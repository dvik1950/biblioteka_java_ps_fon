/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Clan;
import exception.ServerskiException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author FON
 */
public class SONadjiClanove extends OpstaSistemskaOperacija{

    private HashMap<String, String> kriterijum;
    private ArrayList<Clan> clanovi;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        clanovi = dbb.nadjiClanove(kriterijum);
    }

    public ArrayList<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public HashMap<String, String> getKriterijum() {
        return kriterijum;
    }

    public void setKriterijum(HashMap<String, String> kriterijum) {
        this.kriterijum = kriterijum;
    }
    
    
    
}
