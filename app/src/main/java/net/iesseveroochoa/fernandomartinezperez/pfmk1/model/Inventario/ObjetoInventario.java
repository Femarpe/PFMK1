package net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Inventario;
/**
 *A Implementar en el futuro
 */
public class ObjetoInventario {

    private String nombre;

    private String descripcion;

    private int cantidad;

    public ObjetoInventario(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
