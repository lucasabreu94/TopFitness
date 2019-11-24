/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


/**
 *
 * @author user
 */
public class TelaTreinoAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaExercicios
     */
    public TelaTreinoAluno() {
        initComponents();
        setIcon();
        TreinoDAO tdao = new TreinoDAO();
        ExercicioDAO edao = new ExercicioDAO();
        
        TelaMain talunos = new TelaMain();
        
        if(talunos.preecamp == true){
            jTxtAluno.setText(talunos.nome);
        }
        talunos.preecamp=false;
        
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
        
        TelaMain talunos = new TelaMain();
        
        
        
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCbTreino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCbExercicio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTxtSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtRepeticao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCbDivisao = new javax.swing.JComboBox<>();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnRemover = new javax.swing.JButton();
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
        jBtnSair = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();

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
        setTitle("Treino Aluno");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
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

        jLabel5.setText("Aluno");

        jTxtAluno.setEditable(false);

        jLabel6.setText("Treinos Pré-definidos");

        jCbTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR" }));
        jCbTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTreinoActionPerformed(evt);
            }
        });

        jLabel2.setText("Exercicio");

        jCbExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR" }));

        jLabel3.setText("Series");

        jLabel4.setText("Repetição");

        jLabel7.setText("Divisão");

        jCbDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", " " }));

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add_32px.png"))); // NOI18N
        jBtnAdicionar.setText("ADICIONAR");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/waste_32px.png"))); // NOI18N
        jBtnRemover.setText("REMOVER");
        jBtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverActionPerformed(evt);
            }
        });

        jTblA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Series", "Repetição", "Divisão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_window_32px.png"))); // NOI18N
        jBtnSair.setText("SAIR");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/broom_32px.png"))); // NOI18N
        jBtnLimpar.setText("LIMPAR");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnRemover)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCbExercicio, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                                .addComponent(jTxtAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCbTreino, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCbDivisao, javax.swing.GroupLayout.Alignment.LEADING, 0, 70, Short.MAX_VALUE)
                                .addComponent(jTxtRepeticao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtSerie, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCbExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtRepeticao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 132, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSair)
                            .addComponent(jBtnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnAdicionar)
                            .addComponent(jBtnLimpar))
                        .addGap(16, 16, 16))))
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

    private void jCbTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTreinoActionPerformed
        TelaMain talunos = new TelaMain();
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
        
        jCbTreino.setSelectedItem("SELECIONAR"); 
        readJTbl();
    }//GEN-LAST:event_jCbTreinoActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        Treino_aluno ta = new Treino_aluno();
        Treino_alunoDAO dao = new Treino_alunoDAO();

        TelaMain talunos = new TelaMain();
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

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        
        TelaMain talunos = new TelaMain();
        Treino_aluno ta = new Treino_aluno();
        Treino_alunoDAO tadao = new Treino_alunoDAO();
        
        ta.setFk_id_aluno(talunos.idAluno);
        tadao.deleteAll(ta);
        
        readJTbl();
    }//GEN-LAST:event_jBtnLimparActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(TelaTreinoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTreinoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTreinoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTreinoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTreinoAluno().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnRemover;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox<String> jCbDivisao;
    private javax.swing.JComboBox<Object> jCbExercicio;
    private javax.swing.JComboBox<Object> jCbTreino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
