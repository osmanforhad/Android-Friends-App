package com.osmanforhad.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {

    //Constructor method
    public CustomAdapter(MainActivity mainact,String[] nameofmember, int[]memberimg, String[]frindno, String[]frindblood){
        names = nameofmember;
        images = memberimg;
        contactno = frindno;
        bloodgroup = frindblood;
        ct = mainact;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    //Declare Array for Storing items
    String[] names;
    int[] images;
    String[] contactno;
    String [] bloodgroup;
    //Declare Context for accessing Activity/Class
    Context ct;
    //Use LayoutInflater for initial xml file or custom Layout
    private static LayoutInflater inflater = null;

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //Writing a Inner/Nested class for hold/recive data form xml layout
    public class MyHolder{
        TextView tvs;
        ImageView img;
        TextView cnum;
        TextView blood;

    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //Crate an object for passing Inner class
        MyHolder myh = new MyHolder();
//Call Custom Layout Within CustomAdapter for Display
        View myview;
        myview = inflater.inflate(R.layout.custom_layout_item, null);
        myh.tvs = (TextView) myview.findViewById(R.id.textid);
        myh.img = (ImageView) myview.findViewById(R.id.imageid);
        myh.cnum = (TextView) myview.findViewById(R.id.cno);
        //myh.blood = (TextView) myview.findViewById(R.id.bgp);
        //For Display Text
        myh.tvs.setText(names[position]);
        //For Display Image
        myh.img.setImageResource(images[position]);
        //For display Contact No
        myh.cnum.setText(contactno[position]);
        //For Display Blood Group
        //myh.blood.setText(bloodgroup[position]);

        //For Click
        myview.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //For After Click Display a text
                Toast.makeText(ct," Blood Group "+bloodgroup[position], Toast.LENGTH_LONG).show();
            }
        });

        return myview;
    }
}
