package com.bodyguard.mybank.userpass.mybank_username_password.repository;

import com.bodyguard.mybank.userpass.mybank_username_password.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CounterRepository extends JpaRepository<AccountEntity, Integer> , JpaSpecificationExecutor<AccountEntity> {

    @Query(value = "select * from user where username=:username", nativeQuery = true)
    public AccountEntity findUserByUserName(@Param("username") String username);
}
