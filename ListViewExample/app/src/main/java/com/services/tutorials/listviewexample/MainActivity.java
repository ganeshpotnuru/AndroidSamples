package com.services.tutorials.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_id);

        final String[] values = new String[] {
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };
        final ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<values.length;++i) {
            list.add(values[i]);
        }

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, final View view, int i, long l) {

                final String row = (String) adapterView.getItemAtPosition(i);
                view.animate().setDuration(2000).alpha(0).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        list.remove(row);
                        adapter.notifyDataSetChanged();
                        view.setAlpha(1);
                    }
                });

                Toast.makeText(getApplicationContext(), "Clicked "+values[i], Toast.LENGTH_LONG).show();
            }
        });


    }
}
