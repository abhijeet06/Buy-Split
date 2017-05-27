package com.buysplit.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


import com.buysplit.R;

import java.util.ArrayList;



public class FriendsItemAdapter extends BaseAdapter {

    private static final String TAG = "FriendsItemAdapter";
    private Context mContext;
    private LayoutInflater inflater;
    private ArrayList<String> mItems;
    private String tag;


    public FriendsItemAdapter(String tag, Context context, ArrayList<String> items) {
        this.tag = tag;
        this.mContext = context;
        this.mItems = items;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public String getItem(int position) {
        return mItems.get(position);
    }

    public void updateUI(ArrayList<String> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder {
        ImageView delete;
        TextView name;
        TextView amt;
        TextView email;
        TextView status;
        TextView mDate;
        TextView mMonth;
        CheckBox box;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder view;
        if (convertView == null) {
            view = new ViewHolder();
            convertView = inflater.inflate(R.layout.inflat_friend_detail, null);
            convertView.setTag(view);
        } else {
            view = (ViewHolder) convertView.getTag();
        }


       // view.name.setText(mItems.get(position).getName());
       // view.email.setText(mItems.get(position).getEmail());



        return convertView;
    }
}