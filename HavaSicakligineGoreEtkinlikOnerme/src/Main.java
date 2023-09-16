import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int degree;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        degree = inp.nextInt();

        if (degree <5 ) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if (degree >= 5 && degree < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (degree >= 15 && degree < 25) {
            System.out.println("Piknik yapmak için güzel bir gün.");
        }
        else if (degree >= 25) {
            System.out.println("Yüzmek size iyi gelecektir.");
        }
    }
}
