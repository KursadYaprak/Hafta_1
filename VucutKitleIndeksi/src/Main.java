import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilo;
        double vucKit, boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();

        vucKit = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vucKit);
    }
}
