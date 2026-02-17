package com.akhil.dsa.slidingwindow.practice;

//Find min no of swaps to bring elements together less than B in a Sub Array.
public class MinSwapsSubarray {

	public static void main(String[] args) {
		int[] arr = {25, 30, 2, 18, 7, 6, 9,50, 3};
		int ans = 0;
		int minSwaps = 0;
		int b = 10;
		int k  = 0;
		
		//Counting elements less than b	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < b) {
				k +=1;
			}
		}
		System.out.println("Elements less than b :: "+k);

		
		for(int j = 0; j < k; j++) {
			if(arr[j] > b) {
				minSwaps++;
			}
		}
		System.out.println("Min swaps for First Window :: "+minSwaps);

		
		int s = 1;
		int e = k;
		ans = minSwaps; //Min Swap for First Window
		while(e < arr.length) {
			if(arr[s-1] > b) {
				minSwaps -= 1;
			}
			
			if(arr[e] > b) {
				minSwaps += 1;
			}
			
			if(minSwaps < ans) {
				ans =  minSwaps;
			}
			s++;
			e++;
		}
		
		System.out.println("Min Swaps :: "+ans);
		
	}

}
