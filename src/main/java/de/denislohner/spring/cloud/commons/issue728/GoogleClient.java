package de.denislohner.spring.cloud.commons.issue728;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("google")
public interface GoogleClient {

	@GetMapping("/")
	String getIndex();
}
