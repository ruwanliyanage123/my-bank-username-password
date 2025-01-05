package com.bodyguard.mybank.userpass.dto;

import com.bodyguard.mybank.userpass.entity.GoldEntity;

public class GoldDTO {
    private Integer goldId;
    private int weight;
    private double price;

    public GoldDTO(GoldEntity goldEntity) {
        this.goldId = goldEntity.getGoldId();
        this.weight = goldEntity.getWeight();
        this.price = goldEntity.getPrice();
    }

    public GoldDTO(Integer goldId, int weight, double price) {
        this.goldId = goldId;
        this.weight = weight;
        this.price = price;
    }

    public GoldDTO() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

