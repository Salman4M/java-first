
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        char a = 'c';
        int u = a;
//        System.out.println(a);// : c
//        System.out.println(u); // : bize ascii cedveline c herfinin qarsiligini verir : 99
//        /*
//        kicik simvolun deyerinden 32 cixdigda boyuk simvolunun ascii deyerini almis oluruq
//         */
//
//        char kicik_herf = 'c';
//        int kicik_reqem = kicik_herf;
//        int boyuk_reqem = kicik_reqem-32;
//        char boyuk_herf = (char)boyuk_reqem;
//        System.out.println(boyuk_herf);//: C

        //ve ya bu sekilde
        int c_herf = (int)'c'; // bize ascii deyerini qaytaracaq : 99
        char c_reqem = (char)99; //bize bu ascii deyerdeki simvolu qaytaracaq:c
//        System.out.println(c_herf); //: 99
//        System.out.println(c_reqem);//: c

        /*
        char data tipinde bele bir xususiyyet var ki ,bir riyazi emeliyatda istifade olunan
        herflerin yeni character-lerin ascii deyerlerini istifade edir.Misal ucun
        char bir deyeri scanner-den alib uzerine bir char deyer gelsek (yeni toplama emeliyyati)
        onlarin ascii deyerlerini toplayib ve o deyere uygun simvolu ve ya herfi bize verir.

//         */
//        char small_let = new Scanner(System.in).nextLine().charAt(0); // :c
//        char big_let = (char)(small_let - 32);
//        System.out.println(big_let); // : C
////
//        char ch_let = (char)(small_let + 'd');
//        System.out.println(ch_let);
        int g_herf = (int)'Ç';//    :199
        int d_herf = (int)'d';//    :100
        int c_herf2 = (int)'c';//    :99
        /*
        evaluate expression deye bir tool var ki , istediyiniz setrdeki emeliyyati secib
        neticesini gore bilersiz. ALT+F8 di amma ki nese calisdira bilemedim
         */
        byte number_byte = 127;
        short s = 32767;
        int number_int= 2147483647;
        /*
        longun sonuna 'l' elave etmek lazimdi ki onu int kimi gormeye davam elemesin.
        eger reqem int-in max ve minimum deyerleri serhedleri daxilinde deyilse long-da
        'l'in istifadesi mecburdur
        */
        //burda mecburdur
        long number_long =9223372036854775807l;
        //burda deyil
        long other_long =2412412;
        /*
        float ve double data diplerinde de eyni senari var. Float tipli deyisene deyer verdikde
        hemin deyeri double olaraq gorur ve qebul etmir. Bu zaman hemin deyeri float-a cevirmek
        lazimdir ki error almayaq
         */
        double f =4.3;
        //misal ucun
//        float i = 4.3;
        //floata cevirsek hec bir problem qalmir
        float j = (float)4.3;
        //casting bu autocasting sayilir. Cunki deyisdirilen data tipin yaddasi daha boyukdur
        //no problem for short to int
        short to_numb = 32767;
        int numb = to_numb;
        //
         /*
         when you
          */
        /*
        short datatipi ucun max ve minimum 32767 ve -32768-di. Eger int deyer max-i 1 vahid
        kecibse artiq short deyer min deyere beraber olacaq. Eger 1 vahid kecibse artiq bu min deyerden
        1 vahid 1 vahid ireli dogru getmeye baslayacaq (menfiden musbete dogru)

        yox eger int deyer min-u 1 vahid kecibse artiq short deyer max deyere beraber olacaq.Eger 1 vahid
        de kecibse bu 1 vahid 1 vahid geriye dogru getmeye baslayacaq (musbetden menfiye)
         */
        int from_numb = -32770;
        int from_numb2 = 32771;

        short to_short = (short)from_numb;
        short to_short2 = (short)from_numb2;
//        System.out.println(to_short); //: 32766
//        System.out.println(to_short2);//: -32765

        System.out.println(Byte.MAX_VALUE);//:127
        System.out.println(Byte.MIN_VALUE);//:-128

        System.out.println(Short.MAX_VALUE);//:32767
        System.out.println(Short.MIN_VALUE);//:-32768

        System.out.println(Integer.MAX_VALUE);//:2147483647
        System.out.println(Integer.MIN_VALUE);//:-2147483648

        System.out.println(Long.MAX_VALUE);//:9223372036854775807
        System.out.println(Long.MIN_VALUE);//:-9223372036854775808
    }
}
