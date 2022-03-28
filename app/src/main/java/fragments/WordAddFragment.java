package fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.easyword.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Word;
import dao.WordDao;

public class WordAddFragment extends Fragment{

    private word_add wordAdd;
    private EditText editText;
    private TextView textView;
    //在textview展示的内容
    private String text;
    //暂时的用来展示数据库内容的列表
    private List<Word> wordList;

    //定义回调接口
    public interface word_add{
        WordDao getDao();
    }

    public WordAddFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        try {
            wordAdd = (word_add)context;
        } catch (Exception e){
            throw new RuntimeException("must implement");
        }

        super.onAttach(context);

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_add, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initEvents();
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    private void initView() {
        textView = (TextView) getActivity().findViewById(R.id.text_view1);
        editText = (EditText) getActivity().findViewById(R.id.edit_test4);

    }

    protected void initEvents() {
        //
        List<Word> words = new ArrayList<>();
        List<String> names = Arrays.asList("andy", "bob", "cindy");
        for (String name : names){
            words.add(new Word(name));
        }
        text = "";  //define a value to store data from database
        for(int i=0;i<words.size();i++){   //fetch all data from database
            Word word = words.get(i);
            text += word.getName();
        }
        textView.setText(text);
        //
        WordDao wordDao = wordAdd.getDao();
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN){
                    if (i == KeyEvent.KEYCODE_ENTER){
                        String content = editText.getText().toString();
                        Word word = new Word(content);
                        wordDao.insertWords(word);
                        Toast.makeText(getActivity(), wordDao.toString() ,Toast.LENGTH_SHORT).show();
                        wordList = wordDao.findByPrefix("A");
                        text="";
                        for (Word word1 : wordList){
                            text = text + word1.getName() + ",";
                        }
                        textView.setText(text);
                        editText.setText("");
                        return true;
                    }
                }
                return false;
            }
        });




        //
        Toast.makeText(getActivity(), "success", Toast.LENGTH_SHORT).show();
    }
}