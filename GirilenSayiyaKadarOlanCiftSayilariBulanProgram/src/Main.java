import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int k, top = 0, say = 0;
        double ort;

        System.out.print("Bir Sayi Giriniz : ");
        k = inp.nextInt();

        for (int i=0; i<=k; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                top += i;
                say++;
            }
        }
        ort = top / say;
        System.out.println("Sayıların Ortalaması : " + ort);
    }
}