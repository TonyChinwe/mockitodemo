package com.phisoft.mockitodemo;

import com.phisoft.mockitodemo.pogos.JsonPogos;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class HelloWorldResource {

    @GetMapping("/hello")
    public String helloWorld(){
     return "Hello world";
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public JsonPogos getJson(){
    return new JsonPogos("Mr","Anthony");
    }


}
