import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int tamSayi;
        double ondalikSayi;

        System.out.print("Bir Tam Sayi Giriniz : ");
        tamSayi = inp.nextInt();
        System.out.print("Bir Ondalıklı Sayı Giriniz : ");
        ondalikSayi = inp.nextDouble();

        double a = (double) tamSayi;
        int b = (int) ondalikSayi;

        System.out.print(a + "\n" + b);
    }
}
