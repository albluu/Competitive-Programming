import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();
		scan.close();

		for (int q = 1; q <= n; q++) {
			double divx = (double) q / x;
			double divy = (double) q / y;
			if (Math.floor(divx) == divx) {
				System.out.print("Fizz");
				if (Math.floor(divy) == divy) {
					System.out.println("Buzz");
				} else
					System.out.println();
			} else if (Math.floor(divy) == divy) {
				System.out.println("Buzz");
			} else {
				System.out.println(q);
			}
		}

	}

}
