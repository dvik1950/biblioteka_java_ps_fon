/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Primerak;
import exception.ServerskiException;

/**
 *
 * @author FON
 */
public class SOVratiPrimerak extends OpstaSistemskaOperacija {
    
    private Primerak primerak;
    private boolean uspesno;

    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
       uspesno = dbb.vratiPrimerak(primerak);
    }

    public Primerak getPrimerak() {
        return primerak;
    }

    public void setPrimerak(Primerak primerak) {
        this.primerak = primerak;
    }

    public boolean isUspesno() {
        return uspesno;
    }

    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
    }
    
    
    
    
}
