package com.revicere.apakek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.w3c.dom.Text;

public class StrukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        /*get intent from shoppingact
        String ambilNama = getIntent().getStringExtra("v_nama");
        String ambilTotal = getIntent().getStringExtra("v_total");*/

        //Declare textview gagal, tidak bisa get id textview
        //TextView nama = (TextView) findViewById(R.id.);
    }
}
