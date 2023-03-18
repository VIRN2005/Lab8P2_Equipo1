package lab8p2_equipo1;

import java.io.Serializable;
import java.util.ArrayList;
import java.sql.SQLException;

public class Universo implements Serializable {

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
        return nombre;
    }

    public void coso() {
        Dba db = new Dba("./Universos.mdb");
        String nombreuni = "";
        AdminUniverso au = new AdminUniverso("./SeresVivos");
        db.conectar();
        try {
            String n, d;
            for (int i = 0; i < au.getUni().size(); i++) {
                n = au.getUni().get(i).getNombre();
                d = au.getUni().get(i).getUniProcedencia().getNombre();
                db.query.execute("INSERT INTO Seres Vivos"
                        + " (Nombre,Universo)"
                        + " VALUES ('" + n + "', '" + d + "')");
                db.commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }

}
