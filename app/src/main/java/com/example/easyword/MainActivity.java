package com.example.easyword;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import adapter.MyAdapter;
import fragments.WordFragment;
import fragments.WordShowFragment;

public class MainActivity extends AppCompatActivity implements WordFragment.onItemClickListener {

    private WordFragment wordFragment;
    private List<String> data;
    private ArrayAdapter<String> adapter;
    private Button btn_hop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager(); //通过getXXX方法得到碎片管理器
        FragmentTransaction fg = fm.beginTransaction();
        wordFragment = new WordFragment();
        fg.add(R.id.frame_main, wordFragment); //
        fg.commit();
        initData();
        initView();
        initEvent();

//        似乎不应该要
//        //actionBar
//        ActionBar actionBar = getActionBar();
//        //类似返回箭头的东东
//        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    private void initData() {
        data = Arrays.asList("A", "B" ,"C", "D" ,"E", "F" ,"G","H", "I","J", "K","L","M","N","O",
                "P","Q","R","S","T","X","Y","Z");
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,data);
        wordFragment.setListAdapter(adapter);

    }

    private void initView() {
    }

    private void initEvent() {

    }

    @Override
    public void onItemClick(ListView l, @NonNull View v, int position, long id) {
        switch(position){
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, new WordShowFragment()).commit();
                break;
            case 1:
                break;
            default:
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                //返回到上一级页面，也就是主页面
                //更换frame layout
                wordFragment = new WordFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, wordFragment).commit();
                //重新使用list Fragment
                data = Arrays.asList("A", "B" ,"C", "D" ,"E", "F" ,"G","H", "I","J", "K","L","M","N","O",
                        "P","Q","R","S","T","X","Y","Z");
                adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,data);
                wordFragment.setListAdapter(adapter);
                return true;
            case R.id.user_p:
                Toast.makeText(this, "你点击了“用户”按键！", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.write_p:
                Toast.makeText(this, "你点击了“发布”按键！", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.favo_p:
                Toast.makeText(this, "你点击了“收藏”按键！", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }





    /**    on create
     //        btn_hop = (Button) findViewById(R.id.btn_hop);

     //初始化fragment
     //        FragmentManager fm = getSupportFragmentManager(); //通过getXXX方法得到碎片管理器
     //        FragmentTransaction fg = fm.beginTransaction();
     //        wordFragment = new WordFragment();
     //        fg.replace(R.id.frame_main, wordFragment);
     //        fg.commit();
     //初始化事件
     */

    /**      使用baseAdapter initEvent
     //绑定适配器数据源 初始化列表最好用的方法Arrays.as list（）
     data = Arrays.asList("A", "B", "C", "D", "E" ,"F", "G", "H" ,"I", "J","K");// 数据库
     //把数据源给adapter where main activity
     adapter = new MyAdapter(data, this);
     //把adapter返回的视图返回到 fragment的 view
     ListView listView = (ListView) findViewById(R.id.word_view);
     listView.setAdapter(adapter);
     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    switch(i){
    case 0:
    getSupportFragmentManager().beginTransaction().replace(R.id.frame_test, new WordShowFragment()).commit();
    break;
    case 1:
    getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, new WordShowFragment()).commit();
    break;
    case 2:
    getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, new WordShowFragment()).commit();
    break;
    case 3:
    break;
    case 4:
    break;
    case 5:
    break;
    case 6:
    break;
    case 7:
    break;
    case 8:
    break;
    case 9:
    break;
    case 10:
    break;
    case 11:
    break;
    case 12:
    break;
    case 13:
    break;
    case 14:
    break;
    case 15:
    break;
    case 16:
    break;
    case 17:
    break;
    case 18:
    break;
    case 19:
    break;
    case 20:
    break;
    case 21:
    break;
    case 22:
    break;
    case 23:
    break;
    case 24:
    break;
    case 25:
    break;
    default:
    break;





    }
    }
    });
     //        Adapter = new MyAdapter(data);
     //        ListView listView = (ListView) findViewById(R.id.word_view);
     //        listView.setAdapter(adapter);

     //绑定点击事件
     //        btn_hop.setOnClickListener(new View.OnClickListener() {
     //            @Override
     //            public void onClick(View view) {
     //                Log.d("a", "start");
     //                getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, new WordFragment()).commit();
     //            }
     //        });
     **/
}