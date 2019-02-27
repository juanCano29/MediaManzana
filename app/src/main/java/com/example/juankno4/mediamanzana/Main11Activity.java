package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Toolbar tool1 = findViewById(R.id.toolbar2);
        setSupportActionBar(tool1);
        getSupportActionBar().setTitle(null);


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

    public void onClick(View view) {
        Intent s=new Intent(this,Main18ActivityJK.class);
        startActivity(s);
    }
}
