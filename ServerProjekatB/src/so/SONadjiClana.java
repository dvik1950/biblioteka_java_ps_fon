/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Clan;
import exception.ServerskiException;

/**
 *
 * @author FON
 */
public class SONadjiClana extends OpstaSistemskaOperacija{

    private Clan clan;
    private Clan ceoClan;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        ceoClan = (Clan) dbb.vratiObjekatPoKljucu(clan, clan.getSifraClana());
    }


    
    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Clan getCeoClan() {
        return ceoClan;
    }

    public void setCeoClan(Clan ceoClan) {
        this.ceoClan = ceoClan;
    }
    
    
    
}
