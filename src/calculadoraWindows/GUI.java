package calculadoraWindows;

import java.util.ArrayList;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelResultado = new javax.swing.JPanel();
        textoResultado = new javax.swing.JTextField();
        jPanelNumeros = new javax.swing.JPanel();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        jPanelOperandos = new javax.swing.JPanel();
        operandoSuma = new javax.swing.JButton();
        operandoMultiplicar = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        operandoRestar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoResultado.setEnabled(false);

        javax.swing.GroupLayout jPanelResultadoLayout = new javax.swing.GroupLayout(jPanelResultado);
        jPanelResultado.setLayout(jPanelResultadoLayout);
        jPanelResultadoLayout.setHorizontalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoResultado)
                .addContainerGap())
        );
        jPanelResultadoLayout.setVerticalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        numero1.setLabel("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.setLabel("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        numero0.setText("0");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });

        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNumerosLayout = new javax.swing.GroupLayout(jPanelNumeros);
        jPanelNumeros.setLayout(jPanelNumerosLayout);
        jPanelNumerosLayout.setHorizontalGroup(
            jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNumerosLayout.createSequentialGroup()
                            .addComponent(numero1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numero2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numero3)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanelNumerosLayout.createSequentialGroup()
                            .addComponent(numero7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numero8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero9)))
                    .addGroup(jPanelNumerosLayout.createSequentialGroup()
                        .addComponent(numero4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numero6)))
                .addContainerGap())
        );
        jPanelNumerosLayout.setVerticalGroup(
            jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumerosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero7)
                    .addComponent(numero8)
                    .addComponent(numero9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero4)
                    .addComponent(numero5)
                    .addComponent(numero6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1)
                    .addComponent(numero2)
                    .addComponent(numero3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numero0)
                .addGap(7, 7, 7))
        );

        operandoSuma.setText("+");
        operandoSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operandoSumaActionPerformed(evt);
            }
        });

        operandoMultiplicar.setText("*");
        operandoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operandoMultiplicarActionPerformed(evt);
            }
        });

        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        operandoRestar.setText("-");
        operandoRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operandoRestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperandosLayout = new javax.swing.GroupLayout(jPanelOperandos);
        jPanelOperandos.setLayout(jPanelOperandosLayout);
        jPanelOperandosLayout.setHorizontalGroup(
            jPanelOperandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperandosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOperandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operandoSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operandoMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operandoRestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOperandosLayout.setVerticalGroup(
            jPanelOperandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperandosLayout.createSequentialGroup()
                .addComponent(operandoRestar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(operandoMultiplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operandoSuma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botonBorrar.setText("Retroceso");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBorrar)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(botonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNumeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOperandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed

        this.textoResultado.setText(this.textoResultado.getText().concat("1"));
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("0"));
    }//GEN-LAST:event_numero0ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("2"));
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("3"));
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("4"));
    }//GEN-LAST:event_numero4ActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        this.textoResultado.setText("");
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void operandoSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operandoSumaActionPerformed
        Double conversion = Double.parseDouble(this.textoResultado.getText());
        listaNumeros.add(conversion);
        listaOperaciones.add("+");
        this.textoResultado.setText("");
    }//GEN-LAST:event_operandoSumaActionPerformed

    private void operandoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operandoMultiplicarActionPerformed
        Double conversion = Double.parseDouble(this.textoResultado.getText());
        listaNumeros.add(conversion);
        listaOperaciones.add("*");
        this.textoResultado.setText("");
    }//GEN-LAST:event_operandoMultiplicarActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        Double conversion = Double.parseDouble(this.textoResultado.getText());
        listaNumeros.add(conversion);
        Double respuesta = 0.0;
        String resultado = "";
        if (listaOperaciones.get(0).equals("+")) {
            respuesta = listaNumeros.get(0) + listaNumeros.get(1);
        } else if (listaOperaciones.get(0).equals("*")) {
            respuesta = listaNumeros.get(0) * listaNumeros.get(1);
        } else if (listaOperaciones.get(0).equals("-")) {
            respuesta = listaNumeros.get(0) - listaNumeros.get(1);
        }
        resultado = respuesta.toString();
        this.textoResultado.setText(resultado);


    }//GEN-LAST:event_resultadoActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("5"));
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("6"));
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("7"));
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("8"));
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        this.textoResultado.setText(this.textoResultado.getText().concat("9"));
    }//GEN-LAST:event_numero9ActionPerformed

    private void operandoRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operandoRestarActionPerformed
        Double conversion = Double.parseDouble(this.textoResultado.getText());
        listaNumeros.add(conversion);
        listaOperaciones.add("-");
        this.textoResultado.setText("");
    }//GEN-LAST:event_operandoRestarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JPanel jPanelNumeros;
    private javax.swing.JPanel jPanelOperandos;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JButton operandoMultiplicar;
    private javax.swing.JButton operandoRestar;
    private javax.swing.JButton operandoSuma;
    private javax.swing.JButton resultado;
    private javax.swing.JTextField textoResultado;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Double> listaNumeros = new ArrayList<Double>();
    private ArrayList<String> listaOperaciones = new ArrayList<String>();
}
