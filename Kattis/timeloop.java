import java.util.Scanner;
public class timeloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for (int x = 0; x < i; x++) {
            System.out.println(x + 1 + " Abracadabra");
        }
        scan.close();
    }
}