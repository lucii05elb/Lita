/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.Carrito;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Producto;
import edu.mil.cet002.compraslita.Servicios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Carro extends javax.swing.JFrame {

    private DefaultListModel<String> dlm = new DefaultListModel<>(); //Esto es la lista que contiene los productos del carrito (Sus nombres)
    private DefaultComboBoxModel<String> dlmIni = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> dlmFin = new DefaultComboBoxModel<>();
    private Carrito carro;
    private ResultadosBusqueda a;

    /**
     * Creates new form
     */
    public Carro() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrado en pantalla

    }

    public Carro(Carrito carro, ResultadosBusqueda a) {
        this();
        this.carro = carro;
        this.a = a;
        precio.setText(calcularPrecio());
        iniciarLista();
        listaProductos.setModel(dlm);
        listaProductos.setSelectedIndex(0);
        this.setVisible(true);
        mostrarRecorrido.setEnabled(false);
        if (!carro.getListaDeProductos().isEmpty()) {
            mostrarRecorrido.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textoTransporte = new javax.swing.JTextField();
        botonAuto = new javax.swing.JRadioButton();
        botonCaminar = new javax.swing.JRadioButton();
        textoCarro = new javax.swing.JTextField();
        panelItems = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList<>();
        botonEliminar = new javax.swing.JButton();
        mostrarRecorrido = new javax.swing.JButton();
        textoTotal = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        comboInici = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        comboFinal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));

        textoTransporte.setEditable(false);
        textoTransporte.setBackground(new java.awt.Color(255, 255, 255));
        textoTransporte.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textoTransporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoTransporte.setText(" Medio de transporte:");
        textoTransporte.setBorder(null);
        textoTransporte.setFocusable(false);

        botonAuto.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(botonAuto);
        botonAuto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonAuto.setSelected(true);
        botonAuto.setText("Auto");

        botonCaminar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(botonCaminar);
        botonCaminar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonCaminar.setText("Caminar");
        botonCaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCaminarActionPerformed(evt);
            }
        });

        textoCarro.setEditable(false);
        textoCarro.setBackground(new java.awt.Color(255, 255, 255));
        textoCarro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoCarro.setText("Carro de compras:");
        textoCarro.setBorder(null);
        textoCarro.setFocusable(false);

        listaProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProductos.setSelectedIndex(0);
        panelItems.setViewportView(listaProductos);

        botonEliminar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/elimina3.png"))); // NOI18N
        botonEliminar.setText("Eliminar producto del carro");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        mostrarRecorrido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/recorrido.png"))); // NOI18N
        mostrarRecorrido.setText("Mostrar recorrido");
        mostrarRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRecorridoActionPerformed(evt);
            }
        });

        textoTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoTotal.setText("Total a pagar: $");
        textoTotal.setToolTipText("");
        textoTotal.setBorder(null);

        precio.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        precio.setBorder(null);

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/volver2.png"))); // NOI18N
        botonVolver.setLabel("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        jTextPane2.setText("Punto de partida:");
        jScrollPane2.setViewportView(jTextPane2);

        comboInici.setModel(dlmIni);

        jScrollPane1.setBorder(null);

        jTextPane1.setBorder(null);
        jTextPane1.setText("Punto final:");
        jScrollPane1.setViewportView(jTextPane1);

        comboFinal.setModel(dlmFin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboInici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 294, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(comboInici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelItems)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(textoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonCaminar)
                                    .addComponent(botonAuto)
                                    .addComponent(textoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botonEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarRecorrido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelItems, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCaminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrarRecorrido)
                            .addComponent(botonVolver))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    private void mostrarRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRecorridoActionPerformed
        try {
            a.dispose();
            Nodo origen = Servicios.getInstance().getMapa().getMapa().get(comboInici.getSelectedIndex());
            Nodo Final = Servicios.getInstance().getMapa().getMapa().get(comboFinal.getSelectedIndex());
            List<Nodo> destinoIntermedio = convertirProductosANodos();
            Mapa mapa = Servicios.getInstance().getMapa();
            int camino;
            if (buttonGroup1.isSelected(botonAuto.getModel())) {
                camino = 1;
            } else {
                camino = 0;
            }
            MapaVisual m = new MapaVisual(Servicios.getInstance().calcularRecorrido(origen, Final, destinoIntermedio, mapa, camino), carro);
            m.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            new PanelBusqueda().setVisible(true); // Crea y muestra panel de busqueda
            this.dispose();
        }
    }//GEN-LAST:event_mostrarRecorridoActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (!listaProductos.isSelectionEmpty()) {
            int i = listaProductos.getSelectedIndex();
            dlm.remove(i);
            carro.eliminarProducto(i);
            precio.setText(calcularPrecio());//Se actualiza el precio total del carrito
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCaminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCaminarActionPerformed
    private String calcularPrecio() {
        double precio = 0;
        for (int d = 0; d != carro.getListaDeProductos().size(); d++) {
            precio = precio + carro.getListaDeProductos().get(d).getPrecio();
        }

        return String.valueOf(precio);
    }

    private List<Nodo> convertirProductosANodos() {
        List<Nodo> nodos = new ArrayList();
        for (int i = 0; i < carro.getListaDeProductos().size(); i++) {
            nodos.add(carro.getListaDeProductos().get(i).getComercio().getUbicacion());
        }
        return nodos;
    }

    private void iniciarLista() {
        for (int i = 0; i != carro.getListaDeProductos().size(); i++) {
            dlm.addElement(carro.getListaDeProductos().get(i).getNombre() + " | " + carro.getListaDeProductos().get(i).getComercio().getNombre() + " | $" + carro.getListaDeProductos().get(i).getPrecio());
        }
        Mapa m = Servicios.getInstance().getMapa();
        for (int d = 0; d != m.getMapa().size(); d++) {
            dlmIni.addElement(m.getMapa().get(d).getNombre());
            dlmFin.addElement(m.getMapa().get(d).getNombre());
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonAuto;
    private javax.swing.JRadioButton botonCaminar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboFinal;
    private javax.swing.JComboBox<String> comboInici;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JList<String> listaProductos;
    private javax.swing.JButton mostrarRecorrido;
    private javax.swing.JScrollPane panelItems;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField textoCarro;
    private javax.swing.JTextField textoTotal;
    private javax.swing.JTextField textoTransporte;
    // End of variables declaration//GEN-END:variables
}
