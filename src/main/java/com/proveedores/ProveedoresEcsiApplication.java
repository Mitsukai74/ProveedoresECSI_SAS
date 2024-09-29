package com.proveedores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class ProveedoresEcsiApplication implements CommandLineRunner{
	
	public static Logger LOG = LoggerFactory.getLogger(ProveedoresEcsiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProveedoresEcsiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
    @Bean
    public SpringDataDialect springDataDialect() {
        return new SpringDataDialect();
    }
	
	/*
	 * @Bean public LocalValidatorFactoryBean validator() { return new
	 * LocalValidatorFactoryBean(); }
	 */
	 

}
