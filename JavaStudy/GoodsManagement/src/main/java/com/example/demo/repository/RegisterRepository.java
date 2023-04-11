package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RegisterEntity;

/**
 * グッズ情報 Repository
 */
@Repository

public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer>{
}
