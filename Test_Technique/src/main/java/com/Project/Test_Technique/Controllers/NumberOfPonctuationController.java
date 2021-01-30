package com.Project.Test_Technique.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Test_Technique.ServicesImpl.NumberOfPonctuationServiceImpl;


@RestController
@CrossOrigin
public class NumberOfPonctuationController {
	
	@Autowired
	NumberOfPonctuationServiceImpl service;
	
	@PostMapping("/ponctuation")
	public int getNumberOfPonctuation(@RequestBody String text)
	{
		return service.getNumberOfPonctuation(text);
	}

}
