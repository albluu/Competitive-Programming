import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class armystrengthhard {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int t = scan.nextInt();

		for (int x = 0; x < t; x++) {
			scan.nextInt();
			scan.nextInt();
			String[] gzs = scan.nextLine().split(" ");
			String[] mzs = scan.nextLine().split(" ");
			int gzm = -1;
			int mzm = -1;
			for (String s : gzs) {
				gzm = Math.max(gzm, Integer.parseInt(s));
			}
			for (String s : mzs) {
				mzm = Math.max(mzm, Integer.parseInt(s));
			}
			System.out.println(gzm >= mzm ? "Godzilla" : "MechaGodzilla");
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
