package com.qa.AccountAppMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
  
@RestController
@SpringBootApplication
public class appContoler 
{
     
	@RequestMapping("/")
    public String index()
     {
    	 return"SpringBootAppiction";
     }
     
	 
}
