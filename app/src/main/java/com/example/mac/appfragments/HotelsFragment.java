package com.example.mac.appfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by mac on 25/07/17.
 */

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }
    // newInstance constructor for creating fragment with arguments
    public static HotelsFragment newInstance(int page, String title) {
        HotelsFragment fragmentHotels = new HotelsFragment();

        return fragmentHotels;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.grid,container,false);

        ArrayList<Restau> restaus=new ArrayList<>();
        restaus.add(new Restau(R.drawable.hilton,"Hilton"));
        restaus.add(new Restau(R.drawable.hotelbogotaplaza,"Hotel Bogota Plaza"));
        restaus.add(new Restau(R.drawable.whotel,"W Bogota Hotel"));
        restaus.add(new Restau(R.drawable.marriot,"Marriot"));

        RestauAdapter resadapter=new RestauAdapter(getActivity(),R.layout.layout_design,restaus);

        GridView grid=(GridView)view.findViewById(R.id.gridview);
        grid.setAdapter(resadapter);
        return view;
    }
}
