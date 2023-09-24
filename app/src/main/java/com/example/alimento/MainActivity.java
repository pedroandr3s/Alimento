package com.example.alimento;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encuentra los ImageButtons por sus IDs
        ImageButton botonOtro = findViewById(R.id.ibOtro);
        ImageButton botonPerro = findViewById(R.id.ibPerro);
        ImageButton botonGato = findViewById(R.id.ibGato);
        ImageButton botonCanario = findViewById(R.id.ibCanario);

        // Configura OnClickListener para cada botón
        botonOtro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear Intent para iniciar la actividad DatosOtro
                Intent intent = new Intent(MainActivity.this, DatosOtro.class);
                startActivity(intent);
            }
        });

        botonPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear Intent para iniciar la actividad DatosPerro
                Intent intent = new Intent(MainActivity.this, DatosPerro.class);
                startActivity(intent);
            }
        });

        botonGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear Intent para iniciar la actividad DatosGato
                Intent intent = new Intent(MainActivity.this, DatosPerro.class);
                startActivity(intent);
            }
        });

        botonCanario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear Intent para iniciar la actividad DatosCanario
                Intent intent = new Intent(MainActivity.this, DatosPerro.class);
                startActivity(intent);
            }
        });
    }
}
