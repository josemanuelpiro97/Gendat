package IU;

import java.awt.*;

/**
 *
 * @author FedeSSD
 */
public class VistaPrincipal extends javax.swing.JFrame {
    VistaIngresar vistaIngresar;
    VistaAgregar vistaAgregar;
    VistaEventos vistaEventos;
    VistaAgendas vistaAgendas;
    VistaSeleccion vistaSeleccion;
    VistaVariante vistaVariante;
    String nombreUsuario;

    public VistaPrincipal() {
        initComponents();
        this.setLayout(new FlowLayout());
        //this.setLayout(new GridLayout(2,3));//(2,3));
        this.vistaIngresar = new VistaIngresar(this);
        this.vistaAgregar = new VistaAgregar(this);
        this.vistaVariante = new VistaVariante(this);
        this.vistaEventos = new VistaEventos(this);
        this.vistaAgendas = new VistaAgendas(this);
        this.vistaSeleccion = new VistaSeleccion(this);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
        this.add(vistaEventos);
        this.add(vistaAgendas);
        this.add(vistaSeleccion);
        /*
        this.add(vistaEventos);
        this.add(vistaAgendas);
        this.add(vistaSeleccion);*/
    }

    public void updateVista()
    {
        labelUsuario.setText(nombreUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        botonAgregarEvento = new javax.swing.JButton();
        botonGenerarAgendas = new javax.swing.JButton();
        botonImprimirAgenda = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();
        labelGendat = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        panelMenu.setToolTipText("");
        panelMenu.setName(""); // NOI18N
        panelMenu.setPreferredSize(new java.awt.Dimension(280, 280));

        botonAgregarEvento.setText("Agregar Evento");
        botonAgregarEvento.setMaximumSize(new java.awt.Dimension(140, 25));
        botonAgregarEvento.setMinimumSize(new java.awt.Dimension(140, 25));
        botonAgregarEvento.setPreferredSize(new java.awt.Dimension(140, 25));
        botonAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEventoActionPerformed(evt);
            }
        });

        botonGenerarAgendas.setText("Generar Agendas");
        botonGenerarAgendas.setMaximumSize(new java.awt.Dimension(140, 25));
        botonGenerarAgendas.setMinimumSize(new java.awt.Dimension(140, 25));
        botonGenerarAgendas.setPreferredSize(new java.awt.Dimension(140, 25));

        botonImprimirAgenda.setText("Imprimir Agenda");
        botonImprimirAgenda.setMaximumSize(new java.awt.Dimension(140, 25));
        botonImprimirAgenda.setMinimumSize(new java.awt.Dimension(140, 25));
        botonImprimirAgenda.setPreferredSize(new java.awt.Dimension(140, 25));
        botonImprimirAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirAgendaActionPerformed(evt);
            }
        });

        botonCerrarSesion.setText("Cerrar Sesi�n");
        botonCerrarSesion.setMaximumSize(new java.awt.Dimension(140, 25));
        botonCerrarSesion.setMinimumSize(new java.awt.Dimension(140, 25));
        botonCerrarSesion.setPreferredSize(new java.awt.Dimension(140, 25));
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        labelMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMenu.setText("Menu Principal del Usuario:");

        labelGendat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelGendat.setText("Gendat");

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuario.setText("nombreUsuario");

        botonBorrar.setText("Eliminar Usuario");
        botonBorrar.setMaximumSize(new java.awt.Dimension(140, 25));
        botonBorrar.setMinimumSize(new java.awt.Dimension(140, 25));
        botonBorrar.setPreferredSize(new java.awt.Dimension(140, 25));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 3, 30)); // NOI18N
        jLabel1.setText("G");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(labelGendat))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsuario))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonAgregarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonGenerarAgendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonImprimirAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGendat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(labelMenu))
                .addGap(11, 11, 11)
                .addComponent(botonAgregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGenerarAgendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonImprimirAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(610, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 320, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        this.setVisible(false);
        vistaIngresar.setVisible(true);
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEventoActionPerformed
        this.setVisible(false);
        vistaAgregar.setVisible(true);
    }//GEN-LAST:event_botonAgregarEventoActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        //TODO: ELIMINAR USUARIOOO
        this.setVisible(false);
        vistaIngresar.setVisible(true);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonImprimirAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonImprimirAgendaActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEvento;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonGenerarAgendas;
    private javax.swing.JButton botonImprimirAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelGendat;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
