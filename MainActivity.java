package com.example.student.list1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity
{
    private ListView lv;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listV);
        String planets[] = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(planets));
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, planets);
        lv.setAdapter(adapter);
    }
}

