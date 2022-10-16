package com.promineotech.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import lombok.Getter;

public class BaseTest {
	@LocalServerPort
	private int serverPort;
	
	@Autowired
	@Getter
	private TestRestTemplate restTemplate;
	
	protected String getBaseUri() {
		return String.format("http://localhost:%d/jeeps", getServerPort());
	}

	public TestRestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(TestRestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
}
