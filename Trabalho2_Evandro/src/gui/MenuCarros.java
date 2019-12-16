/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.Carro;
import classes.Placa;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 0047171
 */
public class MenuCarros extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MenuCarros() {
        initComponents();
        opAtualizarLista();
        contador = 0;
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMontadora = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPlacaLetras = new javax.swing.JTextField();
        txtPlacaNumeros = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnTglEditarSalvar = new javax.swing.JToggleButton();
        btnNovoCadastro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jMenuItemCarregar = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemNovoCarro = new javax.swing.JMenuItem();
        jMenuItemDeletarPlaca = new javax.swing.JMenuItem();
        jMenuItemPesquisaAno = new javax.swing.JMenuItem();
        jMenuItemListaCarros = new javax.swing.JMenuItem();
        jMenuIndexLabel = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelStatus.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelStatus.setText("Carro");

        jLabel2.setText("Ano:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Montadora:");

        jLabel5.setText("Placa:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnDeletar.setEnabled(false);
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnTglEditarSalvar.setText("Editar");
        btnTglEditarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTglEditarSalvarActionPerformed(evt);
            }
        });

        btnNovoCadastro.setText("Novo");
        btnNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroActionPerformed(evt);
            }
        });

        jMenuArquivo.setText("Arquivo");

        jMenuItemNovo.setText("Novo");
        jMenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemNovo);

        jMenuItemCarregar.setText("Carregar BD");
        jMenuItemCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCarregarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemCarregar);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuCadastros.setText("Cadastros");

        jMenuItemNovoCarro.setText("Novo cadastro");
        jMenuItemNovoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoCarroActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemNovoCarro);

        jMenuItemDeletarPlaca.setText("Deletar por placa");
        jMenuItemDeletarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeletarPlacaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemDeletarPlaca);

        jMenuItemPesquisaAno.setText("Pesquisar por ano");
        jMenuItemPesquisaAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisaAnoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemPesquisaAno);

        jMenuItemListaCarros.setText("Lista completa");
        jMenuItemListaCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaCarrosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemListaCarros);

        jMenuBar1.add(jMenuCadastros);

        jMenuIndexLabel.setEnabled(false);
        jMenuIndexLabel.setText("0");
        jMenuBar1.add(jMenuIndexLabel);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtMontadora)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlacaLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlacaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTglEditarSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoCadastro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlacaLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo)
                    .addComponent(btnTglEditarSalvar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemDeletarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeletarPlacaActionPerformed
        // TODO add your handling code here:
        opDeletar();
    }//GEN-LAST:event_jMenuItemDeletarPlacaActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // TODO add your handling code here:
        opCarregaDados(0);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        if (contador == 0) {
            JOptionPane.showMessageDialog(this, "Você já está no início da lista!");
        } else {
            contador--;
            opCarregaDados(contador);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
        if (contador == lista.size() - 1) {
            JOptionPane.showMessageDialog(this, "Você já está no fim da lista!");
        } else {
            contador++;
            opCarregaDados(contador);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        opCarregaDados(lista.size() - 1);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        opDeletar();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void jMenuItemCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarregarActionPerformed
        // TODO add your handling code here:
        opCarregarBD();
    }//GEN-LAST:event_jMenuItemCarregarActionPerformed

    private void jMenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoActionPerformed
        // TODO add your handling code here:
        opNovoCarro();
    }//GEN-LAST:event_jMenuItemNovoActionPerformed

    private void btnTglEditarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTglEditarSalvarActionPerformed
        // TODO add your handling code here:
        if (btnTglEditarSalvar.isSelected()) {
            opEditar();
        } else {
            opSalvar();
        }
    }//GEN-LAST:event_btnTglEditarSalvarActionPerformed

    private void btnNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroActionPerformed
        // TODO add your handling code here:
        opNovoCarro();
    }//GEN-LAST:event_btnNovoCadastroActionPerformed

    private void jMenuItemNovoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoCarroActionPerformed
        // TODO add your handling code here:
        opNovoCarro();
    }//GEN-LAST:event_jMenuItemNovoCarroActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemPesquisaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisaAnoActionPerformed
        // TODO add your handling code here:
        opConsultaPorAno();
    }//GEN-LAST:event_jMenuItemPesquisaAnoActionPerformed

    private void jMenuItemListaCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaCarrosActionPerformed
        // TODO add your handling code here:
        opListaCompleta();
    }//GEN-LAST:event_jMenuItemListaCarrosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JToggleButton btnTglEditarSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuIndexLabel;
    private javax.swing.JMenuItem jMenuItemCarregar;
    private javax.swing.JMenuItem jMenuItemDeletarPlaca;
    private javax.swing.JMenuItem jMenuItemListaCarros;
    private javax.swing.JMenuItem jMenuItemNovo;
    private javax.swing.JMenuItem jMenuItemNovoCarro;
    private javax.swing.JMenuItem jMenuItemPesquisaAno;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMontadora;
    private javax.swing.JTextField txtPlacaLetras;
    private javax.swing.JTextField txtPlacaNumeros;
    // End of variables declaration//GEN-END:variables

    private static int contador = 0;
    private List<Carro> lista;

    private void iniciar() {
        btnTglEditarSalvar.setEnabled(false);
        opFocusEditando(true);
        opEnableSalvar(false);
        opFocusDesproteger(false);
    }

    private void opCarregaDados(int posicao) {
        if (!opAtualizarLista()) {
            return;
        }
        Carro car = lista.get(posicao);
        txtAno.setText(String.valueOf(car.getAno()));
        txtModelo.setText(car.getModelo());
        txtMontadora.setText(car.getMontadora());
        Placa plc = car.getPlaca();
        txtPlacaLetras.setText(plc.getLetras());
        txtPlacaNumeros.setText(String.valueOf(plc.getNumeros()));
        contador = posicao;
        jMenuIndexLabel.setText("n" + String.valueOf(contador)
                + ";C" + String.valueOf(car.getIdCarro())
                + ";P" + String.valueOf(car.getIdCarro())
        );
    }

    private void opSalvaDados() {
        int ano = Integer.parseInt(txtAno.getText());
        String modelo = txtModelo.getText();
        String montadora = txtMontadora.getText();
        String letras = txtPlacaLetras.getText();
        int numeros = Integer.parseInt(txtPlacaNumeros.getText());

        Carro car = new Carro(ano, modelo, montadora, new Placa(letras, numeros));

        if (contador != -1) {
            car.setIdCarro(lista.get(contador).getIdCarro());
            car.getPlaca().setIdPlaca(lista.get(contador).getPlaca().getIdPlaca());
            car.update();
        } else {
            car.insert();
            contador = lista.size();
        }
        opAtualizarLista();
    }

    private void opFocusDesproteger(boolean habilitar) {
        txtAno.setEditable(habilitar);
        txtModelo.setEditable(habilitar);
        txtMontadora.setEditable(habilitar);
        txtPlacaLetras.setEditable(habilitar);
        txtPlacaNumeros.setEditable(habilitar);
    }

    private void opFocusEditando(boolean habilitar) {
        jMenuCadastros.setEnabled(!habilitar);
        btnDeletar.setEnabled(!habilitar);
        btnPrimeiro.setEnabled(!habilitar);
        btnAnterior.setEnabled(!habilitar);
        btnProximo.setEnabled(!habilitar);
        btnUltimo.setEnabled(!habilitar);
    }

    private void opFocusNovo() {
        jLabelStatus.setText("Novo...");
        opLimparCampos();
        opFocusEditando(true);
        opEnableSalvar(true);
        opFocusDesproteger(true);
    }

    private void opNovoCarro() {
        opFocusNovo();
        txtAno.grabFocus();
        contador = -1;
    }

    private void opCarregarBD() {
        jLabelStatus.setText("Carros");
        opFocusDesproteger(false);
        opFocusEditando(false);
        opEnableSalvar(false);
        opCarregaDados(0);
    }

    private void opEnableSalvar(boolean habilitar) {
        if (habilitar) {
            btnTglEditarSalvar.setText("Salvar");
            btnTglEditarSalvar.setFont(btnTglEditarSalvar.getFont().deriveFont(Font.BOLD));
            btnTglEditarSalvar.setBackground(Color.WHITE);
            btnTglEditarSalvar.setSelected(true);
            btnTglEditarSalvar.setEnabled(true);
        } else {
            jLabelStatus.setText("Carros");
            btnTglEditarSalvar.setText("Editar");
            btnTglEditarSalvar.setFont(btnTglEditarSalvar.getFont().deriveFont(Font.PLAIN));
            btnTglEditarSalvar.setBackground(new Color(240, 240, 240));
            btnTglEditarSalvar.setSelected(false);
        }
    }

    private void opEditar() {
        jLabelStatus.setText("Editando");
        opFocusEditando(true);
        opEnableSalvar(true);
        opFocusDesproteger(true);
    }

    private void opSalvar() {
        if (isCamposCompletos()) {
            jLabelStatus.setText("Carros");
            opFocusEditando(false);
            opEnableSalvar(false);
            opFocusDesproteger(false);
            opSalvaDados();
        } else {
            opEnableSalvar(true);
        }
    }

    private boolean isCamposCompletos() {
        if (txtAno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo ANO sem valor, inserir apenas numeros");
            return false;
        } else if (txtModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo MODELO sem valor");
            return false;
        } else if (txtMontadora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo MONTADORA sem valor");
            return false;
        } else if (txtPlacaLetras.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro campo PLACA de letras");
            return false;
        } else if (txtPlacaNumeros.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro campo PLACA de numeros");
            return false;
        }
        try {
            Integer.parseInt(txtAno.getText());
            Integer.parseInt(txtPlacaNumeros.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro nos campos numericos, verifique o ANO e a PLACA");
            return false;
        }
        return true;
    }

    private void opDeletar() {
        String plcText;
        try {
            plcText = JOptionPane.showInputDialog("Digite a placa do Veiculo que deseja EXCLUIR", lista.get(contador).getPlaca().toString());
            if (plcText == null) {
                JOptionPane.showMessageDialog(null, "CANCELADO!");
                return;

            }
            for (Carro x : lista) {
                if (x.getPlaca().toString().equalsIgnoreCase(plcText)) {
                    x.delete();
                    JOptionPane.showMessageDialog(null, x + "\nFoi deletado!");
                    opAtualizarLista();
                    contador = 0;
                    opLimparCampos();
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Nao foi encontrado carro com placa:\n" + plcText);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "SEM REGISTROS");
        }
    }

    private void opConsultaPorAno() {
        contador = 0;
        int anoDes;
        anoDes = Integer.parseInt(JOptionPane.showInputDialog("Digite o ANO desejado"));
        if (anoDes == 0) {
            JOptionPane.showMessageDialog(null, "CANCELADO!");
            return;
        }
        for (Carro x : lista) {
            if (x.getAno() < anoDes) {
                contador++;
            } else if (x.getAno() == anoDes) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Sem Registros! para o ANO: " + anoDes);
                break;
            }
        }
        opCarregaDados(contador);
    }
    
    private void opListaCompleta(){
        String strT="";
        for(Carro x:lista)
            strT += x +"\n";
        JOptionPane.showMessageDialog(null, strT, "Lista Completa", JOptionPane.PLAIN_MESSAGE);
    }

private boolean opAtualizarLista() {
        lista = Carro.listAll();
        if (lista.isEmpty()){
            opFocusEditando(true);
            btnTglEditarSalvar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "LISTA VAZIA. SEM REGISTROS");
            return false;
        }
        else{
            btnTglEditarSalvar.setEnabled(true);
            btnDeletar.setEnabled(true);
            return true;
        }
}
    
    private void opLimparCampos(){
        txtAno.setText("");
        txtModelo.setText("");
        txtMontadora.setText("");
        txtPlacaLetras.setText("");
        txtPlacaNumeros.setText("");
    }
}
