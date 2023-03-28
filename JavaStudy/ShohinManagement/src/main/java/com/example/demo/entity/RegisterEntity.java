package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 商品情報 Entity
 */
@Entity
@Data
@Table(name = "shohin_tb")
public class RegisterEntity {
	  /**
	   * ID
	   */
	  @Id
	  @Column(name = "shohin_code")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer shohin_code;
	  /**
	   * 商品名
	   */
	  @Column(name = "shohin_name")
	  private String shohin_name;
	  /**
	   * カテゴリ
	   */
	  @Column(name = "category")
	  private String category;
	  /**
	   * カラー
	   */
	  @Column(name = "color")
	  private String color;
	  /**
	   * 値段
	   */
	  @Column(name = "price")
	  private Integer price;

}
