import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz : ");
        n3 = inp.nextInt();

        if ( n1 < n2 && n1 < n3 && n2 < n3 ) {
            System.out.println("Sayılar küçükten büyüğe : " + n1 + " , " + n2 + " , " + n3);
        }
        else if ( n1 < n2 && n1 < n3 && n2 > n3 ) {
            System.out.println("Sayılar küçükten büyüğe : " + n1 + " , " + n3 + " , " + n2);
        }
        else if ( n2 < n1 && n2 < n3 && n1 < n3 ) {
            System.out.println("Sayılar küçükten büyüğe : " + n2 + " , " + n1 + " , " + n3);
        }
        else if ( n2 < n1 && n2 < n3 && n1 > n3 ) {
            System.out.println("Sayılar küçükten büyüğe : " + n2 + " , " + n3 + " , " + n1);
        }
        else if ( n3 < n1 && n3 < n2 && n1 < n2 ) {
            System.out.println("Sayılar küçükten büyüğe : " + n3 + " , " + n1 + " , " + n2);
        }
        else if ( n3 < n1 && n3 < n2 && n1 > n2 ) {
            System.out.println("Sayılar küçükten büyüğe : " + n3 + " , " + n2 + " , " + n1);
        }
    }
}
