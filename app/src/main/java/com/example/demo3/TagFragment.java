package com.example.demo3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TagFragment extends Fragment {
    private RecyclerView recyclerView;
    private TagAdapter tagAdapter;
    private ArrayList<TagsModel> tagsModels;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tag,container,false);
//        return inflater.inflate(R.layout.fragment_tag, container, false);

        getData();

        recyclerView = v.findViewById(R.id.rc_list_tag);
        tagAdapter = new TagAdapter(tagsModels);

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(tagAdapter);

        return v;
    }

    private void getData() {
        tagsModels = new ArrayList<>();
        tagsModels.add(new TagsModel("School",R.drawable.ic_tag_school));
        tagsModels.add(new TagsModel("Break",R.drawable.ic_tag_break));
        tagsModels.add(new TagsModel("Reading", R.drawable.ic_tag_reading));
    }
}