import java.util.Scanner;

public class pet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] m = {0, 0};
		for (int x = 0; x < 5; x++) {
			int r = 0;
			for (int y = 0; y < 4; y++) {
				r += scan.nextInt();
			}
			if (r > m[1]) {
				m[0] = x;
				m[1] = r;
			}
		}
		System.out.println(m[0] + 1 + " " + m[1]);
		scan.close();
	}

}
