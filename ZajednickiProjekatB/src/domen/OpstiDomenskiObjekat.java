/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public abstract class OpstiDomenskiObjekat implements Serializable {
    
    public abstract String vratiImeTabele();
    public abstract String vratiParametre();  //values u insertu
    public abstract String vratiPK();
    public abstract String vratiVrednostPK();
    public abstract List<OpstiDomenskiObjekat> RSuTabelu(ResultSet rs);
    public abstract String vratiUpdate();
    public abstract void postaviVrednostPK(String pk);

}
