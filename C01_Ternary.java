package ders11_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*Kullanıcıdan bir sayı alın,
        sayıyı kontrol edip 5 ile bölünebiliyorsa "Sayı 5 in tam katıdır" yazdırın.
        Bölünemiyorsa "Sayı 5 in tam katıdır değildir" yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println(girilenSayi%5==0 ? "Sayı 5 in tam katıdır" : "Sayı 5 in tam katıdır değildir");
    }
}
