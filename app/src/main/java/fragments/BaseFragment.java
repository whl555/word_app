package fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.easyword.R;


public class BaseFragment extends Fragment {

    protected Bundle data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getArguments();//
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
        initEvents();
        setListener();
        setData();

    }

    //设置监听
    protected void setListener() {

    }

    //初始化事件
    protected void initEvents() {

    }

    //初始化视图控件
    protected void initView(View view) {
        view.setBackgroundColor(getResources().getColor(
                android.R.color.background_light));
    }

    //设置数据
    protected void setData() {

    }

    //展示
    public void show(String s) {
        if (getActivity() != null) {
            Toast.makeText(getActivity().getApplicationContext(), s,
                    Toast.LENGTH_SHORT).show();
        }
    }

}