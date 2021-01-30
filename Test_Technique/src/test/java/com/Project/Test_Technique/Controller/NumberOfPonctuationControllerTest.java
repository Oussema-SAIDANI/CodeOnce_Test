package com.Project.Test_Technique.Controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.Project.Test_Technique.ServicesImpl.NumberOfPonctuationServiceImpl;
import com.Project.Test_Technique.Controllers.NumberOfPonctuationController;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfPonctuationController.class)
public class NumberOfPonctuationControllerTest {

	 protected MockMvc mvc;
	 
	 @MockBean
	    private NumberOfPonctuationServiceImpl NumberOfPonctuationServiceImpl;
	   
	    void numberOfPonctuation() throws Exception {
	        
	    	String uri = "/ponctuation";
	        mvc.perform(MockMvcRequestBuilders.post(uri)
	                .contentType(MediaType.APPLICATION_JSON).content("oussema, good job! thanks. ")
	        ).andExpect(status().isOk());
	    }
}
