package lab8p2_equipo1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminUniverso {

    private ArrayList<SerVivo> uni = new ArrayList();
    File archivo = null;

    public AdminUniverso(String path) {
        archivo = new File(path);
    }

    public ArrayList<SerVivo> getUni() {
        return uni;
    }

    public void setUni(ArrayList<SerVivo> uni) {
        this.uni = uni;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    

    public void setUniversos(SerVivo a) {
        uni.add(a);
    }

    public void cargarCarpeta() {
        try {
            uni = new ArrayList();
            SerVivo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (SerVivo) objeto.readObject()) != null) {
                        uni.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirCarpeta() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (SerVivo     t : uni) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
