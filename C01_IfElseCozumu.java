package ders10_NestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseCozumu {
    public static void main(String[] args) {
        /*
        Örneğin : Kullanıcıdan cinsiyetini ve yaşını alın,
        Kadın, 60 yaş üzeri, Erkek 65 yaş ve üzeri emekli olabilir.
        Cinsiyeti ve yaşını dikkate alarak "Emekli olabilirisin"
        veya "Emekli olmak için ... yıl daha çalışman gerekli" yazdırın

        Çözümü ıf else ile yaparsak
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        if (yas<0 || yas>90){
            System.out.println("Geçersiz yaş girdiniz");
        } else if (!(cinsiyet.equalsIgnoreCase("Kadın") ||
                cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Geçersiz cinsiyet");
        } else if (cinsiyet.equalsIgnoreCase("Kadın") && yas>60){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("Kadın") && yas<60) {
            System.out.println("Emekli olmak için " + (60 - yas) + " yıl daha çalışman gerekli");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas>65) {
            System.out.println("Emekli olabilirsin");
       } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65) {
            System.out.println("Emekli olmak için " + (65 - yas) + " yıl daha çalışman gerekli");
        }
    }

}
