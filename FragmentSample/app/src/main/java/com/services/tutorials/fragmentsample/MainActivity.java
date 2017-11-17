package com.services.tutorials.fragmentsample;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonOne;
    Button buttoTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button) findViewById(R.id.button);
        buttoTwo = (Button) findViewById(R.id.button2);
    }

    public void updateFragment(View view) {

        FragmentManager fm = getFragmentManager();


        if (view == buttonOne) {
            FragmentOne fragment1 = new FragmentOne();
        }
        else {
            FragmentTwo fragment2 = new FragmentTwo();
        }
    }
}
