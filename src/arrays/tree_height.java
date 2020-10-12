package arrays;

import java.util.*;
import java.io.*;
import java.util.Arrays; 
import java.util.Collections; 

public class tree_height {
    class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public class TreeHeight {
		int n;
		int parent[];
		List<Integer> h;
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			h=new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
				h.add(-1);
			}
		
			for(int i=0;i<n;i++)
				if(h.get(i)==-1)
					computeHeight(h,parent,i);
			System.out.println(Collections.max(h));			
		}

		int computeHeight(List<Integer> h,int parent[],int i) {
			if(parent[i]==-1) {
				h.set(i, 0);
				return 1;
			}
				
			else {				
				int h1=1+computeHeight(h,parent,parent[i]);
				h.set(i, h1);
				return h1;
			}

		}
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_height().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		//System.out.println(tree.computeHeight());
	}
}
