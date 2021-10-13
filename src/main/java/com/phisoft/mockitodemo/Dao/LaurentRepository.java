package com.phisoft.mockitodemo.Dao;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class LaurentRepository {

    public List<String> getProductRepository(){
       return Arrays.asList("abc","abcd","abcde","abcdef","abcdefg","abcdefgh");


    }

}
