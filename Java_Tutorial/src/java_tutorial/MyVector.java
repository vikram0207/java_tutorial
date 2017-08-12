/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

import java.util.Vector;

/**
 *
 * @author vikramsingh
 */
public class MyVector {
    
    
    
    public static void main (String[] arg) {
        
        //ArrayList
        Vector al = new Vector();
       al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add("AADD");
      
        System.out.println(al.size());
        System.out.println(al.get(1));
        al.remove(1);
        System.out.println(al);
        al
                .stream()
                .forEach(System.out::println);
                
        
    }
    
}
