package boj.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class problem11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min = 0;
				
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		
		for (i = 1; i <= n; i++) arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		for(i = 1; i <= n; i++) {
			arr[i] = arr[i] + arr[i - 1];
			min += arr[i];
		}
		
		System.out.println(min);
 
	}

}
