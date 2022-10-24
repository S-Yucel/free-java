package ders09_IfElseStatements;

import java.util.Scanner;

public class C04_BagimsizIfOrnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Geçersiz not");
        } if (not>=85){
            System.out.println("AA");
        } if (not>=65){
            System.out.println("BB");
        } if (not>=50){
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }
    }
}
