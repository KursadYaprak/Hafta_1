import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n, k, total = 1;

        System.out.print("Üssü alınacak sayı : ");
        n = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = inp.nextInt();

        int i = 1;
        while ( i <= k) {
            total *= n;
            i++;
        }
        System.out.println("Cevap : " + total);
    }
}