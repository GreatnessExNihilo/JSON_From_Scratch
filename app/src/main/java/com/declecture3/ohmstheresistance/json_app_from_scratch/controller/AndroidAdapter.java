package com.declecture3.ohmstheresistance.json_app_from_scratch.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.declecture3.ohmstheresistance.json_app_from_scratch.R;
import com.declecture3.ohmstheresistance.json_app_from_scratch.model.MyAndroid;
import com.declecture3.ohmstheresistance.json_app_from_scratch.view.AndroidViewHolder;

import java.util.List;



    public class AndroidAdapter extends RecyclerView.Adapter<AndroidViewHolder>{

        private List<MyAndroid> androidInfoList;

        public AndroidAdapter(List<MyAndroid> androidInfoList) {

            this.androidInfoList = androidInfoList;
        }

        @Override
        public AndroidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.android_itemview, parent, false);
            return new AndroidViewHolder(childView);
        }


        @Override
        public void onBindViewHolder(@NonNull AndroidViewHolder holder, int position) {
            MyAndroid myAndroid = androidInfoList.get(position);

            holder.onBind(myAndroid.getApi(),myAndroid.getName(), myAndroid.getVersion());
        }


        @Override
        public int getItemCount() {

            return androidInfoList.size();
        }
    }

