package ders03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan isim, soyisim ve yaş alıp
        ismin ilk harfi, soyisim ve yaş olarak yazdır
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz :");
        String ad = scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz :");
        String soyad = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("Girilen bilğiler : " + ad.charAt(0) +  ", " + soyad + ", " + yas);



    }
}
