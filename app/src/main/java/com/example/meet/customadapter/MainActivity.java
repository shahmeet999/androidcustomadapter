package com.example.meet.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mlistview;
    ArrayList <employee> mArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistview=findViewById(R.id.lstemp);
        mArrayList=new ArrayList<employee>();

        mArrayList.add(new employee(1,"meet"));
        mArrayList.add(new employee(2,"shah"));

mlistview.setAdapter(new employee_custom_adapter(MainActivity.this,mArrayList));
    }
}
