package com.akhil.dsa.slidingwindow.practice;

public class MaxSumSubarraySlidingWindow {

	public static void main(String[] args) {
		int k = 3; //length of Sub Array
		int[] arr = {-3,4,2,1,5,8,9,10};
		int ans = 0;
		int maxSum = 0;
		
		for(int i = 0; i< k; i++) {
			maxSum += arr[i];
		}
		
		ans = maxSum;
		
		int s = 1;
		int e = k;
		
		while(e < arr.length) {
			
			maxSum  = ans - arr[s-1] + arr[e];
			if(maxSum > ans) {
				ans = maxSum;
			}
			s++;
			e++;
		}	
		System.out.println("Max Sum :: "+maxSum);
		
	}

}
