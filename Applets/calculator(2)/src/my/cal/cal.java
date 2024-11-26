package my.cal;
public class cal extends javax.swing.JFrame {
    String s1="";
    String s2="";
    char op=' ';
    int w=0,p=0;
    String s3="";
    double a=0.0;
    double b=0.0;
    String his="";
    public cal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        equa = new javax.swing.JButton();
        div = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        min = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        txtm = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txth = new javax.swing.JTextField();
        neg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        equa.setText("=");
        equa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equaActionPerformed(evt);
            }
        });

        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        min.setText("-");
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(one)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(two)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(three)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(four)
                                .addGap(6, 6, 6)
                                .addComponent(five)
                                .addGap(6, 6, 6)
                                .addComponent(six)
                                .addGap(6, 6, 6)
                                .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seven)
                                .addGap(6, 6, 6)
                                .addComponent(eight)
                                .addGap(6, 6, 6)
                                .addComponent(nine)
                                .addGap(6, 6, 6)
                                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(div))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(mul))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(min))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zero)
                    .addComponent(dot)
                    .addComponent(equa)
                    .addComponent(plus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtm.setEditable(false);
        txtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmActionPerformed(evt);
            }
        });

        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel1.setText("                          History");

        txth.setEditable(false);
        jScrollPane3.setViewportView(txth);

        neg.setText("'-'");
        neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negActionPerformed(evt);
            }
        });

        jButton1.setText("Del");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtm, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(36, 36, 36)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(neg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(neg)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
    s1=s1+"2";
    txtm.setText(s1);
    }//GEN-LAST:event_twoActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
    s1=s1+"6";
    txtm.setText(s1);
    }//GEN-LAST:event_sixActionPerformed

    private void equaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equaActionPerformed
        a=Double.valueOf(s2);
        b=Double.valueOf(s1);
        String e="";
        his=his+s1;
        double c = 0;
        switch(op)
        {
            case '+':
                c=a+b;
                break;
                
            case '-':
                c=a-b;
                break;
                
            case '*':
                c=a*b;
                break;
                
            case '/':
                if(b<0)
                {
                    txtm.setText("Math Error");
                }
                else
                {
                    c=a/b;
                }
                break;
                
            default:
                txtm.setText("wrong Input");
                break;
        }   
        e=Double.toString(c);
        s2=e;
        s1="";
        txtm.setText(s2);
        his=his+'='+e;
        txth.setText(his);
        op=' ';
        w=0;
        p++;
    }//GEN-LAST:event_equaActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
    if(w>0)
    {
        a=Double.valueOf(s2);
        b=Double.valueOf(s1);
        String e="";
        double c = 0;
        his=his+s1;
        switch(op)
        {
            case '+':
                c=a+b;
                break;
                
            case '-':
                c=a-b;
                break;
                
            case '*':
                c=a*b;
                break;
                
            case '/':
                if(b<0)
                {
                    txtm.setText("Math Error");
                }
                else
                {
                    c=a/b;
                }
                break;
                
            default:
                txtm.setText("wrong Input");
                break;
        }
        e=Double.toString(c);
        s2=e;
        s1="";
        txtm.setText("");
        w++;
        op='/';
        his=his+op;
        txth.setText(his);
    }
    else
    {
        op='/';
        if(p>0)
        {
            his="";
            his=s2+op;
            a=Double.valueOf(s2);
            b=Double.valueOf(s1);
            double c5=a/b;
            s2=Double.toString(c5);
            p=0;
            his=his+s2;
        }
        else
        {
            his=his+s1+op;
            s2=s1;
        }
        s1="";   
        txth.setText(his);
        txtm.setText("");
        w++;
    }
    }//GEN-LAST:event_divActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
    s1=s1+"3";
    txtm.setText(s1);
    }//GEN-LAST:event_threeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
    s1=s1+"0";
    txtm.setText(s1);
    }//GEN-LAST:event_zeroActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
    if(w>0)
    {
        a=Double.valueOf(s2);
        b=Double.valueOf(s1);
        String e="";
        double c = 0;
        his=his+s1;
        switch(op)
        {
            case '+':
                c=a+b;
                break;
                
            case '-':
                c=a-b;
                break;
                
            case '*':
                c=a*b;
                break;
                
            case '/':
                if(b<0)
                {
                    txtm.setText("Math Error");
                }
                else
                {
                    c=a/b;
                }
                break;
                
            default:
                txtm.setText("wrong Input");
                break;
        }
        e=Double.toString(c);
        s2=e;
        s1="";
        txtm.setText("");
        w++;
        op='+';
        his=his+op;
        txth.setText(his);
    }
    else
    {
        
        op='+';
       if(p>0)
        {
            his="";
            his=s2+op;
            a=Double.valueOf(s2);
            b=Double.valueOf(s1);
            double c5=a+b;
            s2=Double.toString(c5);
            p=0;
            his=his+s2;
        }
        else
        {
            his=his+s1+op;
            s2=s1;
        }
        s1="";   
        txth.setText(his);
        txtm.setText("");
        w++;
    }
    }//GEN-LAST:event_plusActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
    if(w>0)
    {
        a=Double.valueOf(s2);
        b=Double.valueOf(s1);
        String e="";
        double c = 0;
        his=his+s1;
        switch(op)
        {
            case '+':
                c=a+b;
                break;
                
            case '-':
                c=a-b;
                break;
                
            case '*':
                c=a*b;
                break;
                
            case '/':
                if(b<0)
                {
                    txtm.setText("Math Error");
                }
                else
                {
                    c=a/b;
                }
                break;
                
            default:
                txtm.setText("wrong Input");
                break;
        }
        e=Double.toString(c);
        s2=e;
        s1="";
        txtm.setText("");
        w++;
        op='*';
        his=his+op;
        txth.setText(his);
    }
    else
    {
        op='*';
        if(p>0)
        {
            his="";
            his=s2+op;
            a=Double.valueOf(s2);
            b=Double.valueOf(s1);
            double c5=a*b;
            s2=Double.toString(c5);
            p=0;
            his=his+s2;
        }
        else
        {
            his=his+s1+op;
            s2=s1;
        }
        s1="";   
        txth.setText(his);
        txtm.setText("");
        w++;
    }
    }//GEN-LAST:event_mulActionPerformed

    private void txtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
    s1=s1+"8";
    txtm.setText(s1);
    }//GEN-LAST:event_eightActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
    s1=s1+".";  
    txtm.setText(s1);
    }//GEN-LAST:event_dotActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
     s1=s1+"1";
     txtm.setText(s1);
    }//GEN-LAST:event_oneActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
    s1=s1+"4";
    txtm.setText(s1);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
    s1=s1+"5";
    txtm.setText(s1);
    }//GEN-LAST:event_fiveActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
    s1=s1+"7";
    txtm.setText(s1);
    }//GEN-LAST:event_sevenActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
    s1=s1+"9";
    txtm.setText(s1);
    }//GEN-LAST:event_nineActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
   txtm.setText("");
   s1="";
   s2="";
   w=0;
   txth.setText("");
   his="";
    }//GEN-LAST:event_clearActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
    if(w>0)
    {
        a=Double.valueOf(s2);
        b=Double.valueOf(s1);
        String e="";
        double c = 0;
        his=his+s1;
        switch(op)
        {
            case '+':
                c=a+b;
                break;
                
            case '-':
                c=a-b;
                break;
                
            case '*':
                c=a*b;
                break;
                
            case '/':
                if(b<0)
                {
                    txtm.setText("Math Error");
                }
                else
                {
                    c=a/b;
                }
                break;
                
            default:
                txtm.setText("wrong Input");
                break;
        }
        e=Double.toString(c);
        s2=e;
        s1="";
        txtm.setText("");
        w++;
        op='-';
        his=his+op;
        txth.setText(his);
    }
    else
    {
        
        op='-';
        if(p>0)
        {
            his="";
            his=s2+op;
            a=Double.valueOf(s2);
            b=Double.valueOf(s1);
            double c5=a-b;
            s2=Double.toString(c5);
            p=0;
            his=his+s2;
        }
        else
        {
            his=his+s1+op;
            s2=s1;
        }
        s1="";   
        txth.setText(his);
        txtm.setText("");
        w++;
    }
    }//GEN-LAST:event_minActionPerformed

    private void negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negActionPerformed
        s1="-"+s1;
     txtm.setText(s1);
    }//GEN-LAST:event_negActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int l=s1.length();
     String s5="";
     for(int i=0;i<l-1;i++)
     {
         char c4=s1.charAt(i);
         s5=s5+c4;
     }
     s1=s5;
     txtm.setText(s1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equa;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton min;
    private javax.swing.JButton mul;
    private javax.swing.JButton neg;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JTextField txth;
    private javax.swing.JTextField txtm;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
