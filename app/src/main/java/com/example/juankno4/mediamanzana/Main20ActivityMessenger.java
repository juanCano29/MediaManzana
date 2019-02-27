package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main20ActivityMessenger extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20_messenger);
    }

    @Override
    public void onClick(View v) {
        Intent cgt = new Intent(Main20ActivityMessenger.this,Main15ActivityChat.class);
        startActivity(cgt);
    }
}
