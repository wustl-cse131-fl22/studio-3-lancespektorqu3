package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of n:");
		int n = in.nextInt();
		int[] numbers = new int[n];
		int index = 0;
		while (index < n){
			numbers[index] = index + 1;
			index = index + 1;
		}
		System.out.println(numbers.length);
		
		numbers[0] = 0;
		int p = 2;
		while (p*p <= n) {
			for (int q = 2; p*q <= n; q++) {
				numbers[p*q-1] = 0;
			}
			p = p + 1;
		}
		for (int i = 0; i < numbers.length; i++)
	       {
			if (numbers[i] != 0) 
			{
	            System.out.print(numbers[i] + " ");}
	       }
	}

}
