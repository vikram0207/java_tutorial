/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author vikramsingh
 */
public class MyStack {
    
    
    
    public static void main (String[] arg) {
        
        //ArrayList
      Stack al = new Stack();
       al.push("C");
      al.push("A");
      al.push("E");
      al.push("B");
      al.push("D");
      al.push("F");
      al.push("AADD");
      
      al.pop();
      al.pop();
      al.pop();     
       // System.out.println(al.size());
        //System.out.println(al.get(1));
        //al.remove(1);
        System.out.println(al.peek());
        al
                .stream()
                .forEach(System.out::println);
        
        
    }
    
}
