package ders09_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru: Kullanıcıdan kilo(kg) ve boyunu isteyip (cm),
        vücut kitle endexini hesaplayın (kilo*10000/boy*boy)
        vücut kitle endexi 30dan büyükse obez,
        25-30 arası ise kilolu,
        20-25 arası ise normal,
        20 den küçük ise zayıf yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuzu cm olarak giriniz");
        double boy = scan.nextDouble();

        double vucutKutleEndexi = kilo*10000 / (boy*boy);
        System.out.println("Vücut Kütle endexiniz : " + vucutKutleEndexi);

        if (vucutKutleEndexi >= 30){
            System.out.println("Obez");
        } else if (vucutKutleEndexi >= 25){
            System.out.println("Kilolu");
        } else if (vucutKutleEndexi >= 20){
            System.out.println("Normal");
        } else {
            System.out.println("Zayıf");
        }





    }
}
