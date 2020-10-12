package algoToolbox;

import java.util.Scanner;

public class permutation {
	public static boolean perm(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		else
		{
			int aa[]=new int[128];
			int count=0;
			for(int i=0; i<a.length(); i++)
			{
				aa[a.charAt(i)]++;
				if(aa[a.charAt(i)]%2==0)
				{
					count++;
				}
				aa[b.charAt(i)]++;
				if(aa[b.charAt(i)]%2==0)
				{
					count++;
				}				
			}
			if(count==a.length())
				return true;
		
		}
		
		return false;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str=sc.next();
		System.out.println("Enter fsecond String");
		String str2=sc.next();
		if(perm(str,str2))
		{
			System.out.println("String is unique");
		}
		else
			System.out.println("Not unique ");
				
	}


}
