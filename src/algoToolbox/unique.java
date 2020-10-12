package algoToolbox;

import java.util.Scanner;

public class unique {
	
	public static boolean isUnique(String str)
	{
		int a[]=new int[128];
		for(int i=0; i<str.length(); i++) {
			
			if(a[str.charAt(i)]==0)
			{
				a[str.charAt(i)]=1;
				
			}
			else
				return false;
			
		}
		
		return true;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		if(isUnique(str))
		{
			System.out.println("String is unique");
		}
		else
			System.out.println("Not unique ");
				
	}

}
