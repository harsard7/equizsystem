
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranjith-suranga
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("t1 Thread");
                }
            }
        });

        t1.start();

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("main thread");
        }
    }

}
