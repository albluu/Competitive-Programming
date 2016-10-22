import java.util.Scanner;

public class modulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int out = 0;
		boolean[] num = new boolean[42];
		for (int x = 0; x < 10; x++) {
			int in = scan.nextInt() % 42;
			if (!num[in]) {
				num[in] = true;
				out++;
			}
		}
		scan.close();
		System.out.println(out);

	}

}
