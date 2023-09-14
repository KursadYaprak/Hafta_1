import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double para, kdv, kdvli, kdvsiz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Para Değerini Giriniz : ");
        para = inp.nextDouble();

        if (para >= 0 && para <= 1000) {

            kdvsiz = para;
            kdv = (para / 100) * 18;
            kdvli = para + kdv;

            System.out.println("KDV\'siz Fiyat : " + kdvsiz);
            System.out.println("KDV\'li Fiyat : " + kdvli);
            System.out.print("KDV Tutarı : " + kdv);

        }
        else {

            kdvsiz = para;
            kdv = (para / 100) * 8;
            kdvli = para + kdv;

            System.out.println("KDV\'siz Fiyat : " + kdvsiz);
            System.out.println("KDV\'li Fiyat : " + kdvli);
            System.out.print("KDV Tutarı : " + kdv);

        }

    }
}