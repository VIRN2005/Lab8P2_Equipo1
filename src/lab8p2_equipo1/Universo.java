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
    
    public void coso(){
        Dba db = new Dba("./Universos.mdb");
        String nombreuni = "";
        AdminUniverso au = new AdminUniverso(nombre);
    db.conectar();
        try {
            String n,d;
            for (int i = 0; i < au.getUni().get(0).getSeresVivos().size(); i++) {
                n = au.getUni().get(0).getSeresVivos().get(i).getNombre();
                d = au.getUni().get(0).getSeresVivos().get(i).getUniProcedencia().getNombre();
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
