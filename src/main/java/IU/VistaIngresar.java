/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import javax.swing.JOptionPane;

/**
 *
 * @author FedeSSD
 */
public class VistaIngresar extends javax.swing.JFrame {
    VistaPrincipal vistaPrincipal;

    /**
     * Creates new form VistaIngresar
     * @param vp apuntador a la vista principal para enviarle informacion
     */
    public VistaIngresar(VistaPrincipal vp) {
        initComponents();
        this.vistaPrincipal = vp;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogIn = new javax.swing.JPanel();
        BotonLogIn = new javax.swing.JButton();
        textLogIn = new javax.swing.JTextField();
        ingreseNombre = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        comboUsuarios = new javax.swing.JComboBox();
        labelExistentes = new javax.swing.JLabel();
        labelG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gendat v1.0.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameLogIn"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        PanelLogIn.setPreferredSize(new java.awt.Dimension(400, 300));

        BotonLogIn.setText("Ingresar");
        BotonLogIn.setMaximumSize(new java.awt.Dimension(100, 25));
        BotonLogIn.setMinimumSize(new java.awt.Dimension(100, 25));
        BotonLogIn.setPreferredSize(new java.awt.Dimension(100, 25));
        BotonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLogInActionPerformed(evt);
            }
        });

        textLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLogInActionPerformed(evt);
            }
        });

        ingreseNombre.setText("Ingrese su nombre de usuario:");

        bienvenido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bienvenido.setText("Bienvenido a Gendat");

        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setMaximumSize(new java.awt.Dimension(110, 25));
        botonRegistrarse.setMinimumSize(new java.awt.Dimension(110, 25));
        botonRegistrarse.setPreferredSize(new java.awt.Dimension(110, 25));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        comboUsuarios.setMinimumSize(new java.awt.Dimension(100, 25));
        comboUsuarios.setPreferredSize(new java.awt.Dimension(100, 25));

        labelExistentes.setText("Usuarios Existentes");

        labelG.setFont(new java.awt.Font("MV Boli", 3, 30)); // NOI18N
        labelG.setText("G");

        javax.swing.GroupLayout PanelLogInLayout = new javax.swing.GroupLayout(PanelLogIn);
        PanelLogIn.setLayout(PanelLogInLayout);
        PanelLogInLayout.setHorizontalGroup(
            PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogInLayout.createSequentialGroup()
                .addGroup(PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLogInLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogInLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingreseNombre)
                            .addComponent(textLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelExistentes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28))
            .addGroup(PanelLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(bienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLogInLayout.setVerticalGroup(
            PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogInLayout.createSequentialGroup()
                .addGroup(PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLogInLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bienvenido)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogInLayout.createSequentialGroup()
                        .addComponent(labelExistentes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogInLayout.createSequentialGroup()
                        .addComponent(ingreseNombre)
                        .addGap(18, 18, 18)
                        .addComponent(textLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-------------ACCIONES DE BOTONES----------
    //******************************************
    private void BotonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLogInActionPerformed
        if(comboUsuarios.getSelectedItem() != null)
        {
            this.setVisible(false);
            vistaPrincipal.setNombreUsuario(comboUsuarios.getSelectedItem().toString());
            vistaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_BotonLogInActionPerformed

    private void textLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLogInActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        //establezco el nombre
        String nombre = textLogIn.getText();
        nombre.trim();
        //chequeo si es vacio
        if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar tu nombre de usuario.");
        }
        //sino trato de agregar
        else
        {
            boolean controlFlag = this.vistaPrincipal.setNuevoUsuario(nombre);

            //TODO: Llamar al metodo de la base de datos addUsuario(String nombre)
            if(controlFlag) //Si el usuario no existe y se crea correctamente, devuelve true
            {
                comboUsuarios.addItem(nombre);
                textLogIn.setText("");
            }   
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Ese usuario ya existe, ingrese otro nombre.", "Error al crear", JOptionPane.ERROR_MESSAGE);
                textLogIn.setText("");
            }
        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    //-------------METODOS PARTICULARES---------
    //******************************************
    /**
     * @brief borra un usuario de la lista de usuario
     * @param indexNombreDeUsuario indice del usuario a eliminar
     */
    public void quitElemento(int indexNombreDeUsuario){
        this.comboUsuarios.removeItemAt(indexNombreDeUsuario);
    }


    //-------------INTOCABLE-------------------
    //******************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLogIn;
    private javax.swing.JPanel PanelLogIn;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JLabel ingreseNombre;
    private javax.swing.JLabel labelExistentes;
    private javax.swing.JLabel labelG;
    private javax.swing.JTextField textLogIn;
    // End of variables declaration//GEN-END:variables
}
