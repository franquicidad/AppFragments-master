package com.example.mac.appfragments;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mac on 23/07/17.
 */

public class RestauAdapter extends ArrayAdapter<Restau> {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=convertView;

        if(view==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.layout_design,parent,false);
        }

        Restau resImage=getItem(position);

        ImageView imagenRes=(ImageView)view.findViewById(R.id.restauImage);

        if(resImage !=null){
            imagenRes.setImageResource(resImage.getImageResourceId());
        }else {
            imagenRes.setVisibility(view.GONE);
        }
        TextView Texto=(TextView)view.findViewById(R.id.restauText);
        Texto.setText(resImage.getResText());

        return view;
    }

    public RestauAdapter( Context context, int resource, List<Restau> objects) {
        super(context, resource, objects);


    }

}
