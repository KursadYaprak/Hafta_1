import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a, b, c, sonuc;

        System.out.print("İlk Sayınızı Giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci Sayınızı Giriniz : ");
        b = inp.nextInt();
        System.out.print("Üçüncü Sayınızı Giriniz : ");
        c = inp.nextInt();

        sonuc = a + b * c - b;

        System.out.println("İşlemin Sonucu : " + sonuc);
    }
}
