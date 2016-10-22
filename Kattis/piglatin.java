import java.util.Scanner;

public class piglatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			String in = scan.nextLine();
			String[] s = in.split(" ");
			for (String z : s) {
				char c = z.charAt(0);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
					System.out.print(z + "yay ");
				} else {
					int sp = 0;
					do {
						char v = z.charAt(sp);
						if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
							break;
						} else {
							sp++;
						}
					} while (sp < z.length());
					System.out.print(z.substring(sp) + z.substring(0, sp) + "ay ");
				}
			}
			System.out.println();
		} while (scan.hasNextLine());
		scan.close();
	}
}
