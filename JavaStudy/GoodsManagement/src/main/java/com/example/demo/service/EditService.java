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
	   * グッズ情報 Repository
	   */
	  @Autowired
	  private EditRepository editRepository;
	  /**
	   * グッズ情報 全検索
	   * @return 検索結果
	   */
	  public List<EditEntity> searchAll() {
	    return editRepository.findAll();
	  }
	  /**
	   * グッズ情報 主キー検索
	   * @return 検索結果
	   */
	  public EditEntity findById(Integer goods_id) {
	    return editRepository.findById(goods_id).get();
	  }
	  /**
	   * グッズ情報 更新
	   * @param shohin 商品情報
	   */
	  public void update(EditForm editForm) {
	    EditEntity editEntity =new EditEntity();
	    editEntity.setGoods_id(editForm.getGoods_id());
	    editEntity.setGoods_name(editForm.getGoods_name());
	    editEntity.setPrice(editForm.getPrice());
	    editRepository.save(editEntity);
	  }
	  
	  /**
	   * グッズ情報 物理削除
	   * @param id グッズID
	   */
	  public void delete(Integer goods_id) {
		  editRepository.deleteById(goods_id);
		  }
	  
}

