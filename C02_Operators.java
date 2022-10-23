package ders07_concatenation_operators;

public class C02_Operators {
    public static void main(String[] args) {
        int a = 20;
       /* = işareti assignment'tır
        Java önce = tir işaretinin sağ tarafını yapar yani değeri bulur
        bulduğu değeri soldaki değişkene atar
        */

        int b = 20;
        // a ile b eşit ise....
        // a , b ye eşitmidir diye sorduğumuzda java == çift eşit işareti kullanır
        System.out.println(a==b); //true
        System.out.println(a==b+10); // false

        boolean c = 20==b;
        System.out.println(c);
    }
}
