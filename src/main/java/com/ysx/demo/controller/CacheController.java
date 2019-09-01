package com.ysx.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CacheController {
	
	@RequestMapping("/flushCache")
	public  ResponseEntity<String>  updateEcache() {
		String resBody="";
		return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON_UTF8).body(resBody);
	}
}