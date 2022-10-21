package ders04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayı alıp, bunları birbirine bölün
        //sonucu double olarak yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölünecek tam sayıyı giriniz");
        int a = scan.nextInt();
        System.out.println("Lütfen bölecek tam sayıyı giriniz");
        int b = scan.nextInt();
        System.out.println("Sonuç :" + a/b); //15:4 dersek = 3,75 yerine 3 yazdırır
        //Bölme işlemindeki sayıların her ikiside int olduğu için
        //Java sonucu int verir ondalıklı girilen değerleri yuvarlar

        // eger cast edersek, yani
        double sonuc = a/b;
        //Java önce sağ taraftaki işlemi yapar 3,75 i bulur.Sol tarafa atadıktan sonra double yapar
        System.out.println("bölümü double a atarsak : " + sonuc);

        double dogruSonuc = (double) a/b; //15.0 :4 = 3.75
        System.out.println("Doğru sonuc için double cast yapınca : " + dogruSonuc);

    }
}
