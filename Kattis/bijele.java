import java.util.Scanner;

public class bijele {

	public static void main(String[] args) {
		int[] s = {1, 1, 2, 2, 2, 8};
		Scanner scan = new Scanner(System.in);
		for (int x = 0; x < 6; x++) {
			System.out.print(s[x] - scan.nextInt() + " ");
		}
		scan.close();
	}

}
