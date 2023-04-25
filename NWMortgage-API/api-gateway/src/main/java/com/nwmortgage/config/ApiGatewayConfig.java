package com.nwmortgage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nwmortgage.filter.APIFilter;

@Configuration
public class ApiGatewayConfig {
	
	@Autowired
	private APIFilter apiFilter;

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
//					.route(r -> r.path("/api/user/**")
//							.uri("lb://user-api"))
//					.route(r -> r.path("/api/accounts/**")
//							.filters(f -> f.filters(apiFilter))
//							.uri("http://localhost:8082"))
					.route(r -> r.path("/api/register/**")					
						.uri("http://localhost:8081/"))	
					.route(r -> r.path("/api/cust/**")
							.filters(f -> f.filters(apiFilter))
							.uri("http://localhost:8088"))
					.route(r -> r.path("/api/loan/**")
							.filters(f -> f.filters(apiFilter))
							.uri("http://localhost:8083"))
//					.route(r -> r.path("/login")
//							.uri("http://localhost:8084"))
					.build();
	}
	
	

	
}
