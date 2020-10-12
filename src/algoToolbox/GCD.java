package algoToolbox;

import java.util.Scanner;

public class GCD {
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

	    System.out.println(gcd(a, b));
	  }
	}

