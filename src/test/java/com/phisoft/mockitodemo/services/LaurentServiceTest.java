package com.phisoft.mockitodemo.services;

import com.phisoft.mockitodemo.Dao.LaurentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class LaurentServiceTest {

    @Autowired
    private LaurentService laurentService;



    @MockBean
    private LaurentRepository laurentRepository;

    @Test
    void getListProductEven() {
    }

    @Test
    void getListProductOdd() {
    }

    @Test
    void getNoProduct() {
        given(laurentRepository.getProductRepository()).willReturn(Collections.emptyList());
      List<String> list=laurentService.getListProductEven();
        Assertions.assertTrue(list.isEmpty());

    }
}