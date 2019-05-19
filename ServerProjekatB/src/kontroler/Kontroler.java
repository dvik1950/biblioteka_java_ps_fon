/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.Administrator;
import domen.Clan;
import domen.Iznajmljivanje;
import domen.Knjiga;
import domen.OpstiDomenskiObjekat;
import domen.Primerak;
import exception.ServerskiException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import so.SOIzbrisiPrimerak;
import so.SOKreirajClana;
import so.SOKreirajNovuKnjigu;
import so.SONadjiClana;
import so.SONadjiClanove;
import so.SONadjiIznajmljenePrimerke;
import so.SONadjiKnjige;
import so.SONadjiKnjigu;
import so.SONadjiPrimerke;
import so.SOPrijaviAdministratora;
import so.SOUcitajListuClanova;
import so.SOUcitajListuKnjiga;
import so.SOUcitajListuPrimeraka;
import so.SOVratiPrimerak;
import so.SOZapamtiClana;
import so.SOZapamtiIznajmljivanje;
import so.SOZapamtiKnjigu;
import so.SOZapamtiNovogClana;
import so.SOZapamtiPrimerak;
import so.pomocne.SOKreirajAdministratora;
import so.pomocne.SOIzlogujSe;
import so.pomocne.SOUcitajListuKorisnika;

public class Kontroler {

    private static Kontroler instanca;
    private List<Administrator> listaKorisnika;

    private Kontroler() {
    }

    public static Kontroler vratiInstancu() {
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }

    public List<Administrator> getListaKorisnika() throws ServerskiException {
        if (listaKorisnika == null) {
            listaKorisnika = vratiListuKorisnika();
        }
        return listaKorisnika;
    }

    public void setListaKorisnika(List<Administrator> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }

    private List<Administrator> vratiListuKorisnika() throws ServerskiException {
        SOUcitajListuKorisnika souk = new SOUcitajListuKorisnika();
        souk.izvrsiOperaciju();
        return souk.getListaKorisnika();
    }

    public Administrator prijaviAdministratora(Administrator administrator) throws ServerskiException {
        SOPrijaviAdministratora sopa = new SOPrijaviAdministratora();
        sopa.setParametar(administrator);
        sopa.izvrsiOperaciju();
        return sopa.getAdministrator();
    }
//
//    public boolean zapamtiKnjigu(Knjiga knjiga) throws ServerskiException {
//        SOZapamtiKnjigu sozk = new SOZapamtiKnjigu(knjiga);
//        sozk.izvrsiOperaciju();
//        return sozk.isUspesnost();
//    }
//
//    public ArrayList<Knjiga> nadjiKnjige(String[] pretraga) throws ServerskiException {
//        SONadjiiKnjige sonk = new SONadjiiKnjige();
//        sonk.setPretraga(pretraga);
//        sonk.izvrsiOperaciju();
//        return sonk.getListaKnjiga();
//    }
//
//    public boolean sacuvajPrimerak(Primerak primerak) throws ServerskiException {
//        SOSacuvajPrimerak sosp = new SOSacuvajPrimerak();
//        sosp.setPrimerak(primerak);
//        sosp.izvrsiOperaciju();
//        return sosp.isUspesnost();
//    }
//
//    public ArrayList<Primerak> pronadjiSvePrimerkeZaKnjigu(Knjiga k) throws ServerskiException {
//        SOPronadjiSvePrimerkeZaKnjigu sopspzk = new SOPronadjiSvePrimerkeZaKnjigu();
//        sopspzk.setKnjiga(k);
//        sopspzk.izvrsiOperaciju();
//        return sopspzk.getListaPrimeraka();
//    }
//
//    public boolean obrisiPrimerak(Primerak p) throws ServerskiException {
//        SOObrisiPrimerak soop = new SOObrisiPrimerak();
//        soop.setPrimerak(p);
//        soop.izvrsiOperaciju();
//        return soop.isUspesno();
//    }
//
//    public boolean sacuvajClana(Clan c) throws ServerskiException {
//        SOSacuvajClana sosc = new SOSacuvajClana();
//        sosc.setC(c);
//        sosc.izvrsiOperaciju();
//        return sosc.isUspesno();
//    }
//
//    public ArrayList<Clan> pretraziClanove(String[] pretraga) throws ServerskiException {
//        SOPretraziClanove sopc = new SOPretraziClanove();
//        sopc.setPretraga(pretraga);
//        sopc.izvrsiOperaciju();
//        return sopc.getListaClanova();
//    }
//
//    public boolean izmeniClana(Clan c) throws ServerskiException {
//        SOIzmeniClana soic = new SOIzmeniClana();
//        soic.setC(c);
//        soic.izvrsiOperaciju();
//        return soic.isUspesno();
//    }
//
//    public boolean sacuvajIznajmljivanje(Iznajmljivanje i) throws ServerskiException {
//        SOSacuvajIznajmljivanje sosi = new SOSacuvajIznajmljivanje();
//        sosi.setI(i);
//        sosi.izvrsiOperaciju();
//        return sosi.isUspesno();
//    }
//
//    public void odjaviAdministratora(Administrator administrator) throws ServerskiException {
//        SOOdjaviAdministratora sooa = new SOOdjaviAdministratora();
//        sooa.setAdministrator(administrator);
//        sooa.izvrsiOperaciju();
//    }

    public void kreirajAdministratora(Administrator a) throws ServerskiException {
        so.pomocne.SOKreirajAdministratora ka = new SOKreirajAdministratora();
        ka.setAdmin(a);
        ka.izvrsiOperaciju();
        System.out.println("Kreiran je novi administrator");
    }

    public Knjiga kreirajNovuKnjigu() throws ServerskiException {
        SOKreirajNovuKnjigu soknk = new SOKreirajNovuKnjigu();
        soknk.izvrsiOperaciju();
        return soknk.getKnjiga();
    }

    public Knjiga zapamtiKnjigu(Knjiga knjiga) throws ServerskiException {
        SOZapamtiKnjigu sozk = new SOZapamtiKnjigu();
        sozk.setKnjiga(knjiga);
        sozk.izvrsiOperaciju();
        return sozk.getKnjiga();
    }

    public ArrayList<Knjiga> nadjiKnjige(HashMap<String, String> kriterijum) throws ServerskiException {
        SONadjiKnjige sonk = new SONadjiKnjige();
        sonk.setKriterijum(kriterijum);
        sonk.izvrsiOperaciju();
        return sonk.getKnjige();
    }

    public Object nadjiKnjigu(Knjiga knjiga) throws ServerskiException {
        SONadjiKnjigu sonk = new SONadjiKnjigu();
        sonk.setParametar(knjiga);
        sonk.izvrsiOperaciju();
        return sonk.getKnjiga();
    }

    public Object zapamtiPrimerak(Primerak primerak) throws ServerskiException {
        SOZapamtiPrimerak sozp = new SOZapamtiPrimerak();
        sozp.setPrimerak(primerak);
        sozp.izvrsiOperaciju();
        return sozp.getPrimerak();
    }

    public Object nadjiPrimerke(String isbn) throws ServerskiException {
        SONadjiPrimerke sonp = new SONadjiPrimerke();
        sonp.setISBN(isbn);
        sonp.izvrsiOperaciju();
        return sonp.getPrimerci();
    }

    public boolean izbrisiPrimerak(Primerak primerak) throws ServerskiException {
        SOIzbrisiPrimerak soip = new SOIzbrisiPrimerak();
        soip.setPrimerak(primerak);
        soip.izvrsiOperaciju();
        return soip.isUspesnost();
    }

    public Clan kreirajClana() throws ServerskiException {
        SOKreirajClana sokc = new SOKreirajClana();
        sokc.izvrsiOperaciju();
        return sokc.getClan();
    }

    public boolean zapamtiNovogClana(Clan clan) throws ServerskiException {
        SOZapamtiNovogClana soznc = new SOZapamtiNovogClana();
        soznc.setClan(clan);
        soznc.izvrsiOperaciju();
        return soznc.isUspesno();
    }

    public ArrayList<Clan> nadjiClanove(HashMap<String, String> kriterijum) throws ServerskiException {
        SONadjiClanove sonc = new SONadjiClanove();
        sonc.setKriterijum(kriterijum);
        sonc.izvrsiOperaciju();
        return sonc.getClanovi();
    }

    public Clan nadjiClana(Clan clan) throws ServerskiException {
        SONadjiClana sonc = new SONadjiClana();
        sonc.setClan(clan);
        sonc.izvrsiOperaciju();
        return sonc.getCeoClan();
    }

    public boolean zapamtiClana(Clan clan) throws ServerskiException {
        SOZapamtiClana sozc = new SOZapamtiClana();
        sozc.setClan(clan);
        sozc.izvrsiOperaciju();
        return sozc.isUspesno();
    }

    public ArrayList<Knjiga> ucitajListuKnjiga() throws ServerskiException {
        SOUcitajListuKnjiga soulk = new SOUcitajListuKnjiga();
        soulk.izvrsiOperaciju();
        return soulk.getKnjige();
    }

    public ArrayList<Primerak> ucitajListuPrimeraka() throws ServerskiException {
        SOUcitajListuPrimeraka soulp = new SOUcitajListuPrimeraka();
        soulp.izvrsiOperaciju();
        return soulp.getPrimerci();
    }

    public ArrayList<Clan> ucitajListuClanova() throws ServerskiException {
        SOUcitajListuClanova soulc = new SOUcitajListuClanova();
        soulc.izvrsiOperaciju();
        return soulc.getClanovi();
    }

    public boolean zapamtiIznajmljivanje(Iznajmljivanje i) throws ServerskiException {
        SOZapamtiIznajmljivanje sozi = new SOZapamtiIznajmljivanje();
        sozi.setIznajmljivanje(i);
        sozi.izvrsiOperaciju();
        return sozi.isUspesno();
    }

    public Object nadjiIznajmljenePrimerke(Clan clan) throws ServerskiException {
        SONadjiIznajmljenePrimerke sonip = new SONadjiIznajmljenePrimerke();
        sonip.setClan(clan);
        sonip.izvrsiOperaciju();
        return sonip.getListaPrimeraka();
    }

    public Object vratiPrimerak(Primerak primerak) throws ServerskiException {
        SOVratiPrimerak sovp = new SOVratiPrimerak();
        sovp.setPrimerak(primerak);
        sovp.izvrsiOperaciju();
        return sovp.isUspesno();
    }

    public void izloguj(Administrator administrator) throws ServerskiException {
        SOIzlogujSe sois = new SOIzlogujSe();
        
        sois.setAdministrator(administrator);
        System.out.println("kontroler s admin koris ime je :" + administrator.getKorisnickoIme());
        sois.izvrsiOperaciju();
    }

}
