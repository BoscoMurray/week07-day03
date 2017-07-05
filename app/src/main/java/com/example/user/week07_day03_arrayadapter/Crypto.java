package com.example.user.week07_day03_arrayadapter;

/**
 * Created by user on 05/07/2017.
 */

public class Crypto {

    private int ranking;
    private String name;
    private int marketCap;

    public Crypto(Integer ranking, String name, Integer marketCap) {
        this.ranking = ranking;
        this.name = name;
        this.marketCap = marketCap;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public Integer getMarketCap() {
        return marketCap;
    }

}
