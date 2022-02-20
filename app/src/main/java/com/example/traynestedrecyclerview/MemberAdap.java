package com.example.traynestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.traynestedrecyclerview.databinding.ItemRowMemberBinding;

import java.util.ArrayList;

public class MemberAdap extends RecyclerView.Adapter<MemberAdap.ViewHolder> {

    ArrayList<String> arrayListmember;
    public MemberAdap(ArrayList<String> arrayListmember){
        this.arrayListmember=arrayListmember;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRowMemberBinding view=ItemRowMemberBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_member,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvLesson.setText(arrayListmember.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayListmember.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRowMemberBinding binding;
        public ViewHolder(@NonNull ItemRowMemberBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
