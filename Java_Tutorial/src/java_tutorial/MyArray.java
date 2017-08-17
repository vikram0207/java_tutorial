/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
1) Write own class for .asList() method, make it unmodifiable

 */
package java_tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import static java_tutorial.Sample.list;

/**
 *
 * @author vikramsingh
 */
public class MyArray {
    
    
    public static void main(String[] args) {

        NewArray<Integer> ns = new NewArray<>();
//        ns.add(1);
//        ns.add(2);
//        ns.add(3);
        ns.set(0, 1);
        ns.set(1,2);
        ns.set(2,3);
        
        //System.out.println(ns.v.length);
        System.out.println(ns.asList());        
        
        NewArray2<Integer> ns2 = new NewArray2<>();
        ns2.add(1);
        ns2.add(2);
        ns2.add(3);
        
        //System.out.println(ns.v.length);
        System.out.println(ns.asList());        
        
        System.out.println("=====================================");
        
        //MyLinkedList
        MyLinkedList<Integer> ml = new MyLinkedList<>();
        ml.push(1);
        ml.push(2);
        ml.push(3);
        ml.push(4);
        ml.push(5);
        ml.push(6);
       
        ml.pop();
        ml.pop();        
        ml.addFirst(11);
        ml.addLast(33);
        ml.addMiddle(22);
        
        System.out.println(ml.asList());
        ml.pop();
        System.out.println(ml.asList());
        ml.push(12);
        ml.push(55);        
        System.out.println(ml.asList());        
    }
    
}




class NewArray<T> {
    
    int threashold = 10;
    //T[] v = new T[this.threashold];
    T[] v = (T[])new Object[this.threashold];

    Integer counter = 0;
    
    public void set(int i , T val) {
        this.v[i] = val;
    }

    
    public void add(T val) {
        //System.out.println(this.counter + " : " + this.v.length);
        if(this.counter >= this.v.length) {
            this.v = Arrays.copyOf(this.v, this.v.length + this.threashold);
        }
        this.v[this.counter] = val;
        this.counter++;    
    }
    
    public T get(int i){
        return this.v[i];
    }
    
    public List asList() {
       ArrayList al = new ArrayList();
       
       for(T val: this.v) {
           al.add(val);
       }
       
//       for(Number n: v) {
//           al.add(n);
//       }
       return al;
    }    
}


class NewArray2<Int> {
    
    int threashold = 2;
    int[] v = new int[this.threashold];
    Integer counter = 0;
    
    
    public void add(int val) {
        if(this.counter <= this.v.length + 2) {
            this.v = Arrays.copyOf(this.v, this.v.length + this.threashold);
        }
        this.v[this.counter] = val;
        this.counter++;
        
    }
    
    
    public List asList() {
       ArrayList al = new ArrayList();
       
       for(Number n: v) {
           al.add(n);
       }
       return al;
    }    
    
    
}    



class MyLinkedList<T> {
    
    int threashold = 20;
    //T[] v = new T[this.threashold];
    T[] v = (T[]) new Object[this.threashold];

    Integer counter = 0;
    
    
    public void push(T val) {
        System.out.println(this.counter + " : " + this.v.length);
        if(this.counter >= this.v.length) {
            this.v = Arrays.copyOf(this.v, this.v.length + this.threashold);
        } else {
            this.v = Arrays.copyOf(this.v, this.v.length);
        }
        this.v[this.counter] = val;
        this.counter++;    
    }
    
    public void pop()
    {
        this.v[this.counter -1] = null;
        this.counter--;
    }

    public void addFirst(T val) {
       //T[] temp = (T) new T[this.v.length] ;
        //T[] temp = (T[])new Object[this.v.length + this.threashold];
        T[] temp = (T[])new Object[this.v.length];
       
       temp[0] = val;
        for (int i = 1; i < this.v.length; i++) {
            //System.out.println(i + ":" + this.v[1] + ":"+this.v[i]);
            temp[i] = this.v[i];
        }
        this.v = Arrays.copyOf(temp, this.v.length);
    }
    

    public void addLast(T val) {
        //this.v = Arrays.copyOf(temp, this.v.length + this.threashold);
        this.v[this.v.length - 1] = val;
        this.counter = this.v.length;
        
    }
    
    
    public void addMiddle(T val) {
       int a = (int) (this.v.length / 2);
//        System.out.println(this.v.length);
//        System.out.println(a);
//        System.out.println("=======");
        T[] temp = (T[])new Object[this.v.length];
        
       //T[] temp = null ;
       //temp[0] = val;
        for (int i = 0; i < this.v.length; i++) {
            if(i > a) {
                //if(this.v[i+1] != null) {
                    temp[i] = (T) this.v[i];
                //}
            } else if(i == a) {
                temp[i] = val;
            } else {
                //System.out.println(i + "*:*" +  this.v[i].toString() + ":" + a);
                //System.out.println(i + "*:*" +  this.v[1].toString() + ":" + a);
                temp[i] = this.v[i];
            }
            
        }
        this.v = Arrays.copyOf(temp, this.v.length);
    }
    
    public T get(int i){
        return this.v[i];
    }
    
    public List asList() {
       ArrayList al = new ArrayList();
       
       for(T val: this.v) {
           al.add(val);
       }

       return al;
    }    
}