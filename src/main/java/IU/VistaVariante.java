/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import BaseDeDatos.Comision;
import BaseDeDatos.OpcionEP;

import javax.swing.*;
import java.awt.*;

/**
 * @author marco
 */
public class VistaVariante extends javax.swing.JFrame {
    VistaPrincipal vistaPrincipal;

    /**
     * Creates new form VistaVariante
     */
    public VistaVariante(VistaPrincipal vp) {
        //inicializo componentes
        initComponents();
        this.vistaPrincipal = vp;

        this.setLocationRelativeTo(null);
        ComisionFrame.setVisible(true);
        OpcionFrame.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComisionFrame = new javax.swing.JInternalFrame();
        ProfeField = new javax.swing.JTextField();
        NumeroField = new javax.swing.JTextField();
        AulaField = new javax.swing.JTextField();
        profeLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        DiaField = new javax.swing.JTextField();
        BoxPrioM = new javax.swing.JCheckBox();
        AulaLabel = new javax.swing.JLabel();
        diaLabel = new javax.swing.JLabel();
        hsIniMatLabel = new javax.swing.JLabel();
        hsFinMatLabel = new javax.swing.JLabel();
        puntitos3 = new javax.swing.JLabel();
        puntitos4 = new javax.swing.JLabel();
        BtGuardarCom = new javax.swing.JButton();
        HoraInicioMat = new javax.swing.JComboBox<>();
        HoraFinMat = new javax.swing.JComboBox<>();
        MinInicioMat = new javax.swing.JComboBox<>();
        MinFinMat = new javax.swing.JComboBox<>();
        OpcionFrame = new javax.swing.JInternalFrame();
        LugarField = new javax.swing.JTextField();
        DiaFieldOp = new javax.swing.JTextField();
        BoxPiroO = new javax.swing.JCheckBox();
        LugarLabel = new javax.swing.JLabel();
        diaOpLabel = new javax.swing.JLabel();
        HsIniOpLabel = new javax.swing.JLabel();
        HsFinOpLabel = new javax.swing.JLabel();
        puntitos2 = new javax.swing.JLabel();
        puntitos1 = new javax.swing.JLabel();
        BtAgregarOpc = new javax.swing.JButton();
        HoraInicioOp = new javax.swing.JComboBox<>();
        MinInicioOp = new javax.swing.JComboBox<>();
        MinFinOp = new javax.swing.JComboBox<>();
        HoraFinOp = new javax.swing.JComboBox<>();
        BtAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        Dimension dim = new Dimension(300, 550);
        setMinimumSize(dim);
        setSize(dim);

        AulaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AulaFieldActionPerformed(evt);
            }
        });

        profeLabel.setText("Profesor");

        numeroLabel.setText("Numero");

        DiaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaFieldActionPerformed(evt);
            }
        });

        BoxPrioM.setText("Prioritaria");
        BoxPrioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPrioMActionPerformed(evt);
            }
        });

        AulaLabel.setText("Aula");

        diaLabel.setText("Dia");

        hsIniMatLabel.setText("Hora/Minuto Inicio");

        hsFinMatLabel.setText("Hora/Minuto Fin");

        puntitos3.setText(":");

        puntitos4.setText(":");

        BtGuardarCom.setText("Guardar Comision");
        BtGuardarCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGuardarComActionPerformed(evt);
            }
        });

        HoraInicioMat.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}));

        HoraFinMat.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}));

        MinInicioMat.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{0, 15, 30, 45}));

        MinFinMat.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{00, 15, 30, 45}));

        javax.swing.GroupLayout ComisionFrameLayout = new javax.swing.GroupLayout(ComisionFrame.getContentPane());
        ComisionFrame.getContentPane().setLayout(ComisionFrameLayout);
        ComisionFrameLayout.setHorizontalGroup(
                ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ComisionFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComisionFrameLayout.createSequentialGroup()
                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(diaLabel)
                                                        .addComponent(hsIniMatLabel)
                                                        .addComponent(hsFinMatLabel))
                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ComisionFrameLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(HoraInicioMat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(HoraFinMat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(puntitos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(puntitos4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(MinInicioMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(MinFinMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(ComisionFrameLayout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addComponent(DiaField))))
                                        .addGroup(ComisionFrameLayout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(BoxPrioM)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComisionFrameLayout.createSequentialGroup()
                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(profeLabel)
                                                        .addComponent(numeroLabel)
                                                        .addComponent(AulaLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(AulaField, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                        .addComponent(NumeroField)
                                                        .addComponent(ProfeField)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComisionFrameLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(BtGuardarCom)
                                                .addGap(14, 14, 14)))
                                .addContainerGap())
        );
        ComisionFrameLayout.setVerticalGroup(
                ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ComisionFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ProfeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(profeLabel))
                                .addGap(18, 18, 18)
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NumeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numeroLabel))
                                .addGap(18, 18, 18)
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AulaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AulaLabel))
                                .addGap(18, 18, 18)
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(diaLabel))
                                .addGap(18, 18, 18)
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hsIniMatLabel)
                                        .addComponent(puntitos3)
                                        .addComponent(HoraInicioMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MinInicioMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ComisionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(puntitos4)
                                        .addComponent(hsFinMatLabel)
                                        .addComponent(HoraFinMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MinFinMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BoxPrioM)
                                .addGap(18, 18, 18)
                                .addComponent(BtGuardarCom)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        OpcionFrame.setVisible(true);

        LugarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LugarFieldActionPerformed(evt);
            }
        });

        BoxPiroO.setText("Prioritaria");

        LugarLabel.setText("Lugar");

        diaOpLabel.setText("Dia");

        HsIniOpLabel.setText("Hora/Minuto Inicio");

        HsFinOpLabel.setText("Hora/Minuto Fin");

        puntitos2.setText("  : ");

        puntitos1.setText("  : ");

        BtAgregarOpc.setText("Guardar Opcion");
        BtAgregarOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAgregarOpcActionPerformed(evt);
            }
        });

        HoraInicioOp.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}));

        MinInicioOp.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{0, 15, 30, 45}));

        MinFinOp.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{0, 15, 30, 45}));

        HoraFinOp.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}));

        javax.swing.GroupLayout OpcionFrameLayout = new javax.swing.GroupLayout(OpcionFrame.getContentPane());
        OpcionFrame.getContentPane().setLayout(OpcionFrameLayout);
        OpcionFrameLayout.setHorizontalGroup(
                OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OpcionFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionFrameLayout.createSequentialGroup()
                                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(diaOpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LugarLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(LugarField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                        .addComponent(DiaFieldOp)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionFrameLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(BtAgregarOpc)
                                                .addGap(10, 10, 10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionFrameLayout.createSequentialGroup()
                                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(OpcionFrameLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(BoxPiroO))
                                                        .addGroup(OpcionFrameLayout.createSequentialGroup()
                                                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(HsFinOpLabel)
                                                                        .addComponent(HsIniOpLabel))
                                                                .addGap(0, 24, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(OpcionFrameLayout.createSequentialGroup()
                                                                .addComponent(HoraInicioOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(puntitos1))
                                                        .addGroup(OpcionFrameLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(HoraFinOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(puntitos2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(MinInicioOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(MinFinOp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        OpcionFrameLayout.setVerticalGroup(
                OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OpcionFrameLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LugarLabel)
                                        .addComponent(LugarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(diaOpLabel)
                                        .addComponent(DiaFieldOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(HsIniOpLabel)
                                        .addComponent(puntitos1)
                                        .addComponent(MinInicioOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HoraInicioOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(OpcionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(puntitos2)
                                        .addComponent(HsFinOpLabel)
                                        .addComponent(MinFinOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HoraFinOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(BoxPiroO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtAgregarOpc)
                                .addGap(15, 15, 15))
        );

        BtAtras.setText("Atras");
        BtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(BtAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ComisionFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(OpcionFrame)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(OpcionFrame)
                                        .addComponent(ComisionFrame))
                                .addGap(18, 18, 18)
                                .addComponent(BtAtras)
                                .addContainerGap())
        );
        setUndecorated(true);
        pack();
    }

    //-------------ACCIONES DE BOTONES----------
    //******************************************

    private void BtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtrasActionPerformed
        vistaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtAtrasActionPerformed

    private void BoxPrioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPrioMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxPrioMActionPerformed

    private void LugarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LugarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LugarFieldActionPerformed

    private void AulaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AulaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AulaFieldActionPerformed

    private void DiaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaFieldActionPerformed

    private void BtAgregarOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAgregarOpcActionPerformed
        boolean diaFlag = true;
        boolean controlFlag = true;
        //creo la opcionEP
        OpcionEP opcionEP = new OpcionEP();

        int horaInicio = this.HoraInicioOp.getItemAt(this.HoraInicioOp.getSelectedIndex());
        int horaFin = this.HoraFinOp.getItemAt(this.HoraFinOp.getSelectedIndex());
        int minInicio = this.MinInicioOp.getItemAt(this.MinInicioOp.getSelectedIndex());
        int minFin = this.MinFinOp.getItemAt(this.MinFinOp.getSelectedIndex());
        //si la hora es correcta la establezco
        if (horaInicio == horaFin && minInicio == minFin) {
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Horario Invalido");
        }
        else if(horaInicio == horaFin && minInicio > minFin){
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Horario Invalido");
        }
        else if(horaInicio > horaFin){
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Horario Invalido");
        }
        else{
            opcionEP.setHoraInicio(horaInicio);
            opcionEP.setHoraFin(horaFin);
            opcionEP.setMinInicio(minInicio);
            opcionEP.setMinFin(minFin);
        }


        //cheque el dia para ver si lo agrego
        String dia = this.DiaFieldOp.getText();
        diaFlag = validoParaConvertir(dia);
        if (diaFlag) {
            diaFlag = opcionEP.setDia(Integer.parseInt(dia));
        }
        if (!diaFlag) {
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Dia invalido");
        }

        //seteo la prioridad
        opcionEP.setPrioridad(this.BoxPiroO.isSelected());

        //seteo el lugar
        opcionEP.setLugar(this.LugarField.getText());

        //si se creo correctamente la opcionEP, trato de agregarla en el evento particular
        String resultado = "";
        String nombreEvento = this.vistaPrincipal.vistaEventos.listaEventos.getSelectedValue();
        if (controlFlag) {
            resultado = this.vistaPrincipal.getUsuarioSeleccionado().addVariante(opcionEP, nombreEvento);
        }

        //reviso si la variante fue agregada correctamente
        if (!resultado.equals("Variante agregada") && !resultado.equals("")) {
            JOptionPane.showMessageDialog(null, resultado);
        } else if(resultado.equals("Variante agregada")){
            //seteo ID
            opcionEP.setID();

            //me hago invisible
            this.setVisible(false);
            this.vistaPrincipal.setVisible(true);

            //reseteo los valores--------------
            this.DiaFieldOp.setText("");
            this.BoxPiroO.setSelected(false);
            this.LugarField.setText("");
            //---------------------------------
        }

    }

    private void BtGuardarComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGuardarComActionPerformed
        boolean diaFlag = true;
        boolean controlFlag = true;
        //creo la opcionEP
        Comision comision = new Comision();

        int horaInicio = this.HoraInicioMat.getItemAt(this.HoraInicioMat.getSelectedIndex());
        int horaFin = this.HoraFinMat.getItemAt(this.HoraFinMat.getSelectedIndex());
        int minInicio = this.MinInicioMat.getItemAt(this.MinInicioMat.getSelectedIndex());
        int minFin = this.MinFinMat.getItemAt(this.MinFinMat.getSelectedIndex());
        //si la hora es correcta la establezco
        if (horaInicio == horaFin && minInicio == minFin) {
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Horario Invalido");
        }
        else if(horaInicio == horaFin && minInicio > minFin){
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Horario Invalido");
        }
        else if(horaInicio > horaFin){
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Horario Invalido");
        }
        else{
            comision.setHoraInicio(horaInicio);
            comision.setHoraFin(horaFin);
            comision.setMinInicio(minInicio);
            comision.setMinFin(minFin);
        }

        //cheque el dia para ver si lo agrego
        String dia = this.DiaField.getText();
        diaFlag = validoParaConvertir(dia);
        if (diaFlag) {
            diaFlag = comision.setDia(Integer.parseInt(dia));
        }
        if (!diaFlag) {
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Dia invalido");
        }

        //seteo la prioridad
        comision.setPrioridad(this.BoxPrioM.isSelected());

        //seteo nombre de profesor
        comision.setProfesor(this.ProfeField.getText());

        //seteo numero de aula si es valido
        if(this.validoParaConvertir(this.AulaField.getText())){
            if(!comision.setNumAula(Integer.parseInt(this.AulaField.getText()))){
                JOptionPane.showMessageDialog(null, "Numero de aula invalido");
                controlFlag = false;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Numero de aula invalido");
            controlFlag = false;
        }

        //seteo numero de comision si es valido
        if(this.validoParaConvertir(this.NumeroField.getText())){
            if(!comision.setIdentificador(Integer.parseInt(this.NumeroField.getText()))){
                JOptionPane.showMessageDialog(null, "Numero de comision invalido");
                controlFlag = false;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Numero de comision invalido");
            controlFlag = false;
        }


        //si se creo correctamente la comision, trato de agregarla en la comision
        String resultado = "";
        String nombreEvento = this.vistaPrincipal.vistaEventos.listaEventos.getSelectedValue();
        if (controlFlag) {
            resultado = this.vistaPrincipal.getUsuarioSeleccionado().addVariante(comision, nombreEvento);
        }

        //reviso si la variante fue agregada correctamente
        if (!resultado.equals("Variante agregada") && !resultado.equals("")) {
            JOptionPane.showMessageDialog(null, resultado);
        } else if(resultado.equals("Variante agregada")){
            //me hago invisible
            this.setVisible(false);
            this.vistaPrincipal.setVisible(true);

            //reseteo los valores--------------
            this.ProfeField.setText("");
            this.AulaField.setText("");
            this.DiaField.setText("");
            this.NumeroField.setText("");
            this.BoxPrioM.setSelected(false);
            this.LugarField.setText("");
            //---------------------------------
        }

    }


    //-------------METODOS-------------------
    //******************************************
    public boolean validoParaConvertir(String val) {
        //cheque contenido
        if (val.length() == 0)
            return false;
        //agrego anio y chequeo estado
        for (int a = 0; a < val.length(); a++) {
            if (!(val.charAt(a) > 47 && val.charAt(a) < 58))
                return false;
        }
        return true;
    }

    /**
     * @brief hace visible la vista de comision
     */
    public void agregarComision() {
        ComisionFrame.setVisible(true);
        OpcionFrame.setVisible(false);
        vistaPrincipal.setVisible(false);
    }

    /**
     * @brief hace visible la vista de opcion
     */
    public void agregarOpcion() {
        OpcionFrame.setVisible(true);
        ComisionFrame.setVisible(false);
        vistaPrincipal.setVisible(false);
    }

    //-------------INTOCABLE-------------------
    //******************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AulaField;
    private javax.swing.JLabel AulaLabel;
    private javax.swing.JCheckBox BoxPiroO;
    private javax.swing.JCheckBox BoxPrioM;
    private javax.swing.JButton BtAgregarOpc;
    private javax.swing.JButton BtAtras;
    private javax.swing.JButton BtGuardarCom;
    private javax.swing.JInternalFrame ComisionFrame;
    private javax.swing.JTextField DiaField;
    private javax.swing.JTextField DiaFieldOp;
    private javax.swing.JComboBox<Integer> HoraFinMat;
    private javax.swing.JComboBox<Integer> HoraFinOp;
    private javax.swing.JComboBox<Integer> HoraInicioMat;
    private javax.swing.JComboBox<Integer> HoraInicioOp;
    private javax.swing.JLabel HsFinOpLabel;
    private javax.swing.JLabel HsIniOpLabel;
    private javax.swing.JTextField LugarField;
    private javax.swing.JLabel LugarLabel;
    private javax.swing.JComboBox<Integer> MinFinMat;
    private javax.swing.JComboBox<Integer> MinFinOp;
    private javax.swing.JComboBox<Integer> MinInicioMat;
    private javax.swing.JComboBox<Integer> MinInicioOp;
    private javax.swing.JTextField NumeroField;
    private javax.swing.JInternalFrame OpcionFrame;
    private javax.swing.JTextField ProfeField;
    private javax.swing.JLabel diaLabel;
    private javax.swing.JLabel diaOpLabel;
    private javax.swing.JLabel hsFinMatLabel;
    private javax.swing.JLabel hsIniMatLabel;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel profeLabel;
    private javax.swing.JLabel puntitos1;
    private javax.swing.JLabel puntitos2;
    private javax.swing.JLabel puntitos3;
    private javax.swing.JLabel puntitos4;
    // End of variables declaration//GEN-END:variables
}
