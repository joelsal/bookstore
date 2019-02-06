package com.example.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
	@RequestMapping("/index")
	public @ResponseBody String indexPage() {
		return "index";
	}
}
