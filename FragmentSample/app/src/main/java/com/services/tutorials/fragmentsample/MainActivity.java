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
import java.nio.file.Files;
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

buttonOne.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id,new FragmentOne()).commit();

    }
});

    }

    public void updateFragment(View view) {

//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentOne()).commit();

//        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
//        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//
//
//        if (view == buttonOne) {
//            FragmentOne fragment1 = new FragmentOne();
//            ft.replace(R.id.fragment_container, fragment1);
//        }
//        else {
//            FragmentTwo fragment2 = new FragmentTwo();
//            ft.replace(R.id.fragment_container, fragment2);
//        }
//        ft.commit();
    }
}
