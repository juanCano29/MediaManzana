package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main18ActivityJK extends AppCompatActivity {
   ImageButton btnmensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18_jk);

        btnmensaje = findViewById(R.id.btnmensajes2);

        btnmensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir = new Intent(Main18ActivityJK.this,Main15ActivityChat.class);
                startActivity(ir);
            }
        });
    }
}
