import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, passWord, newPass;
        int option;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        passWord = inp.nextLine();

        if (userName.equals("patika") && passWord.equals("patikaplus")) {
            System.out.println("Giriş Yaptınız.");
        }
        else {
            System.out.print("Şifreniz Yanlış !\nŞifrenizi Sıfırlamak İstermisiniz ?\nEvet - 1\nHayır - 2\nSeçiminiz ? :");
            option = inp.nextInt();

            if (option == 1) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPass = inp.nextLine();
                System.out.println("Yeni Şifreniz " + newPass + " Olarak Belirlendi !");
            }
            else if (option == 2) {
                System.out.println("Yeniden Giriş Yapmayı Deneyebilirsiniz.");
            }
            else {
                System.out.println("Hatalı Seçim Yaptınız !");
            }
        }
    }
}
