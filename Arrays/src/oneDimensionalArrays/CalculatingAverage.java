package oneDimensionalArrays;

import java.util.Scanner;

public class CalculatingAverage {

	// finding average of all numbers
	public static void main(String[] args) {
		int sum = 0;
		int avg;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// finding sum
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average is : " + avg);

		sc.close();
	}
}
