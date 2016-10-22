import java.util.Scanner;

public class encodedmessage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int x = 0; x < t; x++) {
			String in = scan.next();
			int s = (int) Math.sqrt(in.length());
			char[][] ch = new char[s][s];
			int counter = 0;
			for (int y = 0; y < s; y++) {
				for (int z = 0; z < s; z++) {
					ch[y][z] = in.charAt(counter);
					counter++;
				}
			}
			String out = "";
			for (int y = s - 1; y >= 0; y--) {
				for (int z = 0; z < s; z++) {
					out += ch[z][y];
				}
			}
			System.out.println(out);
		}
		scan.close();
	}

}
