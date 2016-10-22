import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class busyschedule {
	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int n = scan.nextInt();
		do {
			PriorityQueue<Time> times = new PriorityQueue<Time>(new TimeComp());
			for (int x = 0; x < n; x++) {
				String in = scan.nextLine();
				String[] input = in.split(" ");
				String[] time = input[0].split(":");
				int[] inttime = {Integer.parseInt(time[0]), Integer.parseInt(time[1])};
				boolean pm;
				if (input[1].equals("a.m.")) {
					pm = false;
				} else {
					pm = true;
				}
				Time t = new Time(inttime[0], inttime[1], pm, in);
				times.add(t);
			}
			
			while (!times.isEmpty()) {
				System.out.println(times.poll().TimeString);
			}
			System.out.println();
			n = scan.nextInt();
		} while (n > 0);
	}
	
	static class TimeComp implements Comparator<Time> {

		@Override
		public int compare(Time t1, Time t2) {
			if (!t1.Pm && t2.Pm) {
				return -1;
			} else if (t1.Pm == t2.Pm) {
				if (t1.Hour == 12 && t2.Hour < 12) {
					return -1;
				} else if (t2.Hour == 12 && t1.Hour < 12) {
					return 1;
				} else if (t1.Hour < t2.Hour) {
					return -1;
				} else if (t1.Hour == t2.Hour) {
					if (t1.Minute < t2.Minute) {
						return -1;
					} else if (t1.Minute == t2.Minute) {
						return 0;
					} else {
						return 1;
					}
				} else {
					return 1;
				}
			} else {
				return 1;
			}
		}
		
	}
	
	static class Time {
		int Hour, Minute;
		boolean Pm;
		String TimeString;
		public Time(int hour, int minute, boolean pm, String timestring) {
			Hour = hour;
			Minute = minute;
			Pm = pm;
			TimeString = timestring;
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
