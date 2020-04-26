package com.example.myparctice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {


    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        Button btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("title",et1.getText());
                intent.putExtra("contain", et2.getText());

            }
        });






    }
}
