package com.example.micro.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.micro.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	
	@GetMapping("/limits")
	public LimitConfiguration retrievelLimitsFromConfigurations() {
	
		return new LimitConfiguration(1000,1);
	}
}
