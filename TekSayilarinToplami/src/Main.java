import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n, top = 0;

        do {
            System.out.print("Bir Sayi Giriniz : ");
            n = inp.nextInt();
            if (n % 2 == 0 || n % 4 == 0) {
               top += n;
            }
        } while (n % 2 != 1) ;

        System.out.println("Toplam : " + top);
    }
}