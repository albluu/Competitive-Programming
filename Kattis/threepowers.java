import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class threepowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger[] vals = new BigInteger[200];
		vals[0] = BigInteger.valueOf(1);
		vals[1] = BigInteger.valueOf(3);
		for (int x = 2; x < vals.length; x++) {
			vals[x] = vals[x - 1].multiply(BigInteger.valueOf(3));
		}
		
		BigInteger n = scan.nextBigInteger().subtract(BigInteger.ONE);
		do {
			char[] bin = new StringBuilder(n.toString(2)).reverse().toString().toCharArray();
			ArrayList<BigInteger> list = new ArrayList<BigInteger>();
			for (int x = 0; x < bin.length; x++) {
				if (bin[x] == '1') {
					list.add(vals[x]);
				}
			}
			String out = "{ ";
			for (int x = 0; x < list.size() - 1; x++) {
				out += list.get(x) + ", ";
			}
			if (list.size() > 0) {
				out += list.get(list.size() - 1);
				System.out.println(out + " }");
			} else {
				System.out.println(out + "}");
			}
			n = scan.nextBigInteger().subtract(BigInteger.ONE);
		} while (!n.equals(BigInteger.ZERO.subtract(BigInteger.ONE)));
		scan.close();
	}

}
