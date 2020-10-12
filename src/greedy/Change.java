package greedy;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int sum=0;
        if(m>=10) {
        	sum=sum+(int)(m/10);
        	m=m%10;
        }
        if(m>=5) {
        	sum=sum+(int)(m/5);
        	m=m%5;
        }
        if(m>0)
        	sum=sum+m;
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
