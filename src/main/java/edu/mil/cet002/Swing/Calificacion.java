/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.*;
import java.util.List;

/**
 *
 * @author User
 */
public class Calificacion extends javax.swing.JFrame {

    List<Comercio> listaC;

    public Calificacion() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    Calificacion(List<Comercio> listaC) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calificaciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textoCalificacion = new javax.swing.JTextField();
        panelComercios = new javax.swing.JScrollPane();
        listaComercios = new javax.swing.JList<>();
        botonFinalizar = new javax.swing.JButton();
        botonEnviar = new javax.swing.JButton();
        botonPositiva = new javax.swing.JRadioButton();
        botonNegativa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textoCalificacion.setEditable(false);
        textoCalificacion.setBackground(new java.awt.Color(255, 255, 255));
        textoCalificacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoCalificacion.setText("Calificación de comercios:");
        textoCalificacion.setBorder(null);
        textoCalificacion.setFocusable(false);

        listaComercios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaComercios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Comercio 1", "Comercio 2", "Comercio 3", "Comercio 4", "Comercio 5", "Comercio 6", "Comercio 7" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaComercios.setSelectedIndex(0);
        panelComercios.setViewportView(listaComercios);

        botonFinalizar.setText("Finalizar");
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        botonEnviar.setText("Enviar calificación");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        botonPositiva.setBackground(new java.awt.Color(255, 255, 255));
        calificaciones.add(botonPositiva);
        botonPositiva.setSelected(true);
        botonPositiva.setText("Positiva");
        botonPositiva.setFocusable(false);

        botonNegativa.setBackground(new java.awt.Color(255, 255, 255));
        calificaciones.add(botonNegativa);
        botonNegativa.setText("Negativa");
        botonNegativa.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelComercios)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonFinalizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEnviar)
                            .addComponent(botonPositiva, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNegativa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonPositiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonNegativa)
                        .addGap(18, 18, 18)
                        .addComponent(botonEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonFinalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelComercios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        int i = listaComercios.getSelectedIndex();
        if (calificaciones.isSelected(botonPositiva.getModel())) {
            listaC.get(i).sumarVotoPositivo();
            System.out.println("+1");
        } else {
            listaC.get(i).sumarVotoNegativo();
            System.out.println("-1");
        }
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JRadioButton botonNegativa;
    private javax.swing.JRadioButton botonPositiva;
    private javax.swing.ButtonGroup calificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listaComercios;
    private javax.swing.JScrollPane panelComercios;
    private javax.swing.JTextField textoCalificacion;
    // End of variables declaration//GEN-END:variables
}
