/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Knjiga;
import exception.ServerskiException;

/**
 *
 * @author FON
 */
public class SONadjiKnjigu extends OpstaSistemskaOperacija{

    private Knjiga parametar;
    private Knjiga knjiga;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
         knjiga = (Knjiga) dbb.vratiObjekatPoKljucu(parametar, parametar.getISBN());
    }

    public Knjiga getParametar() {
        return parametar;
    }

    public void setParametar(Knjiga parametar) {
        this.parametar = parametar;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }
    
    
}
