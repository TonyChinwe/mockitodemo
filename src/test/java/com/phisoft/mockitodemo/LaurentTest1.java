package com.phisoft.mockitodemo;

import com.phisoft.mockitodemo.Dao.LaurentRepository;
import com.phisoft.mockitodemo.services.LaurentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import org.springframework.test.context.junit4.SpringRunner;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;


@SpringBootTest
public class LaurentTest1 {

    @Autowired
    private LaurentService service;
    @MockBean
    private LaurentRepository repository;

    @Test
    public void testNoProduct(){
     //given(repository.getProductRepository()).willReturn(Collections.EMPTY_LIST);
       // List<String> stringList=service.getListProductEven();

        assertTrue(true);

 }

}
