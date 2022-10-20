package ders03;

import java.util.Scanner;

public class

C03_Scanner {
    public static void main(String[] args) {
    // kullanıcıdan bir kelime isteyip, kelimenin ilk harfini yazdır
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String ilkHarf = scan.next().charAt();
        
    }
}