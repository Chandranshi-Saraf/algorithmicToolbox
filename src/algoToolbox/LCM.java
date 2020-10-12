package algoToolbox;

import java.util.Scanner;

public class LCM {
	  private static long lcm_naive(long a, long b) {
		  long gcd=gcd(a,b);
		  long lcm=(a*b)/gcd;

	    return lcm;
	  }
	  private static long gcd(long a, long b) {
		  if(a==0)
			  return b;
		  else
			  return gcd(b%a,a);
	  }

	  public static void main(String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    long a = scanner.nextLong();
	    long b = scanner.nextLong();

	    System.out.println(lcm_naive(a, b));
	  }
	}