/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author FON
 */
public class Iznajmljivanje extends OpstiDomenskiObjekat{
    
    private String sifraIznajmljivanja;
    private Primerak primerak;
    private Clan clan;
    private Administrator administrator;
    private Date datumIznajmljivanja;
    private Date datumVracanja;

    public Iznajmljivanje() {
    }

    public Iznajmljivanje(String sifraIznajmljivanja, Primerak primerak, Clan clan, Administrator administrator, Date datumIznajmljivanja, Date datumVracanja) {
        this.sifraIznajmljivanja = sifraIznajmljivanja;
        this.primerak = primerak;
        this.clan = clan;
        this.administrator = administrator;
        this.datumIznajmljivanja = datumIznajmljivanja;
        this.datumVracanja = datumVracanja;
    }

    public Date getDatumVracanja() {
        return datumVracanja;
    }

    public void setDatumVracanja(Date datumVracanja) {
        this.datumVracanja = datumVracanja;
    }

    public String getSifraIznajmljivanja() {
        return sifraIznajmljivanja;
    }

    public void setSifraIznajmljivanja(String sifraIznajmljivanja) {
        this.sifraIznajmljivanja = sifraIznajmljivanja;
    }

    public Primerak getPrimerak() {
        return primerak;
    }

    public void setPrimerak(Primerak primerak) {
        this.primerak = primerak;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Date getDatumIznajmljivanja() {
        return datumIznajmljivanja;
    }

    public void setDatumIznajmljivanja(Date datumIznajmljivanja) {
        this.datumIznajmljivanja = datumIznajmljivanja;
    }

    @Override
    public String vratiImeTabele() {
        return "iznajmljivanje(SifraIznajmljivanja, SifraPrimerka, SifraClana, SifraAdmina, DatumIznajmljivanja)";
    }

    @Override
    public String vratiParametre() {
         return String.format("'%s', '%s', '%s', '%s', '%s'", sifraIznajmljivanja, primerak.getSifraPrimerka(), clan.getSifraClana(), administrator.getSifraAdmina(), new java.sql.Date(datumIznajmljivanja.getTime()));
    }

    @Override
    public String vratiPK() {
        return "SifraIznajmljivanja";
    }

    @Override
    public String vratiVrednostPK() {
        return sifraIznajmljivanja;
    }


    @Override
    public List<OpstiDomenskiObjekat> RSuTabelu(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postaviVrednostPK(String pk) {
        this.sifraIznajmljivanja = pk;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Iznajmljivanje other = (Iznajmljivanje) obj;
        return true;
    }
    
    
    
}
