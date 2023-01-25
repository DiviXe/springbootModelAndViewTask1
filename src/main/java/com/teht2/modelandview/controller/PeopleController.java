package com.teht2.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PeopleController {
	
	@RequestMapping("/hello")
	
		public String ageChecker(@RequestParam(name="name",required=false, defaultValue="Example" ) String name,
		@RequestParam(name="age",required=false ) Integer age, Model model){
			model.addAttribute("name", name);
			model.addAttribute("age", age);
		return "hello";
	}
	
	

}
