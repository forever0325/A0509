package com.example.cjcu.a123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner sp_fruite;
    private Button button;

    String[] fruite= {"apple","banana","奇異果"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        sp_fruite = findViewById(R.id.sp_fruit);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruite);
        sp_fruite.setAdapter(adapter);
    }
}
