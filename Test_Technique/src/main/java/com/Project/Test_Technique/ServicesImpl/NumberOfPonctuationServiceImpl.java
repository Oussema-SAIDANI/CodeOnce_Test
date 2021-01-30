package com.Project.Test_Technique.ServicesImpl;

import org.springframework.stereotype.Service;

import com.Project.Test_Technique.Services.NumberOfPonctuationService;

@Service
public class NumberOfPonctuationServiceImpl implements NumberOfPonctuationService {

	@Override
	public int getNumberOfPonctuation(String text) {
		int nombre = 0 ;
		String result = text.replaceAll(":|,|\\.|\\?|;|!", "");
		nombre = text.length() - result.length();
		return nombre;
	}
	
	
	

}
