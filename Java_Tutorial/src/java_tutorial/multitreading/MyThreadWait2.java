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
public class MyThreadWait2 {

    public static void main(String[] args) {

        B b = new B();
        Thread s = new S(b);
        Thread t = new T(b);
        s.run();
        t.run();

    }

}

class B {

    int i;

//    synchronized public void setData(int i) {
//        this.i = i;
//    }
//
////    synchronized static public void getData()
//    synchronized public int getData() {
//        return this.i;
//    }
    Boolean flag = false;
    synchronized public void setData(int i) {
        this.i = i;
        if(flag) {
        System.out.println("SET set flag data" + flag);
            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        notify();
        System.out.println("Set Data :" + i);
        flag = false;        
        System.out.println("Set: Setting flag " + flag);
        
    }

//    synchronized static public void getData()
    synchronized public void getData() {
        System.out.println("Get: Flag status : " + flag);
        if(!flag) {
            System.out.println("Get: Going into wait state");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Get: Processing");
        notify();
        flag = false;
        System.out.println("Get Data: " + this.i);
        
        //return this.i;
    }

    

}

class S extends Thread {

    B b;

    public S(B b) {
        this.b = b;
    }

    public void run() {
        //this.a.getData();
        for (int i = 0; i < 10; i++) {
            try {
                //System.out.println("Data SET :" + i);
                this.b.setData(i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(S.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

class T extends Thread {

    B b;

    public T(B b) {
        this.b = b;
    }

    public void run() {
       // for (int i = 0; i < 10; i++) {

            try {
                this.b.getData();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(S.class.getName()).log(Level.SEVERE, null, ex);
            }
        //}
    }

}
