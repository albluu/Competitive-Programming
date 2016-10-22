import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p11727 {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int t = fs.nextInt();
		for (int x = 0; x < t; x++) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for (int y = 0; y < 3; y++) {
				pq.add(fs.nextInt());
			}
			pq.poll();
			System.out.println("Case " + (x + 1) + ": " + pq.poll());
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
