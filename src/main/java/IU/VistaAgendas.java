/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import BaseDeDatos.Agenda;
import BaseDeDatos.EventoInterfaz;
import BaseDeDatos.Materia;
import BaseDeDatos.Usuario;
import Observer.Observador;
import Observer.Sujeto;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author FedeSSD
 */
public class VistaAgendas extends javax.swing.JPanel implements Observador{
    VistaPrincipal vistaPrincipal;
    Sujeto usuario;
    ArrayList<Agenda> agendas;
    DefaultListModel modeloLista = new DefaultListModel();

    public VistaAgendas(VistaPrincipal vp) {
        initComponents();
        this.vistaPrincipal = vp;
        jList1.setModel(modeloLista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtSeleccionarA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        BtEliminarA = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(290, 280));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Agendas");

        BtSeleccionarA.setText("Seleccionar Agenda");
        jScrollPane1.setViewportView(jList1);

        BtEliminarA.setText("Eliminar Agenda");
        BtEliminarA.setMaximumSize(new java.awt.Dimension(120, 25));
        BtEliminarA.setMinimumSize(new java.awt.Dimension(120, 25));
        BtEliminarA.setPreferredSize(new java.awt.Dimension(135, 25));
        BtEliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSeleccionarA)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSeleccionarA)
                    .addComponent(BtEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarAActionPerformed
        boolean seleccion = jList1.isSelectionEmpty();
        if(seleccion) {
            JOptionPane.showMessageDialog(null, "No selecciono ninguna Agenda a eliminar.");
        }
        else {
            int index = jList1.getSelectedIndex();
            String NombreAgenda1 = modeloLista.get(index).toString();
            EliminarDeListaA(NombreAgenda1);
        }
    }//GEN-LAST:event_BtEliminarAActionPerformed


    /**
     * Agrego a la lista las agendas generadas
     */
    public void agregarAListaAgendas(){
        for (Agenda agendaActual:this.agendas){
            System.out.println("Se agrego la agenda numero: " + agendaActual.getID());
            for (EventoInterfaz eventoActual : agendaActual.getListaEventos()){
                System.out.print("Con los eventos: ");
                System.out.println(eventoActual.getNombre() + " y su variante: " + eventoActual.getListaVariantes().get(0).getIdentificador());
            }
            for (EventoInterfaz materiaActual : agendaActual.getListaMaterias()){
                System.out.print("Con las materias: ");
                System.out.println(materiaActual.getNombre() + " y su comisiones: " + materiaActual.getListaVariantes().get(0).getIdentificador());
            }
            this.modeloLista.addElement(agendaActual.getID());
        }
    }

    /**
     * Elimino el elemento seleccionado de la lista
     * @param NombreAgenda1
     */
    public void EliminarDeListaA(String NombreAgenda1){
        modeloLista.removeElement(NombreAgenda1);
    }

    /**
     * @brief vacio la vista de avendas
     */
    public void vaciarLista() {
        this.modeloLista.clear();
    }



    /**
     * @brief setea el usuario actual en la vista
     * @param usuario usuario que observara la vista
     */
    public void setSujeto(Sujeto usuario){
        //asigno el sujeto y me registro
        this.usuario = usuario;
        this.usuario.registrarObservador(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEliminarA;
    private javax.swing.JButton BtSeleccionarA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;

    @Override
    public void actualizar() {
        Usuario usuarioCast = (Usuario)this.usuario;
        this.agendas = usuarioCast.getAgendas();
        this.agregarAListaAgendas();
    }

    @Override
    public int getID() {
        return 0;
    }
    // End of variables declaration//GEN-END:variables
}
