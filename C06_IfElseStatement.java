package ders09_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir tam sayı alın,
        sayı 3 ile bölünebiliyorsa "Üç ile bölünebilen sayı" yazdırın,
        sayı 5 ile bölünebiliyorsa "Beş ile bölünebilen sayı" yazdırın,
        hem 3 hem 5 ile bölünebiliyorsa "Süper sayı" yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int tamSayi = scan.nextInt();

        if (tamSayi%3==0 && tamSayi%5==0){
            System.out.println("Süper sayı");
        } else if(tamSayi%3==0){
            System.out.println("Üç ile bölünebilen sayı");
        } else if (tamSayi%5==0){
            System.out.println("Beş ile bölünebilen sayı");
        }
    }
}
