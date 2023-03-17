/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo1;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private int cant;

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        cant = 100000000 / cant;
        if (avanzar) {
            barra.setValue(barra.getValue() + cant);
            if (barra.getValue() == 100000000) {
                avanzar = false;
                JOptionPane.showMessageDialog(null, "Seres Cargados");
            }
        } //FIN IF

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        
    }

}
