/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Primerak;
import exception.ServerskiException;
import java.util.Date;
import zastita.HashFunkcija;

/**
 *
 * @author FON
 */
public class SOZapamtiPrimerak extends OpstaSistemskaOperacija{

    private Primerak primerak;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        String sifraPrimerka = Integer.toString(((int) (new Date().getTime() / 1000))) + HashFunkcija.napraviHash(primerak.getIzdavac());
        primerak.setSifraPrimerka(sifraPrimerka);
        primerak = (Primerak) dbb.sacuvajObjekat(primerak);
    }

    public Primerak getPrimerak() {
        return primerak;
    }

    public void setPrimerak(Primerak primerak) {
        this.primerak = primerak;
    }
    
    
}


