package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.BaseColumns;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Dinero;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Inventario;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Magia.Hechizos;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.Caracteristicas;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.Habilidades;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.RasgoOCompetencia;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = Personaje.TABLE_NAME,
        indices = {@Index(value = {Personaje.ID}, unique = true)})

public class Personaje implements Parcelable {

    public static final String TABLE_NAME = "personage";
    public static final String ID = BaseColumns._ID;
    public static final String NOMBRE_PERSONAJE = "nombre_personaje";
    public static final String CLASE = "clase";
    public static final String RAZA = "raza";
    public static final String ALINEAMIENTO = "alineamiento";
    public static final String NIVEL = "nivel";
    public static final String PUNTOSXP = "puntos_xp";
    public static final String TRANSFONDO = "transfondo";
    public static final String DADOSDEGOLPE = "dados_de_golpe";
    public static final String BON_COMPETENCIA = "bon_competencia";
    public static final String INICIATIVA = "iniciativa";
    public static final String C_ARMADURA = "c_armaduea";
    public static final String VELOCIDAD = "velocidad";
    public static final String PG_MAXIMOS = "pg_maximos";
    public static final String PG_ACTUALES = "pg_actuales";
    public static final String PERCEPCION_PASIVA = "percepcionPasiva";


    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = ID)
    private int id;

    private String nombrePersonaje;

    private String clase;

    private String raza;

    private String alinemiento;

    private String nivel;

    private String puntosnXP;

    private String transfondo;

    private String dadosDeGolpe;

    private int bonCompetencia;

    private int iniciativa;

    private int cArmadura;

    private int velocidad;

    private int pgMaximos;

    private int pgActuales;

    private int percepcionPasiva;

    private Dinero dinero;

    private Inventario inventario;

    private Caracteristicas caracteristicas;

    private Habilidades habilidades;

    private Hechizos hechizos;

    private List<Arma> armas;

    private List<RasgoOCompetencia> rasgos;

    private List<RasgoOCompetencia> competencias;

    static int contador = 1;


    public Personaje(String nombrePersonaje, String clase, String raza, String alinemiento, String nivel, String puntosnXP, String trandondo, String dadosDeGolpe, int bonCompetencia, int iniciativa, int cArmadura, int velocidad, int pgMaximos, int pgActuales, int percepcionPasiva, Dinero dinero, Inventario inventario, Caracteristicas caracteristicas, Habilidades habilidades, Hechizos hechizos, List<Arma> armas, List<RasgoOCompetencia> rasgos, List<RasgoOCompetencia> competencias) {

        this.id = contador++;
        this.nombrePersonaje = nombrePersonaje;
        this.clase = clase;
        this.raza = raza;
        this.alinemiento = alinemiento;
        this.nivel = nivel;
        this.puntosnXP = puntosnXP;
        this.transfondo = trandondo;
        this.dadosDeGolpe = dadosDeGolpe;
        this.bonCompetencia = bonCompetencia;
        this.iniciativa = iniciativa;
        this.cArmadura = cArmadura;
        this.velocidad = velocidad;
        this.pgMaximos = pgMaximos;
        this.pgActuales = pgActuales;
        this.percepcionPasiva = percepcionPasiva;
        this.dinero = dinero;
        this.inventario = inventario;
        this.caracteristicas = caracteristicas;
        this.habilidades = habilidades;
        this.hechizos = hechizos;
        this.armas = armas;
        this.rasgos = rasgos;
        this.competencias = competencias;
    }

    public Personaje(int id, String nombrePersonaje, String clase, String raza, String alinemiento, String nivel, String puntosnXP, String trandondo, String dadosDeGolpe, int bonCompetencia, int iniciativa, int cArmadura, int velocidad, int pgMaximos, int pgActuales, int percepcionPasiva, Dinero dinero, Inventario inventario, Caracteristicas caracteristicas, Habilidades habilidades, Hechizos hechizos, List<Arma> armas, List<RasgoOCompetencia> rasgos, List<RasgoOCompetencia> competencias) {

        this.id = id;
        this.nombrePersonaje = nombrePersonaje;
        this.clase = clase;
        this.raza = raza;
        this.alinemiento = alinemiento;
        this.nivel = nivel;
        this.puntosnXP = puntosnXP;
        this.transfondo = trandondo;
        this.dadosDeGolpe = dadosDeGolpe;
        this.bonCompetencia = bonCompetencia;
        this.iniciativa = iniciativa;
        this.cArmadura = cArmadura;
        this.velocidad = velocidad;
        this.pgMaximos = pgMaximos;
        this.pgActuales = pgActuales;
        this.percepcionPasiva = percepcionPasiva;
        this.dinero = dinero;
        this.inventario = inventario;
        this.caracteristicas = caracteristicas;
        this.habilidades = habilidades;
        this.hechizos = hechizos;
        this.armas = armas;
        this.rasgos = rasgos;
        this.competencias = competencias;
    }

    public Personaje() {
        dinero = new Dinero();
        inventario = new Inventario();
        caracteristicas = new Caracteristicas();
        habilidades = new Habilidades();
        hechizos = new Hechizos();
    }

    public void setValorCaracteristicas(int fuerza, int destreza, int constitucion, int inteligencia, int sabiduria, int carisma, int bonCompetencia) {
        caracteristicas.setValFuerza(fuerza);
        caracteristicas.setValDestreza(destreza);
        caracteristicas.setValConstitucion(constitucion);
        caracteristicas.setValInteligencia(inteligencia);
        caracteristicas.setValSabiduria(sabiduria);
        caracteristicas.setValCarisma(carisma);
        setModCaracteristica();
        this.bonCompetencia = bonCompetencia;
    }

    public void setModCaracteristica() {
        caracteristicas.setModFuerza(calcularMod(caracteristicas.getValFuerza(), caracteristicas.isCompetenciaFuerza()));
        habilidades.setAtletismo(calcularMod(caracteristicas.getValFuerza(), habilidades.isCompetenciaAtletismo()));

        caracteristicas.setModDestreza(calcularMod(caracteristicas.getValDestreza(), caracteristicas.isCompetenciaDestreza()));
        habilidades.setAcrobacias(calcularMod(caracteristicas.getValDestreza(), habilidades.isCompetenciaAcrobacias()));
        habilidades.setJuegoDeManos(calcularMod(caracteristicas.getValDestreza(), habilidades.isCompetenciaJDM()));
        habilidades.setSigilo(calcularMod(caracteristicas.getValDestreza(), habilidades.isCompetenciaSigilo()));

        caracteristicas.setModConstitucion(calcularMod(caracteristicas.getValConstitucion(), caracteristicas.isCompetenciaConstitucion()));

        caracteristicas.setModInteligencia(calcularMod(caracteristicas.getValInteligencia(), caracteristicas.isCompetenciaInteligencia()));
        habilidades.setcArcano(calcularMod(caracteristicas.getValInteligencia(), habilidades.isCompetenciaCArcano()));
        habilidades.setHistoria(calcularMod(caracteristicas.getValInteligencia(), habilidades.isCompetenciaHistoria()));
        habilidades.setInvestigacion(calcularMod(caracteristicas.getValInteligencia(), habilidades.isCompetenciaInvestigacion()));
        habilidades.setNaturaleza(calcularMod(caracteristicas.getValInteligencia(), habilidades.isCompetenciaNaturaleza()));
        habilidades.setReligion(calcularMod(caracteristicas.getValInteligencia(), habilidades.isCompetenciaReligion()));

        caracteristicas.setModSabiduria(calcularMod(caracteristicas.getValSabiduria(), caracteristicas.isCompetenciaSabiduria()));
        habilidades.setMedicina(calcularMod(caracteristicas.getValSabiduria(), habilidades.isCompetenciaMedicina()));
        habilidades.setPercepcion(calcularMod(caracteristicas.getValSabiduria(), habilidades.isCompetenciaPercepcion()));
        habilidades.setPerspicacia(calcularMod(caracteristicas.getValSabiduria(), habilidades.isCompetenciaPerspicacia()));
        habilidades.setSupervivencia(calcularMod(caracteristicas.getValSabiduria(), habilidades.isCompetenciaSupervivencia()));
        habilidades.settConAnimales(calcularMod(caracteristicas.getValSabiduria(), habilidades.isCompetenciaTCA()));

        caracteristicas.setModCarisma(calcularMod(caracteristicas.getValCarisma(), caracteristicas.isCompetenciaCarisma()));
        habilidades.setEnganyo(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaEnganyo()));
        habilidades.setInterpretacion(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaInterpretacion()));
        habilidades.setIntimidacion(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaIntimidacion()));
        habilidades.setPersuasion(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaPersuasion()));


    }

    public int calcularMod(int valorCaracteristica, boolean competencia) {

        int resultado = 0;

        if (valorCaracteristica == 1) {
            resultado = -5;
        } else if (valorCaracteristica >= 2 && valorCaracteristica <= 3) {
            resultado = -4;
        } else if (valorCaracteristica >= 4 && valorCaracteristica <= 5) {
            resultado = -3;
        } else if (valorCaracteristica >= 6 && valorCaracteristica <= 7) {
            resultado = -2;
        } else if (valorCaracteristica >= 8 && valorCaracteristica <= 9) {
            resultado = -1;
        } else if (valorCaracteristica >= 10 && valorCaracteristica <= 11) {
            resultado = 0;
        } else if (valorCaracteristica >= 12 && valorCaracteristica <= 13) {
            resultado = 1;
        } else if (valorCaracteristica >= 14 && valorCaracteristica <= 15) {
            resultado = 2;
        } else if (valorCaracteristica >= 16 && valorCaracteristica <= 17) {
            resultado = 3;
        } else if (valorCaracteristica >= 18 && valorCaracteristica <= 19) {
            resultado = 4;
        } else if (valorCaracteristica >= 20 && valorCaracteristica <= 21) {
            resultado = 5;
        } else if (valorCaracteristica >= 22 && valorCaracteristica <= 23) {
            resultado = 6;
        } else if (valorCaracteristica >= 24 && valorCaracteristica <= 25) {
            resultado = 7;
        } else if (valorCaracteristica >= 26 && valorCaracteristica <= 27) {
            resultado = 8;
        } else if (valorCaracteristica >= 28 && valorCaracteristica <= 29) {
            resultado = 9;
        } else if (valorCaracteristica == 30) {
            resultado = 10;
        }

        resultado = resultado + bonCompetencia;
        return resultado;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlinemiento() {
        return alinemiento;
    }

    public void setAlinemiento(String alinemiento) {
        this.alinemiento = alinemiento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPuntosnXP() {
        return puntosnXP;
    }

    public void setPuntosnXP(String puntosnXP) {
        this.puntosnXP = puntosnXP;
    }

    public String getTransfondo() {
        return transfondo;
    }

    public void setTransfondo(String transfondo) {
        this.transfondo = transfondo;
    }

    public String getDadosDeGolpe() {
        return dadosDeGolpe;
    }

    public void setDadosDeGolpe(String dadosDeGolpe) {
        this.dadosDeGolpe = dadosDeGolpe;
    }

    public int getBonCompetencia() {
        return bonCompetencia;
    }

    public void setBonCompetencia(int bonCompetencia) {
        this.bonCompetencia = bonCompetencia;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getcArmadura() {
        return cArmadura;
    }

    public void setcArmadura(int cArmadura) {
        this.cArmadura = cArmadura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPgMaximos() {
        return pgMaximos;
    }

    public void setPgMaximos(int pgMaximos) {
        this.pgMaximos = pgMaximos;
    }

    public int getPgActuales() {
        return pgActuales;
    }

    public void setPgActuales(int pgActuales) {
        this.pgActuales = pgActuales;
    }

    public int getPercepcionPasiva() {
        return percepcionPasiva;
    }

    public void setPercepcionPasiva(int percepcionPasiva) {
        this.percepcionPasiva = percepcionPasiva;
    }

    public Dinero getDinero() {
        return dinero;
    }

    public void setDinero(Dinero dinero) {
        this.dinero = dinero;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public Hechizos getHechizos() {
        return hechizos;
    }

    public void setHechizos(Hechizos hechizos) {
        this.hechizos = hechizos;
    }

    public List<RasgoOCompetencia> getRasgos() {
        return rasgos;
    }

    public void setRasgos(List<RasgoOCompetencia> rasgos) {
        this.rasgos = rasgos;
    }

    public List<RasgoOCompetencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<RasgoOCompetencia> competencias) {
        this.competencias = competencias;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombrePersonaje);
        dest.writeString(this.clase);
        dest.writeString(this.raza);
        dest.writeString(this.alinemiento);
        dest.writeString(this.nivel);
        dest.writeString(this.puntosnXP);
        dest.writeString(this.transfondo);
        dest.writeString(this.dadosDeGolpe);
        dest.writeInt(this.bonCompetencia);
        dest.writeInt(this.iniciativa);
        dest.writeInt(this.cArmadura);
        dest.writeInt(this.velocidad);
        dest.writeInt(this.pgMaximos);
        dest.writeInt(this.pgActuales);
        dest.writeInt(this.percepcionPasiva);
        //dest.writeParcelable(this.dinero, flags);
        //dest.writeParcelable(this.inventario, flags);
        //dest.writeParcelable(this.caracteristicas, flags);
        //dest.writeParcelable(this.habilidades, flags);
        //dest.writeParcelable(this.hechizos, flags);
        dest.writeList(this.armas);
        dest.writeList(this.rasgos);
        dest.writeList(this.competencias);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readInt();
        this.nombrePersonaje = source.readString();
        this.clase = source.readString();
        this.raza = source.readString();
        this.alinemiento = source.readString();
        this.nivel = source.readString();
        this.puntosnXP = source.readString();
        this.transfondo = source.readString();
        this.dadosDeGolpe = source.readString();
        this.bonCompetencia = source.readInt();
        this.iniciativa = source.readInt();
        this.cArmadura = source.readInt();
        this.velocidad = source.readInt();
        this.pgMaximos = source.readInt();
        this.pgActuales = source.readInt();
        this.percepcionPasiva = source.readInt();
        this.dinero = source.readParcelable(Dinero.class.getClassLoader());
        this.inventario = source.readParcelable(Inventario.class.getClassLoader());
        this.caracteristicas = source.readParcelable(Caracteristicas.class.getClassLoader());
        this.habilidades = source.readParcelable(Habilidades.class.getClassLoader());
        this.hechizos = source.readParcelable(Hechizos.class.getClassLoader());
        this.armas = new ArrayList<Arma>();
        source.readList(this.armas, Arma.class.getClassLoader());
        this.rasgos = new ArrayList<RasgoOCompetencia>();
        source.readList(this.rasgos, RasgoOCompetencia.class.getClassLoader());
        this.competencias = new ArrayList<RasgoOCompetencia>();
        source.readList(this.competencias, RasgoOCompetencia.class.getClassLoader());
    }

    protected Personaje(Parcel in) {
        this.id = in.readInt();
        this.nombrePersonaje = in.readString();
        this.clase = in.readString();
        this.raza = in.readString();
        this.alinemiento = in.readString();
        this.nivel = in.readString();
        this.puntosnXP = in.readString();
        this.transfondo = in.readString();
        this.dadosDeGolpe = in.readString();
        this.bonCompetencia = in.readInt();
        this.iniciativa = in.readInt();
        this.cArmadura = in.readInt();
        this.velocidad = in.readInt();
        this.pgMaximos = in.readInt();
        this.pgActuales = in.readInt();
        this.percepcionPasiva = in.readInt();
        this.dinero = in.readParcelable(Dinero.class.getClassLoader());
        this.inventario = in.readParcelable(Inventario.class.getClassLoader());
        this.caracteristicas = in.readParcelable(Caracteristicas.class.getClassLoader());
        this.habilidades = in.readParcelable(Habilidades.class.getClassLoader());
        this.hechizos = in.readParcelable(Hechizos.class.getClassLoader());
        this.armas = new ArrayList<Arma>();
        in.readList(this.armas, Arma.class.getClassLoader());
        this.rasgos = new ArrayList<RasgoOCompetencia>();
        in.readList(this.rasgos, RasgoOCompetencia.class.getClassLoader());
        this.competencias = new ArrayList<RasgoOCompetencia>();
        in.readList(this.competencias, RasgoOCompetencia.class.getClassLoader());
    }

    public static final Creator<Personaje> CREATOR = new Creator<Personaje>() {
        @Override
        public Personaje createFromParcel(Parcel source) {
            return new Personaje(source);
        }

        @Override
        public Personaje[] newArray(int size) {
            return new Personaje[size];
        }
    };
}
