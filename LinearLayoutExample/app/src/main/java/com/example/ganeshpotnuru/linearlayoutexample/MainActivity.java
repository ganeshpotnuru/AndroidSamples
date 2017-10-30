package com.example.ganeshpotnuru.linearlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login = (Button) findViewById(R.id.btn_send);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ButtonTag", "Button CLicked");

                Intent new_intent = new Intent(getApplicationContext(), SecondActivity.class);

                EditText et_to = (EditText) findViewById(R.id.et_to);
                new_intent.putExtra("to_value", et_to.getText().toString());

                EditText et_subject = (EditText) findViewById(R.id.et_subject);
                new_intent.putExtra("subject_value", et_subject.getText().toString());

                EditText et_message = (EditText) findViewById(R.id.et_message);
                new_intent.putExtra("message_value", et_message.getText().toString());

                startActivity(new_intent);
            }
        });
    }
}
