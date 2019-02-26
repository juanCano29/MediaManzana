package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
Button btnno, btnsigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
      btnno = findViewById(R.id.btnno);
      btnsigo = findViewById(R.id.btnsigo);

      btnno.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              onBackPressed();
              finish();
          }
      });
      btnsigo.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent ir = new Intent(Main4Activity.this, Main9Activity.class);
              startActivity(ir);
          }
      });

    }
}
