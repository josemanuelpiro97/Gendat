/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

/**
 *
 * @author FedeSSD
 */
public class VistaSeleccion extends javax.swing.JPanel {

    /**
     * Creates new form VistaSeleccion
     */
    public VistaSeleccion() {
        initComponents();
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
                {"06:00", null, null, null, null, null, null, null},
                {"06:15", null, null, null, null, null, null, null},
                {"06:30", null, null, null, null, null, null, null},
                {"06:45", null, null, null, null, null, null, null},
                {"07:00", null, null, null, null, null, null, null},
                {"07:15", null, null, null, null, null, null, null},
                {"07:30", null, null, null, null, null, null, null},
                {"07:45", null, null, null, null, null, null, null},
                {"08:00", null, null, null, null, null, null, null},
                {"08:15", null, null, null, null, null, null, null},
                {"08:30", null, null, null, null, null, null, null},
                {"08:45", null, null, null, null, null, null, null},
                {"09:00", null, null, null, null, null, null, null},
                {"09:15", null, null, null, null, null, null, null},
                {"09:30", null, null, null, null, null, null, null},
                {"09:45", null, null, null, null, null, null, null},
                {"10:00", null, null, null, null, null, null, null},
                {"10:15", null, null, null, null, null, null, null},
                {"10:30", null, null, null, null, null, null, null},
                {"10:45", null, null, null, null, null, null, null},
                {"11:00", null, null, null, null, null, null, null},
                {"11:15", null, null, null, null, null, null, null},
                {"11:30", null, null, null, null, null, null, null},
                {"11:45", null, null, null, null, null, null, null},
                {"12:00", null, null, null, null, null, null, null},
                {"12:15", null, null, null, null, null, null, null},
                {"12:30", null, null, null, null, null, null, null},
                {"12:45", null, null, null, null, null, null, null},
                {"13:00", null, null, null, null, null, null, null},
                {"13:15", null, null, null, null, null, null, null},
                {"13:30", null, null, null, null, null, null, null},
                {"13:45", null, null, null, null, null, null, null},
                {"14:00", null, null, null, null, null, null, null},
                {"14:15", null, null, null, null, null, null, null},
                {"14:30", null, null, null, null, null, null, null},
                {"14:45", null, null, null, null, null, null, null},
                {"15:00", null, null, null, null, null, null, null},
                {"15:15", null, null, null, null, null, null, null},
                {"15:30", null, null, null, null, null, null, null},
                {"15:45", null, null, null, null, null, null, null},
                {"16:00", null, null, null, null, null, null, null},
                {"16:15", null, null, null, null, null, null, null},
                {"16:30", null, null, null, null, null, null, null},
                {"16:45", null, null, null, null, null, null, null},
                {"17:00", null, null, null, null, null, null, null},
                {"17:15", null, null, null, null, null, null, null},
                {"17:30", null, null, null, null, null, null, null},
                {"17:45", null, null, null, null, null, null, null},
                {"18:00", null, null, null, null, null, null, null},
                {"18:15", null, null, null, null, null, null, null},
                {"18:30", null, null, null, null, null, null, null},
                {"18:45", null, null, null, null, null, null, null},
                {"19:00", null, null, null, null, null, null, null},
                {"19:15", null, null, null, null, null, null, null},
                {"19:30", null, null, null, null, null, null, null},
                {"19:45", null, null, null, null, null, null, null},
                {"20:00", null, null, null, null, null, null, null},
                {"20:15", null, null, null, null, null, null, null},
                {"20:30", null, null, null, null, null, null, null},
                {"20:45", null, null, null, null, null, null, null},
                {"21:00", null, null, null, null, null, null, null},
                {"21:15", null, null, null, null, null, null, null},
                {"21:30", null, null, null, null, null, null, null},
                {"21:45", null, null, null, null, null, null, null},
                {"22:00", null, null, null, null, null, null, null},
                {"22:15", null, null, null, null, null, null, null},
                {"22:30", null, null, null, null, null, null, null},
                {"22:45", null, null, null, null, null, null, null},
                {"23:00", null, null, null, null, null, null, null},
                {"23:15", null, null, null, null, null, null, null},
                {"23:30", null, null, null, null, null, null, null},
                {"23:45", null, null, null, null, null, null, null},
                {"00:00", null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora/Dia", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgendaSemanal.setColumnSelectionAllowed(true);
        AgendaSemanal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgendaSemanal.setRowMargin(2);
        AgendaSemanal.setShowGrid(true);
        jScrollPane1.setViewportView(AgendaSemanal);
        AgendaSemanal.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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
    // End of variables declaration//GEN-END:variables
}