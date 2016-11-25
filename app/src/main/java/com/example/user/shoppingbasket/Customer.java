package com.example.user.shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Customer {

    private String name;
    private Integer funds;
    private boolean loyaltyCard;

    public Customer(String name, Integer funds, Boolean loyaltyCard)
    {
        this.name = name;
        this.funds = funds;
        this.loyaltyCard = false;
    }

//    getter
    public String getName(){
        return this.name;
    }

//    setter
    public String setName(){
        return this.name;
    }

    // getter funds
    public Integer getFunds(){
        return this.funds;
    }

    // boolean to see if customer can use loyalty card on items
    public boolean getLoyaltyCard() {
        return this.loyaltyCard;
    }

//    setter
    public void setLoyaltyCard(Boolean discount){
        this.loyaltyCard = discount;
    }

}