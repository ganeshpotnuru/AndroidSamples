package com.example.ganeshpotnuru.linearlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("SecondTag", "In Second Activity");

        TextView tv_to = (TextView) findViewById(R.id.tv_to);
        tv_to.setText(getIntent().getStringExtra("to_value"));

        TextView tv_subject = (TextView) findViewById(R.id.tv_subject);
        tv_subject.setText(getIntent().getStringExtra("subject_value"));

        TextView tv_message = (TextView) findViewById(R.id.tv_message);
        tv_message.setText(getIntent().getStringExtra("message_value"));
    }
}
