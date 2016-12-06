package org.alex859.springrestwebapp.controller;

import org.alex859.springrestwebapp.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class MyController
{
	private final PersonService personService;

	public MyController(final PersonService personService)
	{
		this.personService = personService;
	}

	@RequestMapping("/names")
	public Collection<String> getNames()
	{
		return personService.getNames();
	}
}
