/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author vikramsingh
 */
public class CollectionSort {
    
    public static void main(String[] args) {
        
        Employee[] emp = new Employee[4];
        
        emp[0] = new Employee("CCC", 111);
        emp[1] = new Employee("AAA", 111);
        emp[2] = new Employee("DDD", 444);
        emp[3] = new Employee("BBB", 222);
        
         //Arrays.sort(emp);
         //Arrays.sort(emp, Employee.EmpCodeComparator);
         //Arrays.sort(emp, Employee.NameComparator); 
         Arrays.sort(emp, Employee.ascComparator);         
         System.out.println(Arrays.toString(emp));
         
         Arrays.sort(emp, Employee.dscComparator);         
         System.out.println(Arrays.toString(emp));
        
    }
    
}


class Employee implements Comparable<Employee>
{
    
    String name;
    int emp_code;
    static String type_name = "name";
    static String type_code = "code";
    
    Employee(String name, int emp) {
        this.name = name;
        this.emp_code = emp;
    }
    
    public int getEmpCode() {
        return this.emp_code;
    }

    public String getName() {
        return this.name;
    }    
    
    @Override
    public int compareTo(Employee e) {
        return (this.emp_code - e.getEmpCode());
    }
    
    //@Override
//    public int compateTo(Employee e, String type, String type) 
//    {
//        return 1;
//    }
        
 @Override
    public String toString() {
        return "[name=" + this.name + ", EmpCode=" + this.emp_code + "]";
    }
    
    
    public static Comparator<Employee> EmpCodeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getEmpCode()- e2.getEmpCode());
        }
    };
    
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };    
    
    public static Comparator<Employee> ascComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e2.getEmpCode() - e1.getEmpCode());
        }
    };

    public static Comparator<Employee> dscComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getEmpCode() - e2.getEmpCode());
        }
    };
    
    
}



