package com.example.traynestedrecyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.traynestedrecyclerview.databinding.ItemRowGroupBinding;

import java.util.ArrayList;

public class GroupAdap extends RecyclerView.Adapter<GroupAdap.ViewHolder> {
ArrayList<String> arrayListGroup;
private Activity activity;

public GroupAdap(Activity activiy ,ArrayList<String> arrayListGroup){
    this.activity =activity;
    this.arrayListGroup=arrayListGroup;


}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    ItemRowGroupBinding view =ItemRowGroupBinding.inflate(LayoutInflater
            .from(parent.getContext()),parent,false);
//    View view= LayoutInflater.from(parent.getContext())
//            .inflate(R.layout.item_row_group,parent,false);

        return new GroupAdap.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    holder.binding.tvUnit.setText(arrayListGroup.get(position));

    //intialize array member
        ArrayList<String> arraymember = new ArrayList<>();
        arraymember.add(" الدعامه في النبات "+0);
        arraymember.add(" الهيكل العظمي المحوري "+1);
        arraymember.add(" لهيكل العظمي الطرفي "+2);
        arraymember.add(" الحركه في النبات "+3);
        arraymember.add("  تركيب العضلات  "+4);
        arraymember.add(" إنقباض العضلات "+5);

        MemberAdap adapterMember =new MemberAdap(arraymember);

        //initialize layout manager
        LinearLayoutManager layoutManagerMember=new LinearLayoutManager(activity);
        //set layout manager
        holder.binding.rvMember.setLayoutManager(layoutManagerMember);
        //set adapter
        holder.binding.rvMember.setAdapter(adapterMember);



    }

    @Override
    public int getItemCount() {
        return arrayListGroup.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    //applay data binding in item row
    ItemRowGroupBinding binding;
        public ViewHolder(@NonNull ItemRowGroupBinding binding) {
            super(binding.getRoot());
           this.binding=binding;
        }
    }
}
