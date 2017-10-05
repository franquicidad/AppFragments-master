package com.example.mac.appfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by mac on 26/07/17.
 */

public class NightClubsFragment extends Fragment {

    public NightClubsFragment() {
    }

    // newInstance constructor for creating fragment with arguments
    public static NightClubsFragment newInstance(int page, String title) {
        NightClubsFragment fragmentNightClubs = new NightClubsFragment();

        return fragmentNightClubs;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.grid, container, false);

        ArrayList<Restau> restaus = new ArrayList<>();
        restaus.add(new Restau(R.drawable.hotelv, "Hotel V"));
        restaus.add(new Restau(R.drawable.bendito, "Bendito"));
        restaus.add(new Restau(R.drawable.armando, "Armando Records"));
        restaus.add(new Restau(R.drawable.marquez, "Marquez"));

        RestauAdapter resadapter = new RestauAdapter(getActivity(), R.layout.layout_design, restaus);

        GridView grid = (GridView) view.findViewById(R.id.gridview);
        grid.setAdapter(resadapter);
        return view;
    }
}
