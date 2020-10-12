package algoToolbox;

import java.util.Scanner;

public class rotate {
	public static int[][] transpose(int a[][])
	{
		
		for (int i = 0; i < a.length; i++) 
            for (int j = i; j < a[0].length; j++) { 
                int temp = a[j][i]; 
                a[j][i] = a[i][j]; 
                a[i][j] = temp; 
            } 
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a[0].length; j++)
//			{
//				int temp=a[i][j];
//				a[i][j]=a[j][i];
//				a[j][i]=temp;
//			}
//		}
		return a;
	}
	public static int[][] rot(int a[][])
	{
		
		 for (int i = 0; i < a[0].length; i++) 
	            for (int j = 0, k = a[0].length - 1; 
	                 j < k; j++, k--) { 
	                int temp = a[j][i]; 
	                a[j][i] = a[k][i]; 
	                a[k][i] = temp; 
	            } 
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a[i].length/2; j++)
//			{
//				int temp=a[i][j];
//				a[i][j]=a[i][a[i].length-j-1];
//				a[i][a[i].length-j-1]=temp;
//			}
//		}
		
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.println("Enter element");
				 a[i][j]=sc.nextInt();
			}
		}
		a=transpose(a);
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		a=rot(a);
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
