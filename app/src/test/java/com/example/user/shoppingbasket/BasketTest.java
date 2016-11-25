package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class BasketTest {

    Basket basket;
    Customer customer;
    Customer customer1;
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void before() {
        customer1 = new Customer("J.Ava", 20, true);
        basket = new Basket("J.Ava");
        item1 = new Item("Baked Beans", 1.00, true);
        item2 = new Item("Vegemite", 3.00, true);
        item3 = new Item("Wine", 25.00, false);
        item4 = new Item("Duck", 10.00, false);
    }

    @Test
    public void customerHasName() {
        assertEquals("J.Ava", basket.getCustomer());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item1);
        assertEquals(1, basket.basketSize());
        basket.addItem(item2);
        assertEquals(2, basket.basketSize());
    }

    @Test
    public void canRemoveItem() {
        basket.removeItem(item1);
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item1);
        basket.addItem(item3);
        basket.emptyBasket();
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void canAddTwoOfSameItem() {
        basket.addItem(item2);
        basket.addItem(item2);
        assertEquals(2, basket.basketSize());
    }

    @Test
    public void isProductBogof() {
        assertEquals(true, item1.isBogof());
    }


    @Test
    public void canGetDiscount() {
        basket.addItem(item3);
        assertEquals(22.50, basket.discount(item3));
    }

    @Test
    public void testLoyaltyCard(){
        assertEquals(false, customer1.getLoyaltyCard());
    }

    @Test
    public void setLoyaltyCard(){
        customer1.setLoyaltyCard(true);
        assertEquals(true, customer1.getLoyaltyCard());
    }


    @Test
    public void canGetBasketTotal(){
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(4.00, basket.getTotalCost());
    }


//    @Test
//    public void canGetBogof(){
//        basket.addItem(item1);
//        basket.addItem(item1);
//        assertEquals(1.00, basket.getBogof());
//    }

//    @Test
//    public void canOnlyApplyTwoPercentDiscountIfMember(){
//        basket.addItem(item3);
//        basket.addItem(item3);
//        basket.discount(item3);
//        basket.getLoyaltyDiscount();
//        assertEquals(0.98, basket.getTotalCost());
//    }

}