package com.coreprograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter n value = ");
		int n = scan.nextInt();

		System.out.print("prime factors of " + n + " : ");

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}

		}
		if(n>1) {
			System.out.println(n);
		}
	}

}
