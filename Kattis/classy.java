import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class classy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int x = 0; x < t; x++) {
			int n = scan.nextInt();
			scan.nextLine();
			TreeMap<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>(new Comp());
			for (int y = 0; y < n; y++) {
				String[] line = scan.nextLine().split(" ");
				String name = line[0].substring(0, line[0].length() - 1);
				String[] classes = line[1].split("-");
				String output = "";
				for (String s : classes) {
					if (s.equals("upper")) {
						output += "1";
					} else if (s.equals("middle")) {
						output += "2";
					} else {
						output += "3";
					}
				}
				output = new StringBuilder(output).reverse().toString();
				ArrayList<String> temp = map.getOrDefault(output, new ArrayList<String>());
				temp.add(name);
				map.put(output, temp);
			}
			
			for (Entry<String, ArrayList<String>> e : map.entrySet()) {
				ArrayList<String> list = e.getValue();
				Collections.sort(list);
				for (String s : list) {
					System.out.println(s);
				}
			}
			System.out.println("==============================");
		}
		scan.close();
	}
	private static class Comp implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			String s1 = o1;
			String s2 = o2;
			while (s1.charAt(s1.length() - 1) == '2' && s1.length() > 0) {
				
				s1 = s1.substring(0,s1.length() - 1);
			}
			while (s2.charAt(s2.length() - 1) == '2' && s2.length() > 0) {
				s2 = s2.substring(0,s2.length() - 1);
			}
			int max = Math.max(s1.length(), s2.length()) - 1;
			while (s1.length() <= max) {
				s1 += "2";
			}
			while (s2.length() <= max) {
				s2 += "2";
			}
			return s1.compareTo(s2);
		}
	}
}
