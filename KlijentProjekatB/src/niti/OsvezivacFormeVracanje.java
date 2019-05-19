/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import forme.EkranskaFormaVracanje;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FON
 */
public class OsvezivacFormeVracanje extends Thread{

    private EkranskaFormaVracanje efv;
    private boolean stop = false;
    
    @Override
    public void run() {
        while(!stop){
            try {
                efv.osveziClanove();
                sleep(1000);
            } catch (Exception ex) {
                Logger.getLogger(OsvezivacFormeVracanje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public EkranskaFormaVracanje getEfv() {
        return efv;
    }

    public void setEfv(EkranskaFormaVracanje efv) {
        this.efv = efv;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    
    
    
}
