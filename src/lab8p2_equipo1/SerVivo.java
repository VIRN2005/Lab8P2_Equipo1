package lab8p2_equipo1;

import java.io.Serializable;

public class SerVivo implements Serializable {

    private String nombre;
    private int id, poder, anios;
    private Universo UniProcedencia;
    private String raza;

    public SerVivo() {
    }

    public SerVivo(String nombre, int id, int poder, int anios, Universo UniProcedencia, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.poder = poder;
        this.anios = anios;
        this.UniProcedencia = UniProcedencia;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public Universo getUniProcedencia() {
        return UniProcedencia;
    }

    public void setUniProcedencia(Universo UniProcedencia) {
        this.UniProcedencia = UniProcedencia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
