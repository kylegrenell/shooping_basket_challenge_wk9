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

    @Before
    public void before(){
        customer1 = new Customer("J.Ava", 20);
        basket = new Basket("J.Ava");
        item1 = new Item("Baked Beans", 1);
    }

    @Test
    public void customerHasName(){
        assertEquals("J.Ava", basket.getCustomer());
    }

}