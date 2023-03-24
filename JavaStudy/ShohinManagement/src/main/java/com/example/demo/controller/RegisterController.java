package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.RegisterForm;
import com.example.demo.service.RegisterService;

/**
 * 商品情報 Controller
 */
@Controller
public class RegisterController {
	
	/**
	   * 商品情報 Service
	   */
	  @Autowired
	  private RegisterService registerService; 
	  
	  /**
	   * 商品新規登録画面を表示
	   * @param model Model
	   * @return 商品情報一覧画面
	   */
	  @GetMapping(value = "/register")
	  public String displayAdd(Model model) {
	    model.addAttribute("registerForm", new RegisterForm());
	    return "/register";
	  }

	    
	  /**
	   * 商品新規登録
	   * @param shohinRequest リクエストデータ
	   * @param model Model
	   * @return 商品情報詳細画面
	   */
	  @RequestMapping(value = "/list", method = RequestMethod.POST)
	  public String insert(@ModelAttribute RegisterForm registerForm, Model model) {
		// ユーザー情報の登録
		  registerService.insert(registerForm);
		    return "redirect:/list";
	  }

}
