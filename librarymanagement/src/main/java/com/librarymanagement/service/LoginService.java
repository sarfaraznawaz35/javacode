package com.librarymanagement.service;

import com.librarymanagement.entity.Login;
import com.librarymanagement.repository.LoginRepository;
import com.librarymanagement.serviceinterfaces.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class LoginService implements ILoginService {

    @Autowired
    LoginRepository loginRepository;


    public ArrayList<Login> getAllLoginService() {
        var result = this.loginRepository.findAll();
        return (ArrayList<Login>) result;
    }


}
