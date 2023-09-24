package com.example.alimento;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DatosPerro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_perro);

        // Configura botones para seleccionar la cantidad de comidas
        Button btn_v2 = findViewById(R.id.v2);
        Button btn_v3 = findViewById(R.id.v3);
        Button btn_v4 = findViewById(R.id.v4);
        Button btn_v5 = findViewById(R.id.v5);

        btn_v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarHorariosActivity(2);
            }
        });

        btn_v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarHorariosActivity(3);
            }
        });

        btn_v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarHorariosActivity(4);
            }
        });

        btn_v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarHorariosActivity(5);
            }
        });
    }

    private void iniciarHorariosActivity(int cantidadComidas) {
        Intent intent = new Intent(DatosPerro.this, HorariosActivity.class);
        intent.putExtra("cantidadComidas", cantidadComidas);
        startActivity(intent);
    }
}
