package com.example.recyclerdino;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerdino.adapter.DinosaurioAdapter;
import com.example.recyclerdino.models.Dinosaurio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerDino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //se busca el RecyclerView usando su ID
        recyclerDino = findViewById(R.id.recyclerDino);

        // lista vacía de objetos de tipo Dinosaurio llamada dinosaurioLista
        List<Dinosaurio> dinosaurioLista=new ArrayList<>();
        //cada dino es diferente por las propiedades que reciben por el constructor
        dinosaurioLista.add(new Dinosaurio("T-rex", "Carnívoro", "Es un dinosaurio muy comelón", "Verde", R.drawable.di1));
        dinosaurioLista.add(new Dinosaurio("Velociraptor", "Carnívoro", "Es rápido y ágil, caza en grupo", "Marrón", R.drawable.di2));
        dinosaurioLista.add(new Dinosaurio("Triceratops", "Herbívoro", "Tiene tres cuernos y una gran protección en su cabeza", "Gris", R.drawable.di3));
        dinosaurioLista.add(new Dinosaurio("Stegosaurus", "Herbívoro", "Su espalda está cubierta de placas óseas", "Verde", R.drawable.di4));
        dinosaurioLista.add(new Dinosaurio("Spinosaurus", "Carnívoro", "Es uno de los dinosaurios más grandes, con una enorme vela en su espalda", "Rojo", R.drawable.di5));
        dinosaurioLista.add(new Dinosaurio("Brachiosaurus", "Herbívoro", "Un gigante con un largo cuello que alcanza las copas de los árboles", "Gris", R.drawable.di6));
        dinosaurioLista.add(new Dinosaurio("Ankylosaurus", "Herbívoro", "Tiene una cola en forma de maza para defenderse", "Marrón", R.drawable.di7));
        dinosaurioLista.add(new Dinosaurio("Pteranodon", "Carnívoro", "Este dinosaurio volador cazaba peces desde el aire", "Azul", R.drawable.di8));
        dinosaurioLista.add(new Dinosaurio("Diplodocus", "Herbívoro", "Con su cola y cuello largos, era uno de los más largos", "Gris", R.drawable.di9));
        dinosaurioLista.add(new Dinosaurio("Allosaurus", "Carnívoro", "Cazaba en grupo y era muy feroz", "Verde oscuro", R.drawable.di10));

        //se instancia el adaptador (el que traduce a vista)
        DinosaurioAdapter adapter = new DinosaurioAdapter(dinosaurioLista);
        //fusión adaptador con recycler, lista vertical, todos del mismo tamaño
        recyclerDino.setAdapter(adapter);
        recyclerDino.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerDino.setHasFixedSize(true);
    }
}