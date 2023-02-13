package com.longsub.sequence;

import java.util.Scanner;

public class LongestSubSequence {
	static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        /* Compute optimized LIS values in
           bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of values");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("enter the numbers");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the longest increasing sunsequence is:"+lis(arr, length));
		sc.close();
	}

}
