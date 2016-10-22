import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class haypoints {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();

		int m = fs.nextInt();
		int n = fs.nextInt();

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int x = 0; x < m; x++) {
			String s = fs.next();
			int i = fs.nextInt();
			hm.put(s, i);
		}

		for (int x = 0; x < n; x++) {
			String[] inline = fs.nextLine().split(" ");
			int counter = 0;
			do {
				for (String s : inline) {
					counter += hm.getOrDefault(s, 0);
				}

				inline = fs.nextLine().split(" ");
			} while (!inline[0].equals("."));

			System.out.println(counter);
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
