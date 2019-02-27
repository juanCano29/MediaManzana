package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Main12Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        btn1 = findViewById(R.id.priv);
        btn2 = findViewById(R.id.idi);
        btn3 = findViewById(R.id.noti);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.priv:
                Intent s = new Intent(this, Main14ActivityJK.class);
                startActivity(s);
                break;
            case R.id.idi:
                Intent x = new Intent(this, Main13Activity.class);
                startActivity(x);
                break;
            case R.id.noti:
                Intent y = new Intent(this, Main15ActivityJK.class);
                startActivity(y);
                break;


        }
    }
}
