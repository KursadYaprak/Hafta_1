import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3, number, i;

        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        System.out.print(n1 + " " + n2);

        for (i = 2; i < number; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}