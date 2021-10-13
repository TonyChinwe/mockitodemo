package com.phisoft.mockitodemo.Dao;

import com.phisoft.mockitodemo.pogos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
