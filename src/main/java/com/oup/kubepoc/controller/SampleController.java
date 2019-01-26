package com.oup.kubepoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping("/hello")
	public ResponseEntity<?> getSample() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
