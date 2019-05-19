/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.pomocne;

import domen.Administrator;
import exception.ServerskiException;
import java.util.ArrayList;
import java.util.List;
import kontroler.Kontroler;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author FON
 */
public class SOIzlogujSe extends OpstaSistemskaOperacija{

    private Administrator administrator;
    
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        List<Administrator> lista = Kontroler.vratiInstancu().getListaKorisnika();
        System.out.println("lista prvi je: " + lista.get(0).getKorisnickoIme());
        for (Administrator administrator1 : lista) {
            if(administrator1.getKorisnickoIme().equals(administrator.getKorisnickoIme())){
                administrator1.setUlogovan(false);
                System.out.println("izlogovao: " + administrator1.getKorisnickoIme());
            }
        }
        
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    
    
}
