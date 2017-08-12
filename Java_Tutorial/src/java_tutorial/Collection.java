/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

import java.util.ArrayList;

/**
 *
 * @author vikramsingh
 */
public class Collection {
    
    
    
    public static void main (String[] arg) {
        
        //ArrayList
      ArrayList al = new ArrayList();
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
        
//
//        ArrayList a2 = new ArrayList();
//        a2.add(1,"AAA");
//        a2.add(2,"AAB");
//        a2.add(3,"AAC");
//        a2.add(4,"AAD");
//        a2.add(5,"AAE");
//        a2.add(6,"AAF");
//        a2.add(7,"AAG");
//        
//       //a2.stream().forEach(System.out::println);
//        for(Object obj: al) {
//            System.out.println(obj);
//        }

         ArrayList<Integer> arrlist = new ArrayList<>(5);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(2,25);
        
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }  
        System.out.println(arrlist.get(2));


         ArrayList<String> arrlist2 = new ArrayList<>(5);

        // use add() method to add elements in the list
        arrlist2.add("AA");
        arrlist2.add("BB");
        arrlist2.add("CC");
        arrlist2.add("DD");
        arrlist2.add(2,"EE");
        
        for (String s : arrlist2) {
            System.out.println("Number = " + s);
        }  
        System.out.println(arrlist2.get(2));
                
        
    }
    
}
