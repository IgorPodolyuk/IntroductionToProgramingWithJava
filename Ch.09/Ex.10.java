package Lesson_09_Methods_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_MultiplyTwoPolynomial {
	//Напишете метод, който умножава два многочлена.
	
	public static String[] tranformCharsToStrings(char[] polynomial) {
		String[] stringA = new String[polynomial.length];
		String tempS = "";
		int j = 0;
		for (int i = 0; i < polynomial.length;  i++) {
			switch (polynomial[i]) {
			case '-': 
				if (tempS == "" ) {
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				} else {
					stringA[j] = tempS;
					tempS = "";
					j++;
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				}; break;
			case '+': 
				if (tempS == "" ) {
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				} else {
					stringA[j] = tempS;
					tempS = "";
					j++;
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				}; break;
			case '^': 
				if (tempS == "" ) {
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				} else {
					stringA[j] = tempS;
					tempS = "";
					j++;
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				} break; 
			case 'x': 
				if (tempS == "" ) {
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				} else {
					stringA[j] = tempS;
					tempS = "";
					j++;
					stringA[j] = Character.toString(polynomial[i]);
					j++;
				} break;
			default: if (i == polynomial.length-1) {
				stringA[j] = tempS + Character.toString(polynomial[i]);
			} else {
				tempS += Character.toString(polynomial[i]);
			}
			}
		}
//		System.out.println(Arrays.toString(stringA));
		return stringA;
		
	}
	
	public static boolean checkIfPolynomial(char[] arrayChar) {
		boolean ifPolynomial = true;
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] != '0' && arrayChar[i] != '1' && arrayChar[i] != '2' && arrayChar[i] != '3' && 
				arrayChar[i] != '4' && arrayChar[i] != '5' && arrayChar[i] != '6' && arrayChar[i] != '7' && 
				arrayChar[i] != '8' && arrayChar[i] != '9' && arrayChar[i] != '+' && arrayChar[i] != '-' &&
				arrayChar[i] != '^' && arrayChar[i] != 'x') {
				ifPolynomial = false;
				break;
			}
		}
		return ifPolynomial;
	}

	public static int countHowManyX(String[] polyString) {
		int counter = 0;
		for (int i = 0; i < polyString.length; i++) {
			if (polyString[i].equals("x")) {
				counter++;
			}
		}
		return counter;
	}
	
	public static String[] mergeSignWithNumber(String[] polyString) {
		String[] mergedNumbersPoly = new String[polyString.length];
		int initial = 0;
		if (polyString[initial].equals("+")) {
			if (polyString[initial+1].equals("x")) {
				mergedNumbersPoly[0] = "+1";
				initial = 2;
			} else {
				mergedNumbersPoly[0] = polyString[1];
				initial = 2;
			}
		} else if (polyString[initial].equals("-")) {
			if (polyString[initial+1].equals("x")) {
				mergedNumbersPoly[0] = "-1";
				initial = 2;
			} else {
				mergedNumbersPoly[0] = "-" + polyString[1];
				initial = 2;
			}
		} else if (polyString[initial].equals("x")) {
			mergedNumbersPoly[0] = "1";
			initial = 1;
		} else {	
			mergedNumbersPoly[0] = polyString[0];
			initial = 1;
		}
		
		int j = 1;
		String tempS = "";
		for (int i = initial; i < polyString.length; i++) {
			if (polyString[i].equals("^")) {
				i++;
				continue;
			} else {
				if (polyString[i].equals("+") || polyString[i].equals("-")) {
					if (polyString[i+1].equals("x")) {
						tempS = polyString[i] + "1";
					} else {
						tempS = polyString[i] + polyString[i+1];
					}
					mergedNumbersPoly[j] = tempS;
					j++;
				}
				continue;
			}
		}
		//Remove excessive "null
		mergedNumbersPoly = Arrays.stream(mergedNumbersPoly)
		                   .filter(s -> (s != null && s.length() > 0))
		                   .toArray(String[]::new);
		return mergedNumbersPoly;
	}
	
	public static String[] mergeSignWithDegree(String[] polyString) {
		String[] mergedDegreePoly = new String[polyString.length];
		int j = 0;
		String tempS = "";
		for (int i = 0; i < polyString.length; i++) {
			if (polyString[i].equals("x") && i < polyString.length-1) {
				if (polyString[i+1].equals("^")) {
					if (polyString[i+2].equals("+")) {
						tempS = polyString[i+3];
					} else if (polyString[i+2].equals("-")) {
						tempS = "-" + polyString[i+3];
					} else {
						tempS = polyString[i+2];
					}
					mergedDegreePoly[j] = tempS;
					j++;
				} else {
					mergedDegreePoly[j] = "1";
					j++;
				}
			} else if (polyString[i].equals("x") && i == polyString.length-1) {
				mergedDegreePoly[j] = "1";
			}

		}
		//Remove excessive "null
		mergedDegreePoly = Arrays.stream(mergedDegreePoly)
		                  .filter(s -> (s != null && s.length() > 0))
		                  .toArray(String[]::new);		
		return mergedDegreePoly;
	}
	
	public static int[] convertStringArrayToIntArray(String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
	public static int[] multiplyArrays(int[] array1, int[] array2) {
		int[] resultNumbers = new int[array1.length * array2.length];
		int resultNumbersIndex = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				resultNumbers[resultNumbersIndex] = array1[i] * array2[j];
				resultNumbersIndex++;
			}
		}
		return resultNumbers;
	}
	
	public static int[] summarizeArrays(int[] array1, int[] array2) {
		int[] resultDegrees = new int[array1.length * array2.length];
		int resultDegreesIndex = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				resultDegrees[resultDegreesIndex] = array1[i] + array2[j];
				resultDegreesIndex++;
			}
		}
		return resultDegrees;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Only numbers 0 to 9 and symbols (+,-,^,x) are allowed.");
		System.out.println("Example: 3x^4+5x^2+x+2");
		
		System.out.print("Insert your first polynomial: ");
		char[] firstPoly = input.next().toCharArray();
		String[] firstPolyString = new String[100];
		//Check if firstPoly is a correct polynomial
		boolean ifPolinomial1 = checkIfPolynomial(firstPoly);
		if (ifPolinomial1 == false) {
			System.out.println("You did not input a correct polynomial.");
		} else {
			firstPolyString = tranformCharsToStrings(firstPoly);
		}
		//Remove excessive "null
		firstPolyString = Arrays.stream(firstPolyString)
                 .filter(s -> (s != null && s.length() > 0))
                 .toArray(String[]::new);
//		System.out.println(Arrays.toString(firstPolyString));
		//merge sign with number
		String[] mergedNumbersPoly1 = mergeSignWithNumber(firstPolyString);
		//merge sign with degree
		String[] mergedDegreesPoly1 = mergeSignWithDegree(firstPolyString);
		//convert String[] to int[]
		int[] numbersIntPoly1 = convertStringArrayToIntArray(mergedNumbersPoly1);
//		System.out.println(Arrays.toString(numbersIntPoly1));
		int[] degreesIntPoly1 = convertStringArrayToIntArray(mergedDegreesPoly1);
//		System.out.println(Arrays.toString(degreesIntPoly1));
		//Add "0" in the last index if degreesIntPoly1.length < numbersIntPoly1.length
		int[] zeroIntArray1 = new int[numbersIntPoly1.length];
		for (int i = 0; i < zeroIntArray1.length; i++) {
			zeroIntArray1[i] = 0;
		}
		//transfer degreesIntPoly1 to zeroIntArray1
		int[] finalDegreePoly1 = new int[zeroIntArray1.length];
		for (int i = 0; i < finalDegreePoly1.length; i++) {
			if (i < degreesIntPoly1.length) {
				finalDegreePoly1[i] = degreesIntPoly1[i];
			} else {
				finalDegreePoly1[i] = zeroIntArray1[i];
			}
		}
//		System.out.println(Arrays.toString(finalDegreePoly1));

		
		char[] secondPoly = new char[100];
		String[] secondPolyString = new String[100];
		boolean ifPolinomial2 = false;
		if (ifPolinomial1 == true) {
			System.out.print("Insert your second polynomial: ");
			secondPoly = input.next().toCharArray();
			//Check if secondPoly is a correct polynomial
			ifPolinomial2 = checkIfPolynomial(secondPoly);
			if (ifPolinomial2 == false) {
				System.out.println("You did not input a correct polynomial.");
			} else {
				secondPolyString = tranformCharsToStrings(secondPoly);
			}
		}
		//Remove excessive "null
		secondPolyString = Arrays.stream(secondPolyString)
		                 .filter(s -> (s != null && s.length() > 0))
		                 .toArray(String[]::new);
		//merge sign with number
		String[] mergedNumbersPoly2 = mergeSignWithNumber(secondPolyString);
		//merge sign with degree
		String[] mergedDegreesPoly2 = mergeSignWithDegree(secondPolyString);
		//convert String[] to int[]
		int[] numbersIntPoly2 = convertStringArrayToIntArray(mergedNumbersPoly2);
//		System.out.println(Arrays.toString(numbersIntPoly2));
		int[] degreesIntPoly2 = convertStringArrayToIntArray(mergedDegreesPoly2);
//		System.out.println(Arrays.toString(degreesIntPoly2));
		//Add "0" in the last index if degreesIntPoly2.length < numbersIntPoly2.length
		int[] zeroIntArray2 = new int[numbersIntPoly2.length];
		for (int i = 0; i < zeroIntArray2.length; i++) {
			zeroIntArray2[i] = 0;
		}
		//transfer degreesIntPoly2 to zeroIntArray2
		int[] finalDegreePoly2 = new int[zeroIntArray2.length];
		for (int i = 0; i < finalDegreePoly2.length; i++) {
			if (i < degreesIntPoly2.length) {
				finalDegreePoly2[i] = degreesIntPoly2[i];
			} else {
				finalDegreePoly2[i] = zeroIntArray2[i];
			}
		}
//		System.out.println(Arrays.toString(finalDegreePoly2));
		
		System.out.println();
		
		//multiply numbers
		int[] resultNumbers = multiplyArrays(numbersIntPoly1, numbersIntPoly2);
//		System.out.println("Numbers" + Arrays.toString(resultNumbers));
		
		//summarize degrees
		int[] resultDegrees = summarizeArrays(finalDegreePoly1, finalDegreePoly2);
//		System.out.println("Degrees" + Arrays.toString(resultDegrees));
		
		// Summarize degrees and numbers
		int[] finalN = new int[resultNumbers.length];
		int[] finalD = new int[resultDegrees.length];
		int tempN = 0;
		int tempD = 0;
		for (int i = 0; i < resultDegrees.length; i++) {
			tempN = resultNumbers[i];
			tempD = resultDegrees[i];
			for (int j = i + 1; j < resultDegrees.length; j++) {
				if (resultDegrees[i] == resultDegrees[j]) {
					tempN += resultNumbers[j];
					resultNumbers[j] = 0;
				}
			}
			finalN[i] = tempN;
			finalD[i] = tempD;
		}
//		System.out.println("num: " + Arrays.toString(finalN));
//		System.out.println("deg: " + Arrays.toString(finalD));
		
		// remove degrees if number == "0"
		int[] readyD = new int[finalD.length];
		for (int i = 0; i < finalD.length; i++) {
			if (finalN[i] == 0) {
				readyD[i] = 0;
			} else {
				readyD[i] = finalD[i];
			}
		}
//		System.out.println("deg: " + Arrays.toString(readyD));

		// sorting degrees and corresponding numbers (high > small)
		int tempNum = 0;
		int tempDeg = 0;
		for (int i = 0; i < finalD.length; i++) {
			tempDeg = readyD[i];
			tempNum = finalN[i];
			for (int j = i + 1; j < finalD.length; j++) {
				if (tempDeg > readyD[j]) {
					tempDeg = readyD[i];
					tempNum = finalN[i];
				} else {
					readyD[i] = readyD[j];
					readyD[j] = tempDeg;
					finalN[i] = finalN[j];
					finalN[j] = tempNum;
					tempDeg = readyD[i];
					tempNum = finalN[i];
				}
			}
		}
//		System.out.println("Snum: " + Arrays.toString(finalN));
//		System.out.println("Sdeg: " + Arrays.toString(readyD));

		// remove excessive "0" of numbers and degrees
		int newLength = 0;
		for (int i = 0; i < finalN.length; i++) {
			if (finalN[i] != 0) {
				newLength++;
			}
		}
		int[] numbers = new int[newLength];
		int[] degrees = new int[newLength];
		for (int i = 0, j = 0; i < finalN.length; i++) {
			if(finalN[i] != 0) {
				numbers[j] = finalN[i];
				j++;
			} 
		}
		for (int i = 0, j = 0; i < readyD.length; i++) {
			if(finalN[i] != 0) {
				degrees[j] = readyD[i];
				j++;
			} 
		}
//		System.out.println("numbers: " + Arrays.toString(numbers));
//		System.out.println("degrees: " + Arrays.toString(degrees));
		
		//Print both polynomials
		System.out.println("(" + String.valueOf(firstPoly) + ") * (" + String.valueOf(secondPoly) + ") = ");
		// print the result ( "number" "x" "^" "degree" )
		for (int i = 0; i < degrees.length; i++) {
			switch (numbers[i]) {
			case 1:
				if (degrees[i] == 0 && numbers[i] == 1) {
					System.out.print("1");
				}
				break;
			case -1:
				if (degrees[i] == 0 && numbers[i] == -1) {
					System.out.print("-1");
				}
				break;
			default:
				System.out.print(numbers[i]);
			}
			switch (degrees[i]) {
			case 0:
				break;
			case 1:
				System.out.print("x");
				break;
			case -1:
				System.out.print("x^-1");
				break;
			default:
				System.out.print("x^" + degrees[i]);
			}
			if (i < degrees.length - 1) {
				if (numbers[i + 1] > 0) {
					System.out.print(" +");
				} else {
					System.out.print(" ");
				}
			}
		}
		input.close();
	}

}
