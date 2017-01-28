package com.varunkumar.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private FragmentSecond fragmentSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentSecond = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.right_fragment);
    }


    public void changeTitle(String title) {
        fragmentSecond.changeText(title);
    }
}
