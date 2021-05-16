package com.cg.psd.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleMvcController {

	
	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("welcome", "Raj");
		return "index";
	}
}
