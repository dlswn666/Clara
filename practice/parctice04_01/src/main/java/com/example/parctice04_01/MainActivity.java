package com.example.parctice04_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    LinearLayout container; // 부분 레이아웃을 생성한다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 처음 activity가 실행 될 때는 activity_main만 보여짐
        Button btn1 = findViewById(R.id.btn1); // 버튼 생성

        container = findViewById(R.id.container); // rayout에서 container 이라는 id를 찾는다

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater =
                        (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE); // inflater 생성 방법..
                                                                                            // 원리는 잘 모르겠고... 암기하자!
                                                                                            // inflater를 생성해야 부분 레이아웃에 다른 레이아웃을 참조할 수 있음
                inflater.inflate(R.layout.sub, container,true); // sub layout을 container에 담아라!
                CheckBox checkBox = container.findViewById(R.id.checkBox);
                TextView textView = container.findViewById(R.id.textView2);
                textView.setText("수정되었습니다");
                checkBox.setText("로딩 되었어요");
            }
        });
    }
}
