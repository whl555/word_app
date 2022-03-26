package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager; //androidx包
import androidx.fragment.app.FragmentTransaction;
//import android.app.FragmentManager;
import android.os.Bundle;

import com.example.myapplication_test.fragments.BottomFragment;
import com.example.myapplication_test.fragments.TopFragment;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置activity布局
        setContentView(R.layout.activity_test);
        //设置fragments布局
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_test_1, new TopFragment());
        fragmentTransaction.add(R.id.frame_test_2, new BottomFragment());
        fragmentTransaction.commit();

    }
}