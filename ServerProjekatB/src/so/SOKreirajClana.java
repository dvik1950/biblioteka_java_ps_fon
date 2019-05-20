/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Clan;
import exception.ServerskiException;
import java.util.Date;
import zastita.HashFunkcija;

/**
 *
 * @author FON
 */
public class SOKreirajClana extends OpstaSistemskaOperacija{

    private Clan clan;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        String sifraClana = Integer.toString(((int) (new Date().getTime() / 1000)));
        clan = new Clan();
        clan.setSifraClana(sifraClana);
        dbb.sacuvajObjekat(clan);
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }
    
    
    
}
