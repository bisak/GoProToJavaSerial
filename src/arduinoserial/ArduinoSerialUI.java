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
        speedSlider.setValue(25);
        speedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                speedSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(leftBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightBtn)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(downBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(upBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(upBtn)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rightBtn)
                    .addComponent(leftBtn))
                .addGap(20, 20, 20)
                .addComponent(downBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    int speed=25;
    private void speedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedSliderStateChanged
        speed = speedSlider.getValue();
    }//GEN-LAST:event_speedSliderStateChanged

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
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArduinoSerialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                ArduinoSerialUI window = new ArduinoSerialUI();

                window.mComPort = new ComPort("COM31");
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

        // connects to the port which name (e.g. COM1) is in the first argument  
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
