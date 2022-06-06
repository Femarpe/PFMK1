package net.iesseveroochoa.fernandomartinezperez.pfmk1.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.CrearActivity;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.CrearEditarActivity;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.R;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.adapter.PersonajeAdapter;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.databinding.ActivityMainBinding;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.ArmaVM;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.PersonajeVM;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final int OPTION_REQUEST_CREAR = 1;
    public static final int OPTION_REQUEST_EDITAR = 2;
    private static final String EXTRA_PERSONAJE = "EXTRA_PERSONAJE";
    private RecyclerView rvPersonajes;
    private FloatingActionButton fabnPersonaje;
    private ActivityMainBinding binding;
    PersonajeVM personajeVM;
    ArmaVM armaVM;
    PersonajeAdapter adapter;
    private SearchView svBusqueda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setContentView(R.layout.activity_main);


        rvPersonajes = findViewById(R.id.rvPersonajes);

        fabnPersonaje = findViewById(R.id.fabNuevoPersonaje);
        adapter = new PersonajeAdapter();

        rvPersonajes.setLayoutManager(new LinearLayoutManager(this));
        rvPersonajes.setAdapter(adapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        personajeVM = new ViewModelProvider(this).get(PersonajeVM.class);
        personajeVM.getListaPersonajes().observe(this, adapter::setPersonajes);

        armaVM = new ViewModelProvider(this).get(ArmaVM.class);
        armaVM.getListaArmas().observe(this, adapter::setArmas);

        int orientation = getResources().getConfiguration().orientation;
        //una fila
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            rvPersonajes.setLayoutManager(new LinearLayoutManager(this));
        }
        else {
            rvPersonajes.setLayoutManager(new GridLayoutManager(this, 2));
        }

        fabnPersonaje.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CrearActivity.class);
            int codigoNuevoPersonaje = OPTION_REQUEST_CREAR;
            startActivityForResult(intent, codigoNuevoPersonaje);
        });

        adapter.setOnItemClickBorrarListener(personaje -> {

            AlertDialog.Builder builder =
                    new AlertDialog.Builder(MainActivity.this);

            builder.setMessage(getString(R.string.mensageBorrar) + personaje.getIdPersonaje() + "?").setTitle(R.string.borrar)
                    .setPositiveButton("Ok", (dialog, id) -> {

                        personajeVM.delPersonaje(personaje);
                        dialog.cancel();

                    })
                    .setNegativeButton(R.string.cancelar, (dialog, which) -> dialog.cancel());
            builder.show();

        });


        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView,
                                  RecyclerView.ViewHolder
                                          viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder
                                         viewHolder, int
                                         swipeDir) {

                Personaje personajeDelete = ((PersonajeAdapter.PersonajeViewHolder) viewHolder).getPersonaje();
                personajeVM.delPersonaje(personajeDelete);
            }
        };
        ItemTouchHelper itemTouchHelper = new
                ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(rvPersonajes);


        adapter.setOnItemClickEditarListener(personaje -> {
            personaje.setArmas(armaVM.getArmasPorPersonaje(personaje.getIdPersonaje()));
            Intent intent = new Intent(MainActivity.this, CrearActivity.class);
            intent.putExtra(EXTRA_PERSONAJE, personaje);
            startActivityForResult(intent, OPTION_REQUEST_EDITAR);
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            Personaje personaje = data.getParcelableExtra(EXTRA_PERSONAJE);

            if (requestCode == OPTION_REQUEST_CREAR) {

                personajeVM.addPersonaje(personaje);
                addArmas(personaje.getArmas(),personaje.getIdPersonaje());
            } else if (requestCode == OPTION_REQUEST_EDITAR) {

                personajeVM.addPersonaje(personaje);
                addArmas(personaje.getArmas(),personaje.getIdPersonaje());
            }
        }
    }

    public void addArmas(List<Arma> armas, int idPersonaje){
        for (int i = 0; i < armas.size(); i++) {
            armas.get(i).setFkIdPersonaje(idPersonaje);
            armaVM.addArma(armas.get(i));
        }
    }
    private void addEjemplo() {

        Personaje personaje = new Personaje(
                "Euris",
                "Guerrero Arcano",
                "Semielfo",
                "Legal Neutral",
                "7",
                "Oficial",
                "4d10",
                3,
                2,
                17,
                40,
                73,
                73,
                14);

        personaje.setValorCaracteristicas(16, 14, 14, 15, 12, 12, 3);

        Arma arma = new Arma(1, "artema", "999", "mucho", "destruccion");


        personajeVM.addPersonaje(personaje);
        armaVM.addArma(arma);
    }
}
