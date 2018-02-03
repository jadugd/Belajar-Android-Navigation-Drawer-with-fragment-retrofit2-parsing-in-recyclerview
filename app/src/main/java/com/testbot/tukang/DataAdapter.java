package com.testbot.tukang;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 03/02/2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<AndroidVersion> android;

    public DataAdapter(ArrayList<AndroidVersion> android){
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.tv_name.setText(android.get(position).getName());
        holder.tv_ver.setText(android.get(position).getVer());
        holder.tv_api.setText(android.get(position).getApi());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private TextView tv_ver;
        private TextView tv_api;

        public ViewHolder(View itemView){
            super(itemView);

            tv_name = itemView.findViewById(R.id.name);
            tv_api = itemView.findViewById(R.id.api_level);
            tv_ver = itemView.findViewById(R.id.version);

        }
    }
}
