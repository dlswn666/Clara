package com.example.edit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etPhone, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);


        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty() || etPhone.getText().toString().isEmpty()||
                etEmail.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "모두 입력해주세요", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "이름 : " + etName.getText().toString() +"\n"+
                            "전화번호 : " + etPhone.getText().toString() + "\n"
                            +"이메일 : " + etEmail.getText().toString(), Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
