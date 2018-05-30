package com.services.tutorials.listviewexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    String[] values;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_id);


        values = new String[] {
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };
        for (int i=0;i<values.length;++i) {
            list.add(values[i]);
        }

        setCustomAdapter();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, final View view, int position, long l) {

                final String row = (String) adapterView.getItemAtPosition(position);
//                view.animate().setDuration(2000).alpha(0).withEndAction(new Runnable() {
//                    @Override
//                    public void run() {
//                        list.remove(row);
//                        adapter.notifyDataSetChanged();
//                        view.setAlpha(1);
//                    }
//                });
                list.remove(row);

                adapter.notifyDataSetChanged();
//                setCustomAdapter();
                //Toast.makeText(getApplicationContext(), "Clicked "+values[position], Toast.LENGTH_LONG).show();
            }
        });

        Button btn_plus = (Button) findViewById(R.id.button_plus);
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagDD", "Plus button clicked");

//                AlertDialog.Builder alert_builder = new AlertDialog.Builder(MainActivity.this);
//                alert_builder.setMessage("Test Alert").setTitle("Test Title").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Log.d("yesTag", "Yes Tapped");
//                    }
//                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Log.d("noTag", "No Tapped");
//                    }
//                });
//
//                AlertDialog alert_dialog = alert_builder.create();
//                alert_dialog.setCancelable(false);
//                //alert_dialog.setCanceledOnTouchOutside(false);
//                alert_dialog.show();

                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_dialog_view);
                dialog.show();

                Button btnSubmit = (Button) dialog.findViewById(R.id.dialog_btn_submit);
                btnSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d(TAG, "Submit Clicked");
                        dialog.dismiss();

                        EditText editText = (EditText) dialog.findViewById(R.id.dialog_textview);

                        String text = editText.getText().toString();

                        Log.d(TAG, text);

                        list.add(text);
//                        setCustomAdapter();
                        adapter.notifyDataSetChanged();

                    }
                });

                Button btnCancel = (Button) dialog.findViewById(R.id.dialog_btn_cancel);
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d(TAG, "Cancel Clicked");
                        dialog.dismiss();
                    }
                });

            }
        });

    }

   private void setCustomAdapter() {

        adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.activity_listview,list);
        listView.setAdapter(adapter);
    }
}
