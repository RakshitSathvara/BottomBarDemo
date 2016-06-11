package com.unbeatable.bottombardemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rakshit on 11-06-2016 at 11:23.
 */
public class AllListFragment extends Fragment {

    public static AllListFragment newInstance(int index) {
        AllListFragment fragment = new AllListFragment();
        Bundle b = new Bundle();
        b.putInt("index", index);
        fragment.setArguments(b);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_all_list, container, false);

        return rootView;
    }
}
