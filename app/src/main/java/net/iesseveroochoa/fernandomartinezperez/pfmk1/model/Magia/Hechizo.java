package net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Magia;

public class Hechizo {

    private String nombreHechizo;

    private String descripcion;

    private int nivelconjuro;

    public Hechizo(String nombreHechizo, String descripcion, int nivelconjuro) {
        this.nombreHechizo = nombreHechizo;
        this.descripcion = descripcion;
        this.nivelconjuro = nivelconjuro;
    }

    public String getNombreHechizo() {
        return nombreHechizo;
    }

    public void setNombreHechizo(String nombreHechizo) {
        this.nombreHechizo = nombreHechizo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelconjuro() {
        return nivelconjuro;
    }

    public void setNivelconjuro(int nivelconjuro) {
        this.nivelconjuro = nivelconjuro;
    }
}
