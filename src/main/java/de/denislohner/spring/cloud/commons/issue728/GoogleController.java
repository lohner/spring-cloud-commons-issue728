package de.denislohner.spring.cloud.commons.issue728;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleController {

	@Autowired
	private GoogleClient googleClient;
	
	@RequestMapping("/")
	public String getGoogleIndex() {
		return googleClient.getIndex();
	}
}
