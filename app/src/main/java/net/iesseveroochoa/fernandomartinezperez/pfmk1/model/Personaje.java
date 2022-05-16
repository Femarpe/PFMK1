package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Dinero;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario.Inventario;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Magia.Hechizos;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.Caracteristicas;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.Habilidades;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.habilidadesYCompetencias.RasgoOCompetencia;

import java.util.List;

public class Personaje {

    private String nombrePersonaje;

    private String clase;

    private String raza;

    private String alinemiento;

    private String nivel;

    private String puntosnXP;

    private String trandondo;

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
        caracteristicas.setModFuerza(calcularMod(caracteristicas.getValFuerza(),caracteristicas.isCompetenciaFuerza()));
        habilidades.setAtletismo(calcularMod(caracteristicas.getValFuerza(), habilidades.isCompetenciaAtletismo()));

        caracteristicas.setModDestreza(calcularMod(caracteristicas.getValDestreza(), caracteristicas.isCompetenciaDestreza()));
        habilidades.setAcrobacias(calcularMod(caracteristicas.getValDestreza(), habilidades.isCompetenciaAcrobacias()));
        habilidades.setJuegoDeManos(calcularMod(caracteristicas.getValDestreza(),habilidades.isCompetenciaJDM()));
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
        habilidades.settConAnimales(calcularMod(caracteristicas.getValSabiduria(),habilidades.isCompetenciaTCA()));

        caracteristicas.setModCarisma(calcularMod(caracteristicas.getValCarisma(), caracteristicas.isCompetenciaCarisma()));
        habilidades.setEnganyo(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaEnganyo()));
        habilidades.setInterpretacion(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaInterpretacion()));
        habilidades.setIntimidacion(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaIntimidacion()));
        habilidades.setPersuasion(calcularMod(caracteristicas.getValCarisma(), habilidades.isCompetenciaPersuasion()) );


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

    public String getTrandondo() {
        return trandondo;
    }

    public void setTrandondo(String trandondo) {
        this.trandondo = trandondo;
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
}
