package com.phisoft.mockitodemo.services;

import com.phisoft.mockitodemo.Dao.LaurentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaurentService {

    @Autowired
    private LaurentRepository repository;

    public List<String> getListProductEven(){
     List<String>stringList=repository.getProductRepository().stream().filter(p->(p.length())%2==0).collect(Collectors.toList());
     return stringList;
    }
    public List<String> getListProductOdd(){
      List<String>stringList=repository.getProductRepository().stream().filter(p->(p.length())%2 !=0).collect(Collectors.toList());
        return stringList;
    }

    public List<String> getNoProduct(){
      return Arrays.asList();
    }
    public List<String> getTheProduct(){
        return Arrays.asList("one","two","three");
    }

}
