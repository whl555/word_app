package com.example.myapplication_test.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication_test.R;


public class MyDialogFragment extends DialogFragment {

    private final String TAG = this.getClass().getSimpleName();

    public MyDialogFragment() {
        super();
    }

    public MyDialogFragment(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG + "onAttach start", "w");// 怎么打印呢？
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG + "onAttach start", "w");// 怎么打印呢？
    }
    //官方手册DialogFragment如何使用
    public DialogFragment getInstance(int type){
        DialogFragment dialogFragment = new DialogFragment();
        Bundle args = new Bundle();
        args.putInt("type", type);//把数据放在bundle
        dialogFragment.setArguments(args);//把bundle传送给dialog fragment
        return dialogFragment;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        int type = getArguments().getInt("type");
        switch(type){
            case 1:
                return new AlertDialog.Builder();
            case 2:
                return new DatePickerDialog();
            case 3:
                return new TimePickerDialog();
            default:
                break;

        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG + "onAttach start", "w");// 怎么打印呢？
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG + "onAttach start", "w");// 怎么打印呢？
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG + "onAttach start", "w");// 怎么打印呢？
    }
}