import java.util.Scanner;

public class conundrum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.next().toUpperCase();
		scan.close();
		int count = 0;
		String per = "PER";
		for (int x = 0; x < in.length(); x++) {
			if (in.charAt(x) != per.charAt(x % 3)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
