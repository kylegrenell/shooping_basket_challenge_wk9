package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 22/11/2016.
 */

public class Basket {
    //    expressions
    private String customer;
    private ArrayList<Item> shoppingBasket;
    private Item item;


    //    initialise in the constructor
    public Basket(String customer) {
        this.customer = customer;
        this.shoppingBasket = new ArrayList<Item>();
    }

    //    customer getter
    public String getCustomer() {
        return customer;
    }

    //    customer setter
    public String setCustomer() {
        return customer;
    }

    public ArrayList<Item> getShoppingBasket() {
        return this.shoppingBasket;
    }

    //    add Item from arrayList to shoppingBasket
    public void addItem(Item item) {
        this.shoppingBasket.add(item);
    }


    //    remove item
    public void removeItem(Item item) {
        this.shoppingBasket.remove(item);
    }

    //    size of basket
    public int basketSize() {
        return this.shoppingBasket.size();
    }

    //    empty basket
    public void emptyBasket() {
        this.shoppingBasket.clear();
    }


    public Double discount(Item item) {
        Double result = 0.0;

        if (item.getCost() >= 20.00) {
            result = (item.setCost() * 0.9);
        }
        return result;
    }


    public Double getTotalCost() {
        Double totalCost = 0.0;

        for (Item product : shoppingBasket) {
            totalCost += product.getCost();
        }
        return totalCost;
    }


//    public void getLoyaltyDiscount() {
//
//        if (getLoyaltyDiscount() == true) {
//            getTotalCost() = item.setCost() * 0.98;
//        }
//    }


//    public double getBogof() {
//        double totalDiscount = 0;
//        if ((item.getCost() % 2) == 0) {
//            for (Item item : shoppingBasket) {
//                totalDiscount += item.getCost();
//            }
//            return totalDiscount;
//        }
//
//    }

}


//    what I would like is a simple loop that checks if an item can be bogof, if true, then
//    every second item of same value (odd number in an array?) is == 0.


