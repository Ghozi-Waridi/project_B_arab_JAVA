//السَّلَامُ عَلَيْكُمْم
// غاٍٍَََََََََََََََََََََََََََََََََََِِ
// اَلْعِلْمُ نُورٌ يُنِيرُ طَرِيقَ الْإِنْسَانِ فِي حَيَاتِهِ، وَمَنْ طَلَبَ الْعِلْمَ فَقَدْ طَلَبَ أَفْضَلَ الْخَيْرَاتِ، فَإِنَّ الْعِلْمَ سَبِيلٌ إِلَى النَّجَاحِ وَالتَّقَدُّمِ فِي جَمِيعِ الْمَجَالَاتِ
package project_b.arab_netbeand;

import java.awt.ComponentOrientation;
import project_b.arab_netbeand.Presentation.PresentationLayer;
import project_b.arab_netbeand.Repository.Harokat;
import project_b.arab_netbeand.Repository.SplitText;

public class MainFrame extends javax.swing.JFrame {
    
    private Harokat harokat;
    private SplitText splitText;
    private PresentationLayer presentation;
    
    private String textArab;
    private String arabTanpaHarokat;
    private String[] perkataArab;
    

    public MainFrame() {
            
        initComponents();
        
        harokat = new Harokat(Input);
        splitText = new SplitText();
        presentation = new PresentationLayer(Input);
        
        Input.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//        Output.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Input = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Harokat = new javax.swing.JButton();
        Split = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Input.setColumns(20);
        Input.setRows(5);
        Input.setMargin(new java.awt.Insets(10, 6, 10, 6));
        jScrollPane1.setViewportView(Input);

        jButton1.setText("All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Harokat.setText("Harokat");
        Harokat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HarokatActionPerformed(evt);
            }
        });

        Split.setText("Split");
        Split.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SplitActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Harokat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Split, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Split, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Harokat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HarokatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HarokatActionPerformed
        this.arabTanpaHarokat = harokat.operation();
        Input.setText("");
        presentation.Harokat_layer(arabTanpaHarokat);
    }//GEN-LAST:event_HarokatActionPerformed

    private void SplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitActionPerformed
        perkataArab = this.splitText.operation(arabTanpaHarokat);
        Input.setText("");
        presentation.Split_layer(perkataArab);
    }//GEN-LAST:event_SplitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Input.setText("");
        presentation.Harokat_layer(arabTanpaHarokat);
        presentation.Split_layer(perkataArab);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        Output.setText("");
        Input.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Harokat;
    private javax.swing.JTextArea Input;
    private javax.swing.JButton Split;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
