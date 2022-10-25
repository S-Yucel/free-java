package ders11_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf isteyin, girilen karakter küçük harf ise
        onu büyük harf olarak yazdırın, yoksa girilen harfi yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char birHarf = scan.next().charAt(0);
        System.out.println(birHarf>'a' && birHarf<='z' ? (char)(birHarf-32) :birHarf);

    }
}
