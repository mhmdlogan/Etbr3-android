package com.etbr3.mhmdlogan.etbr3;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by MhmdLoGaN on 14/12/2017.
 */

public class Etbr3List extends AppCompatActivity {
    GridView gridView;
    ArrayList<Etbr3> list;
    Etbr3ListAdapter adapter =null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etbr3_list_activity);

        gridView = (GridView)findViewById(R.id.gridView);
        list = new ArrayList<>();
        adapter = new Etbr3ListAdapter(this,R.layout.etbr3_items,list);
        gridView.setAdapter(adapter);

        //get data from DB
        Cursor cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM ETBR3");
        list.clear();
        while (cursor.moveToNext())
        {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String number = cursor.getString(2);
            byte[] image = cursor.getBlob(3);

            list.add(new Etbr3(id,name,number,image));
        }
        adapter.notifyDataSetChanged();
    }
}
