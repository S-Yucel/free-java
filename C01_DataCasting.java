package ders04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {



    int a = 134;
    double b = 23.4;
    short c = 34;
    byte d = 14;

    double e = a; // değerin data türü int, variable ın data türü değerin data türünden geniş
                  // yani double alanı > int

    int f = c; // değerin data  türü < variable ın data türü  yani int<short

    short g = d; // değerin data türü < variable ın data türü yani short>byte
                 // değerin değişkenlerden küçük olduğu durumlarda
                // java otomatik olarak çevirir buna autowidening denir.


    /*
    // otomatik çevirilmeyenler
    short h = b; // variable data türü short < b data türünden

    byte l = a; // variable data türü byte < a nın data türü int

    int m = b; // variable ın data türü < b nin data türü double
     */

    // illada daha kapsamlı bir değeri daha az kapsamlı bir değişkene
    // çevirmek istersek explicit narrowing yapılır.Ancak buda veri kaybına sebep olabilir
    // yada Java datayı yeni data türüne çevirmek için değiştirebilir
    // mesela double int e çevirdiğimizde ondalıklı kısmı atar
    short h = (short)b;
        System.out.println("double 23.4 ün short karşılığı : " + h);
    byte l = (byte)a;
        System.out.println("int 134 ün  byte karşılığı : " + l);

    int m = (int)b;
        System.out.println("double 14 ün int karşılığı : " + m);
    }
}
