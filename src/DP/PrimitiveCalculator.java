package DP;

import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        int a[]=new int[n+1];
        //int b[]={1,2,3};
        for(int i=1;i<=n;i++) {
        	int min=9999;
        	int k=-1;
        	if(i==1)
        		a[i]=0;
        	else {
        		min=a[i-1]+1;
        		k=i-1;
        		if(i%3==0 && a[i/3]+1<min)
        		{
        			k=i/3;
        			min=a[i/3]+1;
        			
        		}
        		if(i%2==0 && a[i/2]+1<min)
        		{
        			k=i/2;
        			min=a[i/2]+1;
        			
        		}
        		a[i]=min;
        	}        	
        }
        System.out.println(a[n]);
        while (n >= 1) {
        	int min=9999;
        	int k=-1;
            sequence.add(n);
            if (n % 3 == 0) {
                min=a[n / 3];
                k=n/3;
            }if (n % 2 == 0 && min>a[n/2]) {
            	min=a[n / 2];
            	k=n/2;
            }if(k==-1 || min>a[n-1]) {
            	min=a[n-1];
        		k=n-1;
            }
            n=k;
        }
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}


