/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Aluno;
import modelo.dao.AlunoDAO;

/**
 *
 * @author ldabr
 */
public class TelaMain extends javax.swing.JFrame {

    static int idAluno;
    static String nome;
    static boolean preecamp;

    /**
     * Creates new form ViewJMain
     */
    public TelaMain() {
        initComponents();        
        setIcon();
        
        readJTblAlunos();
   
    }

    public void readJTblAlunos(){
        DefaultTableModel modelo = (DefaultTableModel) jTbAluno.getModel();
        modelo.setNumRows(0);
        AlunoDAO adao = new AlunoDAO();
        
        for(Aluno a: adao.read()){     
            modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getSexo(),
            a.getDatanasc(),
            a.getObjetivo()
            });
        }
    }
    
    public void searchJTblAlunos(String nome){
        DefaultTableModel modelo = (DefaultTableModel) jTbAluno.getModel();
        modelo.setNumRows(0);
        AlunoDAO adao = new AlunoDAO();
        
        for(Aluno a: adao.search(nome)){     
            modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getSexo(),
            a.getDatanasc(),
            a.getObjetivo()
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

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbAluno = new javax.swing.JTable();
        jBtnExercicios = new javax.swing.JButton();
        btnTreinos = new javax.swing.JButton();
        btnTreinoAluno = new javax.swing.JButton();
        jTxtIdAluno = new javax.swing.JTextField();
        jTxtNomeAluno = new javax.swing.JTextField();
        jBtnConsultar = new javax.swing.JToggleButton();
        jBtnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Top Fitness");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(84, 122));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo 64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTbAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sexo", "Data de Nascimento", "Objetivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbAluno);
        jTbAluno.getAccessibleContext().setAccessibleName("jTbAluno");

        jBtnExercicios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnExercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dumbbell 32x.png"))); // NOI18N
        jBtnExercicios.setText("EXERCÍCIOS");
        jBtnExercicios.setToolTipText("Exercícios");
        jBtnExercicios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBtnExercicios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBtnExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExerciciosActionPerformed(evt);
            }
        });

        btnTreinos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTreinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bench_press_32px.png"))); // NOI18N
        btnTreinos.setText("TREINOS");
        btnTreinos.setToolTipText("Treinos Padrões");
        btnTreinos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinosActionPerformed(evt);
            }
        });

        btnTreinoAluno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTreinoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/weightlifting_32px.png"))); // NOI18N
        btnTreinoAluno.setToolTipText("Editar Treino do Aluno");
        btnTreinoAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTreinoAluno.setLabel("TREINO \nALUNO ");
        btnTreinoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinoAlunoActionPerformed(evt);
            }
        });

        jTxtIdAluno.setEditable(false);
        jTxtIdAluno.setEnabled(false);
        jTxtIdAluno.setOpaque(false);

        jTxtNomeAluno.setToolTipText("Digite nome do aluno");

        jBtnConsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search_32px.png"))); // NOI18N
        jBtnConsultar.setText("CONSULTAR");
        jBtnConsultar.setToolTipText("Consultar aluno");
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_window_32px.png"))); // NOI18N
        jBtnSair.setText("SAIR");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTreinoAluno)
                            .addComponent(jBtnExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSair))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConsultar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConsultar)
                    .addComponent(jTxtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTreinoAluno)
                        .addGap(18, 18, 18)
                        .addComponent(btnTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExercicios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setFont(jMenuBar1.getFont());

        jMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dumbbell 16x.png"))); // NOI18N
        jMenu.setText("Exercicios");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dumbbell 16x.png"))); // NOI18N
        jMenuItem1.setText("Exercicios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem1);

        jMenuBar1.add(jMenu);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bench_press_16px.png"))); // NOI18N
        jMenu2.setText("Treinos");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bench_press_16px.png"))); // NOI18N
        jMenuItem3.setText("Treinos Pré-definidos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/weightlifting_16px.png"))); // NOI18N
        jMenuItem4.setText("Treino Aluno");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info_16px.png"))); // NOI18N
        jMenu3.setText("Opções");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_window_16px.png"))); // NOI18N
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaExercicios exercicios = new TelaExercicios();
        exercicios.setVisible(true);
       
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaCadTreino cadtreino = new TelaCadTreino();
        cadtreino.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinosActionPerformed
        TelaCadTreino cadtreino = new TelaCadTreino();
        cadtreino.setVisible(true);
    }//GEN-LAST:event_btnTreinosActionPerformed

    private void jBtnExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExerciciosActionPerformed
        TelaExercicios exercicios = new TelaExercicios();
        exercicios.setVisible(true);
        
    }//GEN-LAST:event_jBtnExerciciosActionPerformed

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        if (jTxtNomeAluno.getText() != ""){
            searchJTblAlunos(jTxtNomeAluno.getText());
            jTxtIdAluno.setText("");
        } else{
            readJTblAlunos();
            jTxtIdAluno.setText("");
        }
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void jTbAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbAlunoMouseClicked
        int linha = jTbAluno.getSelectedRow();

        /* Verifica se não foi clicado em uma tabela vazia */
        if (linha > -1) {
            /* Captura o modelo da tabela */
            DefaultTableModel modelo = (DefaultTableModel) jTbAluno.getModel();

            /* Copia os dados do registro selecionado para os campos texto */
            jTxtIdAluno.setText(modelo.getValueAt(linha, 0).toString());
            jTxtNomeAluno.setText(modelo.getValueAt(linha, 1).toString());

        }
    }//GEN-LAST:event_jTbAlunoMouseClicked

    private void btnTreinoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinoAlunoActionPerformed
       if(jTbAluno.getSelectedRow() != -1){
            // TODO add your handling code here:
            idAluno = Integer.parseInt(jTxtIdAluno.getText());
            nome = jTxtNomeAluno.getText();
            preecamp = true;
            
            TelaTreinoAluno alunotreino = new TelaTreinoAluno();
            alunotreino.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um aluno.");
        }
    }//GEN-LAST:event_btnTreinoAlunoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(jTbAluno.getSelectedRow() != -1){
            // TODO add your handling code here:
            idAluno = Integer.parseInt(jTxtIdAluno.getText());
            nome = jTxtNomeAluno.getText();
            preecamp = true;
            
            TelaTreinoAluno alunotreino = new TelaTreinoAluno();
            alunotreino.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um aluno.");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja fechar ?",
                "Atenção", JOptionPane.YES_NO_OPTION );
        if (sair == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja fechar ?",
                "Atenção", JOptionPane.YES_NO_OPTION );
        if (sair == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMain().setVisible(true);
            }
        });
        
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTreinoAluno;
    private javax.swing.JButton btnTreinos;
    private javax.swing.JToggleButton jBtnConsultar;
    private javax.swing.JButton jBtnExercicios;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbAluno;
    private javax.swing.JTextField jTxtIdAluno;
    private javax.swing.JTextField jTxtNomeAluno;
    // End of variables declaration//GEN-END:variables
}
