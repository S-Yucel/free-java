package ders04_dataCasting;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {
        int a = 'a' + 'b';
        System.out.println(a); // a 195 çıkar çünkü ascii değerlerini toplar ascii a=97 ascii b=98.
                               // 97+98 =195
        System.out.println('a' + 'b'); //195 matematiksel işlemlerde ascii değerleri toplanıyor

        System.out.println(" " + 'a' + 'b'); // başta string olduğu için char olarak sonuç verir

        // kullanıcıdan char alınmak istendiğinde örnek
        // ascii  tablosunda bu karakterden sonraki 3 karakteri yazdırın dersek

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        System.out.println("Girilen karakter : " + girilenKarakter);

        System.out.println("girilen karakterin bir sonrası :" + (char) (girilenKarakter+1));
        System.out.println("girilen karakterin iki sonrası :" + (char) (girilenKarakter+2));
        System.out.println("girilen karakterin üç sonrası :" + (char) (girilenKarakter+3));
    }
}
