import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double total, perKm = 2.20, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeniz kaç KM\'dir? : ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        if ( km < 5) {
            System.out.print("Taksimetre Tutarı 20 TL'dir.");
        }

        else {
            System.out.println("Taksimetre Tutarı " + total + " TL'dir");
        }
    }

}
