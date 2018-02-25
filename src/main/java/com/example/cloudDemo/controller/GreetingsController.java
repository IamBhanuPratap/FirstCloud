package com.example.cloudDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloudDemo.response.HelloResponse;
import com.example.cloudDemo.service.Greeting;

@RestController
@RequestMapping("/")
public class GreetingsController {
	@Autowired
	private Greeting greetingService;
	@Autowired
	public HelloResponse greetResponse;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(path="/{greetings}",method=RequestMethod.GET)
	public ResponseEntity greetings(@PathVariable ("greetings") String greetings, @RequestParam(value = "name") String name) {
		greetResponse = greetingService.greetingResponse(greetings,name);
		return new ResponseEntity(greetResponse,HttpStatus.OK);
	}

}
