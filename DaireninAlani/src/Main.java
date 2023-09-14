import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r, a;
        double piSay = 3.14, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();
        System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz : ");
        a = inp.nextInt();

        alan = (piSay * (r * r) * a) / 360;

        System.out.println("Dairenin Alanı : " + alan);
    }
}
