package com.example.user.week07_day03_arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopCryptosAdapter extends ArrayAdapter<Crypto> {

    public TopCryptosAdapter(Context context, ArrayList<Crypto> cryptos) { super(context, 0, cryptos); }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.crypto_item, parent, false);
        }

        Crypto currentCrypto = getItem(position);

        TextView rank = (TextView) listItemView.findViewById(R.id.rank);
        rank.setText(currentCrypto.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentCrypto.getName().toString());

        TextView marketCap = (TextView) listItemView.findViewById(R.id.marketCap);
        marketCap.setText("$" + currentCrypto.getMarketCap().toString() + " million");

        return listItemView;
    }
}
