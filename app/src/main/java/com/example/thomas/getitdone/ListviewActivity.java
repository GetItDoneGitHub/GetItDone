package com.example.thomas.getitdone;

/**
 * Created by All on 10/23/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends Activity implements OnItemClickListener {

    String[] transactions;
    TypedArray trans_icons;
    String[] trans_description;

    List<RowItem> rowItems;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funds);

        rowItems = new ArrayList<RowItem>();

        transactions = getResources().getStringArray(R.array.Transactions);

        trans_icons = getResources().obtainTypedArray(R.array.transactions_icons);

        trans_description = getResources().getStringArray(R.array.transactions_descriptions);

        for (int i = 0; i < transactions.length; i++) {
            RowItem item = new RowItem(transactions[i],
                    trans_icons.getResourceId(i, -1), trans_description[i]);
            rowItems.add(item);
        }

        mylistview = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        String transaction = rowItems.get(position).getTransaction();
        if(position==1)
        {
            Intent myIntent = new Intent(view.getContext(), CreditCardActivity.class);
            startActivityForResult(myIntent, 0);
        }

        //Toast.makeText(getApplicationContext(), "" + transactions,
                //Toast.LENGTH_SHORT).show();
    }

}
