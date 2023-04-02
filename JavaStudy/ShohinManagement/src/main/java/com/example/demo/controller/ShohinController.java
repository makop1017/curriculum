package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.ShohinEntity;
import com.example.demo.service.ShohinService;
/**
 * 商品情報 Controller
 */
@SpringBootApplication
@Controller
public class ShohinController {
  /**
   * 商品情報 Service
   */
  @Autowired
  private ShohinService shohinService;
  /**
   * 商品情報一覧画面を表示
   * @param model Model
   * @return 商品情報一覧画面
   */
  @GetMapping(value = "/list")
  public String displayList(Model model) {
    List<ShohinEntity> shohinlist = shohinService.searchAll();
    model.addAttribute("shohinlist",shohinlist);
    return "list";
  }
  /**
   * 商品編集画面を表示
   * @param model Model
   * @return 商品情報編集画面
   */
  @GetMapping(value = "/edit")
  public String displayAdd(Model model) {
    return "edit";
  }
   
}