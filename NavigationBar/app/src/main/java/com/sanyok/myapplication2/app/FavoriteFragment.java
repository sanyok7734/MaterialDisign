package com.sanyok.myapplication2.app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class FavoriteFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<String> itemText;
    private ArrayList<Integer> itemImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favorite_layout, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        // не изменять размер RecyclerView
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(MainActivity.context);
        recyclerView.setLayoutManager(layoutManager);

        itemText = new ArrayList<String>();
        itemImage = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            itemText.add("Сериал " + i);
            itemImage.add(R.drawable.ava);
        }
        mAdapter = new MyAdapter(itemText, itemImage);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.context));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        FloatingActionButton fab = new FloatingActionButton.Builder(this.getActivity(), (FrameLayout)view.findViewById(R.id.frameFavorite))
                .withDrawable(getResources().getDrawable(R.drawable.ic_add_white_36dp))
                .withButtonColor(getResources().getColor(R.color.fab))
                .withGravity(Gravity.BOTTOM | Gravity.RIGHT)
                .withMargins(0, 0, 8, 8)
                .create();

        return view;
    }

}
