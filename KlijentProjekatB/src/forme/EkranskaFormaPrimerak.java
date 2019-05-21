package forme;

import domen.Knjiga;
import domen.OpstiDomenskiObjekat;
import domen.Primerak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroleriKI.OpstiKontrolerKI;
import modeli.ModelTabeleKnjige;
import modeli.ModelTabelePrimerci;

public class EkranskaFormaPrimerak extends OpstaEkranskaForma {

    private ModelTabeleKnjige modelTabeleKnjige = new ModelTabeleKnjige();
    private ModelTabelePrimerci modelTabelePrimerci = new ModelTabelePrimerci();

    /**
     * Creates new form EkranskaFormaPrimerak
     */
    public EkranskaFormaPrimerak() {
        initComponents();
        postaviImeForme();
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

        panelPrimerci = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPrimerci = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnDodajPrimerak = new javax.swing.JButton();
        btnObrisiOdabraniPrimerak = new javax.swing.JButton();
        txtIzdavac = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaKnjige = new javax.swing.JTable();
        btnPrikaziSvePodatkeOKnjizi = new javax.swing.JButton();
        btnPronadjiPrimerkeZaOdabranuKnjigu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNazivKnjige = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPronadjiKnjige = new javax.swing.JButton();
        labelaPretragaNapomena = new javax.swing.JLabel();
        txtGodinaObjavljivanja = new javax.swing.JTextField();
        btnNazadNaGlavnuFormu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrimerci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrimerci.setName(""); // NOI18N

        tabelaPrimerci.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaPrimerci);

        jLabel10.setText("Primerci za odabranu knjigu:");

        btnDodajPrimerak.setText("Dodaj primerak");
        btnDodajPrimerak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPrimerakActionPerformed(evt);
            }
        });

        btnObrisiOdabraniPrimerak.setText("Obriši odabrani primerak");
        btnObrisiOdabraniPrimerak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiOdabraniPrimerakActionPerformed(evt);
            }
        });

        jLabel11.setText("Izdavač novog primerka:");

        javax.swing.GroupLayout panelPrimerciLayout = new javax.swing.GroupLayout(panelPrimerci);
        panelPrimerci.setLayout(panelPrimerciLayout);
        panelPrimerciLayout.setHorizontalGroup(
            panelPrimerciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrimerciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrimerciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrimerciLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrimerciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrimerciLayout.createSequentialGroup()
                                .addComponent(btnDodajPrimerak)
                                .addGap(58, 58, 58))
                            .addGroup(panelPrimerciLayout.createSequentialGroup()
                                .addComponent(txtIzdavac, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrimerciLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(52, 52, 52))))
                    .addGroup(panelPrimerciLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrimerciLayout.createSequentialGroup()
                        .addComponent(btnObrisiOdabraniPrimerak)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelPrimerciLayout.setVerticalGroup(
            panelPrimerciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrimerciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addGroup(panelPrimerciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrimerciLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIzdavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDodajPrimerak)))
                .addGap(29, 29, 29)
                .addComponent(btnObrisiOdabraniPrimerak)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Odaberite knjigu:");

        tabelaKnjige.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaKnjige);

        btnPrikaziSvePodatkeOKnjizi.setText("Prikaži sve podatke o knjizi");
        btnPrikaziSvePodatkeOKnjizi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSvePodatkeOKnjiziActionPerformed(evt);
            }
        });

        btnPronadjiPrimerkeZaOdabranuKnjigu.setText("Pronađi primerke za odabranu knjigu");
        btnPronadjiPrimerkeZaOdabranuKnjigu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronadjiPrimerkeZaOdabranuKnjiguActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrikaziSvePodatkeOKnjizi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPronadjiPrimerkeZaOdabranuKnjigu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrikaziSvePodatkeOKnjizi)
                    .addComponent(btnPronadjiPrimerkeZaOdabranuKnjigu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Odaberite kriterijum i vrednost pretrage za knjige čije primerke želite da vidite:");

        jLabel2.setText("Naziv knjige:");

        jLabel3.setText("Autor:");

        jLabel4.setText("ISBN:");

        jLabel5.setText("Godina objavljivanja:");

        btnPronadjiKnjige.setText("Pronađi knjige");
        btnPronadjiKnjige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronadjiKnjigeActionPerformed(evt);
            }
        });

        labelaPretragaNapomena.setText("Napomena(?)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPronadjiKnjige, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelaPretragaNapomena))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGodinaObjavljivanja)
                            .addComponent(txtNazivKnjige)
                            .addComponent(txtAutor)
                            .addComponent(txtISBN))))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNazivKnjige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGodinaObjavljivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPronadjiKnjige)
                    .addComponent(labelaPretragaNapomena))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnNazadNaGlavnuFormu.setText("Nazad na glavnu formu");
        btnNazadNaGlavnuFormu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadNaGlavnuFormuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPrimerci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNazadNaGlavnuFormu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNazadNaGlavnuFormu)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPrimerci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadNaGlavnuFormuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadNaGlavnuFormuActionPerformed
        nazadNaGlavnuFormu();
    }//GEN-LAST:event_btnNazadNaGlavnuFormuActionPerformed

    private void btnPronadjiKnjigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronadjiKnjigeActionPerformed
        if (validnaPretraga()) {
            try {
                pronadjiKnjige();
            } catch (Exception ex) {
                Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Neispravni parametri pretrage, pogledajte napomenu za dodatne informacije.");
        }
    }//GEN-LAST:event_btnPronadjiKnjigeActionPerformed

    private void btnPrikaziSvePodatkeOKnjiziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSvePodatkeOKnjiziActionPerformed
        if (tabelaKnjige.getSelectedRow() != -1) {
            String isbn = modelTabeleKnjige.getLista().get(tabelaKnjige.getSelectedRow()).getISBN();
            try {
                nadjiSvePodatkeOKnjizi(isbn);
            } catch (Exception ex) {
                Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Prvo odaberite knjigu iz tabele.");
        }
    }//GEN-LAST:event_btnPrikaziSvePodatkeOKnjiziActionPerformed

    private void btnDodajPrimerakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPrimerakActionPerformed
        if (!txtIzdavac.getText().isEmpty()) {
            if (tabelaKnjige.getSelectedRow() != -1) {
                try {
                    kreirajObjekat();
                } catch (Exception ex) {
                    Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Odaberite knjigu za koju želite da dodate novi primerak.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Unesite ime izdavača novog primerka.");
        }
    }//GEN-LAST:event_btnDodajPrimerakActionPerformed

    private void btnPronadjiPrimerkeZaOdabranuKnjiguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronadjiPrimerkeZaOdabranuKnjiguActionPerformed
        if (tabelaKnjige.getSelectedRow() != -1) {
            try {
                pronadjiPrimerke(modelTabeleKnjige.getLista().get(tabelaKnjige.getSelectedRow()).getISBN());
            } catch (Exception ex) {
                Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Odaberite knjigu za koju želite da nađete primerke.");
        }
    }//GEN-LAST:event_btnPronadjiPrimerkeZaOdabranuKnjiguActionPerformed

    private void btnObrisiOdabraniPrimerakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiOdabraniPrimerakActionPerformed
        if (tabelaPrimerci.getSelectedRow() != -1) {
            try {
                izbrisiPrimerak(modelTabelePrimerci.getLista().get(tabelaPrimerci.getSelectedRow()).getSifraPrimerka());
            } catch (Exception ex) {
                Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Odaberite primerak koji želite da obrišete.");
        }
    }//GEN-LAST:event_btnObrisiOdabraniPrimerakActionPerformed

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
            java.util.logging.Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranskaFormaPrimerak().setVisible(true);
            }
        });
    }

    @Override
    void postaviImeForme() {
        this.setTitle("Forma za rad sa primercima");
    }

    @Override
    HashMap<String, String> kreirajObjekat() {
        try {
                HashMap<String, String> primerak = new HashMap<>();
                primerak.put("tip", "primerak");
                primerak.put("isbn", modelTabeleKnjige.getLista().get(tabelaKnjige.getSelectedRow()).getISBN());
                primerak.put("izdavac", txtIzdavac.getText());
               boolean uspesno = OpstiKontrolerKI.vratiInstancu().zapamtiObjekat(primerak);
            if (uspesno) {
                JOptionPane.showMessageDialog(this, "Sistem je zapamtio primerak. \n ISBN: " + primerak.get("isbn")
                        + "\n Izdavac: " + primerak.get("izdavac"));
                txtIzdavac.setText("");
                return primerak;
            } else {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti primerak.");
                return null;
            }
        } catch (Exception ex) {
            Logger.getLogger(EkranskaFormaPrimerak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    void postaviModeleTabela() {
        tabelaKnjige.setModel(modelTabeleKnjige);
        tabelaPrimerci.setModel(modelTabelePrimerci);
    }

    @Override
    void popuniTabele() {
        //
    }

    @Override
    void postaviToolTipove() {
        labelaPretragaNapomena.setToolTipText("Ukoliko ostavite sva  polja prazna sistem će pokušati da pronađe sve knjige. \n Da bi se knjiga pojavila u rezultatu pretrage mora da ispuni sve uslove pretrage.");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajPrimerak;
    private javax.swing.JButton btnNazadNaGlavnuFormu;
    private javax.swing.JButton btnObrisiOdabraniPrimerak;
    private javax.swing.JButton btnPrikaziSvePodatkeOKnjizi;
    private javax.swing.JButton btnPronadjiKnjige;
    private javax.swing.JButton btnPronadjiPrimerkeZaOdabranuKnjigu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelaPretragaNapomena;
    private javax.swing.JPanel panelPrimerci;
    private javax.swing.JTable tabelaKnjige;
    private javax.swing.JTable tabelaPrimerci;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtGodinaObjavljivanja;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIzdavac;
    private javax.swing.JTextField txtNazivKnjige;
    // End of variables declaration//GEN-END:variables

    private boolean validnaPretraga() {
        return true;
        // isbn brojevi, autor itd
    }

    private void pronadjiKnjige() throws Exception {
        HashMap<String, String> kriterijum = new HashMap<>();
        if (!txtAutor.getText().isEmpty()) {
            kriterijum.put("autor", txtAutor.getText());
        }
        if (!txtNazivKnjige.getText().isEmpty()) {
            kriterijum.put("naziv", txtNazivKnjige.getText());
        }
        if (!txtISBN.getText().isEmpty()) {
            kriterijum.put("ISBN", txtISBN.getText());
        }
        if (!txtGodinaObjavljivanja.getText().isEmpty()) {
            kriterijum.put("godina", txtGodinaObjavljivanja.getText());
        }
        OpstiKontrolerKI.vratiInstancu().nadjiKnjige(kriterijum, this);
        JOptionPane.showMessageDialog(this, "Sistem je našao sve knjige po zadatoj vrednosti.");
    }

    private void nadjiSvePodatkeOKnjizi(String isbn) throws Exception {
        HashMap<String, String> hashMapKnjige = OpstiKontrolerKI.vratiInstancu().nadjiKnjigu(isbn);
        JOptionPane.showMessageDialog(this, "Sistem je pronašao sve podatke o izabranoj knjizi.\n Naziv knjige: " + hashMapKnjige.get("naziv") + "\n"
                + "Autor knjige: " + hashMapKnjige.get("autor") + "\n"
                + "ISBN knjige: " + hashMapKnjige.get("isbn") + "\n"
                + "Godina objavljivanja knjige: " + hashMapKnjige.get("godina") + "\n");
    }

    private void pronadjiPrimerke(String isbn) throws Exception {
        boolean uspesno = OpstiKontrolerKI.vratiInstancu().nadjiPrimerke(isbn, this);
        if (uspesno) {
            JOptionPane.showMessageDialog(this, "Sistem je našao primerke za datu knjigu.");
        } else {
            JOptionPane.showMessageDialog(this, "Sistem ne može da nađe primerke za datu knjigu.");
        }
    }

    private void izbrisiPrimerak(String sifraPrimerka) throws Exception {
        boolean uspesno = OpstiKontrolerKI.vratiInstancu().izbrisiPrimerak(sifraPrimerka);
        if (uspesno) {
            JOptionPane.showMessageDialog(this, "Sistem je obrisao izabrani primerak.");
            modelTabelePrimerci.setLista(new ArrayList<>());
        } else {
            JOptionPane.showMessageDialog(this, "Sistem ne može da obriše izabrani primerak.");
        }
    }

    public ModelTabeleKnjige getModelTabeleKnjige() {
        return modelTabeleKnjige;
    }

    public void setModelTabeleKnjige(ModelTabeleKnjige modelTabeleKnjige) {
        this.modelTabeleKnjige = modelTabeleKnjige;
    }

    public ModelTabelePrimerci getModelTabelePrimerci() {
        return modelTabelePrimerci;
    }

    public void setModelTabelePrimerci(ModelTabelePrimerci modelTabelePrimerci) {
        this.modelTabelePrimerci = modelTabelePrimerci;
    }

    public javax.swing.JTable getTabelaKnjige() {
        return tabelaKnjige;
    }

    public void setTabelaKnjige(javax.swing.JTable tabelaKnjige) {
        this.tabelaKnjige = tabelaKnjige;
    }

    public javax.swing.JTable getTabelaPrimerci() {
        return tabelaPrimerci;
    }

    public void setTabelaPrimerci(javax.swing.JTable tabelaPrimerci) {
        this.tabelaPrimerci = tabelaPrimerci;
    }

    
    
}
