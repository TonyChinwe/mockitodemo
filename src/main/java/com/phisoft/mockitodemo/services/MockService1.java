package com.phisoft.mockitodemo.services;

import com.phisoft.mockitodemo.Dao.UserRepository;
import com.phisoft.mockitodemo.pogos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockService1 implements ServiceInteface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User saveUserData(User user) {
      User user2=  userRepository.save(user);
      return  user2;
    }


}
