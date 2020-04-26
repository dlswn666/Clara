package com.example.parctice04_02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(getApplicationContext(),MenuActivity.class); // Intent 객체 하나 만들고,

                startActivityForResult(intent, RESULT_OK);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메서드 호출됨, 요청 코드 : " + requestCode+
                            ", 결과 코드: :" + resultCode, Toast.LENGTH_LONG).show();}

        if(requestCode == RESULT_OK){
            String name = "name";
            Toast.makeText(getApplicationContext(),
                    "응답으로 전달된 name = " + name,
                    Toast.LENGTH_LONG).show();
        }


        }

    }


