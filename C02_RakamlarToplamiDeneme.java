package ders05_wrapperClass;

import java.util.Scanner;

public class C02_RakamlarToplamiDeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;
        System.out.println(sayi);

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;
        System.out.println(rakamlarToplami);

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;
        System.out.println(rakamlarToplami);

        
    }
}
