package algoToolbox;
import java.io.*; 
import java.util.*; 
import java.math.*; 

public class fibtest {
	public static void fib(int f[]) 
	    { 
	        // 0th and 1st number of  
	        // the series are 0 and 1 
	        f[0] = 0; 
	        f[1] = 1; 
	        for (int i = 2; i <= 59; i++) 
	            f[i] = (f[i - 1] + f[i - 2]) % 10; 
	    } 
	    public static int findLastDigit(long n) 
	    { 
	        int f[] = new int[60]; 
	        fib(f); 
	      
	        int index = (int)(n % 60L);  
	  
	        return f[index]; 
	    } 

	  public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    long n = in.nextLong();   
	        System.out.println((findLastDigit(n)));
	    }
	  }


