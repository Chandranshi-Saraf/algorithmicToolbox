package greedy;

import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        long sum=0;
        if(n==2)	
        {
        	summands.add(2);
        	return summands;
        }
        if(n==1)	
        {
        	summands.add(1);
        	return summands;
        }
        for(int i=1;i<n; i++) {
        	if(n-(sum+i)>i) {
        		summands.add(i);
        		sum=sum+i;
        	}
        	else
        		break;
        	
        }
    	if(n-sum!= 0)
    		summands.add((int)(n-sum));
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}


