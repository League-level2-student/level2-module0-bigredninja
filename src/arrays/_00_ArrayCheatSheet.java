package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"josh","james","john","jimmy","jasper"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "jeffrey";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			Random rnd = new Random();
			numbers[i] = rnd.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 0;
		for (int j = 1; j < numbers.length; j++) {
			if (numbers[smallest] > numbers[j]) {
				smallest = j;
			}
		}
		System.out.println(numbers[smallest]);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		//10. print the largest number in the array.
		int greater = 0;
		for (int j = 1; j < numbers.length; j++) {
			if (numbers[greater] < numbers[j]) {
				greater = j;
			}
		}
		System.out.println();
		System.out.println(numbers[greater]);
	}
}
