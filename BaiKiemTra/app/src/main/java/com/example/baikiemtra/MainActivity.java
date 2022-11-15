package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button Dangnhap;
    EditText Tendangnhap, matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dangnhap = (Button) findViewById(R.id.dangnhap);
        Tendangnhap =(EditText) findViewById(R.id.tendangnhap);
        matkhau = (EditText) findViewById(R.id.matkhau);
        Dangnhap.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Danhsach.class);

                if (Tendangnhap.getText().toString().isEmpty() || matkhau.getText().toString().isEmpty()) {

                    if (Tendangnhap.getText().toString().equals("") || matkhau.getText().toString().equals("")) {

                        Toast.makeText(MainActivity.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                    } else if (Tendangnhap.getText().toString().equals("phuc") && matkhau.getText().toString().equals("123")) {
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                        startActivity(i);
                    } else {
                        Toast.makeText(MainActivity.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
                    }


                }
            }

        });
    }

}