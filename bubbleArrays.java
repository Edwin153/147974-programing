/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author irung
 */
public class bubbleArrays {
    public static void bubbleSort(int[]myArray){
        int n = myArray.length;
        for(int i = 0; i<n-1;i++ ){
            for(int j = 0; j<n -i-1; j++){
                if(myArray[j]>myArray[j+1]){
                    //swap elements
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                     myArray[j+1] = temp;
                    
                }
            }
        }
    }
    public static void main(String[args]){
        int[]myArray = {5,2,8,3,1,6,4};
        bubbleSort(myArray);
        System.out.println("Sorted array: ");
        for(int i:myArray){
            System.out.println(i+ "");
    }
}
