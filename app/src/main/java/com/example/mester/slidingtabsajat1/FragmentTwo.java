package com.example.mester.slidingtabsajat1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mester on 2014.12.11..
 */
public class FragmentTwo extends Fragment {

    public static final String TAG="Második";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_two, container, false);

        return root;
    }
}
