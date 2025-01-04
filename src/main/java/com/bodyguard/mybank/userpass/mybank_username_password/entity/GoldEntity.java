package com.bodyguard.mybank.userpass.mybank_username_password.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gold")
public class GoldEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gold_id")
    private Integer goldId;

    @Column(name = "weight")
    private int weight;

    @Column(name = "price")
    private Double price;

    public GoldEntity(Integer goldId, int weight, Double price) {
        this.goldId = goldId;
        this.weight = weight;
        this.price = price;
    }

    public GoldEntity() {
    }

    public Integer getGoldId() {
        return goldId;
    }

    public void setGoldId(Integer goldId) {
        this.goldId = goldId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
