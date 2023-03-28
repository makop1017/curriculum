package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ShohinEntity;
import com.example.demo.repository.ShohinRepository;

/**
 * 商品情報 Service
 */
@Service
public class ShohinService {
	/**
	 * 商品情報 Repository
	 */
	@Autowired
	private ShohinRepository shohinRepository;
	/**
	 * 商品情報 全検索
	 * @return 検索結果
	 */
	public List<ShohinEntity> searchAll() {
		return shohinRepository.findAll();
		}
	
	/**
	   * ユーザー情報 物理削除
	   * @param id ユーザーID
	   */
	  public void delete(Integer shohin_code) {
//	    ShohinEntity shohinEntity = findById(shohin_code);
//	    shohinRepository.delete(shohinEntity);
	    }
	  
	}