package com.phisoft.mockitodemo;

import com.phisoft.mockitodemo.pogos.User;
import com.phisoft.mockitodemo.services.ServiceInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MockMvcController {

    @Autowired
    private ServiceInteface serviceInteface;

    @GetMapping(value = "/test1/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> test1(@PathVariable Integer id){

        return new ResponseEntity<>(serviceInteface.getUserById(id), HttpStatus.OK);
    }

    @PostMapping(value="/post")
    public User testPost(@RequestBody User user){
     User user1= serviceInteface.saveUserData(user);
     return user1;

    }

}
