package com.example.demo.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterForm {

	@NotEmpty(message = "商品名を入力してください")
	@Size(max = 20, message = "20字以内で入力してください")
	private String shohin_name;

	private Integer shohin_code;

	@NotEmpty(message = "カテゴリを入力してください")
	@Size(max = 20, message = "10字以内で入力してください")
	private String category;

	@NotEmpty(message = "カラーを入力してください")
	@Size(max = 20, message = "10字以内で入力してください")
	private String color;

	@NotNull(message = "値段を入力してください")
	private Integer price;


}
