package der08_basitifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /*
        Soru 2 - Kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.
        örnek: Kullanıcı küçük o veya büyük O yazdığında output Ocak olsun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char tekHarf = scan.next().charAt(0);

        if (tekHarf=='o' || tekHarf=='O'){
            System.out.println("Ocak");
        }
        if (tekHarf=='s' || tekHarf=='S'){
            System.out.println("Subat");
        }
        if (tekHarf=='m' || tekHarf=='M'){
            System.out.println("Mart veya Mayis");
        }
        if (tekHarf=='n' || tekHarf=='N'){
            System.out.println("Nisan");
        }
        if (tekHarf=='h' || tekHarf=='H'){
            System.out.println("Haziran");
        }
        if (tekHarf=='t' || tekHarf=='T'){
            System.out.println("Temmuz");
        }
        if (tekHarf=='a' || tekHarf=='A'){
            System.out.println("Agustos veya Aralık");
        }
        if (tekHarf=='e' || tekHarf=='E'){
            System.out.println("Eylül veya Ekim");
        }
        if (tekHarf=='k' || tekHarf=='K'){
            System.out.println("Kasım");
        }

    }
}
