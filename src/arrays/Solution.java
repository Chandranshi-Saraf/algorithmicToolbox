package arrays;

import java.util.Scanner;

public class Solution {
	
	public static int convertToDecimal(String str, int base) {
	    int v = 0;
	    int total = 0;
	    int pow = 0;
	    str = str.toUpperCase();
	    for (int i = str.length() - 1; i >= 0; i--) {
	        char c = str.charAt(i);
	        if (c >= '0' && c <= '9')
	            v = c - '0';
	        else if (c >= 'A' && c <= 'Z')
	            v = 10 + (c - 'A');
	        total += v * Math.pow(base, pow);
	        pow++;
	    }
	    return total;
	}
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t!=0) {
        	int b=scanner.nextInt();
        	String num=scanner.next();
        	int k=convertToDecimal(num,b);
        	 System.out.println(k);
        	
        }
       
	}

}
