package lab8p2_equipo1;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();

        au.cargarCarpeta();
        uni = au.getUni();
        universo = new ArrayList();
        ab = new administrarBarra(jProgressBar1);

        for (SerVivo s : au.getUni()) {
            if (universo.contains(s.getUniProcedencia())) {

            } else {
                universo.add(s.getUniProcedencia());
            }

        }

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
        jd_eliminar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_eliminar = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        CargarUniverso = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jb_cargar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LISTA_UNIVERSOS = new javax.swing.JList<>();
        jd_modificar = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_modificar = new javax.swing.JList<>();
        jButton8 = new javax.swing.JButton();
        AddSeresVivos1 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtf_nombre1 = new javax.swing.JTextField();
        jtf_ID1 = new javax.swing.JTextField();
        jtf_poder1 = new javax.swing.JTextField();
        jtf_anio1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcb_raza1 = new javax.swing.JComboBox<>();
        jcb_universo1 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        AddSeresVivos.setSize(new java.awt.Dimension(760, 560));
        AddSeresVivos.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo1/Images/Samurai.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 150);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
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
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Universo");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 360, 692, 23);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Poder (del 1 al 10)");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 260, 692, 23);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Años");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 310, 692, 23);

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 210, 692, 23);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Raza");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 410, 692, 23);

        jcb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        jPanel3.add(jcb_raza);
        jcb_raza.setBounds(40, 430, 690, 30);

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

        jScrollPane1.setViewportView(jl_eliminar);

        jButton6.setText("eliminar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton6)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        CargarUniverso.setSize(new java.awt.Dimension(464, 451));
        CargarUniverso.getContentPane().setLayout(null);

        jPanel4.setPreferredSize(new java.awt.Dimension(464, 451));

        jb_cargar.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jb_cargar.setText("CARGAR");
        jb_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cargarMouseClicked(evt);
            }
        });
        jb_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cargarActionPerformed(evt);
            }
        });

        jProgressBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProgressBar1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CARGAR UNIVERSO");

        LISTA_UNIVERSOS.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(LISTA_UNIVERSOS);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jb_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jb_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        CargarUniverso.getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 464, 451);

        jScrollPane3.setViewportView(jl_modificar);

        jButton8.setText("modificar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton8)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        AddSeresVivos1.setSize(new java.awt.Dimension(760, 560));
        AddSeresVivos1.getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo1/Images/Samurai.jpg"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel11);
        jLabel11.setBounds(0, 0, 750, 150);

        jLabel12.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nombre");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(40, 160, 692, 23);
        jPanel5.add(jtf_nombre1);
        jtf_nombre1.setBounds(40, 180, 692, 30);
        jPanel5.add(jtf_ID1);
        jtf_ID1.setBounds(40, 230, 692, 30);
        jPanel5.add(jtf_poder1);
        jtf_poder1.setBounds(40, 280, 692, 30);
        jPanel5.add(jtf_anio1);
        jtf_anio1.setBounds(40, 330, 692, 30);

        jLabel13.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Universo");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(40, 360, 692, 23);

        jLabel14.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Poder (del 1 al 10)");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(40, 260, 692, 23);

        jLabel15.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Años");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(40, 310, 692, 23);

        jLabel16.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ID");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(40, 210, 692, 23);

        jLabel17.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Raza");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(40, 410, 692, 23);

        jcb_raza1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        jPanel5.add(jcb_raza1);
        jcb_raza1.setBounds(40, 430, 690, 30);

        jPanel5.add(jcb_universo1);
        jcb_universo1.setBounds(40, 380, 690, 30);

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Agregar Ser Vivo");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel5.add(jButton9);
        jButton9.setBounds(260, 470, 250, 50);

        AddSeresVivos1.getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 770, 530);

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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        jButton3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jButton3.setText("ELIMINAR SERVIVO");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 340, 320, 50);

        jButton5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jButton5.setText("MODIFICAR SERVIVO");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 280, 320, 50);

        jButton7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jButton7.setText("CARGAR UNIVERSO");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 400, 320, 50);

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
        for (Universo u : universo) {
            if (u.getNombre().equals(jcb_universo.getSelectedItem().toString())) {
                nombre = jtf_nombre.getText();
                id = Integer.parseInt(jtf_ID.getText());
                poder = Integer.parseInt(jtf_poder.getText());
                anios = Integer.parseInt(jtf_anio.getText());
                UniProcedencia = (Universo) jcb_universo.getSelectedItem();
                raza = jcb_raza.getSelectedItem().toString();

                SerVivo asd = new SerVivo(nombre, id, poder, anios, UniProcedencia, raza);
                au.cargarCarpeta();
                uni = au.getUni();
                au.setUniversos(asd);
                au.escribirCarpeta();
            }
        }

        JOptionPane.showMessageDialog(this, "Se ha agregado correctamente");
        AddSeresVivos.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String nombreUni = JOptionPane.showInputDialog("Ingrese el Universo");
        Universo u = new Universo(JOptionPane.showInputDialog("Ingrese el Universo"));

        universo.add(u);

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (universo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "AGREGUE UN PINCHE UNIVERSO", "ERROR", 2);
        } else {
            DefaultComboBoxModel m = new DefaultComboBoxModel();
            m.addAll(universo);
            jcb_universo.setModel(m);
            AddSeresVivos.setVisible(true);
//            AddSeresVivos.pack();
            AddSeresVivos.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultListModel m = new DefaultListModel();
        for (SerVivo s : uni) {
            m.addElement(s);
        }
        jl_eliminar.setModel(m);

        jd_eliminar.setModal(true);
        jd_eliminar.pack();
        jd_eliminar.setLocationRelativeTo(this);
        jd_eliminar.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        DefaultListModel m = new DefaultListModel();
        for (SerVivo s : uni) {
            m.addElement(s);
        }
        jl_eliminar.setModel(m);

        jd_modificar.setModal(true);
        jd_modificar.pack();
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (jl_eliminar.getSelectedIndex() != -1) {
            SerVivo a = jl_eliminar.getSelectedValue();
            uni.remove(a);

            DefaultListModel m = new DefaultListModel();
            for (SerVivo s : uni) {
                m.addElement(s);
            }
            jl_eliminar.setModel(m);

            au.cargarCarpeta();

            File f = new File("./SeresVivos.jsv");
            f.delete();

            for (SerVivo s : uni) {
                au.cargarCarpeta();
                au.setUniversos(s);
                au.escribirCarpeta();
            }
            uni = au.getUni();
            jd_eliminar.dispose();

        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        CargarUniverso.setVisible(true);
        CargarUniverso.setLocationRelativeTo(this);
        DefaultListModel modelolista = (DefaultListModel) LISTA_UNIVERSOS.getModel();
        modelolista.removeAllElements();
        for (int i = 0; i < universo.size(); i++) {
            modelolista.addElement(universo.get(i));
        }
        LISTA_UNIVERSOS.setModel(modelolista);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jb_cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cargarMouseClicked
        Dba db = new Dba("./Universos.accdb");
        Universo nombreuni = LISTA_UNIVERSOS.getSelectedValue();
        db.conectar();
        try {
            String n, d;
            for (int i = 0; i < au.getUni().size(); i++) {
                if (au.getUni().get(i).getUniProcedencia().getNombre().equals(nombreuni.getNombre())) {
                    n = "" + au.getUni().get(i).getNombre();
                    d = "" + au.getUni().get(i).getUniProcedencia().getNombre();
                    db.query.execute("INSERT INTO SeresVivos"
                            + " (Nombre,Universo)"
                            + " VALUES ('" + n + "', '" + d + "')");
                    db.commit();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

        ab.start();
        JOptionPane.showMessageDialog(CargarUniverso, "Se Apreto");
    }//GEN-LAST:event_jb_cargarMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (jl_modificar.getSelectedIndex() != -1) {
            for (SerVivo s : uni) {
                if (s.equals(jl_modificar.getSelectedValue())) {

                    AddSeresVivos1.pack();
                    AddSeresVivos1.setLocationRelativeTo(this);
                    AddSeresVivos1.setVisible(true);
                }
            }
        }


    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jProgressBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProgressBar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jProgressBar1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jb_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cargarActionPerformed

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
    private javax.swing.JFrame AddSeresVivos1;
    private javax.swing.JFrame CargarUniverso;
    private javax.swing.JList<Universo> LISTA_UNIVERSOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_cargar;
    private javax.swing.JComboBox<String> jcb_raza;
    private javax.swing.JComboBox<String> jcb_raza1;
    private javax.swing.JComboBox<Universo> jcb_universo;
    private javax.swing.JComboBox<Universo> jcb_universo1;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JList<SerVivo> jl_eliminar;
    private javax.swing.JList<SerVivo> jl_modificar;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_ID1;
    private javax.swing.JTextField jtf_anio;
    private javax.swing.JTextField jtf_anio1;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_nombre1;
    private javax.swing.JTextField jtf_poder;
    private javax.swing.JTextField jtf_poder1;
    // End of variables declaration//GEN-END:variables
    ArrayList<SerVivo> uni = new ArrayList();
    ArrayList<Universo> universo = new ArrayList();
    private String nombre;
    private int id, poder, anios;
    private Universo UniProcedencia;
    private String raza;
    AdminUniverso au = new AdminUniverso("./SeresVivos.jsv");
    administrarBarra ab = new administrarBarra(jProgressBar1);
}
