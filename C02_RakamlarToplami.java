package ders05_wrapperClass;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {
        // Kullanıcıdan alınan 3 basamaklı pozitif bir tamsayının rakamlar toplamını bul

        System.out.println(23 / 5);  //4,6 iken rakamlar int olduğu için 4 tamsayı olarak yazdırır

        System.out.println(123 % 10); //3 (%10 birler basamağını bulmamızı sağlar)
        System.out.println(123 / 10); // sonuc 12.3 int olduğu için 12 ye yuvarlar

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz");
        int sayi = scan.nextInt();
        int birlerBas = 0;
        int rakamlarTopl = 0;

        //3 basamak için aynı işlemi 3 kere yapmalıyız
        // girilen sayının birler basamağı 3  için
        birlerBas=sayi % 10; //3
        rakamlarTopl = rakamlarTopl + birlerBas; //3
        sayi =sayi / 10; //12

        // girilen sayının onlar basamağındaki 2  için
        birlerBas = sayi%10; //12 % 10 sonuc ==> 2
        rakamlarTopl = rakamlarTopl + birlerBas; // 3+2 =5
        sayi = sayi / 10; // 12/10 = 1.2 ==>1

        // girilen sayının yüzler basamağındaki 1  için
        birlerBas = sayi%10; // 1%10 =1
        rakamlarTopl = rakamlarTopl + birlerBas; //5+1=6
        sayi = sayi / 10; //1/10=0.1 ==>0

        System.out.println("Sayının rakamlar toplamı : " + rakamlarTopl);


    }
}
