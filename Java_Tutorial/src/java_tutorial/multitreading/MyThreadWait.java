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
public class MyThreadWait {
    
    public static void main(String[] args) {
     
        A a = new A();
        
        Thread p = new P(a);
        Thread q = new Q(a);
        p.start();
        q.start();
        
        
    }
            
    
}



class A
{
    
    synchronized static public void getData()
    {
        System.out.println("Thread Started");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}


class P extends Thread
{
    A a;
    
    public P(A a)
    {
        this.a = a;
    }
    
    public void run()
    {
        this.a.getData();
    }
}


class Q extends Thread
{
    A a;
    public Q(A a)
    {
        this.a = a;
    }
    
    public void run()
    {
        this.a.getData();
    }
    
}