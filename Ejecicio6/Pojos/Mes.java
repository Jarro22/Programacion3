package Pojos;

public class Mes {
    private int numeros;
    private String nombre;
    private int cantidadDias;

    public Mes(int numeros, String nombre, int cantidadDias) {
        this.setNumeros(numeros);
        this.setNombre(nombre);
        this.setCantidadDias(cantidadDias);
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
