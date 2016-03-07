package arduinoserial;

import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.Timer;

public class ArduinoSerialUI extends javax.swing.JFrame {

    public Timer timer;

    public ArduinoSerialUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();
        speedSlider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upBtn.setText("UP");
        upBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                upBtnMouseReleased(evt);
            }
        });
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        upBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upBtnKeyPressed(evt);
            }
        });

        downBtn.setText("DOWN");
        downBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                downBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                downBtnMouseReleased(evt);
            }
        });
        downBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downBtnActionPerformed(evt);
            }
        });

        rightBtn.setText("RIGHT");
        rightBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rightBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rightBtnMouseReleased(evt);
            }
        });
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        leftBtn.setText("LEFT");
        leftBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leftBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leftBtnMouseReleased(evt);
            }
        });
        leftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtnActionPerformed(evt);
            }
        });

        speedSlider.setMaximum(50);
        speedSlider.setMinimum(10);
        speedSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        speedSlider.setValue(25);
        speedSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        speedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                speedSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(downBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(upBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(leftBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(rightBtn)
                        .addGap(35, 35, 35)))
                .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtnActionPerformed

    }//GEN-LAST:event_leftBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed

    }//GEN-LAST:event_upBtnActionPerformed

    private void downBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downBtnActionPerformed

    }//GEN-LAST:event_downBtnActionPerformed

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed

    }//GEN-LAST:event_rightBtnActionPerformed


    private void upBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upBtnMousePressed

        this.timer = new Timer(speed, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                byte data[] = new byte[1];
                data[0] = (byte) (20);
                mComPort.write(data);
            }
        });
        this.timer.start();


    }//GEN-LAST:event_upBtnMousePressed

    private void downBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downBtnMousePressed
        this.timer = new Timer(speed, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                byte data[] = new byte[1];
                data[0] = (byte) (40);
                mComPort.write(data);
            }
        });
        this.timer.start();
    }//GEN-LAST:event_downBtnMousePressed

    private void upBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upBtnMouseReleased
        this.timer.stop();
    }//GEN-LAST:event_upBtnMouseReleased

    private void rightBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightBtnMouseReleased
        this.timer.stop();
    }//GEN-LAST:event_rightBtnMouseReleased

    private void leftBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftBtnMouseReleased
        this.timer.stop();
    }//GEN-LAST:event_leftBtnMouseReleased

    private void downBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downBtnMouseReleased
        this.timer.stop();
    }//GEN-LAST:event_downBtnMouseReleased

    private void rightBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightBtnMousePressed
        this.timer = new Timer(speed, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                byte data[] = new byte[1];
                data[0] = (byte) (80);
                mComPort.write(data);
            }
        });
        this.timer.start();
    }//GEN-LAST:event_rightBtnMousePressed

    private void leftBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftBtnMousePressed
        this.timer = new Timer(speed, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                byte data[] = new byte[1];
                data[0] = (byte) (60);
                mComPort.write(data);
            }
        });
        this.timer.start();
    }//GEN-LAST:event_leftBtnMousePressed

    int speed = 25;
    private void speedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedSliderStateChanged
        speed = speedSlider.getValue();
    }//GEN-LAST:event_speedSliderStateChanged

    private void upBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upBtnKeyPressed
        this.timer = new Timer(speed, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                byte data[] = new byte[1];
                data[0] = (byte) (20);
                mComPort.write(data);
            }
        });
        this.timer.start();
    }//GEN-LAST:event_upBtnKeyPressed

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
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                ArduinoSerialUI window = new ArduinoSerialUI();

                window.mComPort = new ComPort("COM63");
                try {
                    window.mComPort.connect();
                } catch (NoSuchPortException ex) {
                    System.out.println(window.mComPort.portName + " not found!");
                } catch (PortInUseException ex) {
                    System.out.println(window.mComPort.portName + " in use!");
                } catch (UnsupportedCommOperationException | IOException ex) {
                    System.out.println("Something happend :)");
                }

                window.setVisible(true);

            }
        });
    }

    public ComPort mComPort;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downBtn;
    private javax.swing.JButton leftBtn;
    private javax.swing.JButton rightBtn;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
