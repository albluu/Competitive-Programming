import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class zoo {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int counter = 1;
		while (n != 0) {
			TreeSet<String> ts = new TreeSet<String>();
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			for (int x = 0; x < n; x++) {
				String[] animal = fs.nextLine().split(" ");
				String aniType = animal[animal.length - 1].toLowerCase();
				int number = hm.getOrDefault(aniType, 0) + 1;
				hm.put(aniType, number);
				ts.add(aniType);
			}
			System.out.println("List " + counter++ + ":");
			for (String s : ts) {
				System.out.println(s + " | " + hm.get(s));
			}
			n = fs.nextInt();
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
