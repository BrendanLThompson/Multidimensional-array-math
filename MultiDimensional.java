//Brendan Thompson
import java.util.Arrays;
import java.util.Random;
public class MultiDimensional
{
   //sum of row
   public static int sumRow (int [][] table, int rowIndex)
   {
   int sum = 0;
         for (int j = 0; j < table[0].length; j++)
         {
         sum += table[rowIndex][j];
         }
   return sum;
   }
   
   //max in row
   public static int maxRow(int [][] table, int rowIndex)
   {
   int largest = table[rowIndex][0];
      for(int j=0; j < table.length; j++)
      {
         if (table[rowIndex][j] > largest)
         {
         largest = table[rowIndex][j];
         }
      }
   return largest;   
   }
   
   //min in row
   public static int minRow(int [][] table, int rowIndex)
   {
   int smallest = table[rowIndex][0];
      for(int j=0; j < table.length; j++)
      {
         if (table[rowIndex][j] < smallest)
         {
         smallest = table[rowIndex][j];
         }
      }
   return smallest;   
   }
   
   //Average
   public static double aveRow(int [][] table, int rowIndex)
   {
   double sum = 0;
         for (int j = 0; j < table[0].length; j++)
         {
         sum += table[rowIndex][j];
         }
   double average = 0;
      if (table.length > 0)
      {
      average = sum / table[0].length;
      }
   return average;   
   }   
   
   //Standard Deviation
   public static double StDevRow(int [][] table, int rowIndex, double average)
   {
   double sum = 0, std;
         for (int j = 0; j < table[0].length; j++)
         {
         sum += Math.pow(table[rowIndex][j] - average, 2);
         } 
         std = ((double) 1)/(table[0].length) * sum;
                 std = Math.sqrt(std);

   return std;      
   }   
   //printing
   public static void main(String []args)
   {
   Random r = new Random(); 
   int minC = 5;
   int maxC = 10;
   int columns = r.nextInt(maxC-minC) + minC;
   
   int minR = 4;
   int maxR = 7;
   int rows = r.nextInt(maxR-minR) + minR;
   
   int [][] table = new int [rows][columns];
   
      for(int i = 0; i < rows; i++)
      {
         for(int j = 0; j < columns; j++) 
         {
         table[i][j] = (r.nextInt(8) + 1);
         System.out.print(table[i][j] + " ");
         }
      System.out.print ("  " + sumRow(table,i) + "    " +maxRow(table,i)+ "   " + minRow(table,i));   
      System.out.printf("  %.2f",aveRow(table,i));
      System.out.printf ("    %.2f", StDevRow(table,i, aveRow(table,i)));
      System.out.println ("   ");
      }  
   }
} 
