package net.iesseveroochoa.fernandomartinezperez.pfmk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

public class CrearActivity extends AppCompatActivity {
    private static final String EXTRA_PERSONAJE = "EXTRA_PERSONAJE";
    private Personaje personajeAEditar;
    private boolean esEdicion;

    private EditText etNombre;
    private EditText etClase;
    private EditText etRaza;
    private EditText etAlinemiento;
    private EditText etNivel;
    private EditText etPuntosXP;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        etNombre = findViewById(R.id.etNombre);
        etClase = findViewById(R.id.etClase);
        etRaza = findViewById(R.id.etRaza);
        etAlinemiento = findViewById(R.id.etAlinemiento);
        etNivel = findViewById(R.id.etNivel);
        etPuntosXP = findViewById(R.id.etPuntosXP);
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

        Intent intent = new Intent();

        personajeAEditar = getIntent().getParcelableExtra(EXTRA_PERSONAJE);
        if (personajeAEditar != null) {
        etNombre.setText(personajeAEditar.getNombrePersonaje());
        etClase.setText(personajeAEditar.getClase());
        etRaza.setText(personajeAEditar.getRaza());










        } else {
            esEdicion = false;
        }


    }
}