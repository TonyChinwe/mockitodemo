package com.phisoft.mockitodemo.pogos;

import com.phisoft.mockitodemo.MockMvcController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MockMvcController.class)
class HomeController2Test {

    @Autowired
    private MockMvcController homeController2;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test1() {

    }
}