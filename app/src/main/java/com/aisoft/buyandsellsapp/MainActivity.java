package com.aisoft.buyandsellsapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText edBuy, edSell;
    Button calculateBtn;
    TextView tvDisplay;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //find===============================================
        edBuy = findViewById(R.id.edBuy);
        edSell = findViewById(R.id.edsell);
        calculateBtn = findViewById(R.id.calculateBtn);
        tvDisplay = findViewById(R.id.tvDisplay);


        //onClick code here============================================

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               float byPrice, sellPrice, profit, profitPercent;

                byPrice =  Float.parseFloat(edBuy.getText().toString());
                sellPrice = Float.parseFloat(edSell.getText().toString());

                profit = sellPrice-byPrice;
                profitPercent = profit/byPrice*100;


                tvDisplay.setText("লাভঃ "+profit+" টাকা"+"\nপার্সেন্টেজঃ "+profitPercent+"%");




            }
        });

    }
}