package der08_basitifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanıcıdan bir sayı isteyin,
        sayıyı kontrol edip 5 ile bölünebiliyorsa "Sayı 5 in tam katı" yazdırın.
         */
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int girilenSayi = scan.nextInt();
            if (girilenSayi % 5 ==0 ) {
            System.out.println( "Girilen sayı 5 in tam katıdır.");
        }


        }

    }

