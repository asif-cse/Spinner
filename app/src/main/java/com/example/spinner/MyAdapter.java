package com.example.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends BaseAdapter {

    private int[] flags;
    private String[] country_names;
    private Context context;
    private LayoutInflater inflater;

    public MyAdapter(Context context, int[] flags, String[] country_names) {
        this.context = context;
        this.flags = flags;
        this.country_names = country_names;
    }


    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample,parent,false);
        }

        ImageView image = convertView.findViewById(R.id.spinnerImagesId);
        TextView text = convertView.findViewById(R.id.simpleTextViewId);

        image.setImageResource(flags[position]);
        text.setText(country_names[position]);

        return convertView;
    }
}
