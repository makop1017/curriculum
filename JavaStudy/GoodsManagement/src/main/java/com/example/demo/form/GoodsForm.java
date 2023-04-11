package com.example.demo.form;

import java.io.Serializable;

public class GoodsForm implements Serializable {

    private String goods_name;
	private Integer goods_id;
	private Integer price;
    
    public void setName(String goods_name) {
        this.goods_name = goods_name;
    }
    
    public void setId(Integer goods_id) {
        this.goods_id = goods_id;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return goods_name;
    }
    
    public Integer getId() {
        return goods_id;
    }
	
    public Integer setPrice() {
        return price;
    }

}
