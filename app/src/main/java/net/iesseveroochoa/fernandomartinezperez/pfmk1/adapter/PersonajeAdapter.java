package net.iesseveroochoa.fernandomartinezperez.pfmk1.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.R;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

import java.util.ArrayList;
import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {
    private List<Personaje> personajes;

    private List<Arma> armas;

    private OnItemClickBorrarListener listenerBorrar;
    private OnItemClickEditarListener listenerEditar;



    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
        notifyDataSetChanged();
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;

        /*
        List<Arma>armasPorPersonaje;
        if (personajes != null && armas != null) {
            for (int i = 0; i < personajes.size(); i++) {
                armasPorPersonaje = new ArrayList<>();
                for (int j = 0; j < armas.size(); j++) {
                    if (personajes.get(i).getIdPersonaje() == armas.get(j).getFkIdPersonaje()){
                        armasPorPersonaje.add(armas.get(j));
                    }
                }
                personajes.get(i).setArmas(armasPorPersonaje);
            }
        }*/
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
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


            holder.tvValorFuerza.setText("Valor:" + String.valueOf(personaje.getValFuerza()));
            holder.tvModFuerza.setText("Modificador:" + String.valueOf(personaje.getModFuerza()));

            holder.tvValorDestreza.setText("Valor:" + String.valueOf(personaje.getValDestreza()));
            holder.tvModDestreza.setText("Modificador:" + String.valueOf(personaje.getModDestreza()));

            holder.tvValorConstitucion.setText("Valor:" + String.valueOf(personaje.getValConstitucion()));
            holder.tvModConstitucion.setText("Modificador:" + String.valueOf(personaje.getModConstitucion()));

            holder.tvValorInteligencia.setText("Valor:" + String.valueOf(personaje.getValInteligencia()));
            holder.tvModInteligencia.setText("Modificador:" + String.valueOf(personaje.getModInteligencia()));

            holder.tvValorSabiduria.setText("Valor:" + String.valueOf(personaje.getValSabiduria()));
            holder.tvModSabiduria.setText("Modificador:" + String.valueOf(personaje.getModSabiduria()));

            holder.tvValorCarisma.setText("Valor:" + String.valueOf(personaje.getValCarisma()));
            holder.tvModCarisma.setText("Modificador:" + String.valueOf(personaje.getModCarisma()));

            holder.tvIniciativa.setText(String.valueOf(personaje.getIniciativa()));
            holder.tvVida.setText(String.valueOf(personaje.getPgMaximos()));


            /*
            holder.tvValorFuerza.setText(R.string.valor + String.valueOf(personaje.getValFuerza()));
            holder.tvModFuerza.setText(R.string.modificador + String.valueOf(personaje.getModFuerza()));

            holder.tvValorDestreza.setText(R.string.valor + String.valueOf(personaje.getValDestreza()));
            holder.tvModDestreza.setText(R.string.modificador + String.valueOf(personaje.getModDestreza()));

            holder.tvValorConstitucion.setText(R.string.valor + String.valueOf(personaje.getValConstitucion()));
            holder.tvModConstitucion.setText(R.string.modificador + String.valueOf(personaje.getModConstitucion()));

            holder.tvValorInteligencia.setText(R.string.valor + String.valueOf(personaje.getValInteligencia()));
            holder.tvModInteligencia.setText(R.string.modificador + String.valueOf(personaje.getModInteligencia()));

            holder.tvValorSabiduria.setText(R.string.valor + String.valueOf(personaje.getValSabiduria()));
            holder.tvModSabiduria.setText(R.string.modificador + String.valueOf(personaje.getModSabiduria()));

            holder.tvValorCarisma.setText(R.string.valor + String.valueOf(personaje.getValCarisma()));
            holder.tvModCarisma.setText(R.string.modificador + String.valueOf(personaje.getModCarisma()));
            */

        }
    }

    @Override
    public int getItemCount() {
        if (personajes != null)
            return personajes.size();
        else return 0;
    }

    public class PersonajeViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvResumen;
        private final TextView tvTecnico;
        private final TextView tvRaza;
        private final TextView tvAlinemiento;
        private final TextView tvTransfondo;
        private final TextView tvClaseArmadura;
        private final TextView tvNivel;

        private final TextView tvValorFuerza;
        private final TextView tvModFuerza;

        private final TextView tvValorDestreza;
        private final TextView tvModDestreza;

        private final TextView tvValorConstitucion;
        private final TextView tvModConstitucion;

        private final TextView tvValorInteligencia;
        private final TextView tvModInteligencia;

        private final TextView tvValorSabiduria;
        private final TextView tvModSabiduria;

        private final TextView tvValorCarisma;
        private final TextView tvModCarisma;

        private final TextView tvIniciativa;
        private final TextView tvVida;


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

            tvValorFuerza = itemView.findViewById(R.id.tvValorFuerza);
            tvModFuerza = itemView.findViewById(R.id.tvModFuerza);

            tvValorDestreza = itemView.findViewById(R.id.tvValorDestreza);
            tvModDestreza = itemView.findViewById(R.id.tvModDestreza);

            tvValorConstitucion = itemView.findViewById(R.id.tvValorConstitucion);
            tvModConstitucion = itemView.findViewById(R.id.tvModConstitucion);

            tvValorInteligencia = itemView.findViewById(R.id.tvValorInteligencia);
            tvModInteligencia = itemView.findViewById(R.id.tvModInteligencia);

            tvValorSabiduria = itemView.findViewById(R.id.tvValorSabiduria);
            tvModSabiduria = itemView.findViewById(R.id.tvModSabiduria);

            tvValorCarisma = itemView.findViewById(R.id.tvValorCarisma);
            tvModCarisma = itemView.findViewById(R.id.tvModCarisma);

            tvIniciativa = itemView.findViewById(R.id.tvIniciativa);
            tvVida = itemView.findViewById(R.id.tvVida);
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
            Personaje personaje =personajes.get(PersonajeViewHolder.this.
                    getBindingAdapterPosition());
            return personaje;
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

