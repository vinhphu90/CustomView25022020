package com.examplevinhphutvp.customview25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EdittextcircleIcon CircleIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleIcon = findViewById(R.id.edittext1) ;
        CircleIcon.setOnClickTitle(new EdittextcircleIcon.OnClistener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this,"Titile",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
