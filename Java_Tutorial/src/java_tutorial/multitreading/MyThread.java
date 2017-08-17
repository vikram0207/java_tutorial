/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial.multitreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vikramsingh
 */
public class MyThread {
    
    static int counter = 0;
    
    public static void main(String[] args) throws InterruptedException {
        
        NewThread t = new NewThread();
        NewThread t2 = new NewThread();
        Thread th = new Thread(t);
        th.setName("MyThread");
        System.out.println(th.getName() + " : " + th.getId());
        th.start();
        th.join();

        //new Thread(t).start();
        new Thread(t2).start();
        
        System.out.println("-------------------");
        
        //new Thread(new NewThread()).start();
        //new Thread(new NewThread()).start();
        
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                MyThread.counter++;
            }
        }).start();
        while (MyThread.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached!");
        
        
    }

    
    
}


class NewThread implements Runnable
{

    public void run() {
        for (int i = 0; i < 10; i++) {
                System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

class NewThread2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
                System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
}