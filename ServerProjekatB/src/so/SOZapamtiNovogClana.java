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
public class SOZapamtiNovogClana extends OpstaSistemskaOperacija{

    private Clan clan;
    private boolean uspesno = false;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        Clan zapamceniClan = (Clan) dbb.sacuvajObjekat(clan);
        if(zapamceniClan != null) uspesno = true;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public boolean isUspesno() {
        return uspesno;
    }

    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
    }
    
    
}
