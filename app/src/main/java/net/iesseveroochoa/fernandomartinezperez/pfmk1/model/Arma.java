package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


@Entity(
        tableName = Arma.TABLE_NAME,
        indices = {
                @Index(
                        value = {Arma.IDARMA},
                        unique = true
                )
        }
)
public class Arma {


    public static final String TABLE_NAME = "arma";
    public static final String IDARMA = "idArma";

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = IDARMA)
    private int idArma;

    private int fkIdPersonaje;

    private String nombre;

    private String bono;

    private String danyo;

    private String tipodanyo;

    private int contador = 1;

    public Arma( int fkIdPersonaje, String nombre, String bono, String danyo, String tipodanyo) {
        this.idArma = contador++;
        this.fkIdPersonaje = fkIdPersonaje;
        this.nombre = nombre;
        this.bono = bono;
        this.danyo = danyo;
        this.tipodanyo = tipodanyo;
    }


    public int getIdArma() {
        return idArma;
    }

    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }

    public int getFkIdPersonaje() {
        return fkIdPersonaje;
    }

    public void setFkIdPersonaje(int fkIdPersonaje) {
        this.fkIdPersonaje = fkIdPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBono() {
        return bono;
    }

    public void setBono(String bono) {
        this.bono = bono;
    }

    public String getDanyo() {
        return danyo;
    }

    public void setDanyo(String danyo) {
        this.danyo = danyo;
    }

    public String getTipodanyo() {
        return tipodanyo;
    }

    public void setTipodanyo(String tipodanyo) {
        this.tipodanyo = tipodanyo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
