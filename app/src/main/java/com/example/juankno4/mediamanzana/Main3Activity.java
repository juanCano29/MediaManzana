package com.example.juankno4.mediamanzana;




import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        new CountDownTimer(10000,2000) {
            @Override
            public void onTick(long millisUntilFinished) {

                Toast.makeText(Main3Activity.this, "Cargando...", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFinish() {
                Intent t = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(t);
                finish();
            }
        }.start();

    }

}
