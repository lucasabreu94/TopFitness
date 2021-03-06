/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Treino;
import modelo.dao.TreinoDAO;


/**
 *
 * @author user
 */
public class TelaCadTreino extends javax.swing.JFrame {

    static int idTreino;
    static String nomeTreino; 
    static boolean preecamp;

    /**
     * Creates new form TelaExercicios
     */
    public TelaCadTreino() {
        initComponents();
        setIcon();
        
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnTreinoExerc = new javax.swing.JButton();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jTxtTreino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblTreinos = new javax.swing.JTable();
        jTxtIDTreino = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadatro Treino");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo 64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jBtnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/waste_32px.png"))); // NOI18N
        jBtnExcluir.setText("EXCLUIR");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save_32px.png"))); // NOI18N
        jBtnSalvar.setText("SALVAR");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnTreinoExerc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnTreinoExerc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dumbbell 32x.png"))); // NOI18N
        jBtnTreinoExerc.setText("TREINO EXERCICIOS");
        jBtnTreinoExerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTreinoExercActionPerformed(evt);
            }
        });

        jBtnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add_32px.png"))); // NOI18N
        jBtnAdicionar.setText("ADICIONAR");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_window_32px.png"))); // NOI18N
        jBtnSair.setText("SAIR");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome Treino");

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

        jTxtIDTreino.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnTreinoExerc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtIDTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTreino))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAdicionar)
                        .addGap(29, 29, 29)
                        .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnExcluir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtIDTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSair)
                    .addComponent(jBtnTreinoExerc))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        Treino t = new Treino();
        TreinoDAO dao = new TreinoDAO();
        t.setNome(jTxtTreino.getText());
        dao.create(t);

        jTxtTreino.setText("");

        readJTblTreino();
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
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
    }//GEN-LAST:event_jBtnSalvarActionPerformed

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

    private void jTblTreinosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblTreinosKeyReleased
        if(jTblTreinos.getSelectedRow() != -1){

            jTxtTreino.setText(jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jTblTreinosKeyReleased

    private void jTblTreinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblTreinosMouseClicked
        if(jTblTreinos.getSelectedRow() != -1){
            
            jTxtIDTreino.setText(jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 0).toString());
            jTxtTreino.setText(jTblTreinos.getValueAt(jTblTreinos.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jTblTreinosMouseClicked

    private void jBtnTreinoExercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTreinoExercActionPerformed
        if(jTblTreinos.getSelectedRow() != -1){
            // TODO add your handling code here:
            idTreino = Integer.parseInt(jTxtIDTreino.getText());
            nomeTreino = jTxtTreino.getText();
            preecamp = true;
            
            TelaTreinoExercicios treinoexer = new TelaTreinoExercicios();
            treinoexer.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um aluno.");
        }
    }//GEN-LAST:event_jBtnTreinoExercActionPerformed

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadTreino().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JButton jBtnTreinoExerc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblTreinos;
    private javax.swing.JTextField jTxtIDTreino;
    private javax.swing.JTextField jTxtTreino;
    // End of variables declaration//GEN-END:variables
}
