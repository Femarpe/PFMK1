package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.BaseColumns;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.ObjetoInventario;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Magia.Hechizo;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.RasgoOCompetencia;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = Personaje.TABLE_NAME,
        indices = {@Index(value = {Personaje.ID}, unique = true)})
public class Personaje implements Parcelable {

    public static final String TABLE_NAME = "personage";
    public static final String ID = BaseColumns._ID;


    /**
     * ESTADISTICAS PRINCIPALES
     */

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

    private int claseArmadura;

    private int velocidad;

    private int pgMaximos;

    private int pgActuales;

    private int percepcionPasiva;

    /**
     * DINERO
     */

    private int cobre;

    private int plata;

    private int electrum;

    private int oro;

    private int platinum;

    /**
     * INVENTARIO
     */
    @Ignore
    private List<ObjetoInventario> Equipo;
    @Ignore
    private List<ObjetoInventario> Tesoro;
    @Ignore
    private List<ObjetoInventario> objetosMagicosVinculados;
    /**
     * CARACTERISTICAS
     */

    private int valFuerza;
    private int modFuerza;
    private boolean competenciaFuerza;

    private int valDestreza;
    private int modDestreza;
    private boolean competenciaDestreza;

    private int valConstitucion;
    private int modConstitucion;
    private boolean competenciaConstitucion;

    private int valInteligencia;
    private int modInteligencia;
    private boolean competenciaInteligencia;

    private int valSabiduria;
    private int modSabiduria;
    private boolean competenciaSabiduria;

    private int valCarisma;
    private int modCarisma;
    private boolean competenciaCarisma;

    /**
     * HABILIDADAES
     */

    private int atletismo;
    private boolean competenciaAtletismo;

    private int acrobacias;
    private boolean competenciaAcrobacias;

    private int juegoDeManos;
    private boolean competenciaJDM;

    private int sigilo;
    private boolean competenciaSigilo;

    private int conocimientoArcano;
    private boolean competenciaCArcano;

    private int historia;
    private boolean competenciaHistoria;

    private int investigacion;
    private boolean competenciaInvestigacion;

    private int naturaleza;
    private boolean competenciaNaturaleza;

    private int religion;
    private boolean competenciaReligion;

    private int medicina;
    private boolean competenciaMedicina;

    private int percepcion;
    private boolean competenciaPercepcion;

    private int perspicacia;
    private boolean competenciaPerspicacia;

    private int supervivencia;
    private boolean competenciaSupervivencia;

    private int tratoConAnimales;
    private boolean competenciaTCA;

    private int enganyo;
    private boolean competenciaEnganyo;

    private int interpretacion;
    private boolean competenciaInterpretacion;

    private int intimidacion;
    private boolean competenciaIntimidacion;

    private int persuasion;
    private boolean competenciaPersuasion;

    /**
     * HECHIZOS
     */
    @Ignore
    private List<Hechizo> trucos;
    @Ignore
    private List<Hechizo> hNivel1;
    @Ignore
    private List<Hechizo> hNivel2;
    @Ignore
    private List<Hechizo> hNivel3;
    @Ignore
    private List<Hechizo> hNivel4;
    @Ignore
    private List<Hechizo> hNivel5;
    @Ignore
    private List<Hechizo> hNivel6;
    @Ignore
    private List<Hechizo> hNivel7;
    @Ignore
    private List<Hechizo> hNivel8;
    @Ignore
    private List<Hechizo> hNivel9;

    /***/
    @Ignore
    private List<Arma> armas;
    @Ignore
    private List<RasgoOCompetencia> rasgos;
    @Ignore
    private List<RasgoOCompetencia> competencias;

    static int contador = 1;

    public Personaje(int id, String nombrePersonaje, String clase, String raza, String alinemiento, String nivel, String puntosnXP, String transfondo, String dadosDeGolpe, int bonCompetencia, int iniciativa, int claseArmadura, int velocidad, int pgMaximos, int pgActuales, int percepcionPasiva, int cobre, int plata, int electrum, int oro, int platinum) {
        this.id = id;
        this.nombrePersonaje = nombrePersonaje;
        this.clase = clase;
        this.raza = raza;
        this.alinemiento = alinemiento;
        this.nivel = nivel;
        this.puntosnXP = puntosnXP;
        this.transfondo = transfondo;
        this.dadosDeGolpe = dadosDeGolpe;
        this.bonCompetencia = bonCompetencia;
        this.iniciativa = iniciativa;
        this.claseArmadura = claseArmadura;
        this.velocidad = velocidad;
        this.pgMaximos = pgMaximos;
        this.pgActuales = pgActuales;
        this.percepcionPasiva = percepcionPasiva;
        this.cobre = cobre;
        this.plata = plata;
        this.electrum = electrum;
        this.oro = oro;
        this.platinum = platinum;
    }

    @Ignore


    public Personaje(int id, String nombrePersonaje, String clase, String raza, String alinemiento, String nivel, String puntosnXP, String transfondo, String dadosDeGolpe, int bonCompetencia, int iniciativa, int claseArmadura, int velocidad, int pgMaximos, int pgActuales, int percepcionPasiva, int cobre, int plata, int electrum, int oro, int platinum, int valFuerza, int modFuerza, boolean competenciaFuerza, int valDestreza, int modDestreza, boolean competenciaDestreza, int valConstitucion, int modConstitucion, boolean competenciaConstitucion, int valInteligencia, int modInteligencia, boolean competenciaInteligencia, int valSabiduria, int modSabiduria, boolean competenciaSabiduria, int valCarisma, int modCarisma, boolean competenciaCarisma, int atletismo, boolean competenciaAtletismo, int acrobacias, boolean competenciaAcrobacias, int juegoDeManos, boolean competenciaJDM, int sigilo, boolean competenciaSigilo, int conocimientoArcano, boolean competenciaCArcano, int historia, boolean competenciaHistoria, int investigacion, boolean competenciaInvestigacion, int naturaleza, boolean competenciaNaturaleza, int religion, boolean competenciaReligion, int medicina, boolean competenciaMedicina, int percepcion, boolean competenciaPercepcion, int perspicacia, boolean competenciaPerspicacia, int supervivencia, boolean competenciaSupervivencia, int tratoConAnimales, boolean competenciaTCA, int enganyo, boolean competenciaEnganyo, int interpretacion, boolean competenciaInterpretacion, int intimidacion, boolean competenciaIntimidacion, int persuasion, boolean competenciaPersuasion) {
        this.id = id;
        this.nombrePersonaje = nombrePersonaje;
        this.clase = clase;
        this.raza = raza;
        this.alinemiento = alinemiento;
        this.nivel = nivel;
        this.puntosnXP = puntosnXP;
        this.transfondo = transfondo;
        this.dadosDeGolpe = dadosDeGolpe;
        this.bonCompetencia = bonCompetencia;
        this.iniciativa = iniciativa;
        this.claseArmadura = claseArmadura;
        this.velocidad = velocidad;
        this.pgMaximos = pgMaximos;
        this.pgActuales = pgActuales;
        this.percepcionPasiva = percepcionPasiva;
        this.cobre = cobre;
        this.plata = plata;
        this.electrum = electrum;
        this.oro = oro;
        this.platinum = platinum;
        this.valFuerza = valFuerza;
        this.modFuerza = modFuerza;
        this.competenciaFuerza = competenciaFuerza;
        this.valDestreza = valDestreza;
        this.modDestreza = modDestreza;
        this.competenciaDestreza = competenciaDestreza;
        this.valConstitucion = valConstitucion;
        this.modConstitucion = modConstitucion;
        this.competenciaConstitucion = competenciaConstitucion;
        this.valInteligencia = valInteligencia;
        this.modInteligencia = modInteligencia;
        this.competenciaInteligencia = competenciaInteligencia;
        this.valSabiduria = valSabiduria;
        this.modSabiduria = modSabiduria;
        this.competenciaSabiduria = competenciaSabiduria;
        this.valCarisma = valCarisma;
        this.modCarisma = modCarisma;
        this.competenciaCarisma = competenciaCarisma;
        this.atletismo = atletismo;
        this.competenciaAtletismo = competenciaAtletismo;
        this.acrobacias = acrobacias;
        this.competenciaAcrobacias = competenciaAcrobacias;
        this.juegoDeManos = juegoDeManos;
        this.competenciaJDM = competenciaJDM;
        this.sigilo = sigilo;
        this.competenciaSigilo = competenciaSigilo;
        this.conocimientoArcano = conocimientoArcano;
        this.competenciaCArcano = competenciaCArcano;
        this.historia = historia;
        this.competenciaHistoria = competenciaHistoria;
        this.investigacion = investigacion;
        this.competenciaInvestigacion = competenciaInvestigacion;
        this.naturaleza = naturaleza;
        this.competenciaNaturaleza = competenciaNaturaleza;
        this.religion = religion;
        this.competenciaReligion = competenciaReligion;
        this.medicina = medicina;
        this.competenciaMedicina = competenciaMedicina;
        this.percepcion = percepcion;
        this.competenciaPercepcion = competenciaPercepcion;
        this.perspicacia = perspicacia;
        this.competenciaPerspicacia = competenciaPerspicacia;
        this.supervivencia = supervivencia;
        this.competenciaSupervivencia = competenciaSupervivencia;
        this.tratoConAnimales = tratoConAnimales;
        this.competenciaTCA = competenciaTCA;
        this.enganyo = enganyo;
        this.competenciaEnganyo = competenciaEnganyo;
        this.interpretacion = interpretacion;
        this.competenciaInterpretacion = competenciaInterpretacion;
        this.intimidacion = intimidacion;
        this.competenciaIntimidacion = competenciaIntimidacion;
        this.persuasion = persuasion;
        this.competenciaPersuasion = competenciaPersuasion;
    }

    public void setValorCaracteristicas(int fuerza, int destreza, int constitucion, int inteligencia, int sabiduria, int carisma, int bonCompetencia) {
        setValFuerza(fuerza);
        setValDestreza(destreza);
        setValConstitucion(constitucion);
        setValInteligencia(inteligencia);
        setValSabiduria(sabiduria);
        setValCarisma(carisma);
        setModCaracteristica();
        this.bonCompetencia = bonCompetencia;
    }

    public void setModCaracteristica() {
        setModFuerza(calcularMod(getValFuerza(), isCompetenciaFuerza()));
        setAtletismo(calcularMod(getValFuerza(), isCompetenciaAtletismo()));

        setModDestreza(calcularMod(getValDestreza(), isCompetenciaDestreza()));
        setAcrobacias(calcularMod(getValDestreza(), isCompetenciaAcrobacias()));
        setJuegoDeManos(calcularMod(getValDestreza(), isCompetenciaJDM()));
        setSigilo(calcularMod(getValDestreza(), isCompetenciaSigilo()));

        setModConstitucion(calcularMod(getValConstitucion(), isCompetenciaConstitucion()));

        setModInteligencia(calcularMod(getValInteligencia(), isCompetenciaInteligencia()));
        setConocimientoArcano(calcularMod(getValInteligencia(), isCompetenciaCArcano()));
        setHistoria(calcularMod(getValInteligencia(), isCompetenciaHistoria()));
        setInvestigacion(calcularMod(getValInteligencia(), isCompetenciaInvestigacion()));
        setNaturaleza(calcularMod(getValInteligencia(), isCompetenciaNaturaleza()));
        setReligion(calcularMod(getValInteligencia(), isCompetenciaReligion()));

        setModSabiduria(calcularMod(getValSabiduria(), isCompetenciaSabiduria()));
        setMedicina(calcularMod(getValSabiduria(), isCompetenciaMedicina()));
        setPercepcion(calcularMod(getValSabiduria(), isCompetenciaPercepcion()));
        setPerspicacia(calcularMod(getValSabiduria(), isCompetenciaPerspicacia()));
        setSupervivencia(calcularMod(getValSabiduria(), isCompetenciaSupervivencia()));
        setTratoConAnimales(calcularMod(getValSabiduria(), isCompetenciaTCA()));

        setModCarisma(calcularMod(getValCarisma(), isCompetenciaCarisma()));
        setEnganyo(calcularMod(getValCarisma(), isCompetenciaEnganyo()));
        setInterpretacion(calcularMod(getValCarisma(), isCompetenciaInterpretacion()));
        setIntimidacion(calcularMod(getValCarisma(), isCompetenciaIntimidacion()));
        setPersuasion(calcularMod(getValCarisma(), isCompetenciaPersuasion()));


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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
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

    public int getClaseArmadura() {
        return claseArmadura;
    }

    public void setClaseArmadura(int claseArmadura) {
        this.claseArmadura = claseArmadura;
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

    public int getCobre() {
        return cobre;
    }

    public void setCobre(int cobre) {
        this.cobre = cobre;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getElectrum() {
        return electrum;
    }

    public void setElectrum(int electrum) {
        this.electrum = electrum;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlatinum() {
        return platinum;
    }

    public void setPlatinum(int platinum) {
        this.platinum = platinum;
    }

    public List<ObjetoInventario> getEquipo() {
        return Equipo;
    }

    public void setEquipo(List<ObjetoInventario> equipo) {
        Equipo = equipo;
    }

    public List<ObjetoInventario> getTesoro() {
        return Tesoro;
    }

    public void setTesoro(List<ObjetoInventario> tesoro) {
        Tesoro = tesoro;
    }

    public List<ObjetoInventario> getObjetosMagicosVinculados() {
        return objetosMagicosVinculados;
    }

    public void setObjetosMagicosVinculados(List<ObjetoInventario> objetosMagicosVinculados) {
        this.objetosMagicosVinculados = objetosMagicosVinculados;
    }

    public int getValFuerza() {
        return valFuerza;
    }

    public void setValFuerza(int valFuerza) {
        this.valFuerza = valFuerza;
    }

    public int getModFuerza() {
        return modFuerza;
    }

    public void setModFuerza(int modFuerza) {
        this.modFuerza = modFuerza;
    }

    public boolean isCompetenciaFuerza() {
        return competenciaFuerza;
    }

    public void setCompetenciaFuerza(boolean competenciaFuerza) {
        this.competenciaFuerza = competenciaFuerza;
    }

    public int getValDestreza() {
        return valDestreza;
    }

    public void setValDestreza(int valDestreza) {
        this.valDestreza = valDestreza;
    }

    public int getModDestreza() {
        return modDestreza;
    }

    public void setModDestreza(int modDestreza) {
        this.modDestreza = modDestreza;
    }

    public boolean isCompetenciaDestreza() {
        return competenciaDestreza;
    }

    public void setCompetenciaDestreza(boolean competenciaDestreza) {
        this.competenciaDestreza = competenciaDestreza;
    }

    public int getValConstitucion() {
        return valConstitucion;
    }

    public void setValConstitucion(int valConstitucion) {
        this.valConstitucion = valConstitucion;
    }

    public int getModConstitucion() {
        return modConstitucion;
    }

    public void setModConstitucion(int modConstitucion) {
        this.modConstitucion = modConstitucion;
    }

    public boolean isCompetenciaConstitucion() {
        return competenciaConstitucion;
    }

    public void setCompetenciaConstitucion(boolean competenciaConstitucion) {
        this.competenciaConstitucion = competenciaConstitucion;
    }

    public int getValInteligencia() {
        return valInteligencia;
    }

    public void setValInteligencia(int valInteligencia) {
        this.valInteligencia = valInteligencia;
    }

    public int getModInteligencia() {
        return modInteligencia;
    }

    public void setModInteligencia(int modInteligencia) {
        this.modInteligencia = modInteligencia;
    }

    public boolean isCompetenciaInteligencia() {
        return competenciaInteligencia;
    }

    public void setCompetenciaInteligencia(boolean competenciaInteligencia) {
        this.competenciaInteligencia = competenciaInteligencia;
    }

    public int getValSabiduria() {
        return valSabiduria;
    }

    public void setValSabiduria(int valSabiduria) {
        this.valSabiduria = valSabiduria;
    }

    public int getModSabiduria() {
        return modSabiduria;
    }

    public void setModSabiduria(int modSabiduria) {
        this.modSabiduria = modSabiduria;
    }

    public boolean isCompetenciaSabiduria() {
        return competenciaSabiduria;
    }

    public void setCompetenciaSabiduria(boolean competenciaSabiduria) {
        this.competenciaSabiduria = competenciaSabiduria;
    }

    public int getValCarisma() {
        return valCarisma;
    }

    public void setValCarisma(int valCarisma) {
        this.valCarisma = valCarisma;
    }

    public int getModCarisma() {
        return modCarisma;
    }

    public void setModCarisma(int modCarisma) {
        this.modCarisma = modCarisma;
    }

    public boolean isCompetenciaCarisma() {
        return competenciaCarisma;
    }

    public void setCompetenciaCarisma(boolean competenciaCarisma) {
        this.competenciaCarisma = competenciaCarisma;
    }

    public int getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(int atletismo) {
        this.atletismo = atletismo;
    }

    public boolean isCompetenciaAtletismo() {
        return competenciaAtletismo;
    }

    public void setCompetenciaAtletismo(boolean competenciaAtletismo) {
        this.competenciaAtletismo = competenciaAtletismo;
    }

    public int getAcrobacias() {
        return acrobacias;
    }

    public void setAcrobacias(int acrobacias) {
        this.acrobacias = acrobacias;
    }

    public boolean isCompetenciaAcrobacias() {
        return competenciaAcrobacias;
    }

    public void setCompetenciaAcrobacias(boolean competenciaAcrobacias) {
        this.competenciaAcrobacias = competenciaAcrobacias;
    }

    public int getJuegoDeManos() {
        return juegoDeManos;
    }

    public void setJuegoDeManos(int juegoDeManos) {
        this.juegoDeManos = juegoDeManos;
    }

    public boolean isCompetenciaJDM() {
        return competenciaJDM;
    }

    public void setCompetenciaJDM(boolean competenciaJDM) {
        this.competenciaJDM = competenciaJDM;
    }

    public int getSigilo() {
        return sigilo;
    }

    public void setSigilo(int sigilo) {
        this.sigilo = sigilo;
    }

    public boolean isCompetenciaSigilo() {
        return competenciaSigilo;
    }

    public void setCompetenciaSigilo(boolean competenciaSigilo) {
        this.competenciaSigilo = competenciaSigilo;
    }

    public int getConocimientoArcano() {
        return conocimientoArcano;
    }

    public void setConocimientoArcano(int conocimientoArcano) {
        this.conocimientoArcano = conocimientoArcano;
    }

    public boolean isCompetenciaCArcano() {
        return competenciaCArcano;
    }

    public void setCompetenciaCArcano(boolean competenciaCArcano) {
        this.competenciaCArcano = competenciaCArcano;
    }

    public int getHistoria() {
        return historia;
    }

    public void setHistoria(int historia) {
        this.historia = historia;
    }

    public boolean isCompetenciaHistoria() {
        return competenciaHistoria;
    }

    public void setCompetenciaHistoria(boolean competenciaHistoria) {
        this.competenciaHistoria = competenciaHistoria;
    }

    public int getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(int investigacion) {
        this.investigacion = investigacion;
    }

    public boolean isCompetenciaInvestigacion() {
        return competenciaInvestigacion;
    }

    public void setCompetenciaInvestigacion(boolean competenciaInvestigacion) {
        this.competenciaInvestigacion = competenciaInvestigacion;
    }

    public int getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(int naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isCompetenciaNaturaleza() {
        return competenciaNaturaleza;
    }

    public void setCompetenciaNaturaleza(boolean competenciaNaturaleza) {
        this.competenciaNaturaleza = competenciaNaturaleza;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public boolean isCompetenciaReligion() {
        return competenciaReligion;
    }

    public void setCompetenciaReligion(boolean competenciaReligion) {
        this.competenciaReligion = competenciaReligion;
    }

    public int getMedicina() {
        return medicina;
    }

    public void setMedicina(int medicina) {
        this.medicina = medicina;
    }

    public boolean isCompetenciaMedicina() {
        return competenciaMedicina;
    }

    public void setCompetenciaMedicina(boolean competenciaMedicina) {
        this.competenciaMedicina = competenciaMedicina;
    }

    public int getPercepcion() {
        return percepcion;
    }

    public void setPercepcion(int percepcion) {
        this.percepcion = percepcion;
    }

    public boolean isCompetenciaPercepcion() {
        return competenciaPercepcion;
    }

    public void setCompetenciaPercepcion(boolean competenciaPercepcion) {
        this.competenciaPercepcion = competenciaPercepcion;
    }

    public int getPerspicacia() {
        return perspicacia;
    }

    public void setPerspicacia(int perspicacia) {
        this.perspicacia = perspicacia;
    }

    public boolean isCompetenciaPerspicacia() {
        return competenciaPerspicacia;
    }

    public void setCompetenciaPerspicacia(boolean competenciaPerspicacia) {
        this.competenciaPerspicacia = competenciaPerspicacia;
    }

    public int getSupervivencia() {
        return supervivencia;
    }

    public void setSupervivencia(int supervivencia) {
        this.supervivencia = supervivencia;
    }

    public boolean isCompetenciaSupervivencia() {
        return competenciaSupervivencia;
    }

    public void setCompetenciaSupervivencia(boolean competenciaSupervivencia) {
        this.competenciaSupervivencia = competenciaSupervivencia;
    }

    public int getTratoConAnimales() {
        return tratoConAnimales;
    }

    public void setTratoConAnimales(int tratoConAnimales) {
        this.tratoConAnimales = tratoConAnimales;
    }

    public boolean isCompetenciaTCA() {
        return competenciaTCA;
    }

    public void setCompetenciaTCA(boolean competenciaTCA) {
        this.competenciaTCA = competenciaTCA;
    }

    public int getEnganyo() {
        return enganyo;
    }

    public void setEnganyo(int enganyo) {
        this.enganyo = enganyo;
    }

    public boolean isCompetenciaEnganyo() {
        return competenciaEnganyo;
    }

    public void setCompetenciaEnganyo(boolean competenciaEnganyo) {
        this.competenciaEnganyo = competenciaEnganyo;
    }

    public int getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(int interpretacion) {
        this.interpretacion = interpretacion;
    }

    public boolean isCompetenciaInterpretacion() {
        return competenciaInterpretacion;
    }

    public void setCompetenciaInterpretacion(boolean competenciaInterpretacion) {
        this.competenciaInterpretacion = competenciaInterpretacion;
    }

    public int getIntimidacion() {
        return intimidacion;
    }

    public void setIntimidacion(int intimidacion) {
        this.intimidacion = intimidacion;
    }

    public boolean isCompetenciaIntimidacion() {
        return competenciaIntimidacion;
    }

    public void setCompetenciaIntimidacion(boolean competenciaIntimidacion) {
        this.competenciaIntimidacion = competenciaIntimidacion;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public boolean isCompetenciaPersuasion() {
        return competenciaPersuasion;
    }

    public void setCompetenciaPersuasion(boolean competenciaPersuasion) {
        this.competenciaPersuasion = competenciaPersuasion;
    }

    public List<Hechizo> getTrucos() {
        return trucos;
    }

    public void setTrucos(List<Hechizo> trucos) {
        this.trucos = trucos;
    }

    public List<Hechizo> gethNivel1() {
        return hNivel1;
    }

    public void sethNivel1(List<Hechizo> hNivel1) {
        this.hNivel1 = hNivel1;
    }

    public List<Hechizo> gethNivel2() {
        return hNivel2;
    }

    public void sethNivel2(List<Hechizo> hNivel2) {
        this.hNivel2 = hNivel2;
    }

    public List<Hechizo> gethNivel3() {
        return hNivel3;
    }

    public void sethNivel3(List<Hechizo> hNivel3) {
        this.hNivel3 = hNivel3;
    }

    public List<Hechizo> gethNivel4() {
        return hNivel4;
    }

    public void sethNivel4(List<Hechizo> hNivel4) {
        this.hNivel4 = hNivel4;
    }

    public List<Hechizo> gethNivel5() {
        return hNivel5;
    }

    public void sethNivel5(List<Hechizo> hNivel5) {
        this.hNivel5 = hNivel5;
    }

    public List<Hechizo> gethNivel6() {
        return hNivel6;
    }

    public void sethNivel6(List<Hechizo> hNivel6) {
        this.hNivel6 = hNivel6;
    }

    public List<Hechizo> gethNivel7() {
        return hNivel7;
    }

    public void sethNivel7(List<Hechizo> hNivel7) {
        this.hNivel7 = hNivel7;
    }

    public List<Hechizo> gethNivel8() {
        return hNivel8;
    }

    public void sethNivel8(List<Hechizo> hNivel8) {
        this.hNivel8 = hNivel8;
    }

    public List<Hechizo> gethNivel9() {
        return hNivel9;
    }

    public void sethNivel9(List<Hechizo> hNivel9) {
        this.hNivel9 = hNivel9;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
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
        dest.writeInt(this.claseArmadura);
        dest.writeInt(this.velocidad);
        dest.writeInt(this.pgMaximos);
        dest.writeInt(this.pgActuales);
        dest.writeInt(this.percepcionPasiva);
        dest.writeInt(this.cobre);
        dest.writeInt(this.plata);
        dest.writeInt(this.electrum);
        dest.writeInt(this.oro);
        dest.writeInt(this.platinum);
        dest.writeList(this.Equipo);
        dest.writeList(this.Tesoro);
        dest.writeList(this.objetosMagicosVinculados);
        dest.writeInt(this.valFuerza);
        dest.writeInt(this.modFuerza);
        dest.writeByte(this.competenciaFuerza ? (byte) 1 : (byte) 0);
        dest.writeInt(this.valDestreza);
        dest.writeInt(this.modDestreza);
        dest.writeByte(this.competenciaDestreza ? (byte) 1 : (byte) 0);
        dest.writeInt(this.valConstitucion);
        dest.writeInt(this.modConstitucion);
        dest.writeByte(this.competenciaConstitucion ? (byte) 1 : (byte) 0);
        dest.writeInt(this.valInteligencia);
        dest.writeInt(this.modInteligencia);
        dest.writeByte(this.competenciaInteligencia ? (byte) 1 : (byte) 0);
        dest.writeInt(this.valSabiduria);
        dest.writeInt(this.modSabiduria);
        dest.writeByte(this.competenciaSabiduria ? (byte) 1 : (byte) 0);
        dest.writeInt(this.valCarisma);
        dest.writeInt(this.modCarisma);
        dest.writeByte(this.competenciaCarisma ? (byte) 1 : (byte) 0);
        dest.writeInt(this.atletismo);
        dest.writeByte(this.competenciaAtletismo ? (byte) 1 : (byte) 0);
        dest.writeInt(this.acrobacias);
        dest.writeByte(this.competenciaAcrobacias ? (byte) 1 : (byte) 0);
        dest.writeInt(this.juegoDeManos);
        dest.writeByte(this.competenciaJDM ? (byte) 1 : (byte) 0);
        dest.writeInt(this.sigilo);
        dest.writeByte(this.competenciaSigilo ? (byte) 1 : (byte) 0);
        dest.writeInt(this.conocimientoArcano);
        dest.writeByte(this.competenciaCArcano ? (byte) 1 : (byte) 0);
        dest.writeInt(this.historia);
        dest.writeByte(this.competenciaHistoria ? (byte) 1 : (byte) 0);
        dest.writeInt(this.investigacion);
        dest.writeByte(this.competenciaInvestigacion ? (byte) 1 : (byte) 0);
        dest.writeInt(this.naturaleza);
        dest.writeByte(this.competenciaNaturaleza ? (byte) 1 : (byte) 0);
        dest.writeInt(this.religion);
        dest.writeByte(this.competenciaReligion ? (byte) 1 : (byte) 0);
        dest.writeInt(this.medicina);
        dest.writeByte(this.competenciaMedicina ? (byte) 1 : (byte) 0);
        dest.writeInt(this.percepcion);
        dest.writeByte(this.competenciaPercepcion ? (byte) 1 : (byte) 0);
        dest.writeInt(this.perspicacia);
        dest.writeByte(this.competenciaPerspicacia ? (byte) 1 : (byte) 0);
        dest.writeInt(this.supervivencia);
        dest.writeByte(this.competenciaSupervivencia ? (byte) 1 : (byte) 0);
        dest.writeInt(this.tratoConAnimales);
        dest.writeByte(this.competenciaTCA ? (byte) 1 : (byte) 0);
        dest.writeInt(this.enganyo);
        dest.writeByte(this.competenciaEnganyo ? (byte) 1 : (byte) 0);
        dest.writeInt(this.interpretacion);
        dest.writeByte(this.competenciaInterpretacion ? (byte) 1 : (byte) 0);
        dest.writeInt(this.intimidacion);
        dest.writeByte(this.competenciaIntimidacion ? (byte) 1 : (byte) 0);
        dest.writeInt(this.persuasion);
        dest.writeByte(this.competenciaPersuasion ? (byte) 1 : (byte) 0);
        dest.writeList(this.trucos);
        dest.writeList(this.hNivel1);
        dest.writeList(this.hNivel2);
        dest.writeList(this.hNivel3);
        dest.writeList(this.hNivel4);
        dest.writeList(this.hNivel5);
        dest.writeList(this.hNivel6);
        dest.writeList(this.hNivel7);
        dest.writeList(this.hNivel8);
        dest.writeList(this.hNivel9);
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
        this.claseArmadura = source.readInt();
        this.velocidad = source.readInt();
        this.pgMaximos = source.readInt();
        this.pgActuales = source.readInt();
        this.percepcionPasiva = source.readInt();
        this.cobre = source.readInt();
        this.plata = source.readInt();
        this.electrum = source.readInt();
        this.oro = source.readInt();
        this.platinum = source.readInt();
        this.Equipo = new ArrayList<ObjetoInventario>();
        source.readList(this.Equipo, ObjetoInventario.class.getClassLoader());
        this.Tesoro = new ArrayList<ObjetoInventario>();
        source.readList(this.Tesoro, ObjetoInventario.class.getClassLoader());
        this.objetosMagicosVinculados = new ArrayList<ObjetoInventario>();
        source.readList(this.objetosMagicosVinculados, ObjetoInventario.class.getClassLoader());
        this.valFuerza = source.readInt();
        this.modFuerza = source.readInt();
        this.competenciaFuerza = source.readByte() != 0;
        this.valDestreza = source.readInt();
        this.modDestreza = source.readInt();
        this.competenciaDestreza = source.readByte() != 0;
        this.valConstitucion = source.readInt();
        this.modConstitucion = source.readInt();
        this.competenciaConstitucion = source.readByte() != 0;
        this.valInteligencia = source.readInt();
        this.modInteligencia = source.readInt();
        this.competenciaInteligencia = source.readByte() != 0;
        this.valSabiduria = source.readInt();
        this.modSabiduria = source.readInt();
        this.competenciaSabiduria = source.readByte() != 0;
        this.valCarisma = source.readInt();
        this.modCarisma = source.readInt();
        this.competenciaCarisma = source.readByte() != 0;
        this.atletismo = source.readInt();
        this.competenciaAtletismo = source.readByte() != 0;
        this.acrobacias = source.readInt();
        this.competenciaAcrobacias = source.readByte() != 0;
        this.juegoDeManos = source.readInt();
        this.competenciaJDM = source.readByte() != 0;
        this.sigilo = source.readInt();
        this.competenciaSigilo = source.readByte() != 0;
        this.conocimientoArcano = source.readInt();
        this.competenciaCArcano = source.readByte() != 0;
        this.historia = source.readInt();
        this.competenciaHistoria = source.readByte() != 0;
        this.investigacion = source.readInt();
        this.competenciaInvestigacion = source.readByte() != 0;
        this.naturaleza = source.readInt();
        this.competenciaNaturaleza = source.readByte() != 0;
        this.religion = source.readInt();
        this.competenciaReligion = source.readByte() != 0;
        this.medicina = source.readInt();
        this.competenciaMedicina = source.readByte() != 0;
        this.percepcion = source.readInt();
        this.competenciaPercepcion = source.readByte() != 0;
        this.perspicacia = source.readInt();
        this.competenciaPerspicacia = source.readByte() != 0;
        this.supervivencia = source.readInt();
        this.competenciaSupervivencia = source.readByte() != 0;
        this.tratoConAnimales = source.readInt();
        this.competenciaTCA = source.readByte() != 0;
        this.enganyo = source.readInt();
        this.competenciaEnganyo = source.readByte() != 0;
        this.interpretacion = source.readInt();
        this.competenciaInterpretacion = source.readByte() != 0;
        this.intimidacion = source.readInt();
        this.competenciaIntimidacion = source.readByte() != 0;
        this.persuasion = source.readInt();
        this.competenciaPersuasion = source.readByte() != 0;
        this.trucos = new ArrayList<Hechizo>();
        source.readList(this.trucos, Hechizo.class.getClassLoader());
        this.hNivel1 = new ArrayList<Hechizo>();
        source.readList(this.hNivel1, Hechizo.class.getClassLoader());
        this.hNivel2 = new ArrayList<Hechizo>();
        source.readList(this.hNivel2, Hechizo.class.getClassLoader());
        this.hNivel3 = new ArrayList<Hechizo>();
        source.readList(this.hNivel3, Hechizo.class.getClassLoader());
        this.hNivel4 = new ArrayList<Hechizo>();
        source.readList(this.hNivel4, Hechizo.class.getClassLoader());
        this.hNivel5 = new ArrayList<Hechizo>();
        source.readList(this.hNivel5, Hechizo.class.getClassLoader());
        this.hNivel6 = new ArrayList<Hechizo>();
        source.readList(this.hNivel6, Hechizo.class.getClassLoader());
        this.hNivel7 = new ArrayList<Hechizo>();
        source.readList(this.hNivel7, Hechizo.class.getClassLoader());
        this.hNivel8 = new ArrayList<Hechizo>();
        source.readList(this.hNivel8, Hechizo.class.getClassLoader());
        this.hNivel9 = new ArrayList<Hechizo>();
        source.readList(this.hNivel9, Hechizo.class.getClassLoader());
        this.armas = new ArrayList<Arma>();
        source.readList(this.armas, Arma.class.getClassLoader());
        this.rasgos = new ArrayList<RasgoOCompetencia>();
        source.readList(this.rasgos, RasgoOCompetencia.class.getClassLoader());
        this.competencias = new ArrayList<RasgoOCompetencia>();
        source.readList(this.competencias, RasgoOCompetencia.class.getClassLoader());
    }

    @Ignore
    public Personaje() {
    }

    @Ignore
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
        this.claseArmadura = in.readInt();
        this.velocidad = in.readInt();
        this.pgMaximos = in.readInt();
        this.pgActuales = in.readInt();
        this.percepcionPasiva = in.readInt();
        this.cobre = in.readInt();
        this.plata = in.readInt();
        this.electrum = in.readInt();
        this.oro = in.readInt();
        this.platinum = in.readInt();
        this.Equipo = new ArrayList<ObjetoInventario>();
        in.readList(this.Equipo, ObjetoInventario.class.getClassLoader());
        this.Tesoro = new ArrayList<ObjetoInventario>();
        in.readList(this.Tesoro, ObjetoInventario.class.getClassLoader());
        this.objetosMagicosVinculados = new ArrayList<ObjetoInventario>();
        in.readList(this.objetosMagicosVinculados, ObjetoInventario.class.getClassLoader());
        this.valFuerza = in.readInt();
        this.modFuerza = in.readInt();
        this.competenciaFuerza = in.readByte() != 0;
        this.valDestreza = in.readInt();
        this.modDestreza = in.readInt();
        this.competenciaDestreza = in.readByte() != 0;
        this.valConstitucion = in.readInt();
        this.modConstitucion = in.readInt();
        this.competenciaConstitucion = in.readByte() != 0;
        this.valInteligencia = in.readInt();
        this.modInteligencia = in.readInt();
        this.competenciaInteligencia = in.readByte() != 0;
        this.valSabiduria = in.readInt();
        this.modSabiduria = in.readInt();
        this.competenciaSabiduria = in.readByte() != 0;
        this.valCarisma = in.readInt();
        this.modCarisma = in.readInt();
        this.competenciaCarisma = in.readByte() != 0;
        this.atletismo = in.readInt();
        this.competenciaAtletismo = in.readByte() != 0;
        this.acrobacias = in.readInt();
        this.competenciaAcrobacias = in.readByte() != 0;
        this.juegoDeManos = in.readInt();
        this.competenciaJDM = in.readByte() != 0;
        this.sigilo = in.readInt();
        this.competenciaSigilo = in.readByte() != 0;
        this.conocimientoArcano = in.readInt();
        this.competenciaCArcano = in.readByte() != 0;
        this.historia = in.readInt();
        this.competenciaHistoria = in.readByte() != 0;
        this.investigacion = in.readInt();
        this.competenciaInvestigacion = in.readByte() != 0;
        this.naturaleza = in.readInt();
        this.competenciaNaturaleza = in.readByte() != 0;
        this.religion = in.readInt();
        this.competenciaReligion = in.readByte() != 0;
        this.medicina = in.readInt();
        this.competenciaMedicina = in.readByte() != 0;
        this.percepcion = in.readInt();
        this.competenciaPercepcion = in.readByte() != 0;
        this.perspicacia = in.readInt();
        this.competenciaPerspicacia = in.readByte() != 0;
        this.supervivencia = in.readInt();
        this.competenciaSupervivencia = in.readByte() != 0;
        this.tratoConAnimales = in.readInt();
        this.competenciaTCA = in.readByte() != 0;
        this.enganyo = in.readInt();
        this.competenciaEnganyo = in.readByte() != 0;
        this.interpretacion = in.readInt();
        this.competenciaInterpretacion = in.readByte() != 0;
        this.intimidacion = in.readInt();
        this.competenciaIntimidacion = in.readByte() != 0;
        this.persuasion = in.readInt();
        this.competenciaPersuasion = in.readByte() != 0;
        this.trucos = new ArrayList<Hechizo>();
        in.readList(this.trucos, Hechizo.class.getClassLoader());
        this.hNivel1 = new ArrayList<Hechizo>();
        in.readList(this.hNivel1, Hechizo.class.getClassLoader());
        this.hNivel2 = new ArrayList<Hechizo>();
        in.readList(this.hNivel2, Hechizo.class.getClassLoader());
        this.hNivel3 = new ArrayList<Hechizo>();
        in.readList(this.hNivel3, Hechizo.class.getClassLoader());
        this.hNivel4 = new ArrayList<Hechizo>();
        in.readList(this.hNivel4, Hechizo.class.getClassLoader());
        this.hNivel5 = new ArrayList<Hechizo>();
        in.readList(this.hNivel5, Hechizo.class.getClassLoader());
        this.hNivel6 = new ArrayList<Hechizo>();
        in.readList(this.hNivel6, Hechizo.class.getClassLoader());
        this.hNivel7 = new ArrayList<Hechizo>();
        in.readList(this.hNivel7, Hechizo.class.getClassLoader());
        this.hNivel8 = new ArrayList<Hechizo>();
        in.readList(this.hNivel8, Hechizo.class.getClassLoader());
        this.hNivel9 = new ArrayList<Hechizo>();
        in.readList(this.hNivel9, Hechizo.class.getClassLoader());
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