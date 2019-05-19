/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Iznajmljivanje;
import exception.ServerskiException;
import java.util.Date;

/**
 *
 * @author FON
 */
public class SOZapamtiIznajmljivanje extends OpstaSistemskaOperacija{

    private Iznajmljivanje iznajmljivanje;
    private boolean uspesno = false;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        String sifraIznajmljivanja = Integer.toString((int) (new Date().getTime() / 1000)); 
        iznajmljivanje.setDatumIznajmljivanja(new Date());
        iznajmljivanje.setSifraIznajmljivanja(sifraIznajmljivanja);
        System.out.println(iznajmljivanje.getSifraIznajmljivanja() + iznajmljivanje.getPrimerak().getSifraPrimerka());
        if(dbb.sacuvajObjekat(iznajmljivanje) != null) uspesno = true;
    }

    public Iznajmljivanje getIznajmljivanje() {
        return iznajmljivanje;
    }

    public void setIznajmljivanje(Iznajmljivanje iznajmljivanje) {
        this.iznajmljivanje = iznajmljivanje;
    }

    public boolean isUspesno() {
        return uspesno;
    }

    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
    }
    
    
}
