package so;

import domen.Clan;
import exception.ServerskiException;

public class SOZapamtiNovogClana extends OpstaSistemskaOperacija{

     // treba da se izbaci ovaj SO, suvisan je
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
