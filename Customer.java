// Class: Customer
// Purpose: Represents a Customer and its attributes
// Tim Gallagher
// 2019 APCSA Facebook Summit

public class Customer
{  
	// Instance Variables
   private String name;     // Customer's name
   private int height;      // Customer's height (in inches)
   	
   // Constructs a Customer
   public Customer(String n, int h)
   {   
      name = n;
      height = h;
   }

   //Returns the Customer's name
   public String getName()
   {   
      return name;
   }

   // Returns the Customer's height.
   public int getHeight()
   {   
      return height;
   }
  
   // String version of a Customer, padded to 12 characters
   public String toString()
   {
      String output = name + "," + height;
      for (int i=0; i< (12-name.length()); i++)
         output = output + " ";
      return output;
   }

}