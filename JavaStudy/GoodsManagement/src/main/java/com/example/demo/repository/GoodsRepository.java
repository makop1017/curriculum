package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GoodsEntity;

/**
 * グッズ情報 Repository
 */
@Repository
public interface GoodsRepository extends JpaRepository<GoodsEntity,Integer> {

}