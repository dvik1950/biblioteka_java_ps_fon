/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.pomocne;

import domen.Administrator;
import domen.OpstiDomenskiObjekat;
import exception.ServerskiException;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author FON
 */
public class SOKreirajAdministratora extends OpstaSistemskaOperacija{

    private OpstiDomenskiObjekat admin;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        dbb.sacuvajObjekat(admin);
    }

    public OpstiDomenskiObjekat getAdmin() {
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }
    
    
    
}
