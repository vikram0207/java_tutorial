/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

/**
 *
 * @author vikramsingh
 */
class Test<T> {
    
    String test;
    
   public static void main(String... arg) {
       //String test;
      // new NewTest().getData("AAAA");
      // this.test = "AAAA";
   }
   
   private void localfunc()
   {
       NewTest a = new NewTest();
       a.getData("aaaaa");
   }
    
    
}



class NewTest extends A<String> {
    
    
    public void getData (String arg) throws ArithmeticException
    {
        
        System.out.println(arg);
    }    
    
}


class A<T> {
    
    
    public void getData(T arg)
    {
        System.out.println(arg);
    }
    
    
    
}