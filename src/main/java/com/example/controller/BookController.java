package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController {
	@GetMapping("/hello")
   public String msg() {
	   return "hii";
   }
}
