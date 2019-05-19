/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Clan;
import domen.Primerak;
import exception.ServerskiException;
import java.util.ArrayList;

/**
 *
 * @author FON
 */
public class SONadjiIznajmljenePrimerke extends OpstaSistemskaOperacija{
    private Clan clan;
    private ArrayList<Primerak> listaPrimeraka;

    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        listaPrimeraka = dbb.nadjiIznajmljenePrimerke(clan);
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public ArrayList<Primerak> getListaPrimeraka() {
        return listaPrimeraka;
    }

    public void setListaPrimeraka(ArrayList<Primerak> listaPrimeraka) {
        this.listaPrimeraka = listaPrimeraka;
    }
    
    
}
