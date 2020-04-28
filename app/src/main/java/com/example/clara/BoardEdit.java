package com.example.clara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BoardEdit extends AppCompatActivity {

    EditText et_title, et_contens;
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board_edit);

        et_title = findViewById(R.id.et_title);
        et_contens = findViewById(R.id.et_contens);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),BoardActivity.class
                );

               ClassBoard C = new ClassBoard(
                       et_title.getText().toString(),
                       et_contens.getText().toString()
               );

               intent.putExtra("ClassBoard", C);
               startActivityForResult(intent, RESULT_OK);
               finish();

            }
        });



    }
}
