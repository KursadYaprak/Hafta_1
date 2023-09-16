import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int month, day;
        boolean isError = false;

        System.out.print("Hangi ayda doğduğunuzu kaçıncı ay olduğuna göre sayı ile belirtiniz : ");
        month = inp.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Hatalı bir sayı girdiniz. 12 ay bulunmaktadır. 1 ila 12 arasında bir ay seçiniz.");
        } else if (month == 1) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 21 && day > 0) {
                System.out.println("Oğlak Burcusunuz.");
            } else if (day > 21 && day <= 31) {
                System.out.println("Kova Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 2) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 19 && day > 0) {
                System.out.println("Kova Burcusunuz.");
            } else if (day > 19 && day <= 28) {
                System.out.println("Balık Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 3) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 20 && day > 0) {
                System.out.println("Balık Burcusunuz.");
            } else if (day > 20 && day <= 31) {
                System.out.println("Koç Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 4) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 20 && day > 0) {
                System.out.println("Koç Burcusunuz.");
            } else if (day > 20 && day <= 30) {
                System.out.println("Boğa Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 5) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 22 && day > 0) {
                System.out.println("Boğa Burcusunuz.");
            } else if (day > 22 && day <= 31) {
                System.out.println("İkizler Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 6) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 23 && day > 0) {
                System.out.println("İkizler Burcusunuz.");
            } else if (day > 23 && day <= 30) {
                System.out.println("Yengeç Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 7) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 23 && day > 0) {
                System.out.println("Yengeç Burcusunuz.");
            } else if (day > 23 && day <= 31) {
                System.out.println("Aslan Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 8) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 23 && day > 0) {
                System.out.println("Aslan Burcusunuz.");
            }
            else if (day > 23 && day <= 31) {
                System.out.println("Başak Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 9) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 23 && day > 0) {
                System.out.println("Başak Burcusunuz.");
            } else if (day > 23 && day <= 30) {
                System.out.println("Terazi Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 10) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 23 && day > 0) {
                System.out.println("Terazi Burcusunuz.");
            } else if (day > 23 && day <= 31) {
                System.out.println("Akrep Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 11) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 22 && day > 0) {
                System.out.println("Akrep Burcusunuz.");
            } else if (day > 22 && day <= 30) {
                System.out.println("Yay Burcusunuz.");
            } else {
                isError = true;
            }
        } else if (month == 12) {
            System.out.print("Hangi günde doğdunuz : ");
            day = inp.nextInt();
            if (day <= 22 && day > 0) {
                System.out.println("Yay Burcusunuz.");
            } else if (day > 22 && day <= 31) {
                System.out.println("Oğlak Burcusunuz.");
            } else {
                isError = true;
            }
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}