package com.phisoft.mockitodemo.services;

import com.phisoft.mockitodemo.pogos.User;

public interface ServiceInteface {

    public User getUserById(Integer id);

    public User saveUserData(User user);

}
