/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datastructures;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author irung
 */
public class DataStructures {
    
    
          

    public static void main(String[] args) {
        // Initialize the array
        int[] myArray = {10, 20, 20, 40, 50, 60, 70, 80, 90, 1000};
        //array sort
         Arrays.sort(myArray, Collections.reverseOrder());
         

        // Display all values in the array
        System.out.print("Array values: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println(); // Print a newline

        // Calculate the sum of all array elements
        int sum = 0;
        for (int value : myArray) {
            sum += value;
        }

        // Display the sum
        System.out.println("Sum of array elements: " + sum);
    
    }
    
}
/*
String[]cars = {"volvo","bmw","ford","mazda"};
            for(int i = 0; i<cars.length;i++){
                System.out.println(cars[i]);
            }
*/
/*
String[] copyFrom = { "afganistan","american","italian","copper","zinc","tin","lead",
                "strings","indices","platinum"};
            String[] copyTo = new String[7];
            System.arraycopy(copyFrom, 2,copyTo, 0, 7);
            for(String coffee :copyTo){
                System.out.print(coffee+ "");
            }
    
    int[]myArray = {5,2,8,3,1,6,4,5,75,34,23,0,23,64,243,1999,34,78,123};
        Arrays.parallelSort(myArray);
        
        System.out.println("sorted array: ");
        for(int i:myArray){
            System.out.println(i+ " ");
        }
  
    }
*/
/*
 Scanner scan = new Scanner(System.in);
             int[]ten={10,20,30,40,50,60,70,80,90,100};
             for(int i=0; i>1; i++){
                 System.out.println(ten[i]);
             }
        String[] copyFrom = { "afganistan","american","italian","copper","zinc","tin","lead",
                "strings","indices","platinum"};
         Arrays.sort(copyFrom);
            String[] copyTo = new String[7];
            System.arraycopy(copyFrom, 2,copyTo, 0, 7);
            for(String coffee :copyTo){
                System.out.print(coffee+ "");
            }
         }
*/
   