import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pot {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int n = scan.nextInt();
		int sum = 0;
		for (int x = 0; x < n; x++) {
			String val = scan.next();
			int num = Integer.parseInt(val.substring(0, val.length() - 1));
			int pow = Integer.parseInt(val.substring(val.length() - 1));
			sum += Math.pow(num, pow);
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
