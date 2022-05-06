package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// Да се напише програма, която създава масив с 20 елемента от 
		// целочислен тип и инициализира всеки от елементите със стойност 
		// равна на индекса на елемента умножен по 5. 
		//Елементите на масива да се изведат на конзолата.
		int[] array = new int[20];
		for (int i=0; i<array.length; i++) {
			array[i] = i*5;
		}
		System.out.println(Arrays.toString(array));

	}

}
