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
        Intent toTO = new Intent(this, TOActivity.class);
        startActivity(toTO);
    }
    public void intentToAseum(View view){
        Intent toErorr = new Intent(this, ContentErrorActivity.class);
        startActivity(toErorr);
    }
    public void intentToAsinan(View view){
        Intent toErorr = new Intent(this, ContentErrorActivity.class);
        startActivity(toErorr);
    }
    public void intentToCombro(View view){
        Intent toErorr = new Intent(this, ContentErrorActivity.class);
        startActivity(toErorr);
    }
    public void intentToSurabi(View view){
        Intent toErorr = new Intent(this, ContentErrorActivity.class);
        startActivity(toErorr);
    }
    public void intentToCendol(View view){
        Intent toErorr = new Intent(this, ContentErrorActivity.class);
        startActivity(toErorr);
    }
    public void intentToEslilin(View view){
        Intent toErorr = new Intent(this, ContentErrorActivity.class);
        startActivity(toErorr);
    }

    double result_liwet = 0, result_to = 0, result_aseum = 0, result_asinan = 0, result_combro = 0, result_surabi = 0
            , result_cendol = 0, result_eslilin = 0;
    int price_liwet = 35000, qty_liwet= 0, price_to = 15000, qty_to = 0, price_aseum = 5000, qty_aseum = 0,
            price_asinan = 10000, qty_asinan = 0, price_combro = 2000, qty_combro = 0, price_surabi = 12000, qty_surabi = 0
            , price_cendol = 8000, qty_cendol = 0, price_eslilin = 1000, qty_eslilin = 0;

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
        TextView txtPriceLiwet = (TextView) findViewById(R.id.txt_tot1_harga_liwet);
        txtPriceLiwet.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end liwet

    //=============================================== start to
    public void onClickIncTO(View view){
        qty_to += 1;
        result_to = qty_to*price_to;
        TextView txtQtyTo = (TextView) findViewById(R.id.txt_qty_to);
        txtQtyTo.setText(""+qty_to);
        displayPriceTO(result_to);
    }
    public void onClickDecTO(View view){
        qty_to -= 1;
        result_to = qty_to*price_to;
        TextView txtQtyTo = (TextView) findViewById(R.id.txt_qty_to);
        txtQtyTo.setText(""+qty_to);
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

    //=============================================== start surabi
    public void onClickIncSurabi(View view){
        qty_surabi += 1;
        result_surabi = qty_surabi*price_surabi;
        TextView txtQtySurabi = (TextView) findViewById(R.id.txt_qty_surabi);
        txtQtySurabi.setText(""+qty_surabi);
        displayPriceSurabi(result_surabi);
    }
    public void onClickDecSurabi(View view){
        qty_surabi -= 1;
        result_surabi = qty_surabi*price_surabi;
        TextView txtQtySurabi = (TextView) findViewById(R.id.txt_qty_surabi);
        txtQtySurabi.setText(""+qty_surabi);
        displayPriceSurabi(result_surabi);
    }
    private void displayPriceSurabi(double number){
        TextView txtQtySurabi = (TextView) findViewById(R.id.txt_tot1_harga_surabi);
        txtQtySurabi.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end surabi

    //=============================================== start cendol
    public void onClickIncCendol(View view){
        qty_cendol += 1;
        result_cendol = qty_cendol*price_cendol;
        TextView txtQtyCendol = (TextView) findViewById(R.id.txt_qty_cendol);
        txtQtyCendol.setText(""+qty_cendol);
        displayPriceCendol(result_cendol);
    }
    public void onClickDecCendol(View view){
        qty_cendol -= 1;
        result_cendol = qty_cendol*price_cendol;
        TextView txtQtyCendol = (TextView) findViewById(R.id.txt_qty_cendol);
        txtQtyCendol.setText(""+qty_cendol);
        displayPriceCendol(result_cendol);
    }
    private void displayPriceCendol(double number){
        TextView txtQtyCendol = (TextView) findViewById(R.id.txt_tot1_harga_cendol);
        txtQtyCendol.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end cendol

    //=============================================== start eslilin
    public void onClickIncEslilin(View view){
        qty_eslilin += 1;
        result_eslilin = qty_eslilin*price_eslilin;
        TextView txtQtyEslilin = (TextView) findViewById(R.id.txt_qty_eslilin);
        txtQtyEslilin.setText(""+qty_eslilin);
        displayPriceEslilin(result_eslilin);
    }
    public void onClickDecEslilin(View view){
        qty_eslilin -= 1;
        result_eslilin = qty_eslilin*price_eslilin;
        TextView txtQtyEslilin = (TextView) findViewById(R.id.txt_qty_eslilin);
        txtQtyEslilin.setText(""+qty_eslilin);
        displayPriceEslilin(result_eslilin);
    }
    private void displayPriceEslilin(double number){
        TextView txtQtyEslilin = (TextView) findViewById(R.id.txt_tot1_harga_eslilin);
        txtQtyEslilin.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    //=============================================== end eslilin

    public void hitungTotal(View view){
        displayTotal(result_eslilin, result_cendol, result_surabi, result_combro, result_asinan, result_aseum, result_liwet, result_to);
    }
    private void displayTotal(double eslilin, double cendol, double surabi, double combro, double asinan, double aseum, double liweut, double to){
        double hasil = eslilin+cendol+surabi+combro+asinan+aseum+liweut+to;
        TextView txtTotal = (TextView) findViewById(R.id.txt_tot_harga);
        txtTotal.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hasil));
    }
}
