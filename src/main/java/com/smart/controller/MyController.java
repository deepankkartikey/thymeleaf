package com.smart.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside About Endpoint");
		model.addAttribute("name", "Deepank");
		return "about";
	}

	@GetMapping(value = "/iteration")
	public String iterateHandler(Model m) {
		List<String> names = List.of("Test", "Dev", "Scrum", "Release");
		m.addAttribute("names", names);
		return "iterate";
	}
}
