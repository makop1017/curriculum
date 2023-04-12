package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.RegisterEntity;
import com.example.demo.form.RegisterForm;
import com.example.demo.repository.RegisterRepository;

/**
 * グッズ情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RegisterService {
	/**
	   * グッズ情報 Repository
	   */
	  @Autowired
	  private RegisterRepository registerRepository;
	  
	  /**
	   * グッズ情報 新規登録
	   * @param shohin グッズ情報
	   */
	  public void create(RegisterForm registerForm) {
		  RegisterEntity registerEntity = new RegisterEntity();
		  registerEntity.setGoods_name(registerForm.getGoods_name());
		  registerEntity.setPrice(registerForm.getPrice());
		  registerRepository.save(registerEntity);
	  }

}
