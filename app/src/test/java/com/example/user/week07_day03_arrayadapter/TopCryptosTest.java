package com.example.user.week07_day03_arrayadapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class TopCryptosTest {

    @Test
    public void getListTest() {
        TopCryptos topCryptos = new TopCryptos();
        assertEquals(10, topCryptos.getList().size());
    }

}
