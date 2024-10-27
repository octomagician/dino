package com.example.recyclerdino;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.recyclerdino.models.Dinosaurio; //modelo de dinosaurio para recibirlo

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.util.Log;

public class Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalles);

        // Obtener el Intent y el objeto Dinosaurio
        Dinosaurio dinosaurio = (Dinosaurio) getIntent().getSerializableExtra("dinosaurio");

        if (dinosaurio != null) {
            TextView txtnombre = findViewById(R.id.txtnombre); // Reemplaza con el ID correcto en tu layout
            TextView txttipo = findViewById(R.id.txttipo);
            TextView txtdescripcion = findViewById(R.id.txtdescripcion);
            ImageView imgdino = findViewById(R.id.imgdino);

            // Muestra los detalles del dinosaurio
            txtnombre.setText(dinosaurio.getNombre());
            txttipo.setText(dinosaurio.getTipo());
            txtdescripcion.setText(dinosaurio.getDescripcion());
            imgdino.setImageResource(dinosaurio.getImagen());
        } else {
            Log.e("Detalles", "El objeto Dinosaurio es null");
        }
    }
}