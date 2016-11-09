import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class akcija {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int n = scan.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int x = 0; x < n; x++) {
			pq.add(scan.nextInt());
		}
		int sum = 0;
		while (pq.size() >= 3) {
			int a = pq.poll();
			int b = pq.poll();
			pq.poll();
			sum += a + b;
		}
		while (!pq.isEmpty()) {
			sum += pq.poll();
		}
		System.out.println(sum);
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
