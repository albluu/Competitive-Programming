import java.util.Scanner;

public class cold {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for (int x = 0; x < n; x++) {
			if (scan.nextInt() < 0) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
