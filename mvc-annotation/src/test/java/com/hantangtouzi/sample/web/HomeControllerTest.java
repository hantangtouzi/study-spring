package com.hantangtouzi.sample.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 10:23
 */

public class HomeControllerTest {

    @Test
    public void home() throws  Exception{
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/")).andExpect(view().name("home"));


    }
}