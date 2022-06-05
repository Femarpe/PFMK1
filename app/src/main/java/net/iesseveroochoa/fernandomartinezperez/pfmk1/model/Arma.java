package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
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
public class Arma implements Parcelable {


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

    @Ignore
    private int contador = 1;

    public Arma( int fkIdPersonaje, String nombre, String bono, String danyo, String tipodanyo) {
        this.fkIdPersonaje = fkIdPersonaje;
        this.nombre = nombre;
        this.bono = bono;
        this.danyo = danyo;
        this.tipodanyo = tipodanyo;
    }

    @Ignore
    public Arma(String nombre, String bono, String danyo, String tipodanyo) {
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




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.idArma);
        dest.writeInt(this.fkIdPersonaje);
        dest.writeString(this.nombre);
        dest.writeString(this.bono);
        dest.writeString(this.danyo);
        dest.writeString(this.tipodanyo);
        dest.writeInt(this.contador);
    }

    public void readFromParcel(Parcel source) {
        this.idArma = source.readInt();
        this.fkIdPersonaje = source.readInt();
        this.nombre = source.readString();
        this.bono = source.readString();
        this.danyo = source.readString();
        this.tipodanyo = source.readString();
        this.contador = source.readInt();
    }

    protected Arma(Parcel in) {
        this.idArma = in.readInt();
        this.fkIdPersonaje = in.readInt();
        this.nombre = in.readString();
        this.bono = in.readString();
        this.danyo = in.readString();
        this.tipodanyo = in.readString();
        this.contador = in.readInt();
    }

    public static final Parcelable.Creator<Arma> CREATOR = new Parcelable.Creator<Arma>() {
        @Override
        public Arma createFromParcel(Parcel source) {
            return new Arma(source);
        }

        @Override
        public Arma[] newArray(int size) {
            return new Arma[size];
        }
    };
}
