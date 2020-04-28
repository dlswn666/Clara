package com.example.clara;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder>{

    ArrayList<ClassBoard> items = new ArrayList<ClassBoard>();


    // 생성자
    static BoardAdapter adapter;
    public BoardAdapter() {this.adapter = this;};


    public void addItem(ClassBoard item){
        items.add(item);
    }

    public void setItems(ArrayList<ClassBoard> items){
        this.items = items;
    }

    public ClassBoard getItem(int position){
        return items.get(position);
    }

    public void setItem (int position, ClassBoard item){
        items.set(position, item);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView =inflater.inflate(R.layout.board_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ClassBoard item = items.get(position);
        holder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title, tv_contens;

        // 생성자
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

             tv_title = itemView.findViewById(R.id.tv_title);
             tv_contens = itemView.findViewById(R.id.tv_contens);

        }

        public void setItem(ClassBoard board){
            tv_title.setText(board.getTitle());
            tv_contens.setText(board.getContents());
        }
    }

}
