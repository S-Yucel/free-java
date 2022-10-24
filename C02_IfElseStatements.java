package ders09_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanıcıdan notunu alın,
        50 veya daha büyükse "Sınıfı geçtin",
        50'den küçükse "Maalesef kaldın" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen not giriniz");
        double not = scan.nextDouble();

        if (not>=50){
            System.out.println("Sınıfı geçtin");
        } else {
            System.out.println("Sınıfta kaldın");
        }

    }
}
