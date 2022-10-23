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

        // eşit değil mi için != kullanırız sonuc true veya false döner
        // And oparatörü çift && veya tek & kullanılır.
        // çift && hem hem yani hepsinin doğru veya hepsinin yanlış olması gerekir.
        // ilk bulduğu hatada işlemi sonlandırır ve atamayı yapar
        // tek & ise hatayı bulsada işlemi sonuna kadar devam ettirdikten sonra
        // atamayı yapar


        //Or (veya) operatörü || işareti ile gösterilir. 2 boolean ifadenin
        // ikiside false olmadığı sürece true döner.
        // Yani ifadelerden birinin true olması or oparatörü için yeterlidir
    }
}
