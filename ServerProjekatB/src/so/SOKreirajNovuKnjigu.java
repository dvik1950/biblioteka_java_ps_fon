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
public class SOKreirajNovuKnjigu extends OpstaSistemskaOperacija{

    private Knjiga knjiga;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        knjiga = new Knjiga();
        knjiga.setAutor("Unesite ime autora");
        knjiga.setISBN("Unesite ISBN");
        knjiga.setNazivKnjige("Unesite naziv knjige");
        knjiga.setGodinaObjavljivanja(0);
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }
    
    
    
}
