package greedy;

import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
    	int s=0;
    	int curr=0;
    	int pos=0;
    	if(dist<=tank)
    		return 0;
    	else if(stops[stops.length-1]+tank<dist){
    		return -1;    		
    	}
    	else if(curr+tank==dist)
    		return 0;
    	else if(stops.length==1) {
    		if(stops[0]<=curr+tank && dist-stops[0]<=tank)
    			return 1;
    		return -1;
    	}
    	else
    	{
    				for(int j=0;j<stops.length && curr<dist;j++) {
    					
    					 if(curr+tank>stops[j] && j!=stops.length-1)
    						continue;
    					else if(curr+tank==stops[j]) {
    						curr=stops[j];
    						//System.out.println("curr 1"+ curr);
    						s++;    						
    					}
    					else if(curr+tank<stops[j]) {
    						//System.out.println(curr);
    						if(stops[j-1]<=curr)
    							return -1;
    						curr=stops[--j];
    						//System.out.println("curr 2  "+ curr+"  "+j);
    						s++;
    						
    					}
    					else if(j==stops.length-1) {
    						//System.out.println("final"+ curr);
    						if(curr+tank == dist)
    							break;
    						
    						else if(curr+tank>=stops[j]) {
    							//System.out.println("final 2"+ curr);
    							if(dist-stops[j]<=tank) {
    								//System.out.println("final 3"+ curr);
    								s++;
    								break;}
    						}
    						return -1;
    					}
    				}    				
    			}    			
    		return s;
    	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
