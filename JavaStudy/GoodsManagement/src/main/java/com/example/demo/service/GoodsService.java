package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.GoodsEntity;
import com.example.demo.repository.GoodsRepository;

/**
 * グッズ情報 Service
 */
@Service
public class GoodsService {
	/**
	 * グッズ情報 Repository
	 */
	@Autowired
	private GoodsRepository goodsRepository;
	/**
	 * グッズ情報 全検索
	 * @return 検索結果
	 */
	public List<GoodsEntity> searchAll() {
		return goodsRepository.findAll();
		}
	
	/**
	   * グッズ情報 物理削除
	   * @param id グッズID
	   */
	  public void delete(Integer goods_id) {
	    }
	  
	}