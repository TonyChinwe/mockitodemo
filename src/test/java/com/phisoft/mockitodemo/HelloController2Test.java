package com.phisoft.mockitodemo;

import com.phisoft.mockitodemo.services.LaurentService;
import com.phisoft.mockitodemo.services.MockService1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController1.class)
class HelloController2Test {

    @Autowired
    private MockService1 service;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void sayHello() throws Exception {
        RequestBuilder builder= MockMvcRequestBuilders.get("/hello/Anthony");
        MvcResult result=mockMvc.perform(builder).andReturn();
        Assertions.assertEquals("Hello Anthony",result.getResponse().getContentAsString());

    }
}