package com.SpringDemo.services.impl;


import com.SpringDemo.model.User;
import com.SpringDemo.repository.UserRepository;
import com.SpringDemo.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
@Transactional
public class userServiceImpl implements userServices {


    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    EntityManager em;

    @Override
    public void addUser(User p) {
        try {
            userRepository.saveAndFlush(p);

        }catch (Exception ex){
            System.out.println("Exception"+ex);
        }
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> getResults() {
        String sql="SELECT  * FROM User";
        Query query= em.createNativeQuery(sql, User.class);
        List<User> results=query.getResultList();

        return results;
    }

    @Override
    public void deleteId(Long id) {
        userRepository.delete(id);
    }


}
