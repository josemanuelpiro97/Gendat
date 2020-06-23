package IU;

import BaseDeDatos.Materia;

import javax.swing.*;

/**
 *
 * @author FedeSSD
 */
public class VistaEventos extends javax.swing.JPanel{
    VistaPrincipal vistaPrincipal;

    /**
     * @brief constructor de clase
     * @param vp vista prioncipal
     */
    DefaultListModel modeloLista = new DefaultListModel();


    public VistaEventos(VistaPrincipal vp) {
        //asigno la vita principal
        this.vistaPrincipal = vp;

        //inicio componentes
        initComponents();

        listaEventos.setModel(modeloLista);
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VistaEventos = new javax.swing.JLabel();
        AgregarVariante = new javax.swing.JButton();
        EliminarEventos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEventos = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(280, 280));

        VistaEventos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VistaEventos.setText("Eventos");

        AgregarVariante.setText("Agregar Variante");
        AgregarVariante.setMaximumSize(new java.awt.Dimension(130, 25));
        AgregarVariante.setMinimumSize(new java.awt.Dimension(130, 25));
        AgregarVariante.setPreferredSize(new java.awt.Dimension(135, 25));
        AgregarVariante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVarianteActionPerformed(evt);
            }
        });

        EliminarEventos.setText("Eliminar Evento");
        EliminarEventos.setMaximumSize(new java.awt.Dimension(125, 25));
        EliminarEventos.setMinimumSize(new java.awt.Dimension(125, 25));
        EliminarEventos.setPreferredSize(new java.awt.Dimension(125, 25));
        EliminarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEventosActionPerformed(evt);
            }
        });



        /*listaEventos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });*/
        listaEventos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaEventos.setToolTipText("");
        jScrollPane1.setViewportView(listaEventos);
        listaEventos.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AgregarVariante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EliminarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(VistaEventos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VistaEventos)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarVariante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    //-------------ACCIONES DE BOTONES----------
    //******************************************
    private void AgregarVarianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVarianteActionPerformed

        boolean materia;
        int index = listaEventos.getSelectedIndex();
        String nombreEvento = modeloLista.get(index).toString();
        materia = this.vistaPrincipal.getUsuarioSeleccionado().getEvento(nombreEvento) instanceof Materia;



        //---------------------
        vistaPrincipal.vistaVariante.setVisible(true);
        vistaPrincipal.setVisible(false);
    }//GEN-LAST:event_AgregarVarianteActionPerformed

    private void EliminarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVarianteActionPerformed
        boolean seleccion = listaEventos.isSelectionEmpty();
        if(seleccion) {
            JOptionPane.showMessageDialog(null, "No selecciono ningun evento a eliminar.");
        }
        else{
            int index = listaEventos.getSelectedIndex();
            String nombreEvento = modeloLista.get(index).toString();
            eliminarDeLista(nombreEvento);
        }
    }

    //-------------METODOS PARTICULARES---------
    //******************************************



    /**
     * Agrego a la lista el elemento del evento
     * @param nombreEvento
     */
    public void agregarALista(String nombreEvento){
        modeloLista.addElement(nombreEvento);
    }

    /**
     * Elimino el elemento seleccionado de la lista
     * @param nombreEvento
     */
    public void eliminarDeLista(String nombreEvento){
        this.vistaPrincipal.getUsuarioSeleccionado().quitEvento(nombreEvento);
        modeloLista.removeElement(nombreEvento);
    }

    public void vaciarLista(){modeloLista.clear();}


    //-------------INTOCABLE-------------------
    //******************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVariante;
    private javax.swing.JButton EliminarEventos;
    private javax.swing.JLabel VistaEventos;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList<String> listaEventos;
    // End of variables declaration//GEN-END:variables
}






/*
pendiente

--------------------------------------------------------
    **
     * @brief setea el usuario actual en la vista
     * @param usuario usuario que observara la vista
     *
public void setSujeto(Sujeto usuario){
    //asigno el sujeto y me registro
    this.usuario = usuario;
    this.usuario.registrarObservador(this);
}
 */