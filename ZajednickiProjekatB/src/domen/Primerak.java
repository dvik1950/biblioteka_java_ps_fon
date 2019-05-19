/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author FON
 */
public class Primerak extends OpstiDomenskiObjekat{
    private String sifraPrimerka;
    private String ISBN;
    private String izdavac;

    public Primerak() {
    }

    public Primerak(String sifraPrimerka, String ISBN, String izdavac) {
        this.sifraPrimerka = sifraPrimerka;
        this.ISBN = ISBN;
        this.izdavac = izdavac;
    }

    public String getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(String izdavac) {
        this.izdavac = izdavac;
    }

    public String getSifraPrimerka() {
        return sifraPrimerka;
    }

    public void setSifraPrimerka(String sifraPrimerka) {
        this.sifraPrimerka = sifraPrimerka;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String vratiImeTabele() {
        return "primerak";
    }

    @Override
    public String vratiParametre() {
        return String.format("'%s', '%s','%s'", sifraPrimerka, ISBN, izdavac);
    }

    @Override
    public String vratiPK() {
        return "SifraPrimerka";
    }

    @Override
    public String vratiVrednostPK() {
        return "'" + sifraPrimerka + "'";
    }


    @Override
    public List<OpstiDomenskiObjekat> RSuTabelu(ResultSet rs) {
         List<OpstiDomenskiObjekat> primerci = new ArrayList<>();
        try {
            while (rs.next()) {
                String ISBN = rs.getString("ISBN");
                String sifraPrimerka = rs.getString("SifraPrimerka");
                String izdavac = rs.getString("Izdavac");
                Primerak p = new Primerak(sifraPrimerka, ISBN, izdavac);
                primerci.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Greska kod RSuTabelu za Primerke");
        }
        return primerci;
    }

    @Override
    public String vratiUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postaviVrednostPK(String pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
