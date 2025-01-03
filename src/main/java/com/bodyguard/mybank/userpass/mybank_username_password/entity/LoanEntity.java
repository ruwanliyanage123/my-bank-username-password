package com.bodyguard.mybank.userpass.mybank_username_password.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan")
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id")
    private Integer loanId;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "loan_amount")
    private Double loanAmount;

    public LoanEntity(Integer loanId, String loanType, Double loanAmount) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public LoanEntity(){}

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
