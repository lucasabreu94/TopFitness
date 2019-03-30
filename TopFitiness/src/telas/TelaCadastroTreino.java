/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Treino;
import modelo.dao.TreinoDAO;


/**
 *
 * @author ldabr
 */
public class TelaCadastroTreino extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroTreino
     */
    public TelaCadastroTreino() {
        initComponents();
        setIcon();
        
        DefaultTableModel modelo = (DefaultTableModel) jTblTreinos.getModel();
        jTblTreinos.setRowSorter(new TableRowSorter(modelo));

        readJTblTreino();
    }

    public void readJTblTreino(){
        DefaultTableModel modelo = (DefaultTableModel) jTblTreinos.getModel();
        modelo.setNumRows(0);
        TreinoDAO tdao = new TreinoDAO();
        
        for(Treino t: tdao.read()){     
            modelo.addRow(new Object[]{
            t.getId(),
            t.getNome()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnSalvar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jTxtTreino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblTreinos = new javax.swing.JTable();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Sair");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Treino");

        jTblTreinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Treino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblTreinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblTreinosMouseClicked(evt);
            }
        });
        jTblTreinos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTblTreinosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTblTreinos);

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtTreino, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnCancelar)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnCancelar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        Treino t = new Treino();
        TreinoDAO dao = new TreinoDAO();
        t.setNome(jTxtTreino.getText());
        dao.create(t);

        jTxtTreino.setText("");

        readJTblTreino();
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jTblTreinosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblTreinosKeyReleased
        if(jTblTreinos.getSelectedRow() != -1){

            jTxtTreino.setText(jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 1).toString());
            
        }
    }//GEN-LAST:event_jTblTreinosKeyReleased

    private void jTblTreinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblTreinosMouseClicked
        if(jTblTreinos.getSelectedRow() != -1){

            jTxtTreino.setText(jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 1).toString());
            
        }
    }//GEN-LAST:event_jTblTreinosMouseClicked

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if(jTblTreinos.getSelectedRow() != -1){

            Treino t = new Treino();
            TreinoDAO dao = new TreinoDAO();

            t.setId((int)jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 0));
            dao.delete(t);

            jTxtTreino.setText("");
            

            readJTblTreino();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para fazer exclusão.");
        }
    
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja fechar ?",
                "Atenção", JOptionPane.YES_NO_OPTION );
        if (sair == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        if(jTblTreinos.getSelectedRow() != -1){

            Treino t = new Treino();
            TreinoDAO dao = new TreinoDAO();
            t.setNome(jTxtTreino.getText());            
            t.setId((int)jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 0));
            dao.update(t);

            jTxtTreino.setText("");
            

            readJTblTreino();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para fazer alteração.");
        }
    }//GEN-LAST:event_jBtnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroTreino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblTreinos;
    private javax.swing.JTextField jTxtTreino;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
    
}