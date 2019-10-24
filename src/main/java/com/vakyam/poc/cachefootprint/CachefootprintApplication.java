package com.vakyam.poc.cachefootprint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching
public class CachefootprintApplication {

	@Autowired
	private BO bo;



	public static void main(String[] args) {
		SpringApplication.run(CachefootprintApplication.class, args);
	}

	@GetMapping("/api/accountkey/get/{acctnum}")
	public String getEmployeeByID(@PathVariable("acctnum") String acctnum) {
		return bo.getAccountKey(acctnum);
	}


	@GetMapping("/api/accountkey/get/count")
	public int getCount(){
		return bo.getCount();
	}
}
