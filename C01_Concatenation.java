package ders07_concatenation_operators;

public class C01_Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Verilen iki değerin toplamı : " + (a+b));

        // Girilen 10 ve 20 sayılarının toplamı : 30
        System.out.println("Girilen " + a + " ve " + b + " sayılarının toplamı :" + (a+b));

        /*
        Not: eğer matematiksel bir işlemin içinde String kullanılıyorsa, matematikteki
        öncelikler dikkate alınarak işlem yapılır.Sıra String ile toplamaya geldiğinde
        toplama yerine Concatenation uygulanır
         */

        System.out.println("Sayıların toplamı : " + a + b); //1020
        //yani önce sayıların toplamı + a olur sonra b eklenir



    }
}
