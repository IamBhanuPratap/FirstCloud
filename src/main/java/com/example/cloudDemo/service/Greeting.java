package com.example.cloudDemo.service;

import org.springframework.stereotype.Service;

import com.example.cloudDemo.response.HelloResponse;
@Service
public interface Greeting {

	
	public HelloResponse greetingResponse(String greetings,String name);
}
