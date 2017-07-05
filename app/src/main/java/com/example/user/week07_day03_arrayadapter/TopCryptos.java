package com.example.user.week07_day03_arrayadapter;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopCryptos {

    private ArrayList<Crypto> list;

    public TopCryptos() {
        list = new ArrayList<Crypto>();
        list.add(new Crypto(1, "Bitcoin", 42347));
        list.add(new Crypto(2, "Ethereum", 24484));
        list.add(new Crypto(3, "Ripple", 9794));
        list.add(new Crypto(4, "Litecoin", 2716));
        list.add(new Crypto(5, "Ethereum Classic", 1655));
        list.add(new Crypto(6, "NEM", 1569));
        list.add(new Crypto(7, "Dash", 1459));
        list.add(new Crypto(8, "IOTA", 1053));
        list.add(new Crypto(9, "Monero", 678));
        list.add(new Crypto(10, "BitShares", 590));
    }

    public ArrayList<Crypto> getList() { return new ArrayList<Crypto>(list); }

}
