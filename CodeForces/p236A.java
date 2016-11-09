import java.util.HashSet;
import java.util.Scanner;

public class p236A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] s = scan.next().toCharArray();
		scan.close();
		HashSet<Character> chars = new HashSet<Character>();
		for (char c : s) {
			chars.add(c);
		}
		System.out.println(chars.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

	}

}
