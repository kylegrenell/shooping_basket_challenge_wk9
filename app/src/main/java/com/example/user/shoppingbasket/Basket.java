package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 22/11/2016.
 */

public class Basket {
//    expressions
    private String customer;
    private ArrayList<Item> shoppingBasket;

//    initialise in the constructor
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

    public ArrayList<Item> getShoppingBasket(){
        return this.shoppingBasket;
    }

//    add Item from arrayList to shoppingBasket
    public void addItem(Item item){
        this.shoppingBasket.add(item);
    }


//    remove item
    public void removeItem(Item item){
        this.shoppingBasket.remove(item);
    }

//    size of basket
    public int basketSize(){
        return this.shoppingBasket.size();
    }

}