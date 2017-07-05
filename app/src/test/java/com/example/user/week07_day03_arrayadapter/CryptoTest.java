package com.example.user.week07_day03_arrayadapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class CryptoTest {

    Crypto crypto;

    @Before
    public void before() {
        crypto = new Crypto(1, "Bitcoin", 42347);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, crypto.getRanking());

    }

    @Test
    public void getNameTest() {
        assertEquals("Bitcoin", crypto.getName());

    }

    @Test
    public void getMarketCap() {
        assertEquals((Integer)42347, crypto.getMarketCap());

    }

}
