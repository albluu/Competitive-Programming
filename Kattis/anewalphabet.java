import java.util.HashMap;
import java.util.Scanner;

public class anewalphabet {
	public static void main(String[] args) {
		
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put('a', "@");
		map.put('b', "8");
		map.put('c', "(");
		map.put('d', "|)");
		map.put('e', "3");
		map.put('f', "#");
		map.put('g', "6");
		map.put('h', "[-]");
		map.put('i', "|");
		map.put('j', "_|");
		map.put('k', "|<");
		map.put('l', "1");
		map.put('m', "[]\\/[]");
		map.put('n', "[]\\[]");
		map.put('o', "0");
		map.put('p', "|D");
		map.put('q', "(,)");
		map.put('r', "|z");
		map.put('s', "$");
		map.put('t', "']['");
		map.put('u', "|_|");
		map.put('v', "\\/");
		map.put('w', "\\/\\/");
		map.put('x', "}{");
		map.put('y', "`/");
		map.put('z', "2");
		
		Scanner scan = new Scanner(System.in);
		char[] in = scan.nextLine().toLowerCase().toCharArray();
		scan.close();
		String out = "";
		for (char c : in) {
			String check = map.get(c);
			if (check != null) {
				out += check;
			} else {
				out += c;
			}
		}
		System.out.println(out);
	}
}
