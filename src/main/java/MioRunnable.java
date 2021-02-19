/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class MioRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("suono: " + Thread.currentThread());
        
    }
    
}
