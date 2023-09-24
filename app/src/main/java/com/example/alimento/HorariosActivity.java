package com.example.alimento;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class HorariosActivity extends AppCompatActivity {

    private int cantidadComidas; // Variable para almacenar la cantidad de comidas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);

        // Recuperar la cantidad de comidas seleccionadas (pasada como extra desde la actividad anterior)
        cantidadComidas = getIntent().getIntExtra("cantidadComidas", 2);

        // Configurar los TimePicker según la cantidad de comidas
        configureTimePickers();
    }

    private void configureTimePickers() {
        // Configurar el primer TimePicker
        TimePicker timePicker1 = findViewById(R.id.timePicker1);

        // Configurar el segundo TimePicker (y más, si es necesario)
        TimePicker timePicker2 = findViewById(R.id.timePicker2);
        timePicker2.setVisibility(cantidadComidas >= 2 ? View.VISIBLE : View.GONE);

        // Configurar otros TimePicker según la cantidad de comidas
        // ...

        // Configurar el botón para guardar alarmas
        Button btnGuardar = findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Determinar la cantidad de alarmas según la ID del botón presionado
                int cantidadAlarmas = 0;
                switch (cantidadComidas) {
                    case 2:
                        cantidadAlarmas = 2;
                        break;
                    case 3:
                        cantidadAlarmas = 3;
                        break;
                    case 4:
                        cantidadAlarmas = 4;
                        break;
                    case 5:
                        cantidadAlarmas = 5;
                        break;
                }

                // Aquí puedes guardar las alarmas según las horas seleccionadas en los TimePicker
                // y la cantidad de comidas (cantidadAlarmas)

                // Ejemplo de cómo pasar información de vuelta a DatosPerro
                Intent intent = new Intent();
                intent.putExtra("alarmasGuardadas", true); // Indicar que las alarmas se han guardado
                setResult(RESULT_OK, intent);
                finish(); // Cierra esta actividad y vuelve a DatosPerro
            }
        });
    }
}
