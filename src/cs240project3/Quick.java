/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs240project3;

import java.util.Arrays;

/**
 *
 * @author mrfre
 */
//---------------------------------------------------------------------------
public class Quick {
   private static int[] myArray;
   private static int length;
   int pivot;
//---------------------------------------------------------------------------   
   public Quick(int[] input){
      this.myArray = input;                                 //constructor that initialzied my global array from the driver along with some variables
      this.length = input.length;                           //Makes quickSort call, prints original array, then sorted array
      System.out.println("QuickSort:");
      System.out.println("Original Array: ");
      System.out.println(Arrays.toString(myArray)); 
      int low = 0;
      int high = myArray.length - 1;
      quicksort(low, high);
      System.out.println("Sorted Array: ");
      System.out.println(Arrays.toString(myArray));   
      System.out.println();
   }   
//---------------------------------------------------------------------------
    private void quicksort(int low, int high) {          
        if(low < high){
            pivot = partition(low, high);                   //quicksort implementation using last index in array as pivot value
            quicksort(low, pivot-1);
            quicksort(pivot+1, high);         
        }
    }
//---------------------------------------------------------------------------
    
    private int partition(int low, int high) {
        pivot = myArray[high];
        int i = low-1;                                      //start index i at a value one less than it
        for(int j = low; j <= high-1; j++){                 
            if(myArray[j] <= pivot){
                i++;
                swap(i,j);                                  //if value at j is less than pivot value, increment i by one, then swap values at i and j
            }
        }
        swap(i+1, high);                                    //swap value at i+1 and last value in array
        return i+1;                                         //return i+!
    }    
//---------------------------------------------------------------------------   
   private void swap(int i, int j){
      int tempVal = myArray[i];                                     //performs a swap when it is called from partition method
      myArray[i] = myArray[j];
      myArray[j] = tempVal;      
   }
//--------------------------------------------------------------------------- 
}