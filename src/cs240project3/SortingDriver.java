/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs240project3;

/**
 *
 * @author mrfre
 */
///////////////////////////////////////////////////////////////////////////////

//purpose: Demonstrate ability to sort an array recursively through the use of MergeSort and QuickSort
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SortingDriver {  
//---------------------------------------------------------------------------    
   public static void main(String args[]){  
      Scanner kb = new Scanner(System.in);
      Random r = new Random();
      int[] x;
      int[] y;
      int size = 0;      
      do{
          System.out.print("Enter desired array size (Integer): ");
          size = kb.nextInt();
          if(size <= 0){
              System.out.println("Please enter a valid integer value");
          }
      }while(size <= 0);
      x = new int[size];
      for(int i = 0; i < size; i++){  
          x[i] = r.nextInt(size);   
      }
      y = Arrays.copyOf(x, size);
      Quick myQS = new Quick(x);
      MergeSort myMS = new MergeSort(y);

   }
//---------------------------------------------------------------------------   
}
///////////////////////////////////////////////////////////////////////////////