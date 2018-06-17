package com.example.android.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class AndroidAdapter extends BaseAdapter {
    ArrayList<AndroidVersion> mAndroidVersions;

    public AndroidAdapter(ArrayList<AndroidVersion> mAndroidVersions) {
        this.mAndroidVersions = mAndroidVersions;
    }

    @Override
    public int getCount() {
        return mAndroidVersions.size();
    }

    @Override
    public AndroidVersion getItem(int position) {
        return mAndroidVersions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(R.layout.activity_show, parent, false);
        TextView tvName = itemView.findViewById(R.id.tvName);
        TextView tvNumber = itemView.findViewById(R.id.tvNumber);
        TextView tvAPI = itemView.findViewById(R.id.tvAPI);
        ImageView ivAndroidSymbol = itemView.findViewById(R.id.ivAndroidSymbol);

        AndroidVersion androidVersion = getItem(position);
        tvName.setText(androidVersion.getVersionName());
        tvNumber.setText(androidVersion.getVersionNumber());
        tvAPI.setText(androidVersion.getAPILevel());
        ivAndroidSymbol.setImageResource(androidVersion.getmImageResourceId());

        return itemView;
    }
}
