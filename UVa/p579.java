import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p579 {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		String[] init = fs.nextLine().split(":");
		int h = Integer.parseInt(init[0]);
		int m = Integer.parseInt(init[1]);
		while (!(h == 0 && m == 0)) {
			h *= 30;
			m *= 6;
			if (h == 360) h = 0;
			if (m == 360) m = 0;
			double angle = (double) h - m;
			if (angle > 180) angle -= 180;
			System.out.println(angle);
			init = fs.nextLine().split(":");
			h = Integer.parseInt(init[0]);
			m = Integer.parseInt(init[1]);
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
