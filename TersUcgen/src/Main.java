import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;

        System.out.print("Bir Sayı Giriniz : ");
        n = inp.nextInt();

        for (int i = 0; i < n ; i++) {

            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = (2 * n) - 1; j >= (2 * i) + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}