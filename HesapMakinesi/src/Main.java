import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, islem;
        double sonuc;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayınızı Girin : ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayınızı Girin : ");
        n2 = inp.nextInt();

        System.out.print("Yapmak İstediğiniz İşlem İçin Bir Sayı Giriniz\nToplama : 1  Çıkarma : 2  Çarpma : 3  Bölme : 4\nSeçiminiz ? : ");
        islem = inp.nextInt();

        if (islem == 1) {
            sonuc = n1 + n2;
            System.out.println("İşleminizin Sonucu : " + sonuc);
        }
        else if (islem == 2) {
            sonuc = n1 - n2;
            System.out.println("İşleminizin Sonucu : " + sonuc);
        }
        else if (islem == 3) {
            sonuc = n1 * n2;
            System.out.println("İşleminizin Sonucu : " + sonuc);
        }
        else if (islem == 4) {
            if (n2 != 0) {
                sonuc = n1 / n2;
                System.out.println("İşleminizin Sonucu : " + sonuc);
            }
            else {
                System.out.println("Bir Sayı Sıfıra Bölünemez !");
            }
        }
        else {
            System.out.println("Hatalı Bir İşlem Sayısı Girdiniz.\nTekrar Deneyiniz.");
        }

    }
}