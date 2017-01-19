import java.util.HashMap;
import java.util.Scanner;

public class bing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int N = scan.nextInt();
		for (int x = 0; x < N; x++) {
			String s = scan.next();
			for (int y = 0; y < s.length(); y++) {
				String sub = s.substring(0, y + 1);
				hm.put(sub, hm.getOrDefault(sub, 0) + 1);
			}
			System.out.println(hm.get(s) - 1);
		}
		scan.close();
	}
}
