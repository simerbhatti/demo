package com.example.demo.service;

public class FindLargestNumber {
	public static void main(String[] args) {
		int[] numbers = { -22, 15, 11, 3 };
		int max = Integer.MIN_VALUE;
		// int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The largest number in the array is: " + max);
	}
}
