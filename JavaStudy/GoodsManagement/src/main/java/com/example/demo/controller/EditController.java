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
 * グッズ情報 Controller
 */
@Controller
public class EditController {
	/**
	 * グッズ情報 Service
	 */
	@Autowired
	private EditService editService;
	
	/**
	 * グッズ編集画面を表示
	 * @param グッズコード
	 * @param model Model
	 * @return グッズ編集画面
	 */
	@GetMapping("/goods/{goods_id}/edit")
	public String displayEdit(@PathVariable Integer goods_id,Model model) {
		EditEntity goodsEntity = editService.findById(goods_id);
		EditForm editForm = new EditForm();
		editForm.setGoods_id(goodsEntity.getGoods_id());
		editForm.setGoods_name(goodsEntity.getGoods_name());
		editForm.setPrice(goodsEntity.getPrice());
		model.addAttribute("editForm", editForm);
		return "/edit";
	}
	
	/**
	 * グッズ更新
	 * @param userRequest リクエストデータ
	 * @param model Model
	 * @return グッズ情報詳細画面
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
		//グッズ情報の更新
		editService.update(editForm);
		return "redirect:/list";
	}
	 // グッズ情報の削除
	 @GetMapping("/goods/{goods_id}/delete")
	  public String delete(Model model,EditForm editForm) {
	    editService.delete(editForm.getGoods_id());
	    return "redirect:/list";
	  }
	
}