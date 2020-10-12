package greedy;
import java.util.*;

public class DotProduct {
    private static long maxDotProduct(long[] a, long[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += (double)a[i] * b[i];
        }
        return (long)result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

