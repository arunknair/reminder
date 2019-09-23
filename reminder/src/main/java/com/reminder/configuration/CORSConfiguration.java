package com.reminder.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Profile("dev")
public class CORSConfiguration implements WebMvcConfigurer{

	public void addCorsMappings(CorsRegistry corsRegistry) {
		System.out.println("cors Registry ##########################");
		corsRegistry.addMapping("/*").allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS");
	}
}
