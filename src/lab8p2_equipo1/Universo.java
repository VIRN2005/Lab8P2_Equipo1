package lab8p2_equipo1;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private ArrayList<SerVivo> SeresVivos = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getSeresVivos() {
        return SeresVivos;
    }

    public void setSeresVivos(ArrayList<SerVivo> SeresVivos) {
        this.SeresVivos = SeresVivos;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
