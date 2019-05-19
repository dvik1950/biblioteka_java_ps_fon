/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Clan;
import domen.OpstiDomenskiObjekat;
import exception.ServerskiException;
import java.util.ArrayList;

/**
 *
 * @author FON
 */
public class SOUcitajListuClanova extends OpstaSistemskaOperacija{

       private ArrayList<Clan> clanovi = new ArrayList<>();
     
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
         ArrayList<OpstiDomenskiObjekat> lista = (ArrayList<OpstiDomenskiObjekat>) dbb.vratiSveObjekte(new Clan());
         for (OpstiDomenskiObjekat opstiDomenskiObjekat : lista) {
            clanovi.add((Clan) opstiDomenskiObjekat);
        }
    }

    public ArrayList<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    
    
    
}
