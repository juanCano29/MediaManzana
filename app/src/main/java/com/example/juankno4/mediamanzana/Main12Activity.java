package com.example.juankno4.mediamanzana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main12Activity extends AppCompatActivity {

    ListView lt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        lt=(ListView)findViewById(R.id.config);


//        para generar un listview generico
        String configuracion[]={"Acuerdos de privacidad y seguridad","idioma","notificaciones"};

//        para contruir un adaptador se necesita el diseño y el
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,configuracion);

        lt.setAdapter(aa);
    }
}
