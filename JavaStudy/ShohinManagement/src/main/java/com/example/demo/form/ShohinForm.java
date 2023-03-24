package com.example.demo.form;

import java.io.Serializable;

public class ShohinForm implements Serializable {

    private String shohin_name;
	private Integer shohin_code;
	private String category;
	private String color;
	private Integer price;
    
    public void setName(String shohin_name) {
        this.shohin_name = shohin_name;
    }
    
    public void setCode(Integer shohin_code) {
        this.shohin_code = shohin_code;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return shohin_name;
    }
    
    public Integer getCode() {
        return shohin_code;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getCategory() {
        return category;
    }
	
    public Integer setPrice() {
        return price;
    }

}
