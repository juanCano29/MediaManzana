package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main19ActivityJK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19_jk);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lapiz:
                Intent s=new Intent(this,Main10Activity.class);
                startActivity(s);
                break;
            case R.id.galeria:
                Intent x=new Intent(this,Main18ActivityJK.class);
                startActivity(x);
                break;
            case R.id.chat:
                break;
        }
    }
}
