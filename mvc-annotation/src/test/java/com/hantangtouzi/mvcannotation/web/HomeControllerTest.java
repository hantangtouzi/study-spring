package com.hantangtouzi.mvcannotation.web;

import com.hantangtouzi.mvcannotation.config.MyWebApplicationInitializer;
import com.hantangtouzi.mvcannotation.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 10:23
 */

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {WebConfig.class, MyWebApplicationInitializer.class})
public class HomeControllerTest {

    @Test
    public void home() throws Exception {
        HomeController controller = new HomeController();

        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}