import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n, i = 1, k = 1;

        System.out.print("Bir Sayi Giriniz : ");
        n = inp.nextInt();

        while (i <= n && k <= n) {
            i *= 4;
            k *= 5;
            if (i <= n && k <= n) {
                System.out.println(i);
                System.out.println(k);
            }
        }
    }
}