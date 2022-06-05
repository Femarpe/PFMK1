package net.iesseveroochoa.fernandomartinezperez.pfmk1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

public class CrearActivity extends AppCompatActivity {
    private static final String EXTRA_PERSONAJE = "EXTRA_PERSONAJE";
    private Personaje personajeAEditar;
    private boolean esEdicion = true;

    private EditText etNombre;
    private EditText etClase;
    private EditText etRaza;
    private EditText etAlinemiento;
    private EditText etNivel;
    private EditText etTransfondo;
    private EditText etDadosGolpe;
    private EditText etBonCom;
    private EditText etIniciativa;
    private EditText etClasArmadura;
    private EditText etVelocidad;
    private EditText etPuntosGolpeMax;
    private EditText etPuntosGolpeAtc;
    private EditText etPercepPasiva;
    private EditText etFuerza;
    private EditText etDestreza;
    private EditText etConstitucion;
    private EditText etInteligencia;
    private EditText etSabiduria;
    private EditText etCarisma;
    private FloatingActionButton fabGuardar;
    private Button btVerArmas;
    private Button btAddEspada;
    private Button btAddHacha;
    private Button btAddLanza;
    private Button btAddMaza;
    boolean tieneEspada = false;
    boolean tieneHacha = false;
    boolean tieneLanza = false;
    boolean tieneMaza = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        fabGuardar = findViewById(R.id.fabGuardar);


        etNombre = findViewById(R.id.etNombre);
        etClase = findViewById(R.id.etClase);
        etRaza = findViewById(R.id.etRaza);
        etAlinemiento = findViewById(R.id.etAlinemiento);
        etNivel = findViewById(R.id.etNivel);
        etTransfondo = findViewById(R.id.etTransfondo);
        etDadosGolpe = findViewById(R.id.etDadosGolpe);
        etBonCom = findViewById(R.id.etBonCom);
        etIniciativa = findViewById(R.id.etIniciativa);
        etClasArmadura = findViewById(R.id.etClasArmadura);
        etVelocidad = findViewById(R.id.etVelocidad);
        etPuntosGolpeMax = findViewById(R.id.etPuntosGolpeMax);
        etPuntosGolpeAtc = findViewById(R.id.etPuntosGolpeAtc);
        etPercepPasiva = findViewById(R.id.etPercepPasiva);
        etFuerza = findViewById(R.id.etFuerza);
        etDestreza = findViewById(R.id.etDestreza);
        etConstitucion = findViewById(R.id.etConstitucion);
        etInteligencia = findViewById(R.id.etInteligencia);
        etSabiduria = findViewById(R.id.etSabiduria);
        etCarisma = findViewById(R.id.etCarisma);

        btVerArmas = findViewById(R.id.btVerArmas);
        btAddEspada = findViewById(R.id.btAddEspada);
        btAddHacha = findViewById(R.id.btAddHacha);
        btAddLanza = findViewById(R.id.btAddLanza);
        btAddMaza = findViewById(R.id.btAddMaza);

        Intent intent = new Intent();


        personajeAEditar = getIntent().getParcelableExtra(EXTRA_PERSONAJE);
        if (personajeAEditar != null) {
            etNombre.setText(personajeAEditar.getNombrePersonaje());
            etClase.setText(personajeAEditar.getClase());
            etRaza.setText(personajeAEditar.getRaza());
            etAlinemiento.setText(personajeAEditar.getAlinemiento());
            etNivel.setText(personajeAEditar.getNivel());
            etTransfondo.setText(personajeAEditar.getTransfondo());
            etDadosGolpe.setText(personajeAEditar.getDadosDeGolpe());
            etBonCom.setText(String.valueOf(personajeAEditar.getBonCompetencia()));
            etIniciativa.setText(String.valueOf(personajeAEditar.getIniciativa()));
            etClasArmadura.setText(String.valueOf(personajeAEditar.getClaseArmadura()));
            etVelocidad.setText(String.valueOf(personajeAEditar.getVelocidad()));
            etPuntosGolpeMax.setText(String.valueOf(personajeAEditar.getPgMaximos()));
            etPuntosGolpeAtc.setText(String.valueOf(personajeAEditar.getPgActuales()));
            etPercepPasiva.setText(String.valueOf(personajeAEditar.getPercepcionPasiva()));
            etFuerza.setText(String.valueOf(personajeAEditar.getValFuerza()));
            etDestreza.setText(String.valueOf(personajeAEditar.getValDestreza()));
            etConstitucion.setText(String.valueOf(personajeAEditar.getValConstitucion()));
            etInteligencia.setText(String.valueOf(personajeAEditar.getValInteligencia()));
            etSabiduria.setText(String.valueOf(personajeAEditar.getValSabiduria()));
            etCarisma.setText(String.valueOf(personajeAEditar.getValCarisma()));

        } else {
            esEdicion = false;
            tieneEspada = false;
            tieneLanza = false;
            tieneHacha = false;
            tieneMaza = false;
        }


        btVerArmas.setOnClickListener(view -> {
            Toast.makeText(CrearActivity.this,
                    "nombre: Espada, bono: 6+1, daño: 1d6, tipo de daño: cortante \n" +
                            "nombre: Lanza, bono: 7+1, daño: 1d10, tipo de daño: perforante \n" +
                            "nombre: Hacha, bono: 5+1, daño: 1d8, tipo de daño: cortante \n" +
                            "nombre: Maza, bono: 6+1, daño: 1d6, tipo de daño: contundente",
                    Toast.LENGTH_LONG).show();
        });
        btAddEspada.setOnClickListener(view -> {
            Arma armaABorrar = null;
            tieneEspada = false;
            for (int i = 0; i < personajeAEditar.getArmas().size(); i++) {
                if (personajeAEditar.getArmas().get(i).getNombre().equals("Espada")) {
                    armaABorrar = personajeAEditar.getArmas().get(i);
                    tieneEspada = true;
                } else {
                    tieneEspada = false;
                }
            }
            if (!tieneEspada) {
                personajeAEditar.getArmas().add(new Arma(
                        "Espada", "6+1", "1d6", "cortante"));
                btAddEspada.setBackgroundColor(getResources().getColor(R.color.rosa));
            } else {
                personajeAEditar.getArmas().remove(armaABorrar);
                btAddEspada.setBackgroundColor(getResources().getColor(R.color.Prussian_blue));

            }
        });
        btAddHacha.setOnClickListener(view -> {
            for (int i = 0; i < personajeAEditar.getArmas().size(); i++) {
                if (personajeAEditar.getArmas().get(i).getNombre().equals("Hacha")) {
                    personajeAEditar.getArmas().remove(personajeAEditar.getArmas().get(i));
                    tieneHacha = false;
                }
            }
            if (!tieneHacha) {
                personajeAEditar.getArmas().add(new Arma(
                        "Hacha", "5+1", "1d8", "cortante"));
            }
        });
        btAddLanza.setOnClickListener(view -> {
            for (int i = 0; i < personajeAEditar.getArmas().size(); i++) {
                if (personajeAEditar.getArmas().get(i).getNombre().equals("Lanza")) {
                    personajeAEditar.getArmas().remove(personajeAEditar.getArmas().get(i));
                    tieneLanza = false;
                }
            }
            if (!tieneLanza) {
                personajeAEditar.getArmas().add(new Arma(
                        "Lanza", "7+1", "1d10", "perforante"));
            }
        });
        btAddMaza.setOnClickListener(view -> {
            for (int i = 0; i < personajeAEditar.getArmas().size(); i++) {
                if (personajeAEditar.getArmas().get(i).getNombre().equals("Maza")) {
                    personajeAEditar.getArmas().remove(personajeAEditar.getArmas().get(i));
                    tieneMaza = false;
                }
            }
            if (!tieneMaza) {
                personajeAEditar.getArmas().add(new Arma(
                        "Maza", "6+1", "1d6", "contundente"));
            }
        });


        fabGuardar.setOnClickListener(v -> {
            if (etNombre.getText().toString().isEmpty() || etNivel.getText().toString().isEmpty()) {

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(CrearActivity.this);

                builder.setMessage(getString(R.string.cvacioMensage))
                        .setTitle(R.string.campovacio)
                        .setPositiveButton("Ok", (dialog, id) -> dialog.cancel());

                builder.show();
            } else {

                Personaje personajeAGuardar;

                if (esEdicion) {
                    personajeAGuardar = new Personaje(
                            personajeAEditar.getIdPersonaje(),
                            etNombre.getText().toString(),
                            etClase.getText().toString(),
                            etRaza.getText().toString(),
                            etAlinemiento.getText().toString(),
                            etNivel.getText().toString(),
                            etTransfondo.getText().toString(),
                            etDadosGolpe.getText().toString(),
                            Integer.parseInt(etBonCom.getText().toString()),
                            Integer.parseInt(etIniciativa.getText().toString()),
                            Integer.parseInt(etClasArmadura.getText().toString()),
                            Integer.parseInt(etVelocidad.getText().toString()),
                            Integer.parseInt(etPuntosGolpeMax.getText().toString()),
                            Integer.parseInt(etPuntosGolpeAtc.getText().toString()),
                            Integer.parseInt(etPercepPasiva.getText().toString()));

                    personajeAGuardar.setValorCaracteristicas(Integer.parseInt(etFuerza.getText().toString()),
                            Integer.parseInt(etDestreza.getText().toString()),
                            Integer.parseInt(etConstitucion.getText().toString()),
                            Integer.parseInt(etInteligencia.getText().toString()),
                            Integer.parseInt(etSabiduria.getText().toString()),
                            Integer.parseInt(etCarisma.getText().toString()), Integer.parseInt(etBonCom.getText().toString()));

                } else {
                    personajeAGuardar = new Personaje(
                            etNombre.getText().toString(),
                            etClase.getText().toString(),
                            etRaza.getText().toString(),
                            etAlinemiento.getText().toString(),
                            etNivel.getText().toString(),
                            etTransfondo.getText().toString(),
                            etDadosGolpe.getText().toString(),
                            Integer.parseInt(etBonCom.getText().toString()),
                            Integer.parseInt(etIniciativa.getText().toString()),
                            Integer.parseInt(etClasArmadura.getText().toString()),
                            Integer.parseInt(etVelocidad.getText().toString()),
                            Integer.parseInt(etPuntosGolpeMax.getText().toString()),
                            Integer.parseInt(etPuntosGolpeAtc.getText().toString()),
                            Integer.parseInt(etPercepPasiva.getText().toString()));

                    personajeAGuardar.setValorCaracteristicas(Integer.parseInt(etFuerza.getText().toString()),
                            Integer.parseInt(etDestreza.getText().toString()),
                            Integer.parseInt(etConstitucion.getText().toString()),
                            Integer.parseInt(etInteligencia.getText().toString()),
                            Integer.parseInt(etSabiduria.getText().toString()),
                            Integer.parseInt(etCarisma.getText().toString()), Integer.parseInt(etBonCom.getText().toString()));

                }

                intent.putExtra(EXTRA_PERSONAJE, personajeAGuardar);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }
}