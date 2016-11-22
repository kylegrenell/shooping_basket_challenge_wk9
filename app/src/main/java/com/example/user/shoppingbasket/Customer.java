package com.example.user.shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Customer {

    private String name;
    private Integer funds;

    public Customer(String name, Integer funds)
    {
        this.name = name;
        this.funds = funds;
    }

//    getter
    public String getName(){
        return this.name;
    }

//    setter

    public String setName(){
        return this.name;
    }

    public Integer getFunds(){
        return this.funds;
    }

}