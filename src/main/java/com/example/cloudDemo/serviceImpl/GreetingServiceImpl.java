package com.example.cloudDemo.serviceImpl;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import com.example.cloudDemo.response.HelloResponse;
import com.example.cloudDemo.service.Greeting;


public class GreetingServiceImpl implements Greeting{
	public HelloResponse greet = new HelloResponse();
	public AtomicInteger number = new AtomicInteger(0) ;
	@SuppressWarnings("unchecked")
	@Override
public HelloResponse greetingResponse(String greetings,String name) {
		Set userNames = new HashSet<String>();
		userNames.add("Anil");
		userNames.add("Bhanu");
		userNames.add("Sunil");
		userNames.add("Uma");
		userNames.add("Keerthi");
		userNames.add("Itishri");
		if(greetings.equalsIgnoreCase("greetings")) {
			userNames.forEach(eachName -> {
				if(eachName.equals(name)) {
					greet.setSerialNumber(number.incrementAndGet());
					greet.setMessage("Dear - "+name+" : You are our privilege Customer.Glad to see you are checking our account. The number above displays your serial number.");
				}
				else {
					greet.setSerialNumber(number.incrementAndGet());
					greet.setMessage("Dear - "+name+" : It seems you have not registered yet. Please register to enjoy our privileges.");
				}
			});
		}
		else {
			greet.setSerialNumber(number.incrementAndGet());
			greet.setMessage("Sir/Ma'am"+name+"Welcome to my app. Please user /greetings?name={message} url for more details");
		}
		return greet;
		
		
	}
}
