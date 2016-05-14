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
    public static String comport = "COM7";
    
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
        textComport = new javax.swing.JTextField();
        btnCon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arduinoserial/up.png"))); // NOI18N
        upBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                upBtnMouseReleased(evt);
            }
        });

        downBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arduinoserial/down.png"))); // NOI18N
        downBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                downBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                downBtnMouseReleased(evt);
            }
        });

        rightBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arduinoserial/right.png"))); // NOI18N
        rightBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rightBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rightBtnMouseReleased(evt);
            }
        });

        leftBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arduinoserial/left.png"))); // NOI18N
        leftBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        leftBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leftBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leftBtnMouseReleased(evt);
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

        btnCon.setText("Connect");
        btnCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(131, Short.MAX_VALUE)
                        .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textComport)
                            .addComponent(btnCon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)))
                .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(textComport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(speedSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    //set default speed
    int speed = 25;
    private void speedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedSliderStateChanged
        //get slider's value
        speed = speedSlider.getValue();
    }//GEN-LAST:event_speedSliderStateChanged

    private void btnConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConMouseClicked
        ArduinoSerialUI.comport = this.textComport.getText();
        this.mComPort = new ComPort(ArduinoSerialUI.comport);
        
        try {
            this.mComPort.connect();
        } catch (NoSuchPortException ex) {
            System.out.println(this.mComPort.portName + " not found!");
        } catch (PortInUseException ex) {
            System.out.println(this.mComPort.portName + " in use!");
        } catch (UnsupportedCommOperationException | IOException ex) {
            System.out.println("Something happend :)");
        }

    }//GEN-LAST:event_btnConMouseClicked

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
                
                window.setVisible(true);

            }
        });
    }

    public ComPort mComPort;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCon;
    private javax.swing.JButton downBtn;
    private javax.swing.JButton leftBtn;
    private javax.swing.JButton rightBtn;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JTextField textComport;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
