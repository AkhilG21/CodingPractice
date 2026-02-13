package com.akhil.dsa.slidingwindow.practice;

public class SlidingWindowBruteForceApproach {

	public static void main(String[] args) {
		
		int k = 3;
        int[] arr = {-3,4,2,1,5,8,9,10};
        int s = 0;
        int e = k-1;
        int ans  = 0;
        
        while(e < arr.length) {
            int sum = 0;
            for(int i= s; i <= e; i++) {
                sum += arr[i];
            }
            if(sum > ans) {
                ans = sum;
            }
            s++;
            e++;
        }
        System.out.println("Ans :: "+ans);
    }
		
}
