/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pomocne;

import domen.Administrator;
import exception.ServerskiException;
import java.util.logging.Level;
import java.util.logging.Logger;
import zastita.HashFunkcija;

/**
 *
 * @author FON
 */
public class KreirajAdministratora {
    public static void main(String[] args) {
        Administrator a = new Administrator("333", "Viktor", "Despic", "des", HashFunkcija.napraviHash("des"), false);
        try {
            kontroler.Kontroler.vratiInstancu().kreirajAdministratora(a);
        } catch (ServerskiException ex) {
            System.out.println("Novi administrator nije kreiran.");
        }
    }
}
