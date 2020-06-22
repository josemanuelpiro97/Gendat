package IU;

/**
 *
 * @author FedeSSD
 */
public class VistaPrincipal extends javax.swing.JFrame {
    VistaIngresar vistaIngresar;
    VistaAgregar vistaAgregar;
    String nombreUsuario;

    public VistaPrincipal() {
        initComponents();
        this.vistaIngresar = new VistaIngresar(this);
        this.vistaAgregar = new VistaAgregar(this);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
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
        botonVerAgendas = new javax.swing.JButton();
        botonCalcularAgendas = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();
        labelGendat = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        panelMenu.setToolTipText("");
        panelMenu.setName(""); // NOI18N
        panelMenu.setPreferredSize(new java.awt.Dimension(500, 400));

        botonAgregarEvento.setText("Agregar Evento");
        botonAgregarEvento.setMaximumSize(new java.awt.Dimension(120, 25));
        botonAgregarEvento.setMinimumSize(new java.awt.Dimension(120, 25));
        botonAgregarEvento.setPreferredSize(new java.awt.Dimension(120, 25));
        botonAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEventoActionPerformed(evt);
            }
        });

        botonVerAgendas.setText("Ver Agendas");
        botonVerAgendas.setMaximumSize(new java.awt.Dimension(120, 25));
        botonVerAgendas.setMinimumSize(new java.awt.Dimension(120, 25));
        botonVerAgendas.setPreferredSize(new java.awt.Dimension(120, 25));

        botonCalcularAgendas.setText("Generar Agendas");
        botonCalcularAgendas.setMaximumSize(new java.awt.Dimension(120, 25));
        botonCalcularAgendas.setMinimumSize(new java.awt.Dimension(120, 25));
        botonCalcularAgendas.setPreferredSize(new java.awt.Dimension(120, 25));

        botonCerrarSesion.setText("Cerrar Sesi�n");
        botonCerrarSesion.setMaximumSize(new java.awt.Dimension(120, 25));
        botonCerrarSesion.setMinimumSize(new java.awt.Dimension(120, 25));
        botonCerrarSesion.setPreferredSize(new java.awt.Dimension(120, 25));
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        labelMenu.setText("Menu Principal del Usuario:");

        labelGendat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelGendat.setText("Gendat");

        labelUsuario.setText("nombreUsuario");

        botonBorrar.setText("Eliminar Usuario");
        botonBorrar.setMaximumSize(new java.awt.Dimension(120, 25));
        botonBorrar.setMinimumSize(new java.awt.Dimension(120, 25));
        botonBorrar.setPreferredSize(new java.awt.Dimension(120, 25));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(labelGendat)
                .addGap(233, 233, 233))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsuario))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonAgregarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonVerAgendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCalcularAgendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGendat)
                .addGap(36, 36, 36)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(labelMenu))
                .addGap(65, 65, 65)
                .addComponent(botonAgregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerAgendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCalcularAgendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
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
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEvento;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCalcularAgendas;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonVerAgendas;
    private javax.swing.JLabel labelGendat;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
