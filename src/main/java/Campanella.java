
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Campanella {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r1= new MioRunnable();
        
        Thread t1=new Thread(r1,"din");
        Thread t2=new Thread(r1,"don");
        Thread t3= new Thread(r1,"dan");
        Thread t4= new Thread(r1,"dun");
        Thread t5= new Thread(r1,"dun");
        Thread t6= new Thread(r1,"dun");
        t1.start();
        t5.start();
        try {
            t1.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Campanella.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.start();
        t4.start();
        try {
            t2.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Campanella.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t3.start();
        t6.start();
        try {
            t3.sleep(4000);
           
        } catch (InterruptedException ex) {
            Logger.getLogger(Campanella.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
    
}
