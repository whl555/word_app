package com.example.easyword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import dao.WordDao;
import utils.AppDatabase;

public class RoomActivity extends AppCompatActivity {

    private AppDatabase db;
    private WordDao wordDao;
    private Button btn5,btn6,btn7,btn8;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        db = Room.databaseBuilder(this,AppDatabase.class,"word_database").allowMainThreadQueries().build();
        wordDao = db.wordDao();
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);

        tv = findViewById(R.id.textView);
    }
}