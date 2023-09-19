import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, toplam = 0;

        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println(n + " Bir Mükemmel sayıdır.");
        } else {
            System.out.println(n + " Bir Mükemmel sayı değildir.");
        }
    }
}
