/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.JmfProdutos;
import dao.ProdutosDAO;
import tools.Util;
import view.JDlgProdutosPesquisar;

/**
 *
 * @author admin
 */
public class JDlgProdutos extends javax.swing.JDialog {
    private boolean incluir;

    /**
     * Creates new form jDlgClientes
     * @param parent
     * @param modal
     */
    public JDlgProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro do Produtos");
        setLocationRelativeTo(null);
        Util.habilitar(false,jTxtIdProduto, jTxtNome, jTxtDescricao, jFmtPreco, 
                jTctCategoria, jTxtFornecedor, jCboAtivo);
        

    }
     public JmfProdutos viewBean(){
    JmfProdutos jmfProdutos = new JmfProdutos();
    int codigo = Util.strToInt(jTxtIdProduto.getText());
    jmfProdutos.setJmfId(codigo);
    jmfProdutos.setJmfNome(jTxtNome.getText());
    jmfProdutos.setJmfDescricao(jTxtDescricao.getText());
    double preco = Util.strToDouble(jFmtPreco.getText());
    jmfProdutos.setJmfPreco(preco);
    jmfProdutos.setJmfCategoria(jTctCategoria.getText());
    jmfProdutos.setJmfFornecedor(jLblFornecedor.getText());
    if (jCboAtivo.isSelected()== true){
            jmfProdutos.setJmfAtivo("S");
        } else {
            jmfProdutos.setJmfAtivo("N");
        }

    return jmfProdutos;
}
    public void beanView(JmfProdutos JmfProdutos) {
    jTxtIdProduto.setText(Util.intToStr(JmfProdutos.getJmfId()));
    jTxtNome.setText(JmfProdutos.getJmfNome());
    jTxtDescricao.setText(JmfProdutos.getJmfDescricao());
    jLblPreco.setText(Util.doubleToStr(JmfProdutos.getJmfPreco()));
    jTxtFornecedor.setText(JmfProdutos.getJmfFornecedor());
    jTctCategoria.setText(JmfProdutos.getJmfCategoria());
    if (JmfProdutos.getJmfAtivo().equals("S")== true){
        jCboAtivo.setSelected(true);
    } else {
        jCboAtivo.setSelected(false);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLblDescricao = new javax.swing.JLabel();
        jLblPreco = new javax.swing.JLabel();
        jTxtDescricao = new javax.swing.JTextField();
        jFmtPreco = new javax.swing.JFormattedTextField();
        jLblCategoria = new javax.swing.JLabel();
        jTctCategoria = new javax.swing.JTextField();
        jLblFornecedor = new javax.swing.JLabel();
        jTxtFornecedor = new javax.swing.JTextField();
        jCboAtivo = new javax.swing.JCheckBox();
        jBtnIncluirProdutos = new javax.swing.JButton();
        jBtnAlterarProdutos = new javax.swing.JButton();
        jBtnExcluirProdutos = new javax.swing.JButton();
        jBtnConfirmarProdutos = new javax.swing.JButton();
        jBtnancelarProdutos = new javax.swing.JButton();
        jBtnPesquisarProdutos = new javax.swing.JButton();
        jLblId = new javax.swing.JLabel();
        jTxtIdProduto = new javax.swing.JTextField();

        jTxtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtProdutoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblNome.setText("Nome");

        jLblDescricao.setText("Descrição");

        jLblPreco.setText("Preço");

        jFmtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtPrecoActionPerformed(evt);
            }
        });

        jLblCategoria.setText("Categoria");

        jLblFornecedor.setText("Fornecedor");

        jTxtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFornecedorActionPerformed(evt);
            }
        });

        jCboAtivo.setText("Ativo");

        jBtnIncluirProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluirProdutos.setText("Incluir");
        jBtnIncluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirProdutosActionPerformed(evt);
            }
        });

        jBtnAlterarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterarProdutos.setText("Alterar");
        jBtnAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarProdutosActionPerformed(evt);
            }
        });

        jBtnExcluirProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluirProdutos.setText("Excluir");
        jBtnExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirProdutosActionPerformed(evt);
            }
        });

        jBtnConfirmarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        jBtnConfirmarProdutos.setText("Confirmar");
        jBtnConfirmarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarProdutosActionPerformed(evt);
            }
        });

        jBtnancelarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnancelarProdutos.setText("Cancelar");
        jBtnancelarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnancelarProdutosActionPerformed(evt);
            }
        });

        jBtnPesquisarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisarProdutos.setText("Pesquisar");
        jBtnPesquisarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarProdutosActionPerformed(evt);
            }
        });

        jLblId.setText("Id");

        jTxtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtDescricao)
                    .addComponent(jFmtPreco)
                    .addComponent(jTctCategoria)
                    .addComponent(jTxtFornecedor)
                    .addComponent(jTxtNome)
                    .addComponent(jTxtIdProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboAtivo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluirProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnAlterarProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluirProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnConfirmarProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnancelarProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPesquisarProdutos))
                            .addComponent(jLblDescricao)
                            .addComponent(jLblPreco)
                            .addComponent(jLblCategoria)
                            .addComponent(jLblFornecedor)
                            .addComponent(jLblNome)
                            .addComponent(jLblId)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblDescricao)
                .addGap(3, 3, 3)
                .addComponent(jTxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTctCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCboAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluirProdutos)
                    .addComponent(jBtnAlterarProdutos)
                    .addComponent(jBtnExcluirProdutos)
                    .addComponent(jBtnConfirmarProdutos)
                    .addComponent(jBtnancelarProdutos)
                    .addComponent(jBtnPesquisarProdutos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFmtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtPrecoActionPerformed

    private void jTxtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFornecedorActionPerformed

    private void jBtnancelarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnancelarProdutosActionPerformed

        // TODO add your handling code here:
        Util.habilitar(true, jTxtIdProduto,jTxtNome, jTxtDescricao, jFmtPreco, jLblCategoria, 
               jTxtFornecedor, jCboAtivo, jBtnConfirmarProdutos, jBtnancelarProdutos);
       Util.habilitar(false, jBtnIncluirProdutos, jBtnAlterarProdutos, jBtnExcluirProdutos, jBtnPesquisarProdutos);
      
    }//GEN-LAST:event_jBtnancelarProdutosActionPerformed

    private void jTxtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdProdutoActionPerformed

    private void jBtnIncluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirProdutosActionPerformed
    Util.habilitar(true,jTxtIdProduto, jTxtNome, jTxtDescricao, jFmtPreco, 
                jTctCategoria, jTxtFornecedor, jCboAtivo, jBtnConfirmarProdutos, jBtnancelarProdutos);
    Util.Limpar(jTxtIdProduto, jTxtNome, jTxtDescricao, jFmtPreco, jTctCategoria, jTxtFornecedor, jCboAtivo);
     Util.habilitar(false, jBtnIncluirProdutos, jBtnAlterarProdutos, jBtnExcluirProdutos, jBtnPesquisarProdutos);
     jTxtIdProduto.grabFocus();
        incluir = true;
       
    }//GEN-LAST:event_jBtnIncluirProdutosActionPerformed

    private void jBtnAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarProdutosActionPerformed
        // TODO add your handling code here:
      Util.habilitar(true,jTxtIdProduto, jTxtNome, jTxtDescricao, jFmtPreco, 
                jTctCategoria, jTxtFornecedor, jCboAtivo, jBtnConfirmarProdutos, jBtnancelarProdutos);
       Util.habilitar(false, jBtnIncluirProdutos, jBtnAlterarProdutos, jBtnExcluirProdutos, jBtnPesquisarProdutos);
       
        jTxtNome.grabFocus();
        incluir = false;
    }//GEN-LAST:event_jBtnAlterarProdutosActionPerformed

    private void jBtnExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirProdutosActionPerformed
        // TODO add your handling code here:
           if (Util.perguntar("Deseja Excluir?") == true) {
            ProdutosDAO produtosDAO = new ProdutosDAO();
            produtosDAO.delete(viewBean());

        }
      
  Util.Limpar(jTxtIdProduto, jTxtNome, jTxtDescricao, jFmtPreco, 
                jTctCategoria, jTxtFornecedor, jCboAtivo);
    }//GEN-LAST:event_jBtnExcluirProdutosActionPerformed

    private void jBtnConfirmarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarProdutosActionPerformed
        // TODO add your handling code here:
      ProdutosDAO produtosDAO = new ProdutosDAO();
        if (incluir == true){
         produtosDAO.insert(viewBean());
        }else {
        produtosDAO.update(viewBean());
        }
       Util.habilitar(false, jTxtIdProduto,jTxtNome, jTxtDescricao, jFmtPreco, jLblCategoria, 
               jTxtFornecedor, jCboAtivo, jBtnConfirmarProdutos, jBtnancelarProdutos);
       Util.habilitar(true, jBtnIncluirProdutos, jBtnAlterarProdutos, jBtnExcluirProdutos, jBtnPesquisarProdutos);
       
    }//GEN-LAST:event_jBtnConfirmarProdutosActionPerformed

    private void jBtnPesquisarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarProdutosActionPerformed
        // TODO add your handling code here:
        JDlgProdutosPesquisar jDlgProdutosPesquisar = new JDlgProdutosPesquisar(null, true);     
        jDlgProdutosPesquisar.setTelaAnterior(this);
        jDlgProdutosPesquisar.setVisible(true);
        
    }//GEN-LAST:event_jBtnPesquisarProdutosActionPerformed

    private void jTxtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtProdutoActionPerformed
 /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            JDlgProdutos dialog = new JDlgProdutos(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterarProdutos;
    private javax.swing.JButton jBtnConfirmarProdutos;
    private javax.swing.JButton jBtnExcluirProdutos;
    private javax.swing.JButton jBtnIncluirProdutos;
    private javax.swing.JButton jBtnPesquisarProdutos;
    private javax.swing.JButton jBtnancelarProdutos;
    private javax.swing.JCheckBox jCboAtivo;
    private javax.swing.JFormattedTextField jFmtPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCategoria;
    private javax.swing.JLabel jLblDescricao;
    private javax.swing.JLabel jLblFornecedor;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblPreco;
    private javax.swing.JTextField jTctCategoria;
    private javax.swing.JTextField jTxtDescricao;
    private javax.swing.JTextField jTxtFornecedor;
    private javax.swing.JTextField jTxtIdProduto;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtProduto;
    // End of variables declaration//GEN-END:variables


}
