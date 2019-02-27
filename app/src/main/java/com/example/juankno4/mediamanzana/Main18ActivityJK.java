package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class Main18ActivityJK extends AppCompatActivity {
   ImageButton btnmensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18_jk);
        android.support.v7.widget.Toolbar tool = findViewById(R.id.toolbar2);
        setSupportActionBar(tool);
        getSupportActionBar().setTitle(null);

        btnmensaje = findViewById(R.id.btnmensajes2);

        btnmensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir = new Intent(Main18ActivityJK.this,Main15ActivityChat.class);
                startActivity(ir);
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
}
