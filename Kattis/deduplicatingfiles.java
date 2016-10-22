import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class deduplicatingfiles {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n;
		do {
			n = fs.nextInt();
			if (n != 0) {
				HashMap<String, Byte> hm = new HashMap<String, Byte>();
				for (int x = 0; x < n; x++) {
					String inline = fs.nextLine();
					char[] ca = inline.toCharArray();
					byte c = '\0';
					for (char h : ca) {
						c ^= h;
					}
					hm.put(inline, c);
				}
			}
		} while (n != 0);
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

		String nextLine() {
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
