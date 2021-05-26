package com.packt.cardbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class LoginController {

	  @RequestMapping("/")
	  public String index() {
	    return "Welcome to Spring Logging!";
	  }
	  
}
