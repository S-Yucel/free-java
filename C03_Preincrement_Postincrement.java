package ders06_increment_decrement;

public class C03_Preincrement_Postincrement {
    public static void main(String[] args) {
        int sayi = 10;

        sayi++;
        System.out.println(sayi); //11

        //Postincrement
        ++sayi;
        System.out.println(sayi); //12

        System.out.println(sayi++); //bu satırda java önce sayının eski değerini yazdıracak
                                    // sonra sayi yı 1 arttıracak ve 13 yapacak
        System.out.println(sayi); //13

        //Preincrement
        System.out.println(++sayi); //bu satırda java önce sayının değerini 1 arttıracak sayi=14
                                    //sonra yazdıracak 14
        System.out.println(sayi); //14

    }
}
