package com.phisoft.mockitodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloController1Test {

    @Test
    void sayHello() {
     HelloController1 helloController1=new HelloController1();
        Assertions.assertEquals("Hello Tony",helloController1.sayHello("Tony"));
    }
}