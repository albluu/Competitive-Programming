import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class jankenpoi {

	public static void main(String[] args) {
		TreeMap<Integer, Integer[]> hm = new TreeMap<Integer, Integer[]>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			if (n != 1) {
				int k = scan.nextInt();
				int kv = (k * n * (n-1))/2;
				for (int i = 0; i < kv; i++) {
					int p1 = scan.nextInt();
					String p1p = scan.next();
					int p2 = scan.nextInt();
					String p2p = scan.next();
					if (p1p.equals("rock") && p2p.equals("paper") || p1p.equals("paper") && p2p.equals("scissors")
							|| p1p.equals("scissors") && p2p.equals("rock")) {
						Integer[] p1score = hm.getOrDefault(p1, new Integer[] { 0, 0 });
						p1score[1]++;
						Integer[] p2score = hm.getOrDefault(p2, new Integer[] { 0, 0 });
						p2score[0]++;
						hm.put(p1, p1score);
						hm.put(p2, p2score);
					} else
						if (p2p.equals("rock") && p1p.equals("paper") || p2p.equals("paper") && p1p.equals("scissors")
								|| p2p.equals("scissors") && p1p.equals("rock")) {
						Integer[] p1score = hm.getOrDefault(p1, new Integer[] { 0, 0 });
						p1score[0]++;
						Integer[] p2score = hm.getOrDefault(p2, new Integer[] { 0, 0 });
						p2score[1]++;
						hm.put(p1, p1score);
						hm.put(p2, p2score);
					} else {
						Integer[] p1score = hm.getOrDefault(p1, new Integer[] { 0, 0 });
						Integer[] p2score = hm.getOrDefault(p2, new Integer[] { 0, 0 });
						hm.put(p1, p1score);
						hm.put(p2, p2score);
					}

				} 
				while (!hm.isEmpty()) {
					Entry<Integer, Integer[]> ent = hm.pollFirstEntry();
					Integer[] wl = ent.getValue();
					if (wl[0] + wl[1] != 0) {
						double res = wl[0] / (double) (wl[0] + wl[1]);
						System.out.printf("%.3f\n", res);
					} else {
						System.out.println("-");
					}
				}
				System.out.println();
			} else {
				int k = scan.nextInt();
				int kv = (k * n * (n-1))/2;
				for (int i = 0; i < kv; i++) {
					scan.nextLine();
				}
				System.out.println("-\n");
			}
			
			n = scan.nextInt();
		}
		scan.close();
	}
}
