package ders03;
import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String kullaniciAdi = scan.next();
        System.out.println("Girilen kullanıcı adı : " + kullaniciAdi);

        Scanner scanner = new Scanner(System.in);
        String kullaniciAdSoyad = scan.nextLine();
        System.out.println("Girilen kullanıcı adı : " + kullaniciAdSoyad);

        // next tek metin yazdırır
        // nextline birden fazla metin varsa kullanılır

    }
}
