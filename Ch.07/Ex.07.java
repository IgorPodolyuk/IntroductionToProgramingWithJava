package Lesson07_masivi_arrays_exercises;

import java.util.Scanner;

public class Ex07 {
	
	// Сортиране на масив означава да подредим елементите му в 
	// нарастващ (намаляващ) ред. Напишете програма, която сортира масив. 
	// Да се използва алгоритъма "Selection sort".
	
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++) {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на елементите на масива (N>0): ");
		int n = 0;
		while (n<1) {
			System.out.print("N = ");
			n = input.nextInt();
		}
		int[] array = new int[n];
		System.out.println("Въведете елементите на масива.");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Масив, елемент No." + (i+1) + " = ");
			array[i] = input.nextInt();
		}
		
	    System.out.println("Вашият масив преди сортирането:");  
	    for(int i:array){  
	        System.out.print(i+" ");  
	    }  
	    System.out.println();  
	          
	    selectionSort(array);//sorting array using selection sort method
	       
	    System.out.println("Вашият масив след сортирането:");  
	    for(int i:array){  
	        System.out.print(i+" ");  
	    }  

	}

}
