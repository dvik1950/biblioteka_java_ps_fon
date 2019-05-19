/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Knjiga;
import exception.ServerskiException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author FON
 */
public class SONadjiKnjige extends OpstaSistemskaOperacija{

    private HashMap<String, String> kriterijum;
    private ArrayList<Knjiga> knjige;
    
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        knjige = dbb.nadjiKnjige(kriterijum);
    }


    public ArrayList<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public HashMap<String, String> getKriterijum() {
        return kriterijum;
    }

    public void setKriterijum(HashMap<String, String> kriterijum) {
        this.kriterijum = kriterijum;
    }
    
    
    
}
