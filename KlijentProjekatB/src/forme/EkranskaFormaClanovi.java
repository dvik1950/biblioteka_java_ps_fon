/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Clan;
import domen.Knjiga;
import domen.OpstiDomenskiObjekat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroleriKI.OpstiKontrolerKI;
import modeli.ModelTabeleClanovi;

/**
 *
 * @author FON
 */
public class EkranskaFormaClanovi extends OpstaEkranskaForma {

    ModelTabeleClanovi modelTabeleClanovi = new ModelTabeleClanovi();

    /**
     * Creates new form EkranskaFormaClan
     */
    public EkranskaFormaClanovi() {
        initComponents();
        postaviModeleTabela();
        postaviToolTipove();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJMBG = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSifraClana = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIzmeniOdabranogClana = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClanovi = new javax.swing.JTable();
        btnPretraziClanove = new javax.swing.JButton();
        labelaNapomenaPretraga = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnKreirajNovogClana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Odaberite kriterijum i vrednost pretrage clanova:");

        jLabel4.setText("Prezime:");

        jLabel5.setText("Šifra člana:");

        jLabel2.setText("JMBG:");

        jLabel3.setText("Ime:");

        btnIzmeniOdabranogClana.setText("Izmeni odabranog člana");
        btnIzmeniOdabranogClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniOdabranogClanaActionPerformed(evt);
            }
        });

        tabelaClanovi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaClanovi);

        btnPretraziClanove.setText("Pretraži članove");
        btnPretraziClanove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziClanoveActionPerformed(evt);
            }
        });

        labelaNapomenaPretraga.setText("Napomena(?)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIzmeniOdabranogClana))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnPretraziClanove)
                                .addGap(49, 49, 49)
                                .addComponent(labelaNapomenaPretraga))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJMBG)
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSifraClana)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSifraClana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPretraziClanove)
                    .addComponent(labelaNapomenaPretraga))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIzmeniOdabranogClana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Nazad na glavnu formu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnKreirajNovogClana.setText("Kreiraj novog člana");
        btnKreirajNovogClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajNovogClanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKreirajNovogClana)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnKreirajNovogClana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nazadNaGlavnuFormu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPretraziClanoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziClanoveActionPerformed
        if (validnaPretraga()) {
            try {
                nadjiClanove();
            } catch (Exception ex) {
                Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Neispravni parametri pretrage, pogledajte napomenu za dodatne informacije.");
        }
    }//GEN-LAST:event_btnPretraziClanoveActionPerformed

    private void btnKreirajNovogClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajNovogClanaActionPerformed
        try {
            kreirajClana();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne može da kreira člana.");
        }
    }//GEN-LAST:event_btnKreirajNovogClanaActionPerformed

    private void btnIzmeniOdabranogClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniOdabranogClanaActionPerformed
        if (tabelaClanovi.getSelectedRow() != -1) {
            try {
                izmeniClana(modelTabeleClanovi.getLista().get(tabelaClanovi.getSelectedRow()));
            } catch (Exception ex) {
                Logger.getLogger(EkranskaFormaClanovi.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Odaberite člana kog želite da izmenite.");
        }
    }//GEN-LAST:event_btnIzmeniOdabranogClanaActionPerformed

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
            java.util.logging.Logger.getLogger(EkranskaFormaClanovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaClanovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaClanovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaClanovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranskaFormaClanovi().setVisible(true);
            }
        });
    }

    @Override
    OpstiDomenskiObjekat kreirajObjekat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void postaviImeForme() {
        this.setTitle("Forma za rad sa članovima");
    }

    @Override
    void postaviModeleTabela() {
        tabelaClanovi.setModel(modelTabeleClanovi);
    }

    @Override
    void popuniTabele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void postaviToolTipove() {
        labelaNapomenaPretraga.setToolTipText("JMBG i Sifra moraju biti potpuni, dok ime i prezime mogu biti deo imena ili prezimena. Može se pretraživati po jednom ili više kriterijuma.");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeniOdabranogClana;
    private javax.swing.JButton btnKreirajNovogClana;
    private javax.swing.JButton btnPretraziClanove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelaNapomenaPretraga;
    private javax.swing.JTable tabelaClanovi;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtJMBG;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtSifraClana;
    // End of variables declaration//GEN-END:variables

    private boolean validnaPretraga() {
        if (validanJMBG() && validnoIme() && validnoPrezime() && validnaSifraClana()) {
            return true;
        }
        return false;
    }

    private void nadjiClanove() throws Exception {
        HashMap<String, String> kriterijum = new HashMap<>();
        if (!txtSifraClana.getText().isEmpty()) {
            kriterijum.put("sifra", txtSifraClana.getText());
        }
        if (!txtIme.getText().isEmpty()) {
            kriterijum.put("ime", txtIme.getText());
        }
        if (!txtPrezime.getText().isEmpty()) {
            kriterijum.put("prezime", txtPrezime.getText());
        }
        if (!txtJMBG.getText().isEmpty()) {
            kriterijum.put("jmbg", txtJMBG.getText());
        }
        ArrayList<Clan> rezultatPretrage = OpstiKontrolerKI.vratiInstancu().nadjiClanove(kriterijum);
        modelTabeleClanovi.setLista(rezultatPretrage);
        JOptionPane.showMessageDialog(this, "Sistem je našao članove po zadatoj vrednosti.");
    }

    private void kreirajClana() throws Exception {
        EkranskaFormaClan efc = new EkranskaFormaClan();
        efc.setParentForma(this);
        efc.setStatus("dodaj");
        efc.setVisible(true);
        dispose();
    }

    private void izmeniClana(Clan clan) throws Exception {
        EkranskaFormaClan efc = new EkranskaFormaClan();
        efc.setParentForma(this);
        efc.setStatus("izmeni");
        Clan ceoClan = OpstiKontrolerKI.vratiInstancu().nadjiClana(clan);
        efc.setClan(ceoClan);
        efc.setVisible(true);
        dispose();
    }

    private boolean validanJMBG() {
        String JMBG = txtJMBG.getText();
        if ((JMBG.matches("[0-9]+") && JMBG.length() == 13) || JMBG.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean validnoIme() {
        String ime = txtIme.getText();
        if (ime.matches("[a-zA-Z]+") || ime.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean validnoPrezime() {
        String prezime = txtPrezime.getText();
        if (prezime.matches("[a-zA-Z]+") || prezime.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean validnaSifraClana() {
        return true;
    }
}
