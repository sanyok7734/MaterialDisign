package com.sanyok.myapplication2.app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> mDataText;
    private ArrayList<Integer> mDataImage;

    public MyAdapter(ArrayList<String> mDataText, ArrayList<Integer> mDataImage) {
        this.mDataText = mDataText;
        this.mDataImage = mDataImage;
    }

    /**
     * Создание новых View и ViewHolder элемента списка, которые впоследствии могут переиспользоваться.
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(view);
    }

    /**
     * Заполнение виджетов View данными из элемента списка с номером i
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String string = mDataText.get(i);
        Integer integer = mDataImage.get(i);
        viewHolder.name.setText(string);
        viewHolder.icon.setImageResource(integer);

        viewHolder.deleteButtonListener.setRecord(string);
    }

    @Override
    public int getItemCount() {
        return mDataImage.size();
    }

    public void remove(String item) {
        int position = mDataText.indexOf(item);
        mDataText.remove(position);
        mDataImage.remove(position);
        notifyItemRemoved(position);
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView name;
        private ImageView icon;
        private DeleteButtonListener deleteButtonListener;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textItemList);
            icon = (ImageView) itemView.findViewById(R.id.imageItemList);
            deleteButtonListener = new DeleteButtonListener();
            icon.setOnClickListener(deleteButtonListener);
            name.setOnClickListener(this);

        }


        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.context, name.getText(), Toast.LENGTH_SHORT).show();
        }
    }

    private class DeleteButtonListener implements View.OnClickListener {
        private String record;

        @Override
        public void onClick(View v) {
            remove(record);
        }

        public void setRecord(String record) {
            this.record = record;
        }
    }
}
