import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class cd {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		while (N > 0 && M > 0) {
			HashSet<Integer> hm = new HashSet<Integer>();
			int cd = 0;
			for (int x = 0; x < N; x++) {
				hm.add(scan.nextInt());
			}
			for (int x = 0; x < M; x++) {
				if (hm.contains(scan.nextInt())) {
					cd++;
				}
			}
			System.out.println(cd);
			N = scan.nextInt();
			M = scan.nextInt();
		}
	}
	
	public static class FastScanner {
	      BufferedReader br;
	      StringTokenizer st;
	 
	      public FastScanner() {
	         br = new BufferedReader(new InputStreamReader(System.in));
	      }
	 
	      String next() {
	          while (st == null || !st.hasMoreElements()) {
	              try {
	                  st = new StringTokenizer(br.readLine());
	              } catch (IOException e) {
	                  e.printStackTrace();
	              }
	          }
	          return st.nextToken();
	      }
	 
	      int nextInt() {
	          return Integer.parseInt(next());
	      }
	 
	      long nextLong() {
	          return Long.parseLong(next());
	      }
	 
	      double nextDouble() {
	          return Double.parseDouble(next());
	      }
	 
	      String nextLine(){
	          String str = "";
		  try {
		     str = br.readLine();
		  } catch (IOException e) {
		     e.printStackTrace();
		  }
		  return str;
	      }

	   }
}
