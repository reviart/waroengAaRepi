package com.revicere.apakek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }
    public void intentToLiweut(View view){
        Intent toLiweut = new Intent(this, LiweutActivity.class);
        startActivity(toLiweut);
    }
    public void intentToTO(View view){
        //Intent toTO = new Intent(this, TOActivity.class);
        //startActivity(toTO);
    }
    public void intentToAseum(View view){
        //Intent toAseum = new Intent(this, AseumActivity.class);
        //startActivity(toAseum);
    }
    public void intentToAsinan(View view){
        //Intent toAseum = new Intent(this, AseumActivity.class);
        //startActivity(toAseum);
    }
    public void intentToCombro(View view){
        //Intent toAseum = new Intent(this, AseumActivity.class);
        //startActivity(toAseum);
    }

    double result_liwet = 0, result_to = 0, result_aseum = 0, result_asinan = 0, result_combro = 0;
    int price_liwet = 35000, qty_liwet= 0, price_to = 15000, qty_to = 0, price_aseum = 5000, qty_aseum = 0,
            price_asinan = 10000, qty_asinan = 0, price_combro = 2000, qty_combro = 0 ;

    //=============================================== start liwet
    public void onClickIncLiwet(View view){
        qty_liwet += 1;
        result_liwet = qty_liwet*price_liwet;
        TextView txtQtyLiwet = (TextView) findViewById(R.id.txt_qty_liwet);
        txtQtyLiwet.setText(""+qty_liwet);
        displayPriceLiwet(result_liwet);
    }
    public void onClickDecLiwet(View view){
        qty_liwet -= 1;
        result_liwet = qty_liwet*price_liwet;
        TextView txtQtyLiwet = (TextView) findViewById(R.id.txt_qty_liwet);
        txtQtyLiwet.setText(""+qty_liwet);
        displayPriceLiwet(result_liwet);
    }
    private void displayPriceLiwet(double number){
        TextView txtQtyLiwet = (TextView) findViewById(R.id.txt_tot1_harga_liwet);
        txtQtyLiwet.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end liwet

    //=============================================== start to
    public void onClickIncTO(View view){
        qty_to += 1;
        result_to = qty_to*price_to;
        TextView txtQtyLiwet = (TextView) findViewById(R.id.txt_qty_to);
        txtQtyLiwet.setText(""+qty_to);
        displayPriceTO(result_to);
    }
    public void onClickDecTO(View view){
        qty_to -= 1;
        result_to = qty_to*price_to;
        TextView txtQtyLiwet = (TextView) findViewById(R.id.txt_qty_to);
        txtQtyLiwet.setText(""+qty_to);
        displayPriceTO(result_to);
    }
    private void displayPriceTO(double number){
        TextView txtQtyTO = (TextView) findViewById(R.id.txt_tot1_harga_to);
        txtQtyTO.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end to

    //=============================================== start aseum
    public void onClickIncAseum(View view){
        qty_aseum += 1;
        result_aseum = qty_aseum*price_aseum;
        TextView txtQtyAseum = (TextView) findViewById(R.id.txt_qty_aseum);
        txtQtyAseum.setText(""+qty_aseum);
        displayPriceAseum(result_aseum);
    }
    public void onClickDecAseum(View view){
        qty_aseum -= 1;
        result_aseum = qty_aseum*price_aseum;
        TextView txtQtyAseum = (TextView) findViewById(R.id.txt_qty_aseum);
        txtQtyAseum.setText(""+qty_aseum);
        displayPriceAseum(result_aseum);
    }
    private void displayPriceAseum(double number){
        TextView txtQtyAseum = (TextView) findViewById(R.id.txt_tot1_harga_aseum);
        txtQtyAseum.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end aseum

    //=============================================== start asinan
    public void onClickIncAsinan(View view){
        qty_asinan += 1;
        result_asinan = qty_asinan*price_asinan;
        TextView txtQtyAsinan = (TextView) findViewById(R.id.txt_qty_asinan);
        txtQtyAsinan.setText(""+qty_asinan);
        displayPriceAsinan(result_asinan);
    }
    public void onClickDecAsinan(View view){
        qty_asinan -= 1;
        result_asinan = qty_asinan*price_asinan;
        TextView txtQtyAsinan = (TextView) findViewById(R.id.txt_qty_asinan);
        txtQtyAsinan.setText(""+qty_asinan);
        displayPriceAsinan(result_asinan);
    }
    private void displayPriceAsinan(double number){
        TextView txtQtyAsinan = (TextView) findViewById(R.id.txt_tot1_harga_asinan);
        txtQtyAsinan.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end asinan

    //=============================================== start combro
    public void onClickIncCombro(View view){
        qty_combro += 1;
        result_combro = qty_combro*price_combro;
        TextView txtQtyCombro = (TextView) findViewById(R.id.txt_qty_combro);
        txtQtyCombro.setText(""+qty_combro);
        displayPriceCombro(result_combro);
    }
    public void onClickDecCombro(View view){
        qty_combro -= 1;
        result_combro = qty_combro*price_combro;
        TextView txtQtyCombro = (TextView) findViewById(R.id.txt_qty_combro);
        txtQtyCombro.setText(""+qty_combro);
        displayPriceCombro(result_combro);
    }
    private void displayPriceCombro(double number){
        TextView txtQtyCombro = (TextView) findViewById(R.id.txt_tot1_harga_combro);
        txtQtyCombro.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end combro
}
