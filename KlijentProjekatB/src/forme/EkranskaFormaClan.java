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

/**
 *
 * @author FON
 */
public class EkranskaFormaClan extends OpstaEkranskaForma {

    private EkranskaFormaClanovi parentForma;
    private String sifraClana;
    private String JMBG;
    private String ime;
    private String prezime;
    private String telefon;
    private String email;
    private String status; //"dodaj" ili "izmeni"

    /**
     * Creates new form EkranskaFormaClan
     */
    public EkranskaFormaClan() {
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

        jLabel1 = new javax.swing.JLabel();
        txtSifraClana = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJMBG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSacuvaj = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Šifra člana:");

        jLabel2.setText("JMBG:");

        jLabel3.setText("Ime:");

        jLabel4.setText("Prezime:");

        jLabel5.setText("Telefon:");

        jLabel6.setText("e-mail:");

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        jButton1.setText("Nazad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSifraClana)
                            .addComponent(txtJMBG)
                            .addComponent(txtIme)
                            .addComponent(txtPrezime)
                            .addComponent(txtTelefon)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSifraClana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        if (ispravnoUnetiPodaci()) {
            if (status.equals("dodaj")) {
                try {
                    zapamtiNovogClana();
                } catch (Exception ex) {
                    Logger.getLogger(EkranskaFormaClan.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (status.equals("izmeni")) {
                try {
                    zapamtiClana();
                } catch (Exception ex) {
                    Logger.getLogger(EkranskaFormaClan.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    throw new Exception("Neispravan status ekranske forme!");
                } catch (Exception ex) {
                    Logger.getLogger(EkranskaFormaClan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Neispravno uneti podaci.");
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        parentForma.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EkranskaFormaClan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaClan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaClan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkranskaFormaClan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranskaFormaClan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtJMBG;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtSifraClana;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables

//    public String getStatus() {
//        return status;
//    }
//    private void sacuvajClana() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private void zapamtiNovogClana() throws Exception {
        boolean uspesno = OpstiKontrolerKI.vratiInstancu().zapamtiClana(pokupiPodatkeIzPolja());
        if (uspesno) {
            zatvoriFormu();
            JOptionPane.showMessageDialog(parentForma, "Sistem je zapamtio novog člana");
        } else {
            JOptionPane.showMessageDialog(parentForma, "Sistem ne može da zapamti novog člana");
        }
    }

    private void zatvoriFormu() {
        parentForma.setVisible(true);
        dispose();
    }

    private void kreirajClana() throws Exception {
        this.sifraClana = OpstiKontrolerKI.vratiInstancu().kreirajObjekat("clan").get("sifra");
        txtSifraClana.setText(sifraClana);
    }

    @Override
    HashMap<String, String> kreirajObjekat() { //snima clana u bazu
        throw new UnsupportedOperationException("greska");
    }

    @Override
    void postaviImeForme() {
        if (status.equals("dodaj")) {
            this.setTitle("Kreiranje novog člana");
        } else if (status.equals("izmeni")) {
            this.setTitle("Izmena člana");
        }
    }

    public EkranskaFormaClanovi getParentForma() {
        return parentForma;
    }

    public void setParentForma(EkranskaFormaClanovi parentForma) {
        this.parentForma = parentForma;
    }

    private void zakljucajSifruClana() {
        txtSifraClana.setEditable(false);
    }

    private void popuniPolja() {
        if (sifraClana != null) {
            txtSifraClana.setText(sifraClana);
        }
        if (JMBG != null) {
            txtJMBG.setText(JMBG);
        }
        if (email != null) {
            txtEmail.setText(email);
        }
        if (ime != null) {
            txtIme.setText(ime);
        }
        if (prezime != null) {
            txtPrezime.setText(prezime);
        }
        if (telefon != null) {
            txtTelefon.setText(telefon);
        }
    }

    private HashMap<String, String> pokupiPodatkeIzPolja() {
        HashMap<String, String> podaci = new HashMap<>();
        podaci.put("sifra", txtSifraClana.getText());
        podaci.put("jmbg", txtJMBG.getText());
        podaci.put("ime", txtIme.getText());
        podaci.put("prezime", txtPrezime.getText());
        podaci.put("telefon", txtTelefon.getText());
        podaci.put("email", txtEmail.getText());
        return podaci;
    }

    private void zapamtiClana() throws Exception {
        boolean uspesno = OpstiKontrolerKI.vratiInstancu().zapamtiClana(pokupiPodatkeIzPolja());
        if (uspesno) {
            zatvoriFormu();
            JOptionPane.showConfirmDialog(parentForma, "Sistem je zapamtio člana.");
            parentForma.modelTabeleClanovi.setLista(new ArrayList<>());
        } else {
            zatvoriFormu();
            JOptionPane.showConfirmDialog(parentForma, "Sistem ne može zapamti člana.");
        }
    }

    //validacije
    private boolean ispravnoUnetiPodaci() {
        if (ispravnoUnetEmail() && ispravnoUnetJMBG() && ispravnoUnetTelefon() && ispravnoUnetoIme() && ispravnoUnetoPrezime()) {
            return true;
        }
        return false;
    }

    private boolean ispravnoUnetJMBG() {
        String JMBG = txtJMBG.getText();
        if (JMBG.matches("[0-9]+") && JMBG.length() == 13) {
            return true;
        }
        return false;
    }

    private boolean ispravnoUnetoIme() {
        String ime = txtIme.getText();
        if (ime.matches("[a-zA-Z]+") && ime.length() > 1) {
            return true;
        }
        return false;
    }

    private boolean ispravnoUnetoPrezime() {
        String prezime = txtPrezime.getText();
        if (prezime.matches("[a-zA-Z]+") && prezime.length() > 1) {
            return true;
        }
        return false;
    }

    private boolean ispravnoUnetTelefon() {
        String telefon = txtTelefon.getText();
        if (telefon.matches("[0-9]+") && telefon.length() > 2) {
            return true;
        }
        return false;
    }

    private boolean ispravnoUnetEmail() {
        String email = txtEmail.getText();
        if (email.matches("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$")) {
            return true;
        }
        return false;
    }

    //setteri i getteri
    public String getSifraClana() {
        return sifraClana;
    }

    public void setSifraClana(String sifraClana) {
        this.sifraClana = sifraClana;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) throws Exception {
        this.status = status;
        if (status.equals("dodaj")) {
            kreirajClana();
        }
        postaviImeForme();
        zakljucajSifruClana();
    }

    // neimplementirane metode
    @Override
    void postaviToolTipove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void postaviModeleTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void popuniTabele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
