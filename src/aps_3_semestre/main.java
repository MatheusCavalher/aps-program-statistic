/** @author matheus */
package aps_3_semestre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.*;
import javafx.scene.chart.NumberAxis;
import javax.swing.DefaultListModel;

import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.ui.RefineryUtilities;

public class main extends javax.swing.JFrame {

    media media = new media();
    mediana mediana = new mediana();
    moda moda = new moda();
    desvio_padrao desvio_padrao = new desvio_padrao();
    variancia variancia = new variancia();
    double posicaoAtual = 0;
    DefaultListModel dlm = new DefaultListModel();
    double[] numerosDigitados;
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNumeros = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(32, 33, 35));
        setIconImage(new ImageIcon(getClass().getResource("/image/logo-unip.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite quais números deseja no roll:");

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
        jLabel7.setText("digite os números separados por traço!");

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
                "I.C", "Fi", "Fri%", "Xi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
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

        jListNumeros.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jListNumeros);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanelGrafico.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanelGraficoLayout = new javax.swing.GroupLayout(jPanelGrafico);
        jPanelGrafico.setLayout(jPanelGraficoLayout);
        jPanelGraficoLayout.setHorizontalGroup(
            jPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGraficoLayout.setVerticalGroup(
            jPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRoll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jButtonCalcular))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelMedia))
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabelMediana, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelModa))))
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelDPadrao))
                                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelVariancia))))
                                .addGap(1, 1, 1)))
                        .addGap(39, 39, 39)
                        .addComponent(jButtonLimpar)))
                .addGap(52, 52, 52)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonCalcular)
                            .addComponent(jButton1))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelModa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMedia)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelMediana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelVariancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabelDPadrao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2)
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
    }// </editor-fold>//GEN-END:initComponents

    public void geraTabela(double[] values) {
        ArrayList<Double> lista = new ArrayList();

        //pega cada numero separado por virgula e coloca numa array list que e mais facil de trabalhar
        for (int i = 0; i < values.length; i++) {
            lista.add(values[i]);
        }

        //cria uma outra lista para poder ordenar ela já que uma vez ordenada uma lista você não consegue voltar ao normal
        ArrayList<Double> lista_ordenada = new ArrayList();

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
        double menor_numero = lista_ordenada.get(0);
        System.out.println("menor numero: " + menor_numero);

        double maior_numero = lista_ordenada.get(lista_ordenada.size() - 1);
        System.out.println("maior numero: " + maior_numero);

        double deltat = maior_numero - menor_numero;
        System.out.println("delta: " + deltat);

        double logaritmo_linha = Math.log10(tamanho_lista_ordenada);
        BigDecimal logaritmo_linha_arredondado = new BigDecimal(logaritmo_linha).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("logaritmo: " + logaritmo_linha_arredondado);

        float linha = 0.0f;
        linha = (float) (1 + 3.3 * Math.log10(deltat));
        System.out.println("linha: " + Math.round(linha));

        double linha_arredondado = arredondaNumero(linha);

        double intervalo_classe = deltat / linha_arredondado;
        double intervalo_arredondado = arredondaNumero(intervalo_classe);
        System.out.println("o intervalo de classe e " + intervalo_arredondado);

        //para ser criado a tabela precisa setar o modelo
        DefaultTableModel dtmDistribuicao = (DefaultTableModel) jTableDistribuicaoFrequencia.getModel();

        //limpa as linhas da tabela para não correr o risco de sobreescrever
        dtmDistribuicao.setRowCount(0);
     
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
             
        CategoryItemRenderer lineRenderer = new LineAndShapeRenderer();
     
        double xi = 0;
        float fr = 100 / lista.size();
        int vezes2 = 0;

        ArrayList<Integer> lista2 = new ArrayList();

        if (maior_numero > menor_numero + (intervalo_arredondado * linha_arredondado)) 
        {
            for (int k = 0; k < lista.size(); k++) {
                double soma2 = menor_numero + intervalo_arredondado;

                for (int i = 0; i < lista.size(); i++) {
                    double num1 = lista.get(i);

                    if (num1 >= menor_numero && num1 < soma2) {
                        vezes2++;
                    }
                }       

                menor_numero = soma2;
                lista2.add(vezes2);
                vezes2 = 0;
            }
        } 
        else 
        {
            for (int k = 0; k < linha_arredondado; k++) {
                double soma2 = menor_numero + intervalo_arredondado;

                for (int i = 0; i < lista.size(); i++) {
                    double num1 = lista.get(i);

                    if (num1 >= menor_numero && num1 < soma2) {
                        vezes2++;
                    }
                }       

                menor_numero = soma2;
                lista2.add(vezes2);
                vezes2 = 0;
            }
        }
        //Double.toString(posicaoAtual2)
        double posicaoAtual2 = lista_ordenada.get(0);
        
        if (maior_numero > lista_ordenada.get(0) + (intervalo_arredondado * linha_arredondado))
        {
            for(int i = 0; i <= linha_arredondado; i++)
            {
               double soma = posicaoAtual2 + intervalo_arredondado;
               barchartdata.addValue(lista2.get(i), "Gráfico", Double.toString(posicaoAtual2) + " até " + Double.toString(soma));
               posicaoAtual2 = soma;
            }
        }
        else
        {
            for(int i = 0; i < linha_arredondado; i++)
            {
              double soma = posicaoAtual2 + intervalo_arredondado;
               barchartdata.addValue(lista2.get(i), "Gráfico", Double.toString(posicaoAtual2) + " até " + Double.toString(soma));
               posicaoAtual2 = soma;
            }
        }
        
        int somafr = 0;
        int somafrac = 0;
        double somaxi = 0;
        
        for(int i = 0; i < lista2.size(); i++)
        {
            somafr += lista2.get(i);
            somafrac += (fr * lista2.get(i));
        }
        
        posicaoAtual = lista_ordenada.get(0);
        
         for (int i = 0; i < linha_arredondado; i++) {
            double soma = posicaoAtual + intervalo_arredondado;
            xi = (posicaoAtual + soma) / 2;
            somaxi += xi;
            Object[] dadosprimeiro = {posicaoAtual + " |--- " + soma, lista2.get(i), fr * lista2.get(i), String.format("%.2f", xi), ""};
            Object[] somaaa = { "        Σ", somafr, somafrac, somaxi};
            dtmDistribuicao.addRow(dadosprimeiro);
            posicaoAtual = soma;
                   
            if (i + 1 == linha_arredondado && (maior_numero > lista_ordenada.get(0) + (intervalo_arredondado * linha_arredondado))) {
                double result = (soma + intervalo_arredondado);
                double xi2 = (posicaoAtual + result) / 2;
                Object[] maisumalinha = {posicaoAtual + " |--- " + result, lista2.get(i + 1), fr * lista2.get(i + 1), String.format("%.2f", xi2), ""};
                dtmDistribuicao.addRow(maisumalinha);
            }
            
            if(i + 1 == linha_arredondado)
            dtmDistribuicao.addRow(somaaa);          
        }
        
         
         
        ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
        JFreeChart barchart = ChartFactory.createBarChart("Gráfico de Barras", "Intervalo de Classe (Ic)          X", "Frequencia (Fi)          Y", barchartdata,PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot barchrt = barchart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.BLACK);
        barchrt.getRenderer().setSeriesPaint(0, Color.BLUE);
        
        barchrt.setDataset(1, barchartdata);
        barchrt.setRenderer(1, lineRenderer);       
        
        ChartPanel myChartPanel = new ChartPanel(barchart, true);
        myChartPanel.setSize(jPanelGrafico.getWidth(),jPanelGrafico.getHeight());
        myChartPanel.setVisible(true); 
        jPanelGrafico.removeAll();
        jPanelGrafico.add(myChartPanel);
        jPanelGrafico.revalidate();
        jPanelGrafico.repaint();
        
    }

    public double arredondaNumero(double paraArredondar) {
        BigDecimal bd = new BigDecimal(paraArredondar).setScale(2, RoundingMode.HALF_EVEN);
        double numero_arredondado;
        float fracao = bd.floatValue() % 1.0f;
        if (fracao >= 0.5f) {
            //aumenta ceil
            return numero_arredondado = Math.ceil(bd.doubleValue());
        } else {
            //diminui floor
            return numero_arredondado = Math.floor(bd.doubleValue());
        }
    }

    
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        //511.23-510.82-508.35-507.94-506.70-506.29-505.88-505.47-504.65-503.83-503.01-502.19-500.55-498.92-496.47-494.03-490.37-489.15-488.34-487.13-485.51-483.09-479.47-480.27-481.48-482.69-481.88-481.08-480.27-479.06
        //47-49-50-52-55-57-57-58-59-60-63-64-64-65-68-68-69-69-70-71-72-72-73-73-74-74-75-76-77-77-77-80-80-81-81-81-82-83-86-87-88-88-90-90-91-91-92-94-96-97
        //int tamanhoLista = jListNumeros.getModel().getSize();
        //envia os dados digitados pelo usuario para o metodo que gera tabela
        geraTabela(numerosDigitados);
        //imprime o numero na label media com duas casas decimais
        jLabelMedia.setText(String.format("%.2f", media.calculaMedia(numerosDigitados)));
        //imprime o numero na label mediana com duas casas decimais
        jLabelMediana.setText(String.format("%.2f", mediana.calculaMediana(numerosDigitados)));
        //imprime o numero na label moda com duas casas decimais
        if (moda.calculaModa(numerosDigitados) != 0) {
            jLabelModa.setText(String.format("%.2f", moda.calculaModa(numerosDigitados)));
        } else {
            jLabelModa.setText(String.format("Não tem Moda"));
        }

        //imprime o numero na label variancia com duas casas decimais
        jLabelVariancia.setText(String.format("%.2f", variancia.calculaVariancia(numerosDigitados, media.calculaMedia(numerosDigitados))));
        //imprime o numero na label desvio padrão com duas casas decimais
        jLabelDPadrao.setText(String.format("%.2f", desvio_padrao.calculaDesvioPadrao(variancia.calculaVariancia(numerosDigitados, media.calculaMedia(numerosDigitados)))));

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        jTextFieldRoll.setText("");
        jLabelDPadrao.setText("00,00");
        jLabelVariancia.setText("00,00");
        jLabelMedia.setText("00,00");
        jLabelMediana.setText("00,00");
        jLabelModa.setText("00,00");
        dlm.clear();

        DefaultTableModel dtmDistribuicao = (DefaultTableModel) jTableDistribuicaoFrequencia.getModel();
        dtmDistribuicao.setRowCount(0);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jListNumeros.setModel(dlm);
        dlm.clear();
        String texto = jTextFieldRoll.getText().trim(); //520,36-540,14-700,14-852,69-456,98-4000,21
        String[] values = texto.split("-");

        numerosDigitados = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            double numeroDigitado = Double.parseDouble(values[i].replace(",", "."));
            dlm.addElement(numeroDigitado);
        }

        for (int i = 0; i < values.length; i++) {
            numerosDigitados[i] = Double.parseDouble(values[i].replace(",", "."));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JList<String> jListNumeros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelGrafico;
    private javax.swing.JScrollPane jScrollPane1;
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
