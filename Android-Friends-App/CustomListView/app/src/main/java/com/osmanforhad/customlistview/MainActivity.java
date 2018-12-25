package com.osmanforhad.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylist = (ListView) findViewById(R.id.mylistview);

        //Declare Array for Setup member name and member image
        String[] memberlist = {"Osman","Mehedi","Sohel","Jahangir","Tania"};
        int[] memberimg = {R.drawable.osman,R.drawable.mehedi,R.drawable.sohel,R.drawable.jahangir,R.drawable.tania};
        String[] frindno = {"01672880108","01672880108","01672880108","01672880108","01672880108"};
        String[] frindblood = {"o+","b+","o-","a+","b-"};
        //Code for CustomAdapter
        CustomAdapter myAdap = new CustomAdapter(this,memberlist,memberimg,frindno,frindblood);
        mylist.setAdapter(myAdap);
    }
}
