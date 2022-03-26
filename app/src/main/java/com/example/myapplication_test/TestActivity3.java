package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

public class TestActivity3 extends AppCompatActivity {

    private RadioGroup rg;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        //初始化UI
        rg = (RadioGroup) findViewById(R.id.radio_btn);
        button = (Button) findViewById(R.id.btn_test3);
        initEvent();
        //初始化fragment,但是这个fragment是DialogFragment
    }

    private void initEvent() {
        //绑定点击事件
    }
}