package algoToolbox;

import java.util.*;
import java.io.*;
public class maxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] number) {
		long result = 0;
		long max1 = 0;
		int index1 = -1;
		long max2 = 0;
		max1=number[0];
		for (int i = 1; i < number.length; i++) {
			System.out.println(number[i]);
			if (number[i] > max1) {
				System.out.println("max 1st");
				max2=max1;
				max1 = number[i];

			}
			else if(number[i]>max2 && number[i]<=max1) {
				System.out.println("max 2nd");
				max2=number[i];
			}
		}
//		number[index1] = -1;
//		for (int i = 0; i < number.length; i++) {
//			if (number[i] > max2) {
//				max2 = number[i];
//			}
//		}
		System.out.println(max1+"   "+max2);
		result = max1 * max2;

		return result;

        //return max_product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
        	
            numbers[i] = sc.nextLong();
            //System.out.println(numbers[i]);
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    
}
