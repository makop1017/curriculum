package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EditEntity;
import com.example.demo.form.EditForm;
import com.example.demo.repository.EditRepository;

@Service
public class EditService {
	
	 /**
	   * 商品情報 Repository
	   */
	  @Autowired
	  private EditRepository editRepository;
	  /**
	   * ユーザー情報 全検索
	   * @return 検索結果
	   */
	  public List<EditEntity> searchAll() {
	    return editRepository.findAll();
	  }
	  /**
	   * ユーザー情報 主キー検索
	   * @return 検索結果
	   */
	  public EditEntity findById(Integer shohin_code) {
	    return editRepository.findById(shohin_code).get();
	  }
	  /**
	   * 商品情報 更新
	   * @param shohin 商品情報
	   */
	  public void update(EditForm editForm) {
	    EditEntity editEntity =new EditEntity();
	    editEntity.setShohin_code(editForm.getShohin_code());
	    editEntity.setShohin_name(editForm.getShohin_name());
	    editEntity.setCategory(editForm.getCategory());
	    editEntity.setColor(editForm.getColor());
	    editEntity.setPrice(editForm.getPrice());
	    editRepository.save(editEntity);
	  }
	  
	  public void delete(Integer shohin_code) {
		    EditEntity editEntity = findById(shohin_code);
		    editRepository.delete(editEntity);
		  }
	  
}

