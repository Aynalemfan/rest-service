package org.generation.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class RestServiceApplication {
	private final long id;
	private final String content;

	public RestServiceApplication(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public RestServiceApplication(long id) {
		this.id = id;
		content = null;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}



	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
