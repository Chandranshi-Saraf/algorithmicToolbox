package algoToolbox;
import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
  private static BigInteger calc_fib(int n) {
	  { 
	        BigInteger a = BigInteger.valueOf(0); 
	        BigInteger b = BigInteger.valueOf(1); 
	        BigInteger c = BigInteger.valueOf(1); 
	        for (int j=2 ; j<=n ; j++) 
	        { 
	            c =  a.add(b); 
	            a = b; 
	            b = c; 
	        } 
	        
	  
	        return a.mod(BigInteger.valueOf(10));
	    } 
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();   
		System.out.println((calc_fib(n+1)));
	}
  }


