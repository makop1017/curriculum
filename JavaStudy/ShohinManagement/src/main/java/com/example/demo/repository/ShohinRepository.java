package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ShohinEntity;

/**
 * 商品情報 Repository
 */
@Repository
public interface ShohinRepository extends JpaRepository<ShohinEntity,Integer> {

}