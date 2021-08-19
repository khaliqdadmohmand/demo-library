package com.emericoapp.demolibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.emericoapp.mylibrary.Sample;

public class MainActivity extends AppCompatActivity {

    Sample sample = new Sample();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.framlayout,sample);
        ft.commit();

    }
}
