package com.example.juankno4.mediamanzana;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {
ImageView imgd;
TextView txt1d,txt2d;
Button btncerrar;
Integer id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        btncerrar = findViewById(R.id.btncerrar);

        btncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
       showDialog(v.getId());
    }



    @Override
    protected Dialog onCreateDialog(int id)
    {
        Dialog dialogo = new Dialog(this);

        Window w = dialogo.getWindow();

       int flag = WindowManager.LayoutParams.FLAG_SHOW_WALLPAPER;

       w.setFlags(flag,flag);

       dialogo.setTitle("Dialogo Basico");

       dialogo.setContentView(R.layout.activity_main7);

       imgd = (ImageView) dialogo.findViewById(R.id.crz);
       txt1d = (TextView) dialogo.findViewById(R.id.textoD);
       txt2d = (TextView) dialogo.findViewById(R.id.texto0D);

    return dialogo;
    }
}
