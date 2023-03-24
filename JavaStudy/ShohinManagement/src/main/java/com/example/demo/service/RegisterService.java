package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.RegisterEntity;
import com.example.demo.form.RegisterForm;
import com.example.demo.repository.RegisterRepository;

/**
 * 商品情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RegisterService {
	/**
	   * 商品情報 Repository
	   */
	  @Autowired
	  private RegisterRepository registerRepository;
	  
	  /**
	   * 商品情報 新規登録
	   * @param shohin 商品情報
	   */
	  public void insert(RegisterForm registerForm) {
		  RegisterEntity registerEntity = new RegisterEntity();
		  registerEntity.setShohin_code(registerForm.getShohin_code());
		  registerEntity.setShohin_name(registerForm.getShohin_name());
		  registerEntity.setCategory(registerForm.getCategory());
		  registerEntity.setColor(registerForm.getColor());
		  registerEntity.setPrice(registerForm.getPrice());
		  registerRepository.save(registerEntity);
	  }

}
