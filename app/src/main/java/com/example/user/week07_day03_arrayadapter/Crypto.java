package com.example.user.week07_day03_arrayadapter;

/**
 * Created by user on 05/07/2017.
 */

public class Crypto {

    private int ranking;
    private String title;
    private int maxSupply;

    public Movie(Integer ranking, String title, Integer maxSupply) {
        this.ranking = ranking;
        this.title = title;
        this.maxSupply = maxSupply;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getMaxSupply() {
        return maxSupply;
    }

}
