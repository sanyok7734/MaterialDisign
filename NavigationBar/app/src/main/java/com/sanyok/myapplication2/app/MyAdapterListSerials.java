package com.sanyok.myapplication2.app;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapterListSerials extends RecyclerView.Adapter<MyAdapterListSerials.ViewHolder> {

    private ArrayList<String> mDataTextTitle;
    private ArrayList<String> mDataTextSecond;
    private ArrayList<Integer> mDataImageTitle;

    public MyAdapterListSerials(ArrayList<String> mDataTextTitle, ArrayList<String> mDataTextSecond, ArrayList<Integer> mDataImageTitle) {
        this.mDataTextTitle = mDataTextTitle;
        this.mDataTextSecond = mDataTextSecond;
        this.mDataImageTitle = mDataImageTitle;
    }

    /**
     * Создание новых View и ViewHolder элемента списка, которые впоследствии могут переиспользоваться.
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_serials, viewGroup, false);
        return new ViewHolder(view);
    }

    /**
     * Заполнение виджетов View данными из элемента списка с номером i
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String stringTitle = mDataTextTitle.get(i);
        String stringSecond = mDataTextSecond.get(i);
        Integer integer = mDataImageTitle.get(i);

        viewHolder.title.setText(stringTitle);
        viewHolder.secondText.setText(stringSecond);
        viewHolder.iconTitle.setImageResource(integer);

        viewHolder.deleteButtonListener.setRecord(stringTitle);
    }

    @Override
    public int getItemCount() {
        return mDataImageTitle.size();
    }

    public void addFav(String item) {
        Toast.makeText(MainActivity.context, "added"+item,Toast.LENGTH_SHORT).show();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private TextView secondText;
        private ImageView iconTitle;
        private ImageView iconAddFav;
        private LinearLayout itemList;
        private DeleteButtonListener deleteButtonListener;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textTitleList);
            secondText = (TextView) itemView.findViewById(R.id.textSecondList);
            iconTitle = (ImageView) itemView.findViewById(R.id.imageTitleList);
            iconAddFav = (ImageView) itemView.findViewById(R.id.imageAddFavList);
            itemList = (LinearLayout) itemView.findViewById(R.id.itemList);
            deleteButtonListener = new DeleteButtonListener();
            iconAddFav.setOnClickListener(deleteButtonListener);
            itemList.setOnClickListener(this);

        }


        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.context, ImageScrollViewActivity.class);
            MainActivity.context.startActivity(intent);
        }
    }

    private class DeleteButtonListener implements View.OnClickListener {
        private String record;

        @Override
        public void onClick(View v) {
            addFav(record);
        }

        public void setRecord(String record) {
            this.record = record;
        }
    }
}
