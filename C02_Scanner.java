package ders03;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan dairenin yarıçapını alıp hesaplayıp, yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarıçap giriniz");
        double yariCap = scan.nextDouble();
        double daireAlani = 3.14*yariCap*yariCap;
        System.out.println("Dairenin alanı : " + daireAlani);






    }
}
