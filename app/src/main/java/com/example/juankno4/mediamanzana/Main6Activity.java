package com.example.juankno4.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    private Spinner cmbOpciones, CmbOpciones2;
    CheckBox checkM, checkH,checkPer;
    Button btnreg;
    TextView textacu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btnreg = findViewById(R.id.btnreg);
        checkH = findViewById(R.id.checkH);
        checkM = findViewById(R.id.checkM);
        checkPer = findViewById(R.id.checkPer);
        textacu = findViewById(R.id.txacu);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,
                        R.array.valores_array,
                        android.R.layout.simple_spinner_item);

        cmbOpciones = (Spinner)findViewById(R.id.CmbOpciones);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        cmbOpciones.setAdapter(adapter);


        ArrayAdapter<CharSequence> adapter2 =
                ArrayAdapter.createFromResource(this,
                        R.array.valores_array2,
                        android.R.layout.simple_spinner_item);

        CmbOpciones2 = (Spinner)findViewById(R.id.CmbOpciones2);

        adapter2.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        CmbOpciones2.setAdapter(adapter2);

        textacu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialog = new Intent(Main6Activity.this,Main7Activity.class);
                startActivity(dialog);

            }
        });

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkH.isChecked()){ Intent ir2 = new Intent(Main6Activity.this, Main8Activity.class);
                    startActivity(ir2); }
                if (!checkM.isChecked()){Intent ir3 = new Intent(Main6Activity.this, Main8Activity.class);
                    startActivity(ir3);}
                if (!checkPer.isChecked()){Intent ir4 = new Intent(Main6Activity.this, Main8Activity.class);
                    startActivity(ir4);}
                if (checkH.isChecked() && checkPer.isChecked() ){ Intent ir2 = new Intent(Main6Activity.this, Main9Activity.class);
                    startActivity(ir2); }
                if (checkM.isChecked() && checkPer.isChecked()){Intent ir3 = new Intent(Main6Activity.this, Main9Activity.class);
                    startActivity(ir3);}
            }
        });



    }
}
