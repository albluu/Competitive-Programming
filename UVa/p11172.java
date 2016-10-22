import java.util.Scanner;

public class p11172 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int x = 0; x < n; x++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if (a == b) System.out.println("=");
			else {
				System.out.println(a < b ? "<" : ">");
			}
		}
		scan.close();
	}
}
