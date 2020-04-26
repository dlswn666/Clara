package com.example.parctice04_02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button = findViewById(R.id.button); // 버튼 객체 생성

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(); // 인텐트 객체 생성
                intent.putExtra("name", "mike"); // name 값에 부가 데이터 넣음
                setResult(RESULT_OK, intent); // 응답 보내기
                finish(); // Activity 종료
            }
        });
    }


}
