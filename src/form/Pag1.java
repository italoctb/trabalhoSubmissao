/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author luci
 */
public class Pag1 extends javax.swing.JFrame {

    /**
     * Creates new form pag1
     */
    
    //Cadastro de financiadores
    private String id_financiador_1;
    private String CNPJ_1;
    private String razao_social;
    private String Nome_fantasia;
    private String status_juridico;
    private String pais;
    private String site;
    
    // Cadastro de Programa de Fomento
    private String id_programa;
    private String id_financiador_2;
    private String Nome_2;
    
    // Cadastro de Área de Concentração
    private String id_area;
    private String Nome_3;
    private String descricao_3;
    private String data_inicio_3;
    private String data_fim_3;
    
    // Cadastro de Linha de Pesquisa
    private String id_linha;
    private String nome_4;
    private String area_associada;
    private String descricao_4;
    private String data_inicio_4;
    private String data_fim_4;
    
    public Pag1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        sair2 = new javax.swing.JButton();
        prox1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cnpj_field = new javax.swing.JTextField();
        razao_social_field = new javax.swing.JTextField();
        nome_fantasia_field = new javax.swing.JTextField();
        pais_field = new javax.swing.JTextField();
        site_field = new javax.swing.JTextField();
        nome_2_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        federal = new javax.swing.JRadioButton();
        estadual = new javax.swing.JRadioButton();
        municipal = new javax.swing.JRadioButton();
        privado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id_programa_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        id_financiador_2_field = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nome_3_field = new javax.swing.JTextField();
        id_area_field = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        data_inicio_3_field = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        data_fim_3_field = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nome_4_field = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        id_linha_field = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        area_associada_field = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        data_inicio_4_field = new javax.swing.JTextField();
        data_fim_4_field = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        descricao_3_field = new javax.swing.JTextField();
        descricao_4_field = new javax.swing.JTextField();
        id_financiador_field = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sair2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        sair2.setIcon(new javax.swing.ImageIcon("/home/luci/Downloads/left-arrow.png")); // NOI18N
        sair2.setText("Cancelar");
        sair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair2ActionPerformed(evt);
            }
        });

        prox1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        prox1.setIcon(new javax.swing.ImageIcon("/home/luci/Downloads/right-arrow.png")); // NOI18N
        prox1.setText("Próximo");
        prox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        prox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/luci/Downloads/settings.png")); // NOI18N
        jLabel1.setText("Cadastro de Financiadores");

        cnpj_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpj_fieldActionPerformed(evt);
            }
        });

        razao_social_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razao_social_fieldActionPerformed(evt);
            }
        });

        nome_fantasia_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_fantasia_fieldActionPerformed(evt);
            }
        });

        pais_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais_fieldActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Financiador:");

        jLabel3.setText("Nome de Fantasia:");

        jLabel4.setText("Razão Social:");

        jLabel5.setText("CNPJ:");

        jLabel6.setText("Status  Jurídico:");

        buttonGroup1.add(federal);
        federal.setText("Federal");
        federal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                federalActionPerformed(evt);
            }
        });

        buttonGroup1.add(estadual);
        estadual.setText("Estadual");
        estadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadualActionPerformed(evt);
            }
        });

        buttonGroup1.add(municipal);
        municipal.setText("Municipal");
        municipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipalActionPerformed(evt);
            }
        });

        buttonGroup1.add(privado);
        privado.setText("Privado");
        privado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privadoActionPerformed(evt);
            }
        });

        jLabel7.setText("País:");

        jLabel8.setText("Site:");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("/home/luci/Downloads/settings.png")); // NOI18N
        jLabel9.setText("Cadastro de Programa de Fomento");

        jLabel10.setText("Nome:");

        jLabel11.setText("ID Programa:");

        jLabel12.setText("ID Financiador:");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon("/home/luci/Downloads/settings.png")); // NOI18N
        jLabel13.setText("Cadastro de Área de Concentração");

        jLabel14.setText("Nome:");

        jLabel15.setText("ID Área:");

        jLabel16.setText("Descrição:");

        data_inicio_3_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_inicio_3_fieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Data de Início:");

        data_fim_3_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_fim_3_fieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Data de Fim:");

        jLabel19.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon("/home/luci/Downloads/settings.png")); // NOI18N
        jLabel19.setText("Cadastro de Linha de Pesquisa");

        jLabel20.setText("Nome:");

        jLabel21.setText("ID Linha:");

        jLabel22.setText("Área Associada (ID Área):");

        jLabel23.setText("Descrição:");

        jLabel24.setText("Data de Início:");

        jLabel25.setText("Data de Fim:");

        id_financiador_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_financiador_fieldActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel20))
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome_4_field)
                                    .addComponent(descricao_4_field)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(sair2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabel6)))
                                                    .addGap(3, 3, 3))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(2, 2, 2)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(razao_social_field, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(8, 8, 8)
                                                    .addComponent(federal)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(estadual)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(municipal)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(privado)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7)
                                                    .addGap(2, 2, 2)
                                                    .addComponent(pais_field, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(nome_fantasia_field, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(68, 68, 68)
                                            .addComponent(jLabel10)
                                            .addGap(2, 2, 2)
                                            .addComponent(nome_2_field))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel11)
                                            .addGap(2, 2, 2)
                                            .addComponent(id_programa_field, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12)
                                            .addGap(4, 4, 4)
                                            .addComponent(id_financiador_2_field, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(2, 2, 2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nome_3_field)
                                            .addComponent(descricao_3_field, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prox1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(id_linha_field)
                                        .addComponent(data_fim_3_field)
                                        .addComponent(data_inicio_3_field)
                                        .addComponent(area_associada_field)
                                        .addComponent(data_fim_4_field, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(data_inicio_4_field))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cnpj_field, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(site_field, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(id_financiador_field))))
                        .addGap(229, 229, 229))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 872, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_area_field, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(razao_social_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(id_financiador_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome_fantasia_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(federal)
                    .addComponent(estadual)
                    .addComponent(municipal)
                    .addComponent(privado)
                    .addComponent(jLabel7)
                    .addComponent(pais_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(site_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nome_2_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(id_programa_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(id_financiador_2_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nome_3_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_area_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(descricao_3_field, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_4_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(area_associada_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(descricao_4_field, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sair2)
                                    .addComponent(prox1))
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id_linha_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(data_inicio_4_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(data_fim_4_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_inicio_3_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_fim_3_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void data_inicio_3_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_inicio_3_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_inicio_3_fieldActionPerformed

    private void data_fim_3_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_fim_3_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_fim_3_fieldActionPerformed

    private void sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_sair2ActionPerformed

    private void prox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prox1ActionPerformed
        //Cadastro de financiadores
        this.id_financiador_1 = id_financiador_field.getText();
        this.CNPJ_1 = cnpj_field.getText();
        this.razao_social = razao_social_field.getText();
        this.Nome_fantasia = nome_fantasia_field.getText();
        this.pais = pais_field.getText();
        this.site = site_field.getText();
        
        // Cadastro de Programa de Fomento
        this.id_programa = id_programa_field.getText();
        this.id_financiador_2 = id_financiador_field.getText();
        this.Nome_2 = nome_2_field.getText();
        
        // Cadastro de Área de Concentração
        this.id_area = id_area_field.getText();
        this.Nome_3 = nome_3_field.getText();
        this.descricao_3 = descricao_3_field.getText();
        this.data_inicio_3 = data_inicio_3_field.getText();
        this.data_fim_3 = data_fim_3_field.getText();
        
        // Cadastro de Linha de Pesquisa
        this.id_linha = id_linha_field.getText();
        this.area_associada = area_associada_field.getText();
        this.descricao_4 = descricao_4_field.getText();
        this.data_inicio_4 = data_inicio_4_field.getText();
        this.data_fim_4 = data_fim_4_field.getText();
        Pag2 p2 = new Pag2(this);
        p2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_prox1ActionPerformed

    private void razao_social_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razao_social_fieldActionPerformed
        String a1 = razao_social_field.getText();
    }//GEN-LAST:event_razao_social_fieldActionPerformed

    private void nome_fantasia_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_fantasia_fieldActionPerformed
        String a3 = nome_fantasia_field.getText();
    }//GEN-LAST:event_nome_fantasia_fieldActionPerformed

    private void cnpj_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpj_fieldActionPerformed
        String a4 = cnpj_field.getText();
    }//GEN-LAST:event_cnpj_fieldActionPerformed

    private void pais_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais_fieldActionPerformed
        String a5 = pais_field.getText();
    }//GEN-LAST:event_pais_fieldActionPerformed

    private void federalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_federalActionPerformed
        if(federal.isSelected()){
            this.status_juridico = "Federal";
        }
    }//GEN-LAST:event_federalActionPerformed

    private void estadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadualActionPerformed
        if(estadual.isSelected()){
            this.status_juridico = "Estadual";
        }
    }//GEN-LAST:event_estadualActionPerformed

    private void municipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipalActionPerformed
        if(municipal.isSelected()){
            this.status_juridico = "Municipal";
        }
    }//GEN-LAST:event_municipalActionPerformed

    private void privadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privadoActionPerformed
        if(privado.isSelected()){
            this.status_juridico = "Privado";
        }
    }//GEN-LAST:event_privadoActionPerformed

    private void id_financiador_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_financiador_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_financiador_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pag1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area_associada_field;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cnpj_field;
    private javax.swing.JTextField data_fim_3_field;
    private javax.swing.JTextField data_fim_4_field;
    private javax.swing.JTextField data_inicio_3_field;
    private javax.swing.JTextField data_inicio_4_field;
    private javax.swing.JTextField descricao_3_field;
    private javax.swing.JTextField descricao_4_field;
    private javax.swing.JRadioButton estadual;
    private javax.swing.JRadioButton federal;
    private javax.swing.JTextField id_area_field;
    private javax.swing.JTextField id_financiador_2_field;
    private javax.swing.JFormattedTextField id_financiador_field;
    private javax.swing.JTextField id_linha_field;
    private javax.swing.JTextField id_programa_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton municipal;
    private javax.swing.JTextField nome_2_field;
    private javax.swing.JTextField nome_3_field;
    private javax.swing.JTextField nome_4_field;
    private javax.swing.JTextField nome_fantasia_field;
    private javax.swing.JTextField pais_field;
    private javax.swing.JRadioButton privado;
    private javax.swing.JButton prox1;
    private javax.swing.JTextField razao_social_field;
    private javax.swing.JButton sair2;
    private javax.swing.JTextField site_field;
    // End of variables declaration//GEN-END:variables
}
