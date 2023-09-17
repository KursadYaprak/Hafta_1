import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);    //kullanıcıdan veri almak için bu kısmı ekliyoruz.

        int km, yas, yolTip;                             // gerekli int değerleri burada.
        double norTut, yasInd, indTut, gidDon, toplam;   // buradaki değerleri double aldık çünkü çarpma bölme işlemlerine taabi olacaklar.
        boolean isError = false;                         // eğer hata verdiren mesajda değişiklik yapmak istersek her satıra gidip değiştirmek zorunda kalmamak için boolean atadık.

        System.out.print("Mesafeyi km türünden giriniz : ");   // mesafeyi km cinsinden alıyoruz.
        km = inp.nextInt();

        if (km < 0) {                                          // km eksi girilirse hata mesajı verecek.
            isError = true;
        } else {                                                 // km pozitif girildi ise yaşını sorma kısmına geçiyoruz.
            System.out.print("Yaşınızı Giriniz : ");
            yas = inp.nextInt();

            if (yas < 0) {                                     // yaş eksi girilirse hata mesajı verecek.
                isError = true;
            } else {                                           // yaş pozitif girildi ise yolculuk tipini soruyoruz.
                System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş : ");       // kullanıcı yolculuk tipini girerek seçiyor.
                yolTip = inp.nextInt();

                if (yolTip < 1 || yolTip > 2) {                // kullanıcı 1 veya 2 girmez ise hata mesajı verecek.
                    isError = true;
                } else {                                       // kullanıcı doğru iki seçenekten birini seçer ise işlemler devam ediyor.
                    if (yas < 12 && yolTip == 1) {                                  // 12 yaş altı tek yön sonucu.
                        norTut = km * 0.10;
                        yasInd = norTut * 0.50;
                        indTut = norTut - yasInd;
                        System.out.println("Toplam Tutar : " + indTut + " TL");
                    } else if (yas < 12 && yolTip == 2) {                           // 12 yaş altı gidiş dönüş sonucu.
                        norTut = km * 0.10;
                        yasInd = norTut * 0.50;
                        indTut = norTut - yasInd;
                        gidDon = indTut * 0.20;
                        toplam = (indTut - gidDon) * 2;
                        System.out.println("Toplam Tutar : " + toplam + " TL");
                    } else if (yas >= 12 && yas <= 24 && yolTip == 1) {             // 12-24 yaş arası tek yön sonucu.
                        norTut = km * 0.10;
                        yasInd = norTut * 0.10;
                        indTut = norTut - yasInd;
                        System.out.println("Toplam Tutar : " + indTut + " TL");
                    } else if (yas >= 12 && yas <= 24 && yolTip == 2) {             // 12-24 yaş arası gidiş dönüş sonucu.
                        norTut = km * 0.10;
                        yasInd = norTut * 0.10;
                        indTut = norTut - yasInd;
                        gidDon = indTut * 0.20;
                        toplam = (indTut - gidDon) * 2;
                        System.out.println("Toplam Tutar : " + toplam + " TL");
                    } else if (yas >= 65 && yolTip == 1) {                          // 65 yaş üstü tek yön sonucu.
                        norTut = km * 0.10;
                        yasInd = norTut * 0.30;
                        indTut = norTut - yasInd;
                        System.out.println("Toplam Tutar : " + indTut + " TL");
                    } else if (yas >= 65 && yolTip == 2) {                          // 65 yaş üstü gidiş dönüş sonucu.
                        norTut = km * 0.10;
                        yasInd = norTut * 0.30;
                        indTut = norTut - yasInd;
                        gidDon = indTut * 0.20;
                        toplam = (indTut - gidDon) * 2;
                        System.out.println("Toplam Tutar : " + toplam + " TL");
                    } else if (yas > 24 && yas < 65 && yolTip == 1) {                // 24-65 yaş arası tek yön sonucu.
                        norTut = km * 0.10;
                        System.out.println("Toplam Tutar : " + norTut + " TL");
                    } else if (yas > 24 && yas < 65 && yolTip == 2) {                // 24-65 yaş arası gidiş dönüş sonucu.
                        norTut = km * 0.10;
                        gidDon = norTut * 0.20;
                        toplam = (norTut - gidDon) * 2;
                        System.out.println("Toplam Tutar : " + norTut + " TL");
                    }
                }
            }
        }
        if (isError) {                                             // bu ifadenin true olduğu her kısımda alttaki mesaj ekrana verilecek.
            System.out.println("Hatalı Veri Girdiniz !");          // bunu yaptık çünkü sadece "" kısımları arasındaki mesajı değiştirerek tüm satırlardaki hata mesajını değiştirmiş ve zaman kazanmış olacağız.
        }
    }
}
