import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double armutKg = 2.14, elmaKg = 3.67, domaKg = 1.11, muzKg = 0.95, patliKg = 5.00, toplam;
        int armut, elma, doma, muz, patli;

        System.out.print("Armut Kaç Kilo ? : ");
        armut = inp.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = inp.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        doma = inp.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patli = inp.nextInt();

        toplam = (armut * armutKg) + (elma * elmaKg) + (doma * domaKg) + (muz * muzKg) + (patli * patliKg);

        System.out.println("Toplam Tutar : " + toplam);

    }
}
