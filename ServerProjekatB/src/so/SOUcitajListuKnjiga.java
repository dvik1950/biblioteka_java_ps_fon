/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Knjiga;
import domen.OpstiDomenskiObjekat;
import exception.ServerskiException;
import java.util.ArrayList;

/**
 *
 * @author FON
 */
public class SOUcitajListuKnjiga extends OpstaSistemskaOperacija{

    private ArrayList<Knjiga> knjige = new ArrayList<>();
     
    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
         ArrayList<OpstiDomenskiObjekat> lista = (ArrayList<OpstiDomenskiObjekat>) dbb.vratiSveObjekte(new Knjiga());
         for (OpstiDomenskiObjekat opstiDomenskiObjekat : lista) {
            knjige.add((Knjiga) opstiDomenskiObjekat);
        }
    }

    public ArrayList<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }
 
    
    
}
