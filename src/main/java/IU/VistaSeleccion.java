package IU;

import BaseDeDatos.*;
import Observer.Observador;
import Observer.Sujeto;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FedeSSD
 */
public class VistaSeleccion extends javax.swing.JPanel implements Observador {
    VistaPrincipal vistaPrincipal;
    Sujeto usuario;
    //DefaultTableModel tableModel;

    public VistaSeleccion(VistaPrincipal vp) {
        initComponents();
        this.vistaPrincipal = vp;

        //tableModel = new DefaultTableModel();
        //AgendaSemanal.setModel(tableModel);
    }

    /**
     * setea el observador y lo suscribe
     * @param usuario
     */
    public void setSujeto(Sujeto usuario){
        this.usuario = usuario;
        usuario.registrarObservador(this);
    }

    /**
     * @dessuscribe a la vista del sujeto
     */
    public void quitSujeto(){
        this.usuario.removerObservador(this);
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
        AgendaSemanal = new javax.swing.JTable();

        AgendaSemanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AgendaSemanal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre", "Dia", "Hora Inicio", "Hora Fin", "Anio", "Semestre", "Rubro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgendaSemanal.setColumnSelectionAllowed(true);
        AgendaSemanal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgendaSemanal.setRowMargin(2);
        AgendaSemanal.setShowGrid(true);
        AgendaSemanal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AgendaSemanal);
        AgendaSemanal.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (AgendaSemanal.getColumnModel().getColumnCount() > 0) {
            AgendaSemanal.getColumnModel().getColumn(0).setResizable(false);
            AgendaSemanal.getColumnModel().getColumn(1).setResizable(false);
            AgendaSemanal.getColumnModel().getColumn(2).setResizable(false);
            AgendaSemanal.getColumnModel().getColumn(3).setResizable(false);
            AgendaSemanal.getColumnModel().getColumn(4).setResizable(false);
            AgendaSemanal.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AgendaSemanal;
    private javax.swing.JScrollPane jScrollPane1;
    @Override
    public void actualizar() {
        Usuario usuario = (Usuario) this.usuario;
        Agenda agendaParaPoner = usuario.getAgendaSeleccionada();
    }

//
    @Override
    public int getID() {
        return 0;
    }
    // End of variables declaration//GEN-END:variables
}
