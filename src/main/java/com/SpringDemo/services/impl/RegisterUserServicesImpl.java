package com.SpringDemo.services.impl;

import com.SpringDemo.model.RegisterUser;
import com.SpringDemo.repository.RegisterUserRipository;
import com.SpringDemo.services.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
@Transactional
public class RegisterUserServicesImpl implements RegisterUserService{

    @Autowired
    RegisterUserRipository registerUserRipository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PersistenceContext
    EntityManager em;

    @Override
    public void saveRegisteruser(RegisterUser s) {
        try {
            s.setPassword(bCryptPasswordEncoder.encode(s.getPassword()));
            registerUserRipository.saveAndFlush(s);
        }catch (Exception ex){

        }
    }


}
