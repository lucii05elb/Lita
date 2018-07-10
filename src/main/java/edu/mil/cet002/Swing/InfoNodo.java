/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.Nodo;

/**
 *
 * @author Laucha
 */
public class InfoNodo extends javax.swing.JFrame {

    /**
     * Creates new form InfoNodo
     */
    public InfoNodo() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    public InfoNodo(Nodo n){
    this();
    nombre.setText(n.getNombre());
    idNodo.setText(n.getIdnodo().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lugar = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        nombre = new javax.swing.JTextPane();
        botonVolver = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        idNodo = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(234, 234, 234));
        jScrollPane1.setBorder(null);

        Lugar.setBackground(new java.awt.Color(234, 234, 234));
        Lugar.setBorder(null);
        Lugar.setText("Lugar:");
        Lugar.setToolTipText("");
        jScrollPane1.setViewportView(Lugar);

        jScrollPane2.setBackground(new java.awt.Color(234, 234, 234));

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(nombre);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        idNodo.setBackground(new java.awt.Color(234, 234, 234));
        idNodo.setBorder(null);
        jScrollPane3.setViewportView(idNodo);

        jScrollPane4.setBackground(new java.awt.Color(234, 234, 234));
        jScrollPane4.setBorder(null);

        jTextPane1.setBackground(new java.awt.Color(234, 234, 234));
        jTextPane1.setBorder(null);
        jTextPane1.setText("ID Nodo:");
        jScrollPane4.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(botonVolver)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Lugar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextPane idNodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane nombre;
    // End of variables declaration//GEN-END:variables
}
