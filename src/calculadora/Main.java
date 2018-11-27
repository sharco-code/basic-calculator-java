/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author god
 */
public class Main extends javax.swing.JFrame {

    Calculadora calc = new Calculadora();
    
    
    public Main() {
        
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        np = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        nat = new javax.swing.JButton();
        caja = new javax.swing.JTextField();
        superclean = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        nsum = new javax.swing.JButton();
        nothing = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        nres = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        caja2 = new javax.swing.JTextField();
        n4 = new javax.swing.JButton();
        npor = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        nent = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        ni = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setName("calculadora"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        np.setBackground(new java.awt.Color(255, 255, 255));
        np.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        np.setText(".");
        np.setFocusable(false);
        np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npActionPerformed(evt);
            }
        });

        clean.setBackground(new java.awt.Color(255, 255, 255));
        clean.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clean.setText("C");
        clean.setFocusable(false);
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        n9.setBackground(new java.awt.Color(255, 255, 255));
        n9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n9.setText("9");
        n9.setFocusable(false);
        n9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n9MouseClicked(evt);
            }
        });
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        nat.setBackground(new java.awt.Color(255, 255, 255));
        nat.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nat.setText("<");
        nat.setFocusable(false);
        nat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natActionPerformed(evt);
            }
        });

        caja.setEditable(false);
        caja.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        caja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja.setText("0");
        caja.setToolTipText("");
        caja.setBorder(null);
        caja.setKeymap(null);
        caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaActionPerformed(evt);
            }
        });
        caja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaKeyPressed(evt);
            }
        });

        superclean.setBackground(new java.awt.Color(255, 255, 255));
        superclean.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        superclean.setText("CE");
        superclean.setFocusable(false);
        superclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supercleanActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(255, 255, 255));
        n1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n1.setText("1");
        n1.setFocusable(false);
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        nsum.setBackground(new java.awt.Color(255, 255, 255));
        nsum.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nsum.setText("+");
        nsum.setFocusable(false);
        nsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsumActionPerformed(evt);
            }
        });

        nothing.setBackground(new java.awt.Color(255, 255, 255));
        nothing.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nothing.setEnabled(false);
        nothing.setFocusable(false);
        nothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nothingActionPerformed(evt);
            }
        });

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n2.setText("2");
        n2.setFocusable(false);
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        nres.setBackground(new java.awt.Color(255, 255, 255));
        nres.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nres.setText("-");
        nres.setFocusable(false);
        nres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nresActionPerformed(evt);
            }
        });

        n3.setBackground(new java.awt.Color(255, 255, 255));
        n3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n3.setText("3");
        n3.setFocusable(false);
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        caja2.setEditable(false);
        caja2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        caja2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja2.setToolTipText("");
        caja2.setBorder(null);
        caja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja2ActionPerformed(evt);
            }
        });
        caja2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja2KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caja2KeyPressed(evt);
            }
        });

        n4.setBackground(new java.awt.Color(255, 255, 255));
        n4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n4.setText("4");
        n4.setFocusable(false);
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        npor.setBackground(new java.awt.Color(255, 255, 255));
        npor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        npor.setText("×");
        npor.setFocusable(false);
        npor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nporActionPerformed(evt);
            }
        });

        n5.setBackground(new java.awt.Color(255, 255, 255));
        n5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n5.setText("5");
        n5.setFocusable(false);
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        nent.setBackground(new java.awt.Color(255, 255, 255));
        nent.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nent.setText("÷");
        nent.setFocusable(false);
        nent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nentActionPerformed(evt);
            }
        });

        n6.setBackground(new java.awt.Color(255, 255, 255));
        n6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n6.setText("6");
        n6.setFocusable(false);
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        ni.setBackground(new java.awt.Color(255, 255, 255));
        ni.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ni.setText("=");
        ni.setFocusable(false);
        ni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                niMouseClicked(evt);
            }
        });
        ni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niActionPerformed(evt);
            }
        });

        n7.setBackground(new java.awt.Color(255, 255, 255));
        n7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n7.setText("7");
        n7.setFocusable(false);
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n0.setBackground(new java.awt.Color(255, 255, 255));
        n0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n0.setText("0");
        n0.setFocusable(false);
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        n8.setBackground(new java.awt.Color(255, 255, 255));
        n8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n8.setText("8");
        n8.setFocusable(false);
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caja2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(superclean, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(nothing, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nsum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(npor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superclean, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(npor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nsum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nothing, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsumActionPerformed
        if(!caja.getText().equals("0")) {
            caja2.setText(calc.setN1(Double.parseDouble(caja.getText()), 1));
            caja.setText("0");
        }
        
    }//GEN-LAST:event_nsumActionPerformed

    private void nothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nothingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nothingActionPerformed

    private void caja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2ActionPerformed

    private void caja2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2KeyPressed

    private void caja2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2KeyTyped

    private void niMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_niMouseClicked

    private void niActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niActionPerformed
        calc.setN2(Double.parseDouble(caja.getText()));
        if(calc.getN1()!=0) {
            caja.setText(calc.operacion());
            caja2.setText("");
            calc.clean();
        }
        
    }//GEN-LAST:event_niActionPerformed

    private void natActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natActionPerformed
        if(!caja.getText().equals("0")) {
            if(caja.getText().substring(0, caja.getText().length() - 1).equals("")) {
                caja.setText("0");
            } else {
                caja.setText(caja.getText().substring(0, caja.getText().length() - 1));
            }
            
        }
        
    }//GEN-LAST:event_natActionPerformed

    private void cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaActionPerformed

    }//GEN-LAST:event_cajaActionPerformed

    private void cajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaKeyPressed

    }//GEN-LAST:event_cajaKeyPressed

    private void cajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaKeyTyped

    }//GEN-LAST:event_cajaKeyTyped

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        if(caja.getText().equals("0")) caja.setText("1");
        else caja.setText(caja.getText()+"1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        if(caja.getText().equals("0")) caja.setText("2");
        else caja.setText(caja.getText()+"2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        if(caja.getText().equals("0")) caja.setText("3");
        else caja.setText(caja.getText()+"3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        if(caja.getText().equals("0")) caja.setText("4");
        else caja.setText(caja.getText()+"4");
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        if(caja.getText().equals("0")) caja.setText("5");
        else caja.setText(caja.getText()+"5");
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        if(caja.getText().equals("0")) caja.setText("6");
        else caja.setText(caja.getText()+"6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        if(caja.getText().equals("0")) caja.setText("7");
        else caja.setText(caja.getText()+"7");
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        if(caja.getText().equals("0")) caja.setText("8");
        else caja.setText(caja.getText()+"8");
    }//GEN-LAST:event_n8ActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        calc.clean();
        caja.setText("0");
        caja2.setText("");
    }//GEN-LAST:event_cleanActionPerformed

    private void n9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MouseClicked

    }//GEN-LAST:event_n9MouseClicked

    private void supercleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supercleanActionPerformed
        caja.setText("0");
    }//GEN-LAST:event_supercleanActionPerformed

    private void nresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nresActionPerformed
        caja2.setText(calc.setN1(Double.parseDouble(caja.getText()), 2));
        caja.setText("0");
    }//GEN-LAST:event_nresActionPerformed

    private void nporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nporActionPerformed
        caja2.setText(calc.setN1(Double.parseDouble(caja.getText()), 3));
        caja.setText("0");
    }//GEN-LAST:event_nporActionPerformed

    private void nentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nentActionPerformed
        caja2.setText(calc.setN1(Double.parseDouble(caja.getText()), 4));
        caja.setText("0");
    }//GEN-LAST:event_nentActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        if(!caja.getText().equals("0")) caja.setText(caja.getText()+"0");
    }//GEN-LAST:event_n0ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        if(caja.getText().equals("0")) caja.setText("9");
        else caja.setText(caja.getText()+"9");
    }//GEN-LAST:event_n9ActionPerformed

    private void npActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npActionPerformed
        if(caja.getText().equals("0")) caja.setText("0.");
        else {
            if(!caja.getText().contains(".")) caja.setText(caja.getText()+".");
        }
    }//GEN-LAST:event_npActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caja;
    private javax.swing.JTextField caja2;
    private javax.swing.JButton clean;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton nat;
    private javax.swing.JButton nent;
    private javax.swing.JButton ni;
    private javax.swing.JButton nothing;
    private javax.swing.JButton np;
    private javax.swing.JButton npor;
    private javax.swing.JButton nres;
    private javax.swing.JButton nsum;
    private javax.swing.JButton superclean;
    // End of variables declaration//GEN-END:variables
}
