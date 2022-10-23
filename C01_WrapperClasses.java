package ders05_wrapperClass;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.toUpperCase());

        int sayiP = 20;
        // primitieve data türlerinin hazır metodları yoktur, sadece değer içerirler
        // Wrapper Class'lar primitieve data türleri ile aynı değerleri barındırırken
        //değerlerin yanında hazır metodlar da kullanmamıza imkan veren class'lardır
        //Wrapper Class'ları kendi ismini büyük harfle başlatarak kullanırız
        //Wrapper Classlar ve Primitieve Claslar birbirlerine atanabilir

        Integer sayiW = 20;
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        char karakP = 'a';
        Character karakW = 'b';

        System.out.println(Character.isDigit(karakP)); //false çünkü a bir sayı değil
        System.out.println(Character.isLowerCase(karakW)); //true

        String str2 = "1234";
        String str3 = "1000";
        System.out.println(str2+str3); //12341000
        System.out.println(Integer.valueOf(str2) + Integer.valueOf(str3)); //2234

    }
}
