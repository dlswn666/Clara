package com.example.clara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
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

    }
}
