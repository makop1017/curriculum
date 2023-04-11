package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
	
	 /**
	   * グッズ情報 Service
	   */
	@GetMapping("/top")
	public String top(Model model) {
        return "top";
    }
}