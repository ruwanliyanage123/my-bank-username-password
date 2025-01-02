package com.bodyguard.mybank.userpass.mybank_username_password.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_number")
    private Integer accountNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "branch")
    private String branch;
    @Column(name = "balance")
    private double balance;
}