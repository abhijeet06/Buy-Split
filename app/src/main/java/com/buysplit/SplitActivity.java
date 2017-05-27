package com.buysplit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SplitActivity extends AppCompatActivity {

    private static final String TAG = "SplitActivity";
    private Context mContext;
    private int billNumber = -1;
    private String parentScreen;
    private TextView orderNumber,billAmt;
    private ArrayList<String> friendList;
    private ListView friendsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split);
        mContext = this;
        orderNumber = (TextView) findViewById(R.id.orderNumber);
        billAmt = (TextView) findViewById(R.id.amount);
        friendsListView = (ListView) findViewById(R.id.list);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("billnumber")) {
                billNumber = getIntent().getIntExtra("billnumber", -1);
                Log.i(TAG, "billNumber :: " + billNumber);
            }
            if (extras.containsKey("parent")) {
                parentScreen = getIntent().getStringExtra("parent");
                Log.i(TAG, "parentScreen :: " + parentScreen);
            }
        }
    }
}
