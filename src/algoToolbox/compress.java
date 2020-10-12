package algoToolbox;

import java.util.Scanner;

public class compress {
	public static StringBuilder comp(String aa) {

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < aa.length(); i++) {
			int count = 0;
			int k = 0;
			while ((i < aa.length()) && (k < aa.length()) && (i + k < aa.length())) {
				if (aa.charAt(i) == aa.charAt(i + k)) {
					count++;
					k++;
				} else if(count==0)
				{
					count++;
					k++;
					break;
				}else
					break;

			}
			s.append(aa.charAt(i));
			s.append(count);
			i = i + k-1;
		}
		return s;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str = sc.nextLine();
		StringBuilder s=comp(str);
		if(s.length()>=str.length())
			System.out.println(str);
		else
			System.out.println(comp(str));

	}

}
