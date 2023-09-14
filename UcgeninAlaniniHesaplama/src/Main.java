import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c, u, cevre;
        double alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Kenar Uzunluğunu Giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci Kenar Uzunluğunu Giriniz : ");
        b = inp.nextInt();
        System.out.print("Üçüncü Kenar Uzunluğunu Giriniz : ");
        c = inp.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt((u * (u-a) * (u-b) * (u-c)));

        System.out.println("Üçgenin Alanı : " + alan);

    }
}