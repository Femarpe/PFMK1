package net.iesseveroochoa.fernandomartinezperez.pfmk1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


import net.iesseveroochoa.fernandomartinezperez.pfmk1.R;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {
    private List<Personaje> personajes;
    private OnItemClickBorrarListener listenerBorrar;
    private OnItemClickEditarListener listenerEditar;

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        if (personajes != null) {
            final Personaje personaje = personajes.get(position);

            holder.tvResumen.setText(personaje.getNombrePersonaje());
            holder.tvTecnico.setText(personaje.getClase());
            holder.tvRaza.setText(personaje.getRaza());
            holder.tvAlinemiento.setText(personaje.getAlinemiento());
            holder.tvTransfondo.setText(personaje.getTransfondo());
            holder.tvClaseArmadura.setText(String.valueOf(personaje.getClaseArmadura()));
            holder.tvNivel.setText(personaje.getNivel());

        }
    }

    @Override
    public int getItemCount() {
        if (personajes != null)
            return personajes.size();
        else return 0;
    }

    public class PersonajeViewHolder extends RecyclerView.ViewHolder {

        private TextView tvResumen;
        private TextView tvTecnico;
        private TextView tvRaza;
        private TextView tvAlinemiento;
        private TextView tvTransfondo;
        private TextView tvClaseArmadura;
        private TextView tvNivel;

        private ConstraintLayout clItem;

        private PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvResumen = itemView.findViewById(R.id.tvNombre);
            tvTecnico = itemView.findViewById(R.id.tvClase);
            tvRaza = itemView.findViewById(R.id.tvRaza);
            tvAlinemiento = itemView.findViewById(R.id.tvAlineamiento);
            tvTransfondo = itemView.findViewById(R.id.tvTransfondo);
            tvClaseArmadura = itemView.findViewById(R.id.tvClaseArmadura);
            tvNivel = itemView.findViewById(R.id.tvNivel);

                    /*
            ivBorrar = itemView.findViewById(R.id.ivBorrar);
            ivBorrar.setOnClickListener(v -> listenerBorrar.onItemClickBorrar(
                    personajes.get(PersonajeViewHolder.this.getAbsoluteAdapterPosition())));
            */


            clItem = itemView.findViewById(R.id.clItem);
            clItem.setOnClickListener(v -> listenerEditar.onItemClickEditar(
                    personajes.get(PersonajeViewHolder.this.getAbsoluteAdapterPosition())));

        }

        public Personaje getPersonaje() {
            return personajes.get(PersonajeViewHolder.this.
                    getBindingAdapterPosition());
        }

    }

    public interface OnItemClickBorrarListener {
        void onItemClickBorrar(Personaje personaje);
    }

    public interface OnItemClickEditarListener {
        void onItemClickEditar(Personaje personaje);
    }

    public void setOnItemClickBorrarListener(OnItemClickBorrarListener listener) {
        this.listenerBorrar = listener;

    }

    public void setOnItemClickEditarListener(OnItemClickEditarListener listener) {
        this.listenerEditar = listener;

    }

}

