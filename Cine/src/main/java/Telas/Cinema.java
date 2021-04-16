package Telas;

import Filme.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cinema extends javax.swing.JFrame {

    
    public Cinema() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    List<Filme> filmes = new ArrayList<Filme>();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtSecao = new javax.swing.JTextField();
        txtIngressos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RDdispo = new javax.swing.JRadioButton();
        RDesgo = new javax.swing.JRadioButton();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCine = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Duração");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Gênero");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Seção");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Ingressos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Disponibilidade");

        RDdispo.setText("Disponível");
        RDdispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDdispoActionPerformed(evt);
            }
        });

        RDesgo.setText("Esgotado");
        RDesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDesgoActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeletarMouseClicked(evt);
            }
        });

        TabelaCine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Duração", "Gênero", "Seção", "Ingressos", "Disponibilidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaCine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCine);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(11, 11, 11)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIngressos, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(txtDuracao)
                                            .addComponent(txtGenero)
                                            .addComponent(txtSecao))))
                                .addGap(168, 168, 168)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RDdispo)
                                    .addComponent(RDesgo))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(RDdispo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RDesgo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btEditar)
                    .addComponent(btDeletar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked
        
        Filme filme = new Filme();
        
          
        String Nome = txtNome.getText();
        String Duracao = txtDuracao.getText();
        String Genero = txtGenero.getText();
        String Secao = txtSecao.getText();
        String Ingressos = txtIngressos.getText();
        String estadoIngresso = "*";
                
        if(RDdispo.isSelected())
            estadoIngresso = "Disponível";
        else if (RDesgo.isSelected())
            estadoIngresso = "Esgotado";
        else
            JOptionPane.showMessageDialog(null, "Selecione o estado do ingresso!");
                
  
         filme.dadosFilmes(Nome,Duracao,Genero,Secao,Ingressos,estadoIngresso);  
         JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
         filmes.add(filme);
         
         DefaultTableModel modelo = (DefaultTableModel) TabelaCine.getModel();
         modelo.setNumRows(0);
         
         for (Filme f : filmes){
            modelo.addRow(new Object[]{
               f.getNome(),
               f.getGenero(),
               f.getDuracao(),
               f.getSecao(),
               f.getNumwroIg(),
               f.getDispo(),
            });
         }
        
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void RDdispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDdispoActionPerformed
        
        buttonGroup2.add(RDdispo);
        
    }//GEN-LAST:event_RDdispoActionPerformed

    private void RDesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDesgoActionPerformed
        
        buttonGroup2.add(RDesgo);
        
    }//GEN-LAST:event_RDesgoActionPerformed

    private void btDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeletarMouseClicked
        
        int posicao = TabelaCine.getSelectedRow();
        filmes.remove(posicao);
        
         DefaultTableModel modelo = (DefaultTableModel) TabelaCine.getModel();
         modelo.setNumRows(0);
         
         for (Filme f : filmes){
            modelo.addRow(new Object[]{
               f.getNome(),
               f.getGenero(),
               f.getDuracao(),
               f.getSecao(),
               f.getNumwroIg(),
               f.getDispo(),
            });
         }
        
    }//GEN-LAST:event_btDeletarMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
       
        int posicao = TabelaCine.getSelectedRow();
        
        String Nome = txtNome.getText();
        String Duracao = txtDuracao.getText();
        String Genero = txtGenero.getText();
        String Secao = txtSecao.getText();
        String Ingressos = txtIngressos.getText();
        String estadoIngresso = "*";
                
        if(RDdispo.isSelected())
            estadoIngresso = "Disponível";
        else if (RDesgo.isSelected())
            estadoIngresso = "Esgotado";
        else
            JOptionPane.showMessageDialog(null, "Selecione o estado do ingresso!");
        
        filmes.get(posicao).dadosFilmes(Nome, Duracao, Genero, Secao, Ingressos, estadoIngresso);
        
         DefaultTableModel modelo = (DefaultTableModel) TabelaCine.getModel();
         modelo.setNumRows(0);
         
         for (Filme f : filmes){
            modelo.addRow(new Object[]{
               f.getNome(),
               f.getGenero(),
               f.getDuracao(),
               f.getSecao(),
               f.getNumwroIg(),
               f.getDispo(),
            });
         }
        
    }//GEN-LAST:event_btEditarMouseClicked

    private void TabelaCineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCineMouseClicked
        
        int posicao  = TabelaCine.getSelectedRow();
        txtNome.setText((String) TabelaCine.getValueAt(posicao, 0));
        txtDuracao.setText((String) TabelaCine.getValueAt(posicao, 1));
        txtGenero.setText((String) TabelaCine.getValueAt(posicao, 2));
        txtSecao.setText((String) TabelaCine.getValueAt(posicao, 3));
        txtIngressos.setText((String) TabelaCine.getValueAt(posicao, 4));
        RDdispo.setText((String) TabelaCine.getValueAt(posicao, 5));
        RDesgo.setText((String) TabelaCine.getValueAt(posicao, 5));
    }//GEN-LAST:event_TabelaCineMouseClicked

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
            java.util.logging.Logger.getLogger(Cinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cinema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RDdispo;
    private javax.swing.JRadioButton RDesgo;
    private javax.swing.JTable TabelaCine;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIngressos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSecao;
    // End of variables declaration//GEN-END:variables
}
