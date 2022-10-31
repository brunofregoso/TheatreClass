// Class: TheaterRunner
// Purpose: This program tests the Theater class by making an ArrayList of 
// Customers, making a Theater object, calling the methods & 
// printing the results.
//
// Tim Gallagher
// 2019 APCS A Facebook Summit

import java.util.*;
public class TheaterRunner {

    public static void main(String[] args)
    {
    	ArrayList<Customer> customerList1 = new ArrayList<Customer>();
    	
    	customerList1.add(new Customer("Brandon",74));
    	customerList1.add(new Customer("Matt",65));
    	customerList1.add(new Customer("Noelle",62));
    	customerList1.add(new Customer("Kaleigh",70));
    	customerList1.add(new Customer("Steven",76));
    	customerList1.add(new Customer("Angel",60));
    	customerList1.add(new Customer("Lauren",68));
    	customerList1.add(new Customer("Michael",64));
    	customerList1.add(new Customer("Robin",63));
    	customerList1.add(new Customer("Bryan",60));
    	customerList1.add(new Customer("Kyle",72));
    	customerList1.add(new Customer("Danny",62));
    	customerList1.add(new Customer("Rachel",64));
    	customerList1.add(new Customer("David",68));
    	customerList1.add(new Customer("Sydney",59));
    	customerList1.add(new Customer("Katie",70));
    	customerList1.add(new Customer("Kylie",54));
    	customerList1.add(new Customer("Robert",78));
    	
    	Theater theater1= new Theater(5,4,customerList1,false);
    	
    	System.out.println("Theater #1:");
    	System.out.println(theater1);
    	System.out.println("People to be moved:");
    	for(Customer c : theater1.getCustomersToBeMoved())
    		System.out.print(c);
    	System.out.println();
    	System.out.println();
    	System.out.println("Tallest customer: " + theater1.getTallestCustomer());
    	System.out.println();
    	System.out.println();
    	
    	ArrayList<Customer> customerList2 = new ArrayList<Customer>();
    	
    	customerList2.add(new Customer("Antoine",72));
     	customerList2.add(new Customer("Jacob",68));
    	customerList2.add(new Customer("Jack",77));
    	customerList2.add(new Customer("Peter",70));
    	customerList2.add(new Customer("Hannah",70));
    	customerList2.add(new Customer("Jenny",64));
    	customerList2.add(new Customer("Michele",66));
    	customerList2.add(new Customer("Ricky",70));
    	customerList2.add(new Customer("Niko",70));
    	customerList2.add(new Customer("Chris",67));
    	customerList2.add(new Customer("Holly",68));
    	customerList2.add(new Customer("LaQuane",77));
    	customerList2.add(new Customer("Drew",78));
    	customerList2.add(new Customer("Matt",71));
    	customerList2.add(new Customer("Samuel",65));
    	customerList2.add(new Customer("Deja",66));
    	customerList2.add(new Customer("Will",74));
    	customerList2.add(new Customer("Edward",70));
    	customerList2.add(new Customer("Nick",72));
    	customerList2.add(new Customer("Jamus",66));

    	Theater theater2= new Theater(7,6,customerList2,true);
    	
    	System.out.println("Theater #2:");
    	System.out.println(theater2);
    	System.out.println("Most Occupied Row:" + theater2.findMostOccupiedRow());
      System.out.println();
    	System.out.println("People to be moved:");
    	for(Customer c : theater2.getCustomersToBeMoved())
    		System.out.print(c);
    	System.out.println();
    	System.out.println();
    	System.out.println("Tallest customer: " + theater2.getTallestCustomer());
    	System.out.println();
    }
    
    
}