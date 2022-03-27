package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import androidx.annotation.LayoutRes;

import com.example.easyword.R;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<String> data;
    private LayoutInflater inflater;

    //controller接收到  数据源  和 上下文，生成上下文对应的的布局管理器
    public MyAdapter(List<String> data, Context context)
    {
        this.data = data;
        this.inflater = LayoutInflater.from(context); // 绑定到activity的布局管理器
    }
    //查看数据源的个数,返回给view告诉他们需要几个item
    @Override
    public int getCount() {
        return data.size();
    }

    //从数据源中取出item
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    //记录item的id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //把带数据源的视图，返回给listView
    //View
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            view  = inflater.inflate(R.layout.list_item,null);
            TextView textView = view.findViewById(R.id.text1);
            textView.setText(data.get(position));
        }
        return view;
    }
}
