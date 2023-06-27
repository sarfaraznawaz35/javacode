package com.librarymanagement.serviceinterfaces;


import com.librarymanagement.entity.Login;
import com.librarymanagement.entity.User;

import java.util.ArrayList;
import java.util.Optional;

public interface IUserService {

    User addUserService(User user) throws Exception;
    Login updateUserService(User user, long userId) throws Exception;

    ArrayList<User> getAllUserService();
    Optional<User> getUserByUserIdService(Long userId);
    String deleteUserByUserIdService(Long userId);

}
