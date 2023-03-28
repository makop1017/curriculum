package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/list")
	public String insert(@Validated @ModelAttribute RegisterForm registerForm,BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("registerForm", registerForm);
			model.addAttribute("validationError", errorList);

			return "/register";
		}
		// ここで商品情報を登録する
		// 登録処理は省略
		// 商品情報の登録
		registerService.insert(registerForm);
		return "redirect:/list";
	}

}
