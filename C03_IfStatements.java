package der08_basitifStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        Soru 3 - Kullanıcıdan bir sayı alın,
        sayı 3 ile bölünüyorsa "3 ile bölünebilen bir sayı",
        sayı 5 ile bölünüyorsa "5 ile bölünebilen bir sayı", diye yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0) {
            System.out.println("3 ile bölünebilen bir sayı girdiniz");
        }
        if (girilenSayi % 5 == 0) {
            System.out.println("5 ile bölünebilen bir sayı girdiniz");
        }
        /*
        if cümlesinden sonra {} süslü parantez kullanılırsa,
        if şartı sağlandığında {} içi tamamen çalışır.
        Şart sağlanmaz ise {} içi hiç çalışmaz.

        Ancak {} kullanılmaz ise, java if body' si olarak
        if şartından sonra ilk ; e kadar olan kısmı alır.
        Geriye kalan kodların if cümlesi ile ilgisi olmaz, bağımsız çalışır.

         */


    }
}
