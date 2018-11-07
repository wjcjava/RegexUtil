package com.example.wangjunchao.lianxidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText phone;
    private Button boole;
    private String num;
    private Boolean aBoolean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone=findViewById(R.id.et_phone);
        boole=findViewById(R.id.bt_boole);


        boole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(RegexUtils.checkMobile(phone.getText()+"")){
                    Toast.makeText(MainActivity.this, ""+phone.getText(), Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(MainActivity.this, "您输入的手机号码有误", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
