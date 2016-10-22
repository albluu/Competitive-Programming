import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class classy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int x = 0; x < t; x++) {
			int n = scan.nextInt();
			TreeMap<String, String> tm = new TreeMap<String, String>();
			for (int y = 0; y < n; y++) {
				String name = scan.next();
				name = name.substring(0,name.length() - 1);
				String[] strcla = scan.next().split("-");
				scan.next();
				String output = "";
				for (String s : strcla) {
					if (s.equals("upper")) {
						output += "3";
					} else if (s.equals("middle")) {
						output += "2";
					} else {
						output += "1";
					}
				}
				output = new StringBuilder(output).reverse().toString();
				tm.put(output, name);
			}
			for (Entry<String, String> e : tm.entrySet()) {
				System.out.println(e.getValue());
			}
			System.out.println("==============================");
		}
		scan.close();
	}
}
