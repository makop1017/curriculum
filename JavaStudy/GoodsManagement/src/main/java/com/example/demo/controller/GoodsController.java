package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.GoodsEntity;
import com.example.demo.service.GoodsService;
/**
 * グッズ情報 Controller
 */
@SpringBootApplication
@Controller
public class GoodsController {
  /**
   * グッズ情報 Service
   */
  @Autowired
  private GoodsService goodsService;
  /**
   * グッズ情報一覧画面を表示
   * @param model Model
   * @return グッズ情報一覧画面
   */
  @GetMapping(value = "/list")
  public String displayList(Model model) {
    List<GoodsEntity> goodslist = goodsService.searchAll();
    model.addAttribute("goodslist",goodslist);
    return "list";
  }
  /**
   * 商品編集画面を表示
   * @param model Model
   * @return グッズ情報編集画面
   */
  @GetMapping(value = "/edit")
  public String displayAdd(Model model) {
    return "edit";
  }
   
}