package com.phisoft.mockitodemo;

import com.phisoft.mockitodemo.pogos.User;
import com.phisoft.mockitodemo.services.MockService1;
import com.phisoft.mockitodemo.services.ServiceInteface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(MockMvcController.class)
class MockMvcControllerTest {

    @Autowired
    private MockMvcController mvcController;

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ServiceInteface mockService1;

    @Test
    public void test1() throws Exception{

        User user=new User();
        user.setGender("Male");
        user.setId(10);
        user.setMail("tony@yahoo.com");
        user.setName("Tony");
        user.setPhone("080604532145");

        when(mockService1.getUserById(anyInt())).thenReturn(user);
        mvc.perform(MockMvcRequestBuilders.get("/test1/2"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Tony"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.mail").value("tony@yahoo.com"))
                .andExpect(status().isOk())
        ;
    }

    @Test
    public void test2() throws  Exception{
        User user=new User();
        user.setGender("Male");
        user.setId(10);
        user.setMail("tony@yahoo.com");
        user.setName("Tony");
        user.setPhone("080604532145");

        when(mockService1.saveUserData(any(User.class))).thenReturn(user);
        mvc.perform(MockMvcRequestBuilders.post("/post")
                .content(new ObjectMapper().writeValueAsString(user))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Tony"))
        ;
    }


}