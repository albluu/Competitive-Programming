import java.util.Scanner;

public class different {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			String[] in = scan.nextLine().split(" ");
			long n1 = Long.parseLong(in[0]);
			long n2 = Long.parseLong(in[1]);
			System.out.println(Math.abs(n1 - n2));
		} while (scan.hasNextLine());

	}

}
