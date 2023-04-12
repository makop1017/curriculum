package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.RegisterForm;
import com.example.demo.service.RegisterService;

/**
 * グッズ情報 Controller
 */
@Controller
public class RegisterController {

	/**
	 * グッズ情報 Service
	 */
	@Autowired
	private RegisterService registerService; 

	/**
	 * グッズ新規登録画面を表示
	 * @param model Model
	 * @return グッズ情報一覧画面
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String displayAdd(Model model) {
		model.addAttribute("registerForm", new RegisterForm());
		return "/register";
	}


	/**
	 * グッズ新規登録
	 * @param shohinRequest リクエストデータ
	 * @param model Model
	 * @return グッズ情報詳細画面
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	public String create(@Validated @ModelAttribute RegisterForm registerForm,BindingResult result, Model model) {
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
		registerService.create(registerForm);
		return "redirect:/list";
	}

}
