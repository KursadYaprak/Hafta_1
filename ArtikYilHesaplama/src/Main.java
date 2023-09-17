import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int yil;

        System.out.print("Yıl Giriniz : ");      // Kullanıcıdan yıl girmesini istedik.
        yil = inp.nextInt();

        if (yil % 100 == 0 && yil % 400 == 0) {                    // 4 ihtimale ayırdık çünkü 4'ün katı olsa dahi eğer sayı 100'ün katı ise sadece 400'ün katı olması şartı ile artık yıl sayılıyor.
            System.out.println(yil + " bir artık yıldır !");
        } else if (yil % 100 == 0 && yil % 400 != 0) {
            System.out.println(yil + " bir artık yıl değildir !");
        } else if (yil % 100 != 0 && yil % 4 == 0) {
            System.out.println(yil + " bir artık yıldır !");
        } else if (yil % 100 != 0 && yil % 4 != 0) {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}