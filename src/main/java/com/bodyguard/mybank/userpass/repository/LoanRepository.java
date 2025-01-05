package com.bodyguard.mybank.userpass.repository;

import com.bodyguard.mybank.userpass.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {
}
