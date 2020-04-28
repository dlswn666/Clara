package com.example.clara_ver01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NoticeItemActivity extends AppCompatActivity {

    EditText et_nt_title, et_nt_contents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.edit_notice_item);
        super.onCreate(savedInstanceState);

        et_nt_title = findViewById(R.id.et_nt_title);
        et_nt_contents = findViewById(R.id.et_nt_contents);

        // 정보를 담을 클래스를 불러온다
        final Class_Adapter_Notice class_adapter_notice = new Class_Adapter_Notice();

        // 사용자가 입력한 값은 받는 변수를 생성.

        final Button btn_nt_add = findViewById(R.id.btn_nt_add);

        btn_nt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_adapter_notice.setTv_nt_title(et_nt_title.getText().toString());
                class_adapter_notice.setTv_nt_contents(et_nt_contents.getText().toString());
                Intent intent = new Intent(getApplicationContext(), NoticeActivity.class);

                finish();

            }
        });





    }
}
