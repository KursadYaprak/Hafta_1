import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n1, n2, ebob = 0, ekok = 0;

        System.out.print("İlk Sayınızı Giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinici Sayınızı Giriniz : ");
        n2 = inp.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        for (int k = 1; k <= (n1 * n2); k++) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
        }
        System.out.print("Girilen sayıların\nEbob değeri : " + ebob + "\nEkok değeri : " + ekok);
    }
}
