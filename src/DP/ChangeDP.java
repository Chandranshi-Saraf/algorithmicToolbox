package DP;

import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m) {
        int a[]=new int[m+1];
        int b[]={1,3,4};
        a[0]=0;
        //a[1]=1;
        for(int i=1; i<=m; i++)
        {
        	int min=9999;
        	for(int j=0;j<3;j++) {
        		if(i==b[j])
        		{
        			min=1;
        			break;
        		}
        		if(i>b[j]) {
        			int c=1+a[i-b[j]];
        			if(c<min)
        				min=c;         			
        		}
        		
        	}
        	a[i]=min;
        	//System.out.print(a[i]+"  ");
        }
        return a[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
