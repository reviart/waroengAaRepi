package com.revicere.apakek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intentToMenu(View view){
        Intent toMenu = new Intent(this, ShoppingActivity.class);
        startActivity(toMenu);
    }

    /*public void onClickOrder(View view){
        int price = 20;
        int result = 0;
        result = qty*price;
        displayPrice(result);
    }*/




    /*public void onClickHitung(View view){
        displayTotal(result_krupuk,result_kol);
    }

    private void displayTotal(int krupuk, int kol){
        TextView txtTotal = (TextView) findViewById(R.id.txt_totalharga);
        int hasil = krupuk+kol;
        txtTotal.setText(NumberFormat.getCurrencyInstance().format(hasil));
    }*/


}
