package com.example.user.shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Item {

    private String stock;
    private Double cost;
    private boolean bogof;

    public Item (String stock, Double cost, boolean bogof){
        this.stock = stock;
        this.cost = cost;
        this.bogof = bogof;
    }

//    getter
    public String getStock(){
        return this.stock;
    }

    public Double getCost(){
        return this.cost;
    }

    public Double setCost(){
        return cost;
    }

    public boolean isBogof(){
        return this.bogof;
    }


}