package com.example.clara_ver01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoticeActivity extends AppCompatActivity {

    public static final int  REQUEST_CODE_FOR_NA = 101; // NoticeItemActivity 인텐트 코드
    Adapter_NoticeActivity adapter_noticeActivity; // Adapter 객체
    RecyclerView rv_posting_notice; // RecyclerView 생성
    Button btn_edit_posting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        rv_posting_notice = findViewById(R.id.rv_posting_notice);
        btn_edit_posting = findViewById(R.id.btn_edit_posintg);

        // RecyclerView를 사용하기 위해 LayoutManager를 지정한다
        RecyclerView.LayoutManager layoutManager
                = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL, false);

        rv_posting_notice.setLayoutManager(layoutManager);

        // adapter 생성하자!
        adapter_noticeActivity = new Adapter_NoticeActivity();

        rv_posting_notice.setAdapter(adapter_noticeActivity);

        btn_edit_posting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), NoticeItemActivity.class);

                startActivityForResult(intent, REQUEST_CODE_FOR_NA);

            }
        });

    }// end onCreate

}// end Activity
