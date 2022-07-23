package com.chainsys.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/")
	public String index() {
		return "index"; // index is the name of the view
		// The run time will search for index.jsp in webapp/WEB_INF/views folder
	}

	@PostMapping("/print")
	public String print(@RequestParam("username") String uname, Model model) {
		model.addAttribute("username", uname); // To Share the Data From the Controller to view
		return "print";// print is the name of the view
		// The run time will search for print.jsp in webapp/WEB_INF/views folder
	}
}