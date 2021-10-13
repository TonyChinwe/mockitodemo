package com.phisoft.mockitodemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import wiremock.org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldResourceTest {


    private MockMvc mockMvc;

    @InjectMocks
    private HelloWorldResource helloWorldResource;

    @Before
    public void setUp()throws Exception{
    mockMvc= MockMvcBuilders.standaloneSetup(helloWorldResource).build();

    }
     @Test
    public void testHelloResource() throws Exception{
     mockMvc.perform(get("/resource/hello")).andExpect(status().isOk())
             .andExpect(content().string("Hello world"));

    }

    @Test
    public void getJson() throws Exception {
        mockMvc.perform(get("/resource/json")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Anthony"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Mr"));
    }
}