package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class BasketTest {

    Basket basket;
    Customer customer1;
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void before(){
        customer1 = new Customer("J.Ava", 20);
        basket = new Basket("J.Ava");
        item1 = new Item("Baked Beans", 1.00);
        item2 = new Item("Vegemite", 3.00);
        item3 = new Item("Wine", 20.00);
        item4 = new Item("Duck", 10.00);
    }

    @Test
    public void customerHasName(){
        assertEquals("J.Ava", basket.getCustomer());
    }

    @Test
    public void canAddItem(){
        basket.addItem(item1);
        assertEquals(1, basket.basketSize());
        basket.addItem(item2);
        assertEquals(2, basket.basketSize());
    }

    @Test
    public void canRemoveItem(){
        basket.removeItem(item1);
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void canEmptyBasket(){
        basket.addItem(item1);
        basket.addItem(item3);
        basket.emptyBasket();
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void canGetBuyOneGetOneFree(){

    }

}