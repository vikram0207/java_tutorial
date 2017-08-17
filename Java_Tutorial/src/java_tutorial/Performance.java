/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * 
ArrayList add:  13651943
LinkedList add: 30805015
Vector add: 17375132
Stack add: 8214519
* Stack Wins
* 
ArrayList get:  2690222
LinkedList get: 6495467929
Vector get: 3102220
Stack get: 4775248
* 
* Arraylis Wins
* 
ArrayList remove:  17302062
LinkedList remove: 22043089
Vector remove: 8743477
Stack remove: 7760708
* 

 */
package java_tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

/**
 *
 * @author vikramsingh
 */
public class Performance {

    public static int RECORD_COUNT = 100000;
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Vector vector = new Vector();
        Stack stack = new Stack();
        

        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            linkedList.add(i);
            //linkedList.push(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        // LinkedList add - Push
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            //linkedList.add(i);
            linkedList.push(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add-PUSH: " + duration);
        
        // Vector add
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            vector.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Vector add: " + duration);
        
        // Stack add
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            stack.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Stack add: " + duration);
                
        
        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);

        // Vector get
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            vector.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Vector get: " + duration);

        // Stack get
        startTime = System.nanoTime();

        for (int i = 0; i < Performance.RECORD_COUNT; i++) {
            stack.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Stack get: " + duration);
        
        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = Performance.RECORD_COUNT -1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = Performance.RECORD_COUNT - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = Performance.RECORD_COUNT - 1; i >= 0; i--) {
            linkedList.pop();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove-POP: " + duration);
        
        // Vector remove
        startTime = System.nanoTime();

        for (int i = Performance.RECORD_COUNT - 1; i >= 0; i--) {
            vector.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Vector remove: " + duration);

        Stack stack2 = stack;
        // Stack remove
        startTime = System.nanoTime();

        for (int i = Performance.RECORD_COUNT - 1; i >= 0; i--) {
            stack.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Stack remove: " + duration);

        // Stack remove
        startTime = System.nanoTime();

        for (int i = Performance.RECORD_COUNT - 1; i >= 0; i--) {
            stack2.pop();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Stack remove-POP: " + duration);
        
    }

}
