import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class arstr {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int t = scan.nextInt();

		for (int x = 0; x < t; x++) {
			int ng = scan.nextInt();
			int nm = scan.nextInt();
			PriorityQueue<Integer> ngp = new PriorityQueue<Integer>();
			PriorityQueue<Integer> nmp = new PriorityQueue<Integer>();
			for (int y = 0; y < ng; y++) {
				ngp.add(scan.nextInt());
			}
			for (int y = 0; y < nm; y++) {
				nmp.add(scan.nextInt());
			}
			int ngi = ngp.poll();
			int nmi = nmp.poll();
			if (ngi < nmi) {
				System.out.println("MechaGodzilla");
			} else if (ngi >= nmi){
				System.out.println("Godzilla");
			} 
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
