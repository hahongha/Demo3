package com.example.demo3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TagAdapter extends RecyclerView.Adapter<TagAdapter.ViewHolder> {
    private ArrayList<TagsModel> tagsModelArrayList;

    public TagAdapter(ArrayList<TagsModel> tagsModelArrayList) {
        this.tagsModelArrayList = tagsModelArrayList;
    }

    @NonNull
    @Override
    public TagAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_tag_cardview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TagAdapter.ViewHolder holder, int position) {
        holder.txtTagItem.setText(tagsModelArrayList.get(position).getTagContent());
        holder.imgTagItem.setImageResource(tagsModelArrayList.get(position).getLogoContent());
    }

    @Override
    public int getItemCount() {
        return tagsModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTagItem;
        ImageView imgTagItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTagItem = itemView.findViewById(R.id.txt_tag_item);
            imgTagItem = itemView.findViewById(R.id.img_tag_item);
        }
    }
}
