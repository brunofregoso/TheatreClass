// Class: Theater
// Purpose: Uses a two-dimensional array to represent 
// the seating arrangement of customers in a theater. The seats in the theater 
// are in a rectangular arrangement of rows and columns.
// Tim Gallagher
// 2019 APCS A Facebook Summit

import java.util.*;

public class Theater 
{
   private Customer[][] seats;

/* *  Creates a Theater seating chart with the given number of rows and columns 
   *  from the Customers in customerList. Empty seats are represented by null.
   *  @param rows the number of rows of seats in the theater
   *  @param cols the number of columns of seats in the theater
   *  @param customerList The customers to be given seats in the theater
   *  @param rand indicator if customers should be given random seats
   *  Precondition: rows > 0; cols > 0;
   *             rows * cols >= customerList.size()
   *  Postcondition:
   *    - Customers appear in the seats in the same order as they appear in
   *      customerList, starting at seats[0][0], and seats is filled row by row from
   *      customerList, followed by any empty seats (represented by null).
   *        OR
   *      Customers are placed in the seats in random order, with empty seats null
   *    - customerList is unchanged.
*/	
   public Theater(int rows, int cols, ArrayList<Customer> customerList, boolean rand) 
   {
    	// Construct the seats 2D array
      seats = new Customer[rows][cols];
    	
      if (rand)  // fill the 2D array with Customers from the customerList into random seats
      {
         int index = 0;
         while(index < customerList.size())
         {
            int r = (int)(Math.random()*rows);
            int c = (int)(Math.random()*cols);
            while (seats[r][c] != null)
            {
               r = (int)(Math.random()*rows);
               c = (int)(Math.random()*cols);
            }
            seats[r][c] = customerList.get(index);
            index++;
         }
      }
      else // fill the 2D array with Customers from the customerList in row-major order
      {
         int index = 0;
         for (int r = 0; r < rows; r++)
         {
            for (int c = 0; c < cols; c++)
            {
               if (index < customerList.size())
               {
                  seats[r][c] = customerList.get(index);
                  index++;
               }
            }
         }
      }
   }

/* This method should return true if the seat is occupied, false otherwise.
 */ 
   public boolean isSeatOccupied(int row, int col)
   {
      if (seats[row][col] != null){
        return true;
      }
      else{
        return false;  
      }
   }

   /* This method should return the tallest customer in the theater
    */
   public Customer getTallestCustomer()
   {
     int max = 0; 
     for(int i = 1; i < customerList.size(); i++){
      if(customerList.get(i).getHeight > customerList.get(i-1).getHeight){
        max = customerList.get(i);
      }
     } 
     return customerList.get(Max); 
   }

   /* This method should return the row number with the greatest number of occupied seats
    */
   public int findMostOccupiedRow()
   {
      int maxrow = 0;
      int max = 0; 
      int temp = 0; 
      for(int row = 0; row < Seats[r].length; row++){
        for(int column = 0; coluumn < Seats[c].length; column++){
          if(Seats[r][c] != null){
            temp++;
          }
        }
        if(temp > max){
          max = temp;
          maxrow = row;
        }
        else{
          continue;
        }
      }
      return maxrow;

   }

/* This method should return a list of Customers who need to have their seats moved
 * because there is someone more than 3 inches taller than them sitting directly
 * in front of them (one row closer, but in the same seat).
 * This method does not actually change any seats, but constructs and returns a NEW 
 * arrayList filled with customers who have someone sitting in front of them that 
 * is more than 3 inches taller than they are.
 */
   public ArrayList<Customer> getCustomersToBeMoved()
   {
     int index = 0;
      ArrayList<Customers> arr = new ArrayList<Customers>();
      for(int row = 0; row < Seats[r].length; row++){
        for(int column = 0; coluumn < Seats[c].length; column++){
          if(Seats[r][c].getHeight - Seats[r+1][c].getHeight <= -3){
            arr[index] = Seats[r][c];


          }
        }
      }
   }
          
/* This method returns a String that can be used to print out the contents 
 * of the seats in the theater
 */
   public String toString()
   {
      String output="";
   	
      for (int r = 0; r < seats.length; r++)
      {
         output = output + "[" + r +"] ";
         for (int c = 0; c < seats[r].length; c++)
         {
            if (seats[r][c] == null)
               output = output + "<empty>        ";
            else
               output = output + seats[r][c];
         }
         output = output + "\n";
      }
      return output;
   }    
      
}