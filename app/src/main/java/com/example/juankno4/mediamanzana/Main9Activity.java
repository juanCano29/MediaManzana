package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Main9Activity extends AppCompatActivity {
 ImageView Image1,Image2,Image3,Image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Toolbar tool = findViewById(R.id.toolbar2);
        setSupportActionBar(tool);
        getSupportActionBar().setTitle(null);

        Image1 = findViewById(R.id.Image1);
        Image2 = findViewById(R.id.Image2);
        Image3 = findViewById(R.id.Image3);
        Image4 = findViewById(R.id.Image4);


        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pf1 = new Intent(Main9Activity.this,Main11Activity.class);
                startActivity(pf1);
            }
        });
        Image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pf2 = new Intent(Main9Activity.this,Main11Activity.class);
                startActivity(pf2);
            }
        });
        Image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pf3 = new Intent(Main9Activity.this,Main11Activity.class);
                startActivity(pf3);
            }
        });
        Image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pf4 = new Intent(Main9Activity.this,Main11Activity.class);
                startActivity(pf4);
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

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
