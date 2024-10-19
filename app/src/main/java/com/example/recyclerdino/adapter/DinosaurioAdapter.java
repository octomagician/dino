package com.example.recyclerdino.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerdino.R;
import com.example.recyclerdino.models.Dinosaurio;

import java.util.List;

/* Entonces, mi clase adaptador hereda de RecyclerView.Adapter para ser el adaptador,
y usa el ViewHolder, que ayuda a inflar (crear) las vistas de cada ítem solo una vez
en lugar de hacerlo cada vez que un elemento de la lista se despliega.*/
public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosaurioViewHolder>{
    private List<Dinosaurio> dinosaurioslista;

    //crea la lista de dinosaurios(objeto) llamada dinosaurioslista
    // Lo mete a la lista que podemos usar en este entorno
    public DinosaurioAdapter(List<Dinosaurio> dinosaurioslista) {
        this.dinosaurioslista = dinosaurioslista;
    }

    //onCreateViewHolder()
    //inflar/crear la vista del ítem a partir de un archivo de layout (itemdino.xml)
    @NonNull
    @Override
    public DinosaurioAdapter.DinosaurioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemdino, parent, false);

        return new DinosaurioViewHolder(view);
    }

    //getItemCount
    // Devuelve el número total de elementos que tiene la lista
    @Override
    public int getItemCount() {
        return dinosaurioslista.size();
    }

    //onBindViewHolder
    //enlaza los datos con las vistas que se crearon
    //Sabe en qué iteración vamos, Obtiene los datos del ítem y Llama a DinosaurioViewHolder
    @Override
    public void onBindViewHolder(@NonNull DinosaurioAdapter.DinosaurioViewHolder holder, int position) {
        holder.setData(dinosaurioslista.get(position));
    }

    //Asigna qué dato va en qué vista (o sea en dónde)
    public class DinosaurioViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre,txttipo,txtdescripcion;
        ImageView imgdino;
        Dinosaurio dino;
        public DinosaurioViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.txtnombre);
            txttipo = itemView.findViewById(R.id.txttipo);
            txtdescripcion = itemView.findViewById(R.id.txtdescripcion);
            imgdino = itemView.findViewById(R.id.imgdino);
        }

        public void setData(Dinosaurio dinosaurio) {
            dino=dinosaurio;
            txtnombre.setText(dino.getNombre());
            txttipo.setText(dino.getTipo());
            txtdescripcion.setText(dino.getDescripcion());
            imgdino.setImageResource(dino.getImagen());
        }
    }
}
