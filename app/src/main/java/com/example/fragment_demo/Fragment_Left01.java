package com.example.fragment_demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Left01#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Left01 extends Fragment {
    public Fragment_Left01() {
        // Required empty public constructor
    }

    public static Fragment_Left01 newInstance() {
        Fragment_Left01 fragment = new Fragment_Left01();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment__left01, container, false);
    }
}