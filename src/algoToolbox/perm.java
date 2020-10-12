package algoToolbox;

import java.util.Scanner;

public class perm {
	public static boolean perm2(String a)
	{
		

			int aa[]=new int[128];
			int count=0;
			int length=a.length();
			for(int i=0; i<a.length(); i++)
			{
				if(a.charAt(i)!=' ')
				{
				aa[a.charAt(i)]++;
				System.out.println(a.charAt(i));
				if(aa[a.charAt(i)]%2==0)
				{
					count=count+2;
					System.out.println(count);
				}
				}
				else
				{
					length--;
				}
			
			}
			if(count==length)
				return true;
			else if((length%2!=0)&&(count+1==length))
				return true;	
	
		return false;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str=sc.nextLine();
		if(perm2(str))
		{
			System.out.println("String is unique");
		}
		else
			System.out.println("Not unique ");
				
	}


}
