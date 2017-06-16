package com.sync.g2.poems;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by G2 on 15-Jun-17.
 */

public class RecyclerAdaptor extends Adapter<RecyclerAdaptor.RecyclerViewHolder> {

    private ArrayList<DataProvider> arrayList = new ArrayList<DataProvider>();

    public RecyclerAdaptor(ArrayList<DataProvider> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        DataProvider dataProvider = arrayList.get(position);
        holder.imageView.setImageResource(dataProvider.getImg_res());
        holder.f_name.setText(dataProvider.getF_name());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView f_name;

        public RecyclerViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.i1);
            f_name = (TextView) view.findViewById(R.id.f_name);
        }
    }
}
