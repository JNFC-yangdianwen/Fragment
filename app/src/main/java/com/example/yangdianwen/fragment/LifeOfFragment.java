package com.example.yangdianwen.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yangdianwen on 16-7-27.
 */
public class LifeOfFragment extends Fragment {
    private static final String TAG = "LifeOfFragment";
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach:生命周期开始 ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate:生命周期开始 ");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated:生命周期开始 ");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView:生命周期开始 ");
        View view = inflater.inflate(R.layout.text, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated:生命周期开始 ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart:生命周期开始 ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:生命周期开始 ");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause:生命周期开始 ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop:生命周期开始 ");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView:生命周期开始 ");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach:生命周期开始 ");
    }

}
