/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Sample {
    
    /**
     *
     */
    //public static ArrayList<String> arr = Arrays.asList( "AAA" , "BBB","CCC");
    
  public static List<String> list = Arrays.asList("AA","BB","CC");

  public static String [] stArr = {"AAA","BBB","CCC"};
    
    
  public static List<Person> createPeople() {
    return Arrays.asList(
	    new Person("Sara", Gender.FEMALE, 20),
	    new Person("Sara", Gender.FEMALE, 22),
	    new Person("Bob", Gender.MALE, 20),
	    new Person("Paula", Gender.FEMALE, 32),
	    new Person("Paul", Gender.MALE, 32),
	    new Person("Jack", Gender.MALE, 2),
	    new Person("Jack", Gender.MALE, 72),
	    new Person("Jill", Gender.FEMALE, 12)
	  );
  }
  
  
  
  
	public static void main(String[] args) {
	  List<Person> people = createPeople();

   //get, in uppercase, the names of all female older than 18
   List<String> names = new ArrayList<>();
   for(Person person : people) {
     if(person.getGender() == Gender.FEMALE && person.getAge() > 18) {
       names.add(person.getName().toUpperCase());
     }
   }
   
   System.out.println(names);
   
   System.out.println(
          people.stream()
           .filter( person -> person.getGender().toString().equalsIgnoreCase(Gender.MALE.toString()))
           .map( person -> person.getName().toLowerCase())
           .collect(toList())
   );
   
   //The above mixes what with how - sequential, one element at a time. Details all thrown together.
   //imperative in nature - mutability and low level details
   //We are focused on each element
   
   //Let's use Streams instead
   System.out.println(
    people.stream()
          .filter(per -> per.getGender() == Gender.MALE)
          .filter(per -> per.getAge() < 18)
          .map(per -> per.getName().toLowerCase())
          .collect(toList()));
          
    //we said what, not how, may be sequential, lazy, parallel, etc.
    //functional and declarative in nature - no explicit mutation and higher level of abstraction
    //focus on the whole collection instead of fiddling with iteration and each element.
   
    System.out.println(Sample.list
            .stream()
            //.forEach(System.out::print)
            .map( i -> i.toLowerCase())
            .collect(Collectors.joining(", "))
    );
//    
    
//     List<String> numbers = Arrays.asList("AA", "DD","EE", "CC");
//    String commaSeparatedNumbers = numbers.stream()
//     //.map(i -> i.toString())
//     .collect(Collectors.joining(", "));
//    
//        System.out.println(commaSeparatedNumbers);
//    
   	}
        
}
