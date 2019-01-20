package com.declecture3.ohmstheresistance.json_app_from_scratch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class DisplayActivity extends AppCompatActivity {
    //textview to set the information on
    private TextView selectedTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        selectedTextView= findViewById(R.id.selected_android_textview);

        //get the intents passed from the androidviewholder and using the keys to get each value
        Intent intent = getIntent();
        String api = intent.getStringExtra("api");
        String name = intent.getStringExtra("name");
        String version = intent.getStringExtra("version");

        selectedTextView.setText("API: " + api +"\n" +"Name: " + name + "\n" + "Version: " + version);

    }
}
