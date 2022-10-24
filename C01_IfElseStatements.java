package ders09_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        /* Soru 1- Kullanıcıdan bir üçgenin kenar uzunluğunu alın,
        üçgen eşkenar ise "Eşkenar üçgen" yazdırın,
        değilse "Eşkenar değil" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını giriniz," +
                "\nHer kenardan sonra enter'a basın");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eşkenar üçgen");
        } else {
            System.out.println("Eşkenar üçgen değildir");
        }

    }
}
