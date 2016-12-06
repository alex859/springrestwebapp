package org.alex859.springrestwebapp.config;

import org.alex859.springrestwebapp.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig
{
	@Bean
	public PersonService personService()
	{
		return new PersonService();
	}
}
