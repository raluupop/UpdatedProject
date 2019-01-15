package com.eventssecurity.security.security.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/rest/events")
@RestController
public class Resource {

	
	@GetMapping("/all")
	public String events()
	{
		return "Welcome to my Events!";
	}
	
	@PreAuthorize("hasAnyRole('Admin')")
	
	@GetMapping("/secured/all")
	public String secured()
	{
		return "Secured!";
	}
	
}
