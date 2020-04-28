package com.example.clara_ver01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_NoticeActivity extends RecyclerView.Adapter<Adapter_NoticeActivity.ViewHolder>  {

    List<Class_Adapter_Notice> notice_items = new ArrayList<>();

    static Adapter_NoticeActivity notice_adapter;

    public Adapter_NoticeActivity() {this.notice_adapter = this;}


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View notice_itemView = inflater.inflate(R.layout.notice_item,parent,false);
        return new ViewHolder(notice_itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Class_Adapter_Notice item = notice_items.get(position); // List<> 의 get()
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return notice_items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        // ViewHolder에 담길 각각의 View 들을 담을 변수
        TextView tv_nt_title, tv_nt_contents;

        // 생성자
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nt_title = itemView.findViewById(R.id.tv_nt_title);
            tv_nt_contents = itemView.findViewById(R.id.tv_nt_contents);

        }// end 생성자

        // Class_Adapter_Notice의 데이터를 받아서 벰버변수 세팅
        public void setItem(Class_Adapter_Notice notice_item){
            tv_nt_title.setText(notice_item.getTv_nt_title());
            tv_nt_contents.setText(notice_item.getTv_nt_contents());
        }

    }// end ViewHolder

    //데이터를 다루기 위한 메소드
    // Class_Adapter_Notice에 담긴 아이탬을 List에 저장
    public void add_notice_Item (Class_Adapter_Notice notice_item){notice_items.add(notice_item);}
    public void add_notice_Item (int position, Class_Adapter_Notice notice_item){notice_items.add(position, notice_item);}
    public void setNotice_items (ArrayList<Class_Adapter_Notice> notice_items){this.notice_items = notice_items;}
    public Class_Adapter_Notice getNotice_items(int position){return notice_items.get(position);}
    public void setNotice_items(int position, Class_Adapter_Notice notice_item){notice_items.set(position,notice_item);}







}// end Adapter_NoticeActivity


