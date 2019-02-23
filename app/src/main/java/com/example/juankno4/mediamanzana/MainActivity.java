package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnface,btngo,btnlog;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnface = findViewById(R.id.btnface);
        btngo = findViewById(R.id.btngoogle);
        btnlog = findViewById(R.id.btnlog);
        txt1 = findViewById(R.id.text01);

        btnface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(t);
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(l);
            }
        });
      txt1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent d = new Intent(MainActivity.this,Main6Activity.class);
              startActivity(d);
          }
      });


    }
}
