package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * グッズ情報 Entity
 */
@Entity
@Data
@Table(name = "goods_tb")
public class RegisterEntity implements Serializable {
	  /**
	   * ID
	   */
	  @Id
	  @Column(name = "goods_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer goods_id;
	  /**
	   * 商品名
	   */
	  @Column(name = "goods_name")
	  private String goods_name;
	  /**
	   * 値段
	   */
	  @Column(name = "price")
	  private Integer price;

}
