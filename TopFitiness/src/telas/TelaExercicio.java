/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Exercicio;
import modelo.dao.ExercicioDAO;

/**
 *
 * @author ldabr
 */
public class TelaExercicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaExercicio
     */
    public TelaExercicio() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTblExercicios.getModel();
        jTblExercicios.setRowSorter(new TableRowSorter(modelo));

        readJTblExercicio();
    }
    
    public void readJTblExercicio(){
        DefaultTableModel modelo = (DefaultTableModel) jTblExercicios.getModel();
        modelo.setNumRows(0);
        ExercicioDAO edao = new ExercicioDAO();
        
        for(Exercicio e: edao.read()){     
            modelo.addRow(new Object[]{
            e.getId(),
            e.getNome(),
            e.getDescricao(),
            e.getCategoria()
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

        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jTxtNomeEx = new javax.swing.JTextField();
        jCbxGrupo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblExercicios = new javax.swing.JTable();
        jBtnCadasrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(853, 624));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.setMaximumSize(new java.awt.Dimension(81, 23));
        jBtnAlterar.setMinimumSize(new java.awt.Dimension(81, 23));
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setMaximumSize(new java.awt.Dimension(81, 23));
        jBtnExcluir.setMinimumSize(new java.awt.Dimension(81, 23));
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jCbxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "PEITO", "COSTA", "BICEPS", "TRICEPS", "OMBRO", "PERNA", "PANTURRILHA", "ABDOMEM", "AEROBICO" }));

        jTxaDescricao.setColumns(20);
        jTxaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTxaDescricao);

        jLabel1.setText("Nome");

        jLabel2.setText("Grupo Muscular");

        jLabel3.setText("Descrição");

        jTblExercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblExercicios.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTblExerciciosComponentAdded(evt);
            }
        });
        jTblExercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblExerciciosMouseClicked(evt);
            }
        });
        jTblExercicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTblExerciciosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTblExercicios);

        jBtnCadasrar.setText("Cadastrar");
        jBtnCadasrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadasrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnCadasrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel1))
                                .addComponent(jTxtNomeEx, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jCbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNomeEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnCadasrar)
                            .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(233, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed

        if(jTblExercicios.getSelectedRow() != -1){

            Exercicio e = new Exercicio();
            ExercicioDAO dao = new ExercicioDAO();
            e.setNome(jTxtNomeEx.getText());
            e.setDescricao(jTxaDescricao.getText());
            e.setCategoria((String) jCbxGrupo.getSelectedItem());
            e.setId((int)jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 0));
            dao.update(e);

            jTxtNomeEx.setText("");
            jTxaDescricao.setText("");
            jCbxGrupo.setSelectedItem("GRUPO");

            readJTblExercicio();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para fazer alteração.");
        }
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if(jTblExercicios.getSelectedRow() != -1){

            Exercicio e = new Exercicio();
            ExercicioDAO dao = new ExercicioDAO();

            e.setId((int)jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 0));
            dao.delete(e);

            jTxtNomeEx.setText("");
            jTxaDescricao.setText("");
            jCbxGrupo.setSelectedItem("GRUPO");

            readJTblExercicio();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para fazer exclusão.");
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTblExerciciosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTblExerciciosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTblExerciciosComponentAdded

    private void jTblExerciciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblExerciciosMouseClicked

        if(jTblExercicios.getSelectedRow() != -1){
            jTxtNomeEx.setText(jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 1).toString());
            jTxaDescricao.setText(jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 2).toString());
            jCbxGrupo.setSelectedItem(jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 3));
        }

    }//GEN-LAST:event_jTblExerciciosMouseClicked

    private void jTblExerciciosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblExerciciosKeyReleased

        if(jTblExercicios.getSelectedRow() != -1){

            jTxtNomeEx.setText(jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 1).toString());
            jTxaDescricao.setText(jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 2).toString());
            jCbxGrupo.setSelectedItem(jTblExercicios.getValueAt(jTblExercicios.getSelectedRow(), 3));
        }
    }//GEN-LAST:event_jTblExerciciosKeyReleased

    private void jBtnCadasrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadasrarActionPerformed

        Exercicio e = new Exercicio();
        ExercicioDAO dao = new ExercicioDAO();
        e.setNome(jTxtNomeEx.getText());
        e.setDescricao(jTxaDescricao.getText());
        e.setCategoria((String) jCbxGrupo.getSelectedItem());
        dao.create(e);

        jTxtNomeEx.setText("");
        jTxaDescricao.setText("");
        jCbxGrupo.setSelectedItem("GRUPO");

        readJTblExercicio();
    }//GEN-LAST:event_jBtnCadasrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCadasrar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JComboBox<String> jCbxGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblExercicios;
    private javax.swing.JTextArea jTxaDescricao;
    private javax.swing.JTextField jTxtNomeEx;
    // End of variables declaration//GEN-END:variables
}
