
package telas;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Exercicio;
import modelo.bean.Treino;
import modelo.bean.Treino_aluno;
import modelo.bean.Treino_exercicio;
import modelo.dao.ExercicioDAO;
import modelo.dao.TreinoDAO;
import modelo.dao.Treino_alunoDAO;


public class TelaAlunoTreino extends javax.swing.JFrame {

    public TelaAlunoTreino() {
        initComponents();
        setIcon();
        TreinoDAO tdao = new TreinoDAO();
        ExercicioDAO edao = new ExercicioDAO();
        
        for (Treino t: tdao.read()){
            jCbTreino.addItem(t);
        }
        
        for (Exercicio e: edao.read()){
            jCbExercicio.addItem(e);
        }
        
        readJTbl();
    }
    
    public void readJTbl(){    
        
        DefaultTableModel tabelaA = (DefaultTableModel) jTblA.getModel();
        tabelaA.setNumRows(0);
        DefaultTableModel tabelaB = (DefaultTableModel) jTblB.getModel();
        tabelaB.setNumRows(0);
        DefaultTableModel tabelaC = (DefaultTableModel) jTblC.getModel();
        tabelaC.setNumRows(0);
        DefaultTableModel tabelaD = (DefaultTableModel) jTblD.getModel();
        tabelaD.setNumRows(0);
        DefaultTableModel tabelaE = (DefaultTableModel) jTblE.getModel();
        tabelaE.setNumRows(0);
        DefaultTableModel tabelaF = (DefaultTableModel) jTblF.getModel();
        tabelaF.setNumRows(0);         
        
        Treino_alunoDAO tadao = new Treino_alunoDAO();
        
        TelaAlunos talunos = new TelaAlunos();
        
        
        
        for(Treino_aluno ta: tadao.readA()){ 

 
                if(talunos.idAluno == ta.getFk_id_aluno()){
                    
                    tabelaA.addRow(new Object[]{
                        ta.getId(),
                        ta.getExercicio(),
                        ta.getSerie(),
                        ta.getRepeticao(),
                        ta.getDivisao()
                    });
                }
            
        }
        
        for(Treino_aluno ta: tadao.readB()){ 

 
                if(talunos.idAluno == ta.getFk_id_aluno()){
                    
                    tabelaB.addRow(new Object[]{
                        ta.getId(),
                        ta.getExercicio(),
                        ta.getSerie(),
                        ta.getRepeticao(),
                        ta.getDivisao()
                    });
                }
            
        }
        
        for(Treino_aluno ta: tadao.readC()){ 

 
                if(talunos.idAluno == ta.getFk_id_aluno()){
                    
                    tabelaC.addRow(new Object[]{
                        ta.getId(),
                        ta.getExercicio(),
                        ta.getSerie(),
                        ta.getRepeticao(),
                        ta.getDivisao()
                    });
                }
            
        }
        
        for(Treino_aluno ta: tadao.readD()){ 

 
                if(talunos.idAluno == ta.getFk_id_aluno()){
                    
                    tabelaD.addRow(new Object[]{
                        ta.getId(),
                        ta.getExercicio(),
                        ta.getSerie(),
                        ta.getRepeticao(),
                        ta.getDivisao()
                    });
                }
            
        }
        
        for(Treino_aluno ta: tadao.readE()){ 

 
                if(talunos.idAluno == ta.getFk_id_aluno()){
                    
                    tabelaE.addRow(new Object[]{
                        ta.getId(),
                        ta.getExercicio(),
                        ta.getSerie(),
                        ta.getRepeticao(),
                        ta.getDivisao()
                    });
                }
            
        }
        
        for(Treino_aluno ta: tadao.readF()){ 

 
                if(talunos.idAluno == ta.getFk_id_aluno()){
                    
                    tabelaF.addRow(new Object[]{
                        ta.getId(),
                        ta.getExercicio(),
                        ta.getSerie(),
                        ta.getRepeticao(),
                        ta.getDivisao()
                    });
                }
            
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

        jLabel5 = new javax.swing.JLabel();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnRemover = new javax.swing.JButton();
        jCbExercicio = new javax.swing.JComboBox<>();
        jTxtRepeticao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCbDivisao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTxtSerie = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedA = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblA = new javax.swing.JTable();
        jTabbedB = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTblB = new javax.swing.JTable();
        jTabbedC = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTblC = new javax.swing.JTable();
        jTabbedD = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTblD = new javax.swing.JTable();
        jTabbedE = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblE = new javax.swing.JTable();
        jTabbedF = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblF = new javax.swing.JTable();
        jCbTreino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Treino");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel5.setText("Aluno");

        jBtnAdicionar.setText("Adicionar");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnRemover.setText("Remover");
        jBtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverActionPerformed(evt);
            }
        });

        jCbExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR" }));

        jLabel1.setText("Exercicio");

        jLabel2.setText("Series");

        jTxtAluno.setEditable(false);

        jLabel3.setText("Repetição");

        jCbDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", " " }));

        jLabel4.setText("Divisão");

        jTblA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblAMouseClicked(evt);
            }
        });
        jTblA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTblAKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTblA);

        jTabbedA.addTab("A", jScrollPane3);

        jTabbedPane1.addTab("A", jTabbedA);

        jTblB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTblB);

        jTabbedB.addTab("B", jScrollPane4);

        jTabbedPane1.addTab("B", jTabbedB);

        jTblC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTblC);

        jTabbedC.addTab("C", jScrollPane5);

        jTabbedPane1.addTab("C", jTabbedC);

        jTblD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTblD);

        jTabbedD.addTab("D", jScrollPane6);

        jTabbedPane1.addTab("D", jTabbedD);

        jTblE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblE);

        jTabbedE.addTab("E", jScrollPane1);

        jTabbedPane1.addTab("E", jTabbedE);

        jTblF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTblF);

        jTabbedF.addTab("F", jScrollPane2);

        jTabbedPane1.addTab("F", jTabbedF);

        jCbTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR" }));
        jCbTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTreinoActionPerformed(evt);
            }
        });

        jLabel6.setText("Treinos Pré-definidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCbExercicio, 0, 180, Short.MAX_VALUE)
                        .addComponent(jTxtSerie)
                        .addComponent(jTxtRepeticao)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jCbDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnAdicionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnRemover))
                        .addComponent(jTxtAluno))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtRepeticao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnAdicionar)
                            .addComponent(jBtnRemover))
                        .addGap(0, 111, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        Treino_aluno ta = new Treino_aluno();
        Treino_alunoDAO dao = new Treino_alunoDAO();
        
        TelaAlunos talunos = new TelaAlunos();
        Exercicio exercicio = (Exercicio) jCbExercicio.getSelectedItem();
  
        ta.setFk_id_aluno(talunos.idAluno);
        ta.setFk_id_exercicio(exercicio.getId());
        ta.setExercicio(exercicio.getNome());
        ta.setSerie(jTxtSerie.getText());
        ta.setRepeticao(jTxtRepeticao.getText());
        ta.setDivisao((String) jCbDivisao.getSelectedItem());

        dao.create(ta);

        jTxtSerie.setText("");
        jTxtRepeticao.setText("");
        jCbExercicio.setSelectedItem("SELECIONAR");
        jCbDivisao.setSelectedItem(" ");

        readJTbl();  
     
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverActionPerformed
        if(jTblA.getSelectedRow() != -1){

            Treino_aluno ta = new Treino_aluno();
            Treino_alunoDAO tadao = new Treino_alunoDAO();

            ta.setId((int)jTblA.getValueAt(jTblA.getSelectedRow(), 0));
            tadao.delete(ta);

            
        }else{
            if(jTblB.getSelectedRow() != -1){

                Treino_aluno ta = new Treino_aluno();
                Treino_alunoDAO tadao = new Treino_alunoDAO();

                ta.setId((int)jTblB.getValueAt(jTblB.getSelectedRow(), 0));
                tadao.delete(ta);

                
            }else{
                if(jTblC.getSelectedRow() != -1){

                    Treino_aluno ta = new Treino_aluno();
                    Treino_alunoDAO tadao = new Treino_alunoDAO();

                    ta.setId((int)jTblC.getValueAt(jTblC.getSelectedRow(), 0));
                    tadao.delete(ta);

                    
                }else{
                    if(jTblD.getSelectedRow() != -1){

                        Treino_aluno ta = new Treino_aluno();
                        Treino_alunoDAO tadao = new Treino_alunoDAO();

                        ta.setId((int)jTblD.getValueAt(jTblD.getSelectedRow(), 0));
                        tadao.delete(ta);

                        
                    }else{
                        if(jTblE.getSelectedRow() != -1){

                            Treino_aluno ta = new Treino_aluno();
                            Treino_alunoDAO tadao = new Treino_alunoDAO();

                            ta.setId((int)jTblE.getValueAt(jTblE.getSelectedRow(), 0));
                            tadao.delete(ta);

                           
                        }else{
                            if(jTblF.getSelectedRow() != -1){

                                Treino_aluno ta = new Treino_aluno();
                                Treino_alunoDAO tadao = new Treino_alunoDAO();

                                ta.setId((int)jTblF.getValueAt(jTblF.getSelectedRow(), 0));
                                tadao.delete(ta);

                                
                            }else{
                                JOptionPane.showMessageDialog(null, "Selecione um item para remover.");
                            }

                        }
                    }
                }

            }

        }
        
        
        readJTbl();
    }//GEN-LAST:event_jBtnRemoverActionPerformed

    private void jTblAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblAMouseClicked

    }//GEN-LAST:event_jTblAMouseClicked

    private void jTblAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblAKeyReleased

    }//GEN-LAST:event_jTblAKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        TelaAlunos talunos = new TelaAlunos();
        
        if(talunos.preecamp == true){
            jTxtAluno.setText(talunos.nome);
        }
        talunos.preecamp=false;
    }//GEN-LAST:event_formWindowGainedFocus

    private void jCbTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTreinoActionPerformed
        TelaAlunos talunos = new TelaAlunos();
        Treino_alunoDAO dao = new Treino_alunoDAO();
        Treino_aluno t = new Treino_aluno();
        
        Treino treino = (Treino) jCbTreino.getSelectedItem();
        
        for(Treino_exercicio ta: dao.readTreino()){ 
 
                if(treino.getId() == ta.getFk_id_treinos()){
                    t.setFk_id_aluno(talunos.idAluno);
                    t.setFk_id_exercicio(ta.getFk_id_exercicio());
                    t.setExercicio(ta.getExercicio());
                    t.setSerie(ta.getSerie());
                    t.setRepeticao(ta.getRepeticao());
                    t.setDivisao(ta.getDivisao());
                    
                    dao.copy(t);              
                }
        }
        readJTbl();
    }//GEN-LAST:event_jCbTreinoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlunoTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlunoTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlunoTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlunoTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlunoTreino().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnRemover;
    private javax.swing.JComboBox<String> jCbDivisao;
    private javax.swing.JComboBox<Object> jCbExercicio;
    private javax.swing.JComboBox<Object> jCbTreino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedA;
    private javax.swing.JTabbedPane jTabbedB;
    private javax.swing.JTabbedPane jTabbedC;
    private javax.swing.JTabbedPane jTabbedD;
    private javax.swing.JTabbedPane jTabbedE;
    private javax.swing.JTabbedPane jTabbedF;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTblA;
    private javax.swing.JTable jTblB;
    private javax.swing.JTable jTblC;
    private javax.swing.JTable jTblD;
    private javax.swing.JTable jTblE;
    private javax.swing.JTable jTblF;
    private javax.swing.JTextField jTxtAluno;
    private javax.swing.JTextField jTxtRepeticao;
    private javax.swing.JTextField jTxtSerie;
    // End of variables declaration//GEN-END:variables
}
