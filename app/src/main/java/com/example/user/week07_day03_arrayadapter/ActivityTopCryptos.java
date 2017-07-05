package com.example.user.week07_day03_arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityTopCryptos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cryptos);

        TopCryptos topCryptos = new TopCryptos();
        ArrayList<Crypto> cryptos = topCryptos.getList();

        TopCryptosAdapter cryptosAdapter = new TopCryptosAdapter(this, cryptos);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cryptosAdapter);


    }
}
