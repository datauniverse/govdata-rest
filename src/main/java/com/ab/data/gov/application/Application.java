/**
 * 
 */
package com.ab.data.gov.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author abhil
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.ab.data.gov.api" })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
