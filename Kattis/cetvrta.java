import java.util.Scanner;

public class cetvrta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		scan.close();
		int x, y;
		if (a == c) {
			x = e;
		} else if (a == e) {
			x = c;
		} else {
			x = a;
		}
		if (b == d) {
			y = f;
		} else if (b == f) {
			y = d;
		} else {
			y = b;
		}
		System.out.println(x + " " + y);
	}

}
