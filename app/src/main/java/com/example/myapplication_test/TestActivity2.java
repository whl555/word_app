package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication_test.fragments.BlankFragment;
import com.example.myapplication_test.fragments.BottomFragment;
import com.example.myapplication_test.fragments.TopFragment;

public class TestActivity2 extends AppCompatActivity {

    private Button btn_replace;
    private Button btn_remove;
    private BlankFragment fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        //在activity的视图里添加控件，button
        btn_remove = (Button) findViewById(R.id.btn_remove);
        btn_replace = (Button) findViewById(R.id.btn_replace);
        //初始化fragments
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fg = new BlankFragment();
        ft.add(R.id.frame_test_3, fg);
        ft.commit();
        initEvent();
    }

    private void initEvent() {
        //绑定按钮点击事件
        btn_replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_test_3, new BottomFragment()).commit();
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().remove(fg).commit();
            }
        });
    }

    protected void onClick(View v){
        switch(v.getId()){
            case R.id.btn_remove:

                break;

            case R.id.btn_replace:
                break;

        }
    }
}