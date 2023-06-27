package com.librarymanagement.service;

import com.librarymanagement.entity.Login;
import com.librarymanagement.entity.User;
import com.librarymanagement.repository.LoginRepository;
import com.librarymanagement.repository.UserRepository;
import com.librarymanagement.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    LoginRepository loginRepository;

//    private String EncryptPassword(String password) throws Exception {
//        if(password == null || password.isEmpty()){
//            throw new Exception("Invalid password for new user.");
//        }
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        String encryptedPassword = encoder.encode(password);
//        return encryptedPassword;
//    }
    @Transactional(rollbackFor = Exception.class)
    public User addUserService(User user) throws Exception {
        Date utilDate = new Date();
        var currentDate = new Timestamp(utilDate.getTime());
        user.setCreatedOn(currentDate);

        Login loginDetail;
        loginDetail = new Login();
        Optional<Login> lastLoginRecord = Optional.ofNullable(this.loginRepository.getLastLoginRecord());
        if (lastLoginRecord.isEmpty()){
            loginDetail.setUserId(1L);
        }else {
            loginDetail.setUserId(lastLoginRecord.get().getUserId() + 1);
        }
        loginDetail.setName(user.getName());
        loginDetail.setEmail(user.getEmail());
        loginDetail.setMobile(user.getMobile());
        //String encryptedPassword = EncryptPassword(user.getPassword());
        loginDetail.setPassword(user.getPassword());
        loginDetail.setCreatedBy(loginDetail.getUserId());
        loginDetail.setCreatedOn(currentDate);
        loginDetail.setUpdatedBy(loginDetail.getUserId());
        loginDetail.setUpdatedOn(currentDate);
        loginDetail = this.loginRepository.save(loginDetail);
        if (loginDetail == null )
            throw new Exception("Fail to create login detail");

        User currentUser;
        Optional result = this.userRepository.findById(loginDetail.getUserId());
        if (!result.isEmpty()){
            throw new Exception("Duplicate userid found. Please contact to admin");
        }

        currentUser = user;
        currentUser.setUserId(loginDetail.getUserId());
        currentUser.setRole(1);
        currentUser.setCreatedBy(currentUser.getUserId());
        currentUser.setCreatedOn(currentDate);
        currentUser.setUpdatedOn(currentDate);
        currentUser.setUpdatedBy(currentUser.getUserId());
        this.userRepository.save(currentUser);

        return currentUser;
    }

    @Transactional(rollbackFor = Exception.class)
    public Login updateUserService(User user, long userId) throws Exception {
        Date utilDate = new Date();
        var currentDate = new Timestamp(utilDate.getTime());
        Optional<User> result = this.userRepository.findById(userId);
        if (result.isEmpty())
            throw new Exception("Invalid userID passed");

            var existingResult = result.get();
            existingResult.setName(user.getName());
            existingResult.setEmail(user.getEmail());
            existingResult.setRole(1);
            existingResult.setPassword(user.getPassword());
            existingResult.setUpdatedOn(currentDate);
            existingResult.setUpdatedBy(userId);

        userRepository.save(existingResult);
//        if (existingResult == null)
//                throw new Exception("Invalid userID passed");

        Login login;
        Optional<Login> loginResult = Optional.ofNullable(this.loginRepository.getLoginByUserId(user.getUserId()));
            if (loginResult.isEmpty()) {
                throw new Exception("Fail to get login detail. Please contact to admin");
            }
            login = loginResult.get();
            login.setName(user.getName());
            login.setEmail(user.getEmail());
            login.setMobile(user.getMobile());
            login.setPassword(user.getPassword());
            login.setUpdatedBy(user.getUserId());
            login.setUpdatedOn(currentDate);
        Login loginData = this.loginRepository.save(login);
        if (loginData == null){
            throw new Exception("Fail to update login detail. Please contact to admin");
        }

        return loginData;
    }

    public ArrayList<User> getAllUserService() {
        List<User> result = this.userRepository.findAll();
        return (ArrayList<User>) result;
    }

    public Optional<User> getUserByUserIdService(Long userId) {
        var result = this.userRepository.findById(userId);
        return result;
    }

    public String deleteUserByUserIdService(Long userId) {
        this.userRepository.deleteById(userId);
        return "User has been deleted";
    }

}
