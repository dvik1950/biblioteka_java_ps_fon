/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Administrator;
import exception.ServerskiException;
import java.util.ArrayList;
import java.util.List;
import kontroler.Kontroler;

/**
 *
 * @author FON
 */
public class SOPrijaviAdministratora extends OpstaSistemskaOperacija {

    private Administrator parametar;
    private Administrator administrator;

    @Override
    protected void izvrsiKonkretnuOperaciju() throws ServerskiException {
        List<Administrator> listaAdministratora = Kontroler.vratiInstancu().getListaKorisnika();

        administrator = dbb.prijaviAdministratora(parametar);
        System.out.println("x");
        if (administrator.getKorisnickoIme() != null) {
            System.out.println("y");
            for (Administrator adminIzListe : listaAdministratora) {
                if (adminIzListe.equals(administrator)) {
                    System.out.println("nasao admina u listi");
                    if (adminIzListe.isUlogovan()) {
                        throw new ServerskiException("Administrator je vec ulogovan");
                    } else {
                        System.out.println("3");
                        int indeks = listaAdministratora.indexOf(adminIzListe);
                        System.out.println(indeks);
                        listaAdministratora.get(indeks).setUlogovan(true);
                        System.out.println(listaAdministratora.get(0).isUlogovan());
                        Kontroler.vratiInstancu().setListaKorisnika(listaAdministratora);
                        System.out.println(Kontroler.vratiInstancu().getListaKorisnika().get(0).isUlogovan());
                    }
                } else {
                    System.out.println("not equal");
                }
            }
        }
    }

    public Administrator getParametar() {
        return parametar;
    }

    public void setParametar(Administrator parametar) {
        this.parametar = parametar;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

}
