package zastita;

import db.DBBroker;
import domen.Administrator;
import exception.ServerskiException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTest {

    public static void main(String[] args) {
        String upit = "0123456";
   if(upit.substring(upit.length() - 4, upit.length()).equals("AND ")) System.out.println("da");
       //upit = upit.substring(0, upit.length() - 4);
        System.out.println(upit.substring(upit.length() - 4, upit.length()));       
        
}
}

//viktor : 86faeb3e05561b856666236e198c27e698275e82
//vik :    9f18dd541d5584cda47442d085f1ac5ded16b925
//viktor   86faeb3e05561b856666236e198c27e698275e82