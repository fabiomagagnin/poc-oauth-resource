package com.example.pocoauthresource;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocOauthResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocOauthResourceApplication.class, args);
	}

	@RequestMapping("/")
	public Message home() {
	  return new Message("Hello World FM RESOURCE SERVER x");
	}

	@RequestMapping("/resource")
	public Map<String,Object> resource() {
	  Map<String,Object> model = new HashMap<String,Object>();
	  model.put("id", UUID.randomUUID().toString());
	  model.put("content", "Hello World FM 2");
	  return model;
	}

}

class Message {
	
	private String id = UUID.randomUUID().toString();
	private String content;
	
	public Message(String content) {
	  this.content = content;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

  }

