import java.util.HashMap;
import java.util.Scanner;

public class t9spell {

	public static void main(String[] args) {
		HashMap<Character, String> hm = new HashMap<Character, String>();
		
		hm.put('a', "2");
		hm.put('b', "22");
		hm.put('c', "222");
		hm.put('d', "3");
		hm.put('e', "33");
		hm.put('f', "333");
		hm.put('g', "4");
		hm.put('h', "44");
		hm.put('i', "444");
		hm.put('j', "5");
		hm.put('k', "55");
		hm.put('l', "555");
		hm.put('m', "6");
		hm.put('n', "66");
		hm.put('o', "666");
		hm.put('p', "7");
		hm.put('q', "77");
		hm.put('r', "777");
		hm.put('s', "7777");
		hm.put('t', "8");
		hm.put('u', "88");
		hm.put('v', "888");
		hm.put('w', "9");
		hm.put('x', "99");
		hm.put('y', "999");
		hm.put('z', "9999");
		hm.put(' ', "0");
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for (int x = 0; x < t; x++) {
			System.out.print("Case #" + (x + 1) + ": ");
			String s = scan.nextLine();
			char[] chars = s.toCharArray();
			String out = hm.get(chars[0]);
			for (int y = 1; y < chars.length; y++) {
				String toadd = hm.get(chars[y]);
				if (toadd.charAt(0) == out.charAt(out.length() - 1)) {
					out += " ";
				}
				out += hm.get(chars[y]);
			}
			System.out.println(out);
		}
		scan.close();
	}
}
