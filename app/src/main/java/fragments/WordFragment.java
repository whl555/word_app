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


public class WordFragment extends ListFragment {

    //回调接口
    private onItemClickListener onItemClickListener;
    //实现接口
    public interface onItemClickListener {
        void onItemClick(ListView l, @NonNull View v, int position, long id);
    }

    //实现回调接口
    @Override
    public void onAttach(@NonNull Context context) {
        try{
            onItemClickListener = (onItemClickListener)context;
        } catch(Exception e){
            throw new RuntimeException("must implement this interface");
        }

        super.onAttach(context);

    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        onItemClickListener.onItemClick(l, v, position, id);
    }
}