package com.example.neegoods;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class VotingRate extends AppCompatActivity {

    ListView lv;
     Integer[] photos ={R.drawable.badr4,R.drawable.badr1,R.drawable.badr3,R.drawable.badr2};
      MyDb mdb;
     SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting_rate);

        lv = (ListView) findViewById(R.id.voting_liste);
        mdb=new MyDb(this);
        db=mdb.getReadableDatabase();
        Cursor cur=db.rawQuery("select * from condidat",null);

        String[]ids=new String[cur.getCount()];
        String[]names=new String[cur.getCount()];
        String[]votes=new String[cur.getCount()];

        int x=0;
        cur.moveToFirst();

        while(cur.isAfterLast()==false)

        {

            ids[x]=cur.getString(0);

            names[x]=cur.getString(1);

            votes[x]=cur.getString(2);
            x++;
            cur.moveToNext();
        };

//,R.layout.my_row second parametre in Fill_Row function

           Fill_Row fr =new Fill_Row(this,ids,names,votes,photos);
            lv.setAdapter(fr);




    }
}
