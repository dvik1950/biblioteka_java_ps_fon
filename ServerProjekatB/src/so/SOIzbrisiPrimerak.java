/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.OpstiDomenskiObjekat;
import domen.Primerak;
import exception.ServerskiException;

/**
 *
 * @author FON
 */
public class SOIzbrisiPrimerak extends OpstaSistemskaOperacija{

    private Primerak primerak;
    private boolean uspesnost;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        if(dbb.obrisiObjekat(primerak) != null) uspesnost = true;
    }

    public Primerak getPrimerak() {
        return primerak;
    }

    public void setPrimerak(Primerak primerak) {
        this.primerak = primerak;
    }

    public boolean isUspesnost() {
        return uspesnost;
    }

    public void setUspesnost(boolean uspesnost) {
        this.uspesnost = uspesnost;
    }
    
    
    
}
