/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.ControllerPrincipal;
import javax.swing.JButton;
import model.Facade;
import model.Observer;

/**
 *
 * @author Miqueias
 */
public class ViewPrincipal extends javax.swing.JFrame implements Observer {
    
    private Facade modelo;
    private ControllerPrincipal controllerPrincipal;
    
    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal(Facade modelo) {
        initComponents();
        this.setTitle("Desempenho Técnico");
        this.controllerPrincipal = new ControllerPrincipal(modelo,this);
        this.modelo = modelo;
        modelo.attach(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCadastrarTime = new javax.swing.JButton();
        jCadastrarDesempenho = new javax.swing.JButton();
        jCadastrarPartida = new javax.swing.JButton();
        btnInserirJogador = new javax.swing.JButton();
        gerarRelatorio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCadastrarTime.setText("Cadastrar Time");
        jCadastrarTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCadastrarTimeMouseClicked(evt);
            }
        });
        jCadastrarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarTimeActionPerformed(evt);
            }
        });

        jCadastrarDesempenho.setText("Cadastrar Desempenho");
        jCadastrarDesempenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarDesempenhoActionPerformed(evt);
            }
        });

        jCadastrarPartida.setText("Cadastrar Partida");
        jCadastrarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarPartidaActionPerformed(evt);
            }
        });

        btnInserirJogador.setText("Inserir Jogador");
        btnInserirJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirJogadorActionPerformed(evt);
            }
        });

        gerarRelatorio.setText("Gerar Relatório");
        gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        jLabel2.setText("Desempenho Técnico de Atleta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCadastrarTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCadastrarDesempenho, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jCadastrarPartida)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnInserirJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(gerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirJogador)
                    .addComponent(gerarRelatorio))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastrarTime)
                    .addComponent(jCadastrarDesempenho)
                    .addComponent(jCadastrarPartida))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarTimeActionPerformed
        
        
        this.controllerPrincipal.trataEvento(evt);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastrarTimeActionPerformed

    private void jCadastrarDesempenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarDesempenhoActionPerformed
        this.controllerPrincipal.trataEvento(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastrarDesempenhoActionPerformed

    private void jCadastrarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarPartidaActionPerformed
         this.controllerPrincipal.trataEvento(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastrarPartidaActionPerformed

    private void jCadastrarTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarTimeMouseClicked
             
               // TODO add your handling code here:
    }//GEN-LAST:event_jCadastrarTimeMouseClicked

    private void btnInserirJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirJogadorActionPerformed
        // TODO add your handling code here:
            this.controllerPrincipal.trataEvento(evt);
        
        
    }//GEN-LAST:event_btnInserirJogadorActionPerformed

    private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
        this.controllerPrincipal.trataEvento(evt);
        
    }//GEN-LAST:event_gerarRelatorioActionPerformed

  
    public JButton getjCadastrarDesempenho() {
        return jCadastrarDesempenho;
    }

    public void setjCadastrarDesempenho(JButton jCadastrarDesempenho) {
        this.jCadastrarDesempenho = jCadastrarDesempenho;
    }

    public JButton getjCadastrarPartida() {
        return jCadastrarPartida;
    }

    public void setjCadastrarPartida(JButton jCadastrarPartida) {
        this.jCadastrarPartida = jCadastrarPartida;
    }

    public JButton getjCadastrarTime() {
        return jCadastrarTime;
    }

    public void setjCadastrarTime(JButton jCadastrarTime) {
        this.jCadastrarTime = jCadastrarTime;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserirJogador;
    private javax.swing.JButton gerarRelatorio;
    private javax.swing.JButton jCadastrarDesempenho;
    private javax.swing.JButton jCadastrarPartida;
    private javax.swing.JButton jCadastrarTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        
    }
}