/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Imc2 extends javax.swing.JFrame {

    /**
     * Creates new form Imc
     */
    public Imc2() {
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

        rangos = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanelPesoAltura = new javax.swing.JPanel();
        labelPeso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JSpinner();
        campoAltura = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jBoton = new javax.swing.JPanel();
        botonCalcular = new javax.swing.JButton();
        jPanelIMC = new javax.swing.JPanel();
        labelIMC = new javax.swing.JLabel();
        calculoIMC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOpciones = new javax.swing.JList();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPeso.setText("peso");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kg");

        labelAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAltura.setText("altura");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("cm");

        campoPeso.setModel(new javax.swing.SpinnerNumberModel(30.0d, 30.0d, 150.0d, 1.0d));

        campoAltura.setModel(new javax.swing.SpinnerNumberModel(120.0d, 120.0d, 210.0d, 1.0d));

        javax.swing.GroupLayout jPanelPesoAlturaLayout = new javax.swing.GroupLayout(jPanelPesoAltura);
        jPanelPesoAltura.setLayout(jPanelPesoAlturaLayout);
        jPanelPesoAlturaLayout.setHorizontalGroup(
            jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoAlturaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAltura)
                    .addComponent(labelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(campoAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanelPesoAlturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanelPesoAlturaLayout.setVerticalGroup(
            jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoAlturaLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeso)
                    .addComponent(jLabel2)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesoAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAltura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        botonCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBotonLayout = new javax.swing.GroupLayout(jBoton);
        jBoton.setLayout(jBotonLayout);
        jBotonLayout.setHorizontalGroup(
            jBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBotonLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(botonCalcular)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jBotonLayout.setVerticalGroup(
            jBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBotonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botonCalcular)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        labelIMC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelIMC.setText("Resultado IMC");

        calculoIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoIMCActionPerformed(evt);
            }
        });

        listaOpciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaOpciones.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Obesidad", "Sobrepeso", "Normal", "Extra-delgadez" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaOpciones);

        javax.swing.GroupLayout jPanelIMCLayout = new javax.swing.GroupLayout(jPanelIMC);
        jPanelIMC.setLayout(jPanelIMCLayout);
        jPanelIMCLayout.setHorizontalGroup(
            jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIMCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIMC)
                .addGap(18, 18, 18)
                .addComponent(calculoIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelIMCLayout.setVerticalGroup(
            jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIMCLayout.createSequentialGroup()
                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIMCLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIMC)
                            .addComponent(calculoIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelIMCLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelPesoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPesoAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanelIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        try {

            DecimalFormat patron = new DecimalFormat(".##");
            String p = this.campoPeso.getValue().toString();
            String a = this.campoAltura.getValue().toString();

            Double peso = Double.parseDouble(p);
            Double altura = Double.parseDouble(a);
            alturaM = Math.pow((altura / 100), 2);

            imc = peso / alturaM;
            this.calculoIMC.setText(patron.format(imc));

            if (imc < 18.00) {
                this.listaOpciones.setSelectedIndex(3);
                this.calculoIMC.setBackground(Color.CYAN);
                JOptionPane.showMessageDialog(null, 
                    "Extremadelgadez, debe consultar a su medico",  
                    "Precaución",               
                    JOptionPane.ERROR_MESSAGE);
            }
            if (imc > 18.0 && imc <= 24.99) {
                this.listaOpciones.setSelectedIndex(2);
                this.calculoIMC.setBackground(Color.GREEN);
            }
            if (imc > 25.0 && imc <= 30.0) {
                this.listaOpciones.setSelectedIndex(1);
                this.calculoIMC.setBackground(Color.ORANGE);
            }
            if (imc > 30.0) {
                this.listaOpciones.setSelectedIndex(0);
                this.calculoIMC.setBackground(Color.red);
            }
        } catch (NumberFormatException e) {
//            throw new MiError("Error en las pciones de los datos");
//            JOptionPane.showMessageDialog(this, "Error");
            
        } catch (MiError e) {
            throw new MiError("Error");
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void calculoIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoIMCActionPerformed


    }//GEN-LAST:event_calculoIMCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Imc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JTextField calculoIMC;
    private javax.swing.JSpinner campoAltura;
    private javax.swing.JSpinner campoPeso;
    private javax.swing.JPanel jBoton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanelIMC;
    private javax.swing.JPanel jPanelPesoAltura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelIMC;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JList listaOpciones;
    private javax.swing.ButtonGroup rangos;
    // End of variables declaration//GEN-END:variables
    private Double alturaM, imc;
}
