package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TextinputController {
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("tag", "SpringBoot+Thymeleaf StudyForm");
		return "/index";
	}

	@RequestMapping("/input")
	public String input(String textInput, Model model) {
		model.addAttribute("tag", "SpringBoot+Thymeleaf StudyForm");
		model.addAttribute("textInput", textInput);
		return "/index";
	}
}
