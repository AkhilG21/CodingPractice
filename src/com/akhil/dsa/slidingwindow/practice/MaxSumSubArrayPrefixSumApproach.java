package com.akhil.dsa.slidingwindow.practice;

import java.util.Arrays;

public class MaxSumSubArrayPrefixSumApproach{

	public static void main(String[] args) {
		int k = 3; //length of Sub Array
		
		int[] arr = {-3,4,2,1,5,8,9,10};
		int max = 0;
		int[] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		
		for(int i = 1; i< arr.length;i++) {
			prefixSum[i] = prefixSum[i-1] + arr[i];			
		} 		
		System.out.println("Prefix Sum array"+Arrays.toString(prefixSum));
		
		int s =0; // start index
		int e = k-1; // end index
		
		while(e < arr.length) {
			int ans = 0;
			if(s == 0) {
				ans = prefixSum[0];
			} else {
				ans = prefixSum[e] - prefixSum[s-1];
			}
			if(ans > max) {
				max = ans;
			}		
			s++;
			e++;
		}
		System.out.println("Max Sum :: "+max);
		
	}

}
