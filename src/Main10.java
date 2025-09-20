import com.sun.org.apache.xml.internal.utils.res.StringArrayWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;

import java.sql.Wrapper;

public class Main10 {
/*
bu iki deyisenin burda isleme sebebi class yuklenende icindeki her sey yuklenir deye onlarin deyerleri de
yuklenmis olur
 */
    //wrapper type
//    static int i1; //:yaddasda int deyiseni ucun yer tutur ve ilkin deyeri birdir
//    static Integer i2;//:int ucun yox deyisen kimi yer tutur

    public static void main(String[] args){
        /*
        metodda ise class yuklenib qurtarannan sonra metod ise dusur ve asagidaki hisse islemey baslayir ve
        biz deyisenlere deyer vermemisik yeni onlar deyersiz deyisen kimi oxunur amma metod bizden deyer gozleyir

         */
//        int i1;
//        Integer i2;
        //deyerleri versek
//        int i1=0; //primitive type
        /*
        Integer bir classdir ve onun daxilinde de bir constructor var , hansi ki int tipinde data goturur ve
        oz private deyiseni olan value-ye oturur
         */
//        Integer i2 = null; //wrapper type
        /*
        bu sekilde yaza bilerik.Biz bunu etdiyimiz zaman yaddasda Hem Integer obyekti hem de deyisen ucun
        yer ayrilir.Bele istifadenin ustunluyu odur ki , biz elave metodlardan istifade edebilerik amma
        i1 ucun bunlar elcatan deyil.
        daha bir ustunluyu ise biz ona null deyeri verebilirik. Bu zaman demis oluruq ki yaddasda yer tutma.
        Amma adi int tipli deyisende bunu ede bilmirik
        menfi cehete ise yaddasda hem obyekt hem deyisen ucun yer tutdugu ucun yaddasi boyuk olur
        */

        Integer i2=new Integer(5);//wrapper type
//        int i2 = 0; // : autoboxing
//        int i3 = i2.intValue(); // unboxing (ele bil ki tersine ceviririk)
        int i4 = i2; //auto unboxing
        /*
        integeri stringe cevirmek ucun
         */
        String b = i2.toString();
//        System.out.println(i1); //:0
        System.out.println(i2);//:null
        /*
        butun datatipler ucun wrapper typelar var
         */
        byte v = 0;
//        Byte vv = new Byte((byte)0);
        Byte vv = 0;

        long l = 0;
//        Long ll =new Long(0l);
        Long ll =0l;

        char c = ' ';
        Character cc = ' ';

        boolean f = true;
        Boolean ff = true;
        /*
        stringin wrapper type-i yoxdur. Char-in massive-ni ozunde
        saxlayir. String classina gederek baxa bilerik
         */
//        String s = new String("Java");
        char[] s = {'J','a','v','a'};
        String ss = new String(s); //bele olan halda hem obyekt hem de massive ucun yer tutur
/*
biz new Integer deyende ondan yeni obyekt yaratmasini teleb edirik amma her ikisine eyni deyeri
gondermisik ve neticeleri de eyni olacaq. Amma auto boxing istifade edende burada ferqli hadiseler
bas verir
 */
        Integer f1= new Integer(9);
        Integer f2= new Integer(9);
        /*
        autoboxingde eyni deyerli iki integer tipli obyekti bir yaddasda verir. Yeni
        eyni parametr deyerli basqa bir obyekti yaratmir.
         */
        Integer d1 = 9; //:Integer@543
        Integer d2 = 9; //:Integer@543
        /*
        amma bunun da bir limiti var. Parametrin maximum deyeri 127-dir.127-ye kimi
        bu emeliyyati eyni qaydada icra edir
         */
        Integer z1 = 128; //:Integer@544
        Integer z2 = 128; //:Integer@545

        Integer h1 = 120;
        Integer h2 = 127;
        System.out.println(f1==f2);//burda referance ferqlidir : false
        System.out.println(d1==d2);//burda ise bilirik ki referanc eynidir (autoboxinge gore):true
        System.out.println(z1==z2); //burda da referanceler ferqlidir
        System.out.println(h1==h2); //burda da referanceler ferqlidir cunki deyerler eyni deyil

    }





}
