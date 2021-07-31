package com.example.myapplication11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.Holder> {
    List<rvModel> rvModelList;

    public rvAdapter(List<rvModel> rvModelList) {
        this.rvModelList = rvModelList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rvdg,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        rvModel rev=rvModelList.get(position);
        holder.imageView.setImageResource(rev.getImg());
        holder.textView.setText(rev.getTxt());
    }



    @Override
    public int getItemCount() {
        return rvModelList.size();
    }



    public static class Holder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public Holder(View view){
            super(view);
            imageView=view.findViewById(R.id.img);
            textView=view.findViewById(R.id.txt);
        }
    }

}
