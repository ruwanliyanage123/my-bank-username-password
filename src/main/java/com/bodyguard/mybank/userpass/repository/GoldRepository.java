package com.bodyguard.mybank.userpass.repository;

import com.bodyguard.mybank.userpass.entity.GoldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository<GoldEntity, Integer> {
}
