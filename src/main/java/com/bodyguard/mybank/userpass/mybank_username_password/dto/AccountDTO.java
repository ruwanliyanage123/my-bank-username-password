package com.bodyguard.mybank.userpass.mybank_username_password.dto;

public class AccountDTO {
    private Integer accountNumber;
    private String name;
    private String branch;
    private double balance;

    public AccountDTO(Integer accountNumber, String name, String branch, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.branch = branch;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
