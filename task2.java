/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

import java.util.Arrays;

/**
 *
 * @author irung
 */
public class task2 {
     public static void main(String[]args){
        // Initialize the array
        int[] myArray = {10, 20, 20, 40, 50, 60, 70, 80, 90, 100};
        //array sort
         Arrays.sort(myArray);

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
