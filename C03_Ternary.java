package ders11_TernaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan notunu alın.50 yada daha büyükse "Sınıfı geçtin"
        50 den küçükse "Maalesef kaldın" yazdırın.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double girilenNot = scan.nextDouble();

        System.out.println(girilenNot>=50 ? "Sınıfı geçtin" : "Maalesef kaldın");


    }
}
