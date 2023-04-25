package com.nwmortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AdminLoanApp 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(AdminLoanApp.class, args);
	}
}
