import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int check = 0;

        System.out.print("2 ");
        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k != 0) {
                    check++;
                    if (check == i - 2) {
                        System.out.print(i + " ");
                        check = 0;
                        break;
                    }
                } else {
                    check = 0;
                    break;
                }
            }
        }
        System.out.println();
    }
}
