package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main11Activity extends AppCompatActivity {
 ImageButton btnmensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Toolbar tool1 = findViewById(R.id.toolbar2);
        setSupportActionBar(tool1);
        getSupportActionBar().setTitle(null);

        btnmensaje = findViewById(R.id.btnmensajes);

        btnmensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main11Activity.this, Main15ActivityChat.class);
                startActivity(it);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.conf:
                Intent s=new Intent(this,Main12Activity.class);
                startActivity(s);
                return true;
            case R.id.acercade:
                Intent a=new Intent(this,Main7Activity.class);
                startActivity(a);
                return true;
            case R.id.contact:
                Intent b=new Intent(this,Main17ActivityJK.class);
                startActivity(b);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClick(View v) {

        switch (v.getId()){
            case R.id.perfil:
                Intent x=new Intent(this,Main19ActivityJK.class);
                break;
            case R.id.galeria:
                Intent s=new Intent(this,Main18ActivityJK.class);
                startActivity(s);
                break;
        }

    }

    public void  click(View view) {
        Intent cgt = new Intent(Main11Activity.this,Main20ActivityMessenger.class);
        startActivity(cgt);
    }
}
