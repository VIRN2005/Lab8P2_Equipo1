package lab8p2_equipo1;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();

        au.cargarCarpeta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddSeresVivos = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_ID = new javax.swing.JTextField();
        jtf_poder = new javax.swing.JTextField();
        jtf_anio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcb_raza = new javax.swing.JComboBox<>();
        jcb_universo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        AddSeresVivos.setPreferredSize(new java.awt.Dimension(760, 560));
        AddSeresVivos.setSize(new java.awt.Dimension(760, 560));
        AddSeresVivos.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo1/Images/Samurai.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 150);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 160, 692, 23);
        jPanel3.add(jtf_nombre);
        jtf_nombre.setBounds(40, 180, 692, 30);
        jPanel3.add(jtf_ID);
        jtf_ID.setBounds(40, 230, 692, 30);
        jPanel3.add(jtf_poder);
        jtf_poder.setBounds(40, 280, 692, 30);
        jPanel3.add(jtf_anio);
        jtf_anio.setBounds(40, 330, 692, 30);

        jLabel8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Universo");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 360, 692, 23);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Poder (del 1 al 10)");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 260, 692, 23);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Años");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 310, 692, 23);

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 210, 692, 23);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Raza");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 410, 692, 23);

        jcb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        jPanel3.add(jcb_raza);
        jcb_raza.setBounds(40, 430, 690, 30);

        jcb_universo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jcb_universo);
        jcb_universo.setBounds(40, 380, 690, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar Ser Vivo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(260, 470, 250, 50);

        AddSeresVivos.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 770, 530);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo1/Images/logo-unitec-color2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 740, 140);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 140, 630, 0);

        jButton4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jButton4.setText("CREAR UNIVERSO!");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 160, 320, 50);

        jButton1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jButton1.setText("CREAR SER VIVO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 220, 320, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo1/Images/Samurai.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 140, 740, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        for (Universo universo : uni) {
            if (jcb_universo.getSelectedItem().toString().equals(universo.getNombre())) {
                nombre = jtf_nombre.getText();
                id = Integer.parseInt(jtf_ID.getText());
                poder = Integer.parseInt(jtf_poder.getText());
                anios = Integer.parseInt(jtf_anio.getText());
                UniProcedencia = universo;
                raza = jcb_raza.getSelectedItem().toString();

                universo.getSeresVivos().add((new SerVivo(nombre, id, poder, anios, UniProcedencia, raza)));
            }
        }
        JOptionPane.showMessageDialog(this, "Se ha agregado correctamente");
        AddSeresVivos.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String nombreUni = JOptionPane.showInputDialog("Ingrese el Universo");
        Universo u = new Universo(JOptionPane.showInputDialog("Ingrese el Universo"));
        au = new AdminUniverso("./" + nombreUni + ".jsv");

        au.setUni(u);
        au.escribirCarpeta();
        au.cargarCarpeta();

        uni.add(au.getUni());
        System.out.println(uni);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (uni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "AGREGUE UN PINCHE UNIVERSO", "ERROR", 2);
        } else {
            DefaultComboBoxModel m = new DefaultComboBoxModel();
            m.addAll(uni);
            jcb_universo.setModel(m);
            AddSeresVivos.setVisible(true);
//            AddSeresVivos.pack();
            AddSeresVivos.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AddSeresVivos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcb_raza;
    private javax.swing.JComboBox<String> jcb_universo;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_anio;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_poder;
    // End of variables declaration//GEN-END:variables
    ArrayList<Universo> uni = new ArrayList();
    private String nombre;
    private int id, poder, anios;
    private Universo UniProcedencia;
    private String raza;
    AdminUniverso au;
}
