package com.bodyguard.mybank.userpass.mybank_username_password.repository;

import com.bodyguard.mybank.userpass.mybank_username_password.entity.GoldEntity;
import com.bodyguard.mybank.userpass.mybank_username_password.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository<GoldEntity, Integer> {
}
