/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu.compras;

import igu.ChangePanel;
import igu.compras.clientes.ClientesPanel;
import igu.compras.clientes.ProductosPanel;
import igu.compras.panels.ComprasPanel;
import java.awt.Color;

/**
 *
 * @author Asullom
 */
public class ComprasMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form ComprasMainPanel
     */
    public ComprasMainPanel() {
        initComponents();
        new ChangePanel(workPanel, new ComprasPanel());
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
        jPanel2 = new javax.swing.JPanel();
        clientesButton = new igu.util.buttons.TheButton();
        comprasButton = new igu.util.buttons.TheButton();
        clientesButton1 = new igu.util.buttons.TheButton();
        workPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        clientesButton.setBackground(new java.awt.Color(239, 238, 244));
        clientesButton.setForeground(new java.awt.Color(128, 128, 131));
        clientesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/feeedback.png"))); // NOI18N
        clientesButton.setText("CLIENTES");
        clientesButton.setColorHover(new java.awt.Color(204, 204, 204));
        clientesButton.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesButton.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesButton.setFocusable(false);
        clientesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesButtonMousePressed(evt);
            }
        });
        clientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButtonActionPerformed(evt);
            }
        });

        comprasButton.setBackground(new java.awt.Color(204, 204, 204));
        comprasButton.setForeground(new java.awt.Color(128, 128, 131));
        comprasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/market.png"))); // NOI18N
        comprasButton.setText("COMPRAS");
        comprasButton.setColorHover(new java.awt.Color(204, 204, 204));
        comprasButton.setColorNormal(new java.awt.Color(204, 204, 204));
        comprasButton.setColorPressed(new java.awt.Color(204, 204, 204));
        comprasButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        comprasButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        comprasButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        comprasButton.setFocusable(false);
        comprasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comprasButtonMousePressed(evt);
            }
        });
        comprasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasButtonActionPerformed(evt);
            }
        });

        clientesButton1.setBackground(new java.awt.Color(239, 238, 244));
        clientesButton1.setForeground(new java.awt.Color(128, 128, 131));
        clientesButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/feeedback.png"))); // NOI18N
        clientesButton1.setText("CLIENTES");
        clientesButton1.setColorHover(new java.awt.Color(204, 204, 204));
        clientesButton1.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesButton1.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesButton1.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesButton1.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesButton1.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesButton1.setFocusable(false);
        clientesButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesButton1MousePressed(evt);
            }
        });
        clientesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comprasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comprasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientesButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
        );

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setLayout(new javax.swing.BoxLayout(workPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comprasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasButtonActionPerformed
        // TODO add your handling code here:
        new ChangePanel(workPanel, new ComprasPanel());

        if (this.comprasButton.isSelected()) {
            this.comprasButton.setColorNormal(new Color(204, 204, 204));

            this.clientesButton.setColorNormal(new Color(239, 238, 244));

        } else {
            this.comprasButton.setColorNormal(new Color(239, 238, 244));
        }
    }//GEN-LAST:event_comprasButtonActionPerformed

    private void clientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButtonActionPerformed
        // TODO add your handling code here:
        new ChangePanel(workPanel, new ProductosPanel());
        /*  if (new Validate().comprobar()) {

        } else {
            new ChangePanel(pnlPrincipal, new PinPanel());
        }*/

        if (this.clientesButton.isSelected()) {
            this.clientesButton.setColorNormal(new Color(204, 204, 204));

            this.comprasButton.setColorNormal(new Color(239, 238, 244));

        } else {
            this.clientesButton.setColorNormal(new Color(239, 238, 244));
        }
        
    }//GEN-LAST:event_clientesButtonActionPerformed

    private void clientesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButtonMousePressed
        // TODO add your handling code here:
         this.clientesButton.setSelected(true);
        this.comprasButton.setSelected(false);
    }//GEN-LAST:event_clientesButtonMousePressed

    private void comprasButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasButtonMousePressed
        // TODO add your handling code here:
         this.comprasButton.setSelected(true);
        this.clientesButton.setSelected(false);
    }//GEN-LAST:event_comprasButtonMousePressed

    private void clientesButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesButton1MousePressed

    private void clientesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private igu.util.buttons.TheButton clientesButton;
    private igu.util.buttons.TheButton clientesButton1;
    private igu.util.buttons.TheButton comprasButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
