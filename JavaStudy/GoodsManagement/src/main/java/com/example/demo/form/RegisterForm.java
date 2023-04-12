package com.example.demo.form;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterForm {

	@NotEmpty(message = "グッズ名を入力してください")
	@Size(max = 20, message = "20字以内で入力してください")
	private String goods_name;
	
	@Id
	private Integer goods_id;

	@NotNull(message = "値段を入力してください")
	private Integer price;


}
