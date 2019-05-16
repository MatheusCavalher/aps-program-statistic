/** @author matheus */
package aps_3_semestre;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {
    
    media media = new media();
    mediana mediana = new mediana();
    moda moda = new moda();
    desvio_padrao desvio_padrao = new desvio_padrao();
    variancia variancia = new variancia();
    float varianciacalculada = 0.0f;
    double posicaoAtual = 0;

    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRoll = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabelMedia = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabelMediana = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabelModa = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jButtonCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelVariancia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDPadrao = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDistribuicaoFrequencia = new javax.swing.JTable();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(32, 33, 35));
        setIconImage(new ImageIcon(getClass().getResource("/image/logo-unip.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite quantos números deseja no roll?");

        jTextFieldRoll.setBackground(new java.awt.Color(32, 33, 35));
        jTextFieldRoll.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextFieldRoll.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRoll.setBorder(null);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Média:");

        jLabelMedia.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelMedia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedia.setText("00,00");
        jLabelMedia.setToolTipText("");
        jLabelMedia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mediana:");

        jLabelMediana.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelMediana.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMediana.setText("00,00");
        jLabelMediana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Moda:");

        jLabelModa.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelModa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModa.setText("00,00");

        jButtonCalcular.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(32, 33, 35));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("digite os números separados por virgula!");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Variância:");

        jLabelVariancia.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelVariancia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVariancia.setText("00,00");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Desvio Padrão:");

        jLabelDPadrao.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelDPadrao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDPadrao.setText("00,00");

        jTableDistribuicaoFrequencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i.c", "fi", "fiac", "fri%", "friac%"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableDistribuicaoFrequencia);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButtonLimpar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jButtonCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLimpar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRoll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(162, 162, 162)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelMediana)
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelDPadrao))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelMedia)
                                                .addGap(66, 66, 66))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelModa)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelVariancia)
                                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCalcular)
                            .addComponent(jButtonLimpar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelMedia)
                                            .addComponent(jLabel2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabelVariancia))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelModa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabelDPadrao)
                            .addComponent(jLabel3)
                            .addComponent(jLabelMediana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                            .addComponent(jSeparator4))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void geraTabela(String[] values) {
        ArrayList<String> lista = new ArrayList();
        
        //pega cada numero separado por virgula e coloca numa array list que e mais facil de trabalhar
        for (int i = 0; i < values.length; i++) {
            lista.add(values[i]);
        }
        
        //cria uma outra lista para poder ordenar ela já que uma vez ordenada uma lista você não consegue voltar ao normal
        ArrayList<String> lista_ordenada = new ArrayList();

        //realiza um loop para passar os elementos do array principal para o secundario
        for (int i = 0; i < lista.size(); i++) {
            lista_ordenada.add(lista.get(i));
        }

        //usa uma collection para ordenar com a funcao sort
        Collections.sort(lista_ordenada);

        //verifica quantos itens tem no array
        int tamanho_lista_ordenada = lista_ordenada.size();
        System.out.println("tamanho da lista ordenada: " + tamanho_lista_ordenada);
        
        //pegar menor numero do array
        double menor_numero = Integer.parseInt(lista_ordenada.get(0));
        System.out.println("menor numero: " + menor_numero);
        
        double maior_numero = Integer.parseInt(lista_ordenada.get(lista_ordenada.size()-1));
        System.out.println("maior numero: " + maior_numero);
        
        double deltat = maior_numero - menor_numero;
        System.out.println("delta: " + deltat);
        
        double logaritmo_linha = Math.log10(tamanho_lista_ordenada);
        BigDecimal logaritmo_linha_arredondado = new BigDecimal(logaritmo_linha).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("logaritmo: " + logaritmo_linha_arredondado);
           
        double linha = (1 + (3.3 * logaritmo_linha));
        double linha_arredondado = arredondaNumero(linha);
        System.out.println("linha: " + linha_arredondado);
        
        double intervalo_classe = deltat / linha_arredondado;
        double intervalo_arredondado = arredondaNumero(intervalo_classe);
        System.out.println("o intervalo de classe é " + intervalo_arredondado);
        
        
        //para ser criado a tabela precisa setar o modelo
        DefaultTableModel dtmDistribuicao = (DefaultTableModel)jTableDistribuicaoFrequencia.getModel();
        
        //limpa as linhas da tabela para não correr o risco de sobreescrever
        dtmDistribuicao.setRowCount(0);
        
        double somaprimeiro = Integer.parseInt(lista_ordenada.get(0)) + intervalo_arredondado;
        posicaoAtual = somaprimeiro;
        Object [] dadosprimeiro = {lista_ordenada.get(0) + " |--- " + somaprimeiro ,"","","",""};
        dtmDistribuicao.addRow(dadosprimeiro);
            
        for (int i = 1; i < lista_ordenada.size(); i++) {
            double soma = posicaoAtual + intervalo_arredondado;
            Object [] dados = {posicaoAtual + " |--- " + soma,"","","",""};
            dtmDistribuicao.addRow(dados);
            posicaoAtual = soma;
        }
 
    }
    
    public double arredondaNumero(double paraArredondar) {
        BigDecimal bd = new BigDecimal(paraArredondar).setScale(2, RoundingMode.HALF_EVEN);
        double numero_arredondado;
        float fracao = bd.floatValue() % 1.0f;
        if(fracao >= 0.5f){
          //aumenta ceil
          return numero_arredondado = Math.ceil(bd.doubleValue());
        } else{
          //diminui floor
          return numero_arredondado = Math.floor(bd.doubleValue());
        }
    }
    
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        String texto = jTextFieldRoll.getText();

        ArrayList<String> lista = new ArrayList();

        if (texto.length() > 0 && texto.contains(",")) {

            //pega todo o texto da jtextfield e separa cada numero que ta digitado separado por virgula
            String[] values = texto.split(",");
            
            //envia os dados digitados pelo usuario para o metodo que gera tabela
            geraTabela(values);
            
            //imprime o numero na label media com duas casas decimais
            jLabelMedia.setText(String.format("%.2f", media.calculaMedia(values)));
            
            //imprime o numero na label mediana com duas casas decimais
            jLabelMediana.setText(String.format("%.2f", mediana.calculaMediana(values)));
            
            //imprime o numero na label moda com duas casas decimais
            jLabelModa.setText(String.format("%.2f", moda.calculaModa(values)));
            
            varianciacalculada = variancia.calculaVariancia(values);
            
            //imprime o numero na label variancia com duas casas decimais
            jLabelVariancia.setText(String.format("%.2f", varianciacalculada));
            
            //imprime o numero na label desvio padrão com duas casas decimais
            jLabelDPadrao.setText(String.format("%.2f", desvio_padrao.calculaDesvioPadrao(varianciacalculada)));
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        jTextFieldRoll.setText("");
        jLabelDPadrao.setText("00,00");
        jLabelVariancia.setText("00,00");
        jLabelMedia.setText("00,00");
        jLabelMediana.setText("00,00");
        jLabelModa.setText("00,00");
        
        DefaultTableModel dtmDistribuicao = (DefaultTableModel)jTableDistribuicaoFrequencia.getModel();
        dtmDistribuicao.setRowCount(0);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDPadrao;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelMediana;
    private javax.swing.JLabel jLabelModa;
    private javax.swing.JLabel jLabelVariancia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTableDistribuicaoFrequencia;
    private javax.swing.JTextField jTextFieldRoll;
    // End of variables declaration//GEN-END:variables
}
