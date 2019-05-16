package com.example.cjcu.a123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner sp_fruite;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
 
        sp_fruite = findViewById(R.id.sp_fruit);
    }
}
