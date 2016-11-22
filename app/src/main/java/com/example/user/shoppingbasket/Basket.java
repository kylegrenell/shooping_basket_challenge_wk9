package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 22/11/2016.
 */

public class Basket {

    private String customer;
    private ArrayList<Item> shoppingBasket;

    public Basket(String customer){
        this.customer = customer;
        this.shoppingBasket = new ArrayList<Item>();
    }

//    customer getter
    public String getCustomer(){
        return customer;
    }

//    customer setter
    public String setCustomer(){
        return customer;
    }

}