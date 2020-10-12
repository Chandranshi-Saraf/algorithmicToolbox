package greedy;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights, int fr[]) {
        double value = 0;
        sort(fr,weights,values,0,fr.length-1);
        for (int i = 0; i < fr.length; i++) {
        	System.out.println(fr[i]);
        }
        
        for(int i=0; i<fr.length-1 && capacity>0;i++) {
        	if(capacity>=weights[i]) {
        		value=value+values[i];
        		capacity=capacity-weights[i];
        	}
        	else {
        		value=value+(fr[i]*capacity);
        		capacity=0;
        		break;
        	}
        }

        return value;
    }
    private static int partition(int fr[],int w[], int v[], int low, int high) 
    { 
        int pivot = fr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (fr[j] >= pivot) 
            { 
                i++; 
                int temp = fr[i]; 
                fr[i] = fr[j]; 
                fr[j] = temp; 
                int temp1 = w[i]; 
                w[i] = w[j]; 
                w[j] = temp1;
                int temp2 = v[i]; 
                v[i] = v[j]; 
                v[j] = temp2;
            } 
        } 
        int temp = fr[i+1]; 
        fr[i+1] = fr[high]; 
        fr[high] = temp; 
        int temp1 = w[i+1]; 
        w[i+1] = w[high]; 
        w[high] = temp1;
        int temp2 = v[i+1]; 
        v[i+1] = v[high]; 
        v[high] = temp2;
       
  
        return i+1; 
    } 
    private static void sort(int fr[],int w[], int v[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(fr,w,v, low, high); 
            sort(fr,w,v, low, pi-1); 
            sort(fr,w,v, pi+1, high); 
        } 
    } 

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        int[] fr=new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
            fr[i]=values[i]/weights[i];
        }
        if(n==1) {
        	if(capacity>=weights[0])
        		System.out.println(values[0]);
        	else
        		System.out.println(fr[0]*capacity);
        }
        else
        	System.out.println(getOptimalValue(capacity, values, weights,fr));

        	
            }
} 
