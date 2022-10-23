package ders06_increment_decrement;

public class C02_Preincrement_PostIncrement {
    public static void main(String[] args) {

        // sayi değerini oluşturacağımız b değerine atayalım
        //ve sayi değerini 1 artıralım

        int sayi =10;
        int b = sayi;
        sayi++;

        System.out.println(b);  //10
        System.out.println(sayi); //11

        //yukardaki işlemi bir seferde yapmak istersek:
        // sayi değerini oluşturacağımız c değerine atayalım
        //ve sayi değerini 1 artıralım

        int c = sayi++; //bu satırda 2 işlem var çnce atama yapıyor sonra arttırıyor

        //önce artırma yapılsın istersen ++sayi; -Preincrement
        //artırma sonra yapılsın istersen sayi++; -Postincrement

        System.out.println(c); // 11
        System.out.println(sayi); // 12

        sayi=11;
        c= ++sayi;
        System.out.println(c); // 12
        System.out.println(sayi); // 12



    }
}
