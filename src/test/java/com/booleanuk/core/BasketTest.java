package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    public void addItemToBasket(){
        Basket basket = new Basket();
        boolean isTrue = basket.add("Test", 33);
        assertTrue(isTrue);
        isTrue = basket.add("Test", 33);
        assertFalse(isTrue);
    }

    @Test
    public void testTotal() {
        Basket basket = new Basket();
        assertEquals(0, basket.total());
        basket.add("Egg", 3);
        assertEquals(3, basket.total());
        basket.add("Egg", 4);
        assertEquals(3, basket.total());
        basket.add("Butter", 5);
        assertEquals(8, basket.total());
    }
}
