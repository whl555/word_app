package fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.easyword.R;

import java.util.List;

public class WordShowFragment extends ListFragment {

    //定义接口实例
    private onItemClickListenerShow onItemClickListenerShow;
    //定义接口
    public interface onItemClickListenerShow {
        void onItemClickShow(ListView l, @NonNull View v, int position, long id);
    }

//    //实现回调接口
//    @Override
//    public void onAttach(@NonNull Context context) {
//        try{
//            onItemClickListenerShow = (onItemClickListenerShow)context;
//        } catch(Exception e){
//            throw new RuntimeException("must implement this interface");
//        }
//
//        super.onAttach(context);
//
//    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        onItemClickListenerShow.onItemClickShow(l, v, position, id);
    }
}