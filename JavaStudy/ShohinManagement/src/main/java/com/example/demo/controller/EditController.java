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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.EditEntity;
import com.example.demo.form.EditForm;
import com.example.demo.service.EditService;
/**
 * 商品情報 Controller
 */
@Controller
public class EditController {
	/**
	 * 商品情報 Service
	 */
	@Autowired
	private EditService editService;
	
	/**
	 * 商品編集画面を表示
	 * @param i商品コード
	 * @param model Model
	 * @return 商品編集画面
	 */
	@GetMapping("/shohin/{shohin_code}/edit")
	public String displayEdit(@PathVariable Integer shohin_code,Model model) {
		EditEntity editEntity = editService.findById(shohin_code);
		EditForm editForm = new EditForm();
		editForm.setShohin_code(editEntity.getShohin_code());
		editForm.setShohin_name(editEntity.getShohin_name());
		editForm.setCategory(editEntity.getCategory());
		editForm.setColor(editEntity.getColor());
		editForm.setPrice(editEntity.getPrice());
		model.addAttribute("editForm", editForm);
		return "/edit";
	}
	
	/**
	 * ユーザー更新
	 * @param userRequest リクエストデータ
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@Validated @ModelAttribute EditForm editForm,BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("editForm", editForm);
			model.addAttribute("validationError", errorList);

			return "/edit";
		}
		//ユーザー情報の更新
		editService.update(editForm);
		return "redirect:/list";
	}
	 // ユーザー情報の削除
	 @GetMapping("/shohin/{shohin_code}/delete")
	  public String delete(Model model,EditForm editForm) {
	    editService.delete(editForm.getShohin_code());
	    return "redirect:/list";
	  }
	
}