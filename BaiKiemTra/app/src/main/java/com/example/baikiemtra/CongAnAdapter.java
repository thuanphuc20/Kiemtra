package com.example.baikiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CongAnAdapter extends RecyclerView.Adapter<CongAnAdapter.CAholde> {

    List<CongAn> list;
    Context context;

    public void setData(List<CongAn> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CAholde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_danhsach, parent, false);
        return new CAholde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CAholde holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
