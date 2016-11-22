package com.example.user.shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Item {

    private String stock;
    private Double cost;

    public Item (String stock, Double cost){
        this.stock = stock;
        this.cost = cost;
    }

//    getter
    public String getStock(){
        return this.stock;
    }

    public Double getCost(){
        return this.cost;
    }

}