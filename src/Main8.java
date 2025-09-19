public class Main8 {

    /*
                                            PASS BY VALUE PRINSIPI
    methoda temp deyisenini oturende biz deyisenin ozunu yox onun deyerini otururuk.Cunki biz onun sadece
    referance-nin yolunu gonderirik, yaddas yerini yox. Bu sebebden hemin deyisende hec bir deyisiklik bas vermir
    ve bize oldugu kimi qayidir.
     */
    public static void main(String[] args){
//        int temp = 4;
//        foo(temp);
//        System.out.println(temp); //:4

    /*
    indi ise obyektle yoxlayaq.Biz burada obyektin ozunu gonderirik (referansini). Bu sebebden etdiyimiz deyisikler
    ona tesir edir
     */
        Student s = new Student();
        s.number = 4;
//        fooObj(s);
//        System.out.println(s.number);
        ///
        /*
         yox eger metodda yeni bir obyekt yaratsaq (gonderdiyimiz referansdan istifade ederek hansi ki "s" -dir)
         artiq basqa bir referans yaranmis olur (yeni obyektin referansi) ve gonderdiyimiz obyektle arasindaki
         olan referans qirilir ve artiq hec bir asililiq qalmir.
         */

//        fooNew(s);
//        System.out.println(s.number); // : 4
/*
bele bir sey edek indi. Obyekte obyekt menimsedirik. Cunki hemin metoddan return olaraq obyektin ozu gelir
Bunu etdiyimiz zaman her iki obyekt eyni referance-a baxir
 */
//        Student ss = ExtrFoo(s);
//        System.out.println(s.number); //: 5
//        System.out.println(ss.number);//: 5
/*
indi ise fooNew-daki metodda yeni obyekt yaradaq ve eyni kodun neticesine baxaq
Burada ise daha ferqli proses gedir. 535 referancli s obyektini bu metoda gonderirik amma icerisinde
yeni bir obyekt yaradiriq hansi ki 536 referanclidi (yeni 535 referansli s obyektinde hec bir deyisiklik etmirik
Ve hemin obyektin number attribute-na deyer veririk ve hemin obyekti (536) obyeki return edirik. Bu zaman ss
obyektinin referansi 536-a beraber olur. Yeni bu iki obyekt eyni referanci bolusur. S obyektinde hec bir deyisiklik
bas vermediyi ucun evvelceden verdiyimiz 4 deyeri oldugu kimi qalir, ss-ise 536 referansli obyektdeki s.number = 5
deyerini alir
 */
        Student ss = NewExtrFoo(s);
        System.out.println(s.number); //: 4
        System.out.println(ss.number);//: 5


    }
    public static Student ExtrFoo(Student s){
        s.number = 5;
        return s;
    }
    public static Student NewExtrFoo(Student s){
        s = new Student();
        s.number = 5;
        return s;
    }


    public static void fooNew(Student s){
        s = new Student();
        s.number = 5;
    }


    public static void fooObj(Student t) {
        t.number = 5;

    }
        public static void foo(int a){
            a = 5;
            System.out.println(a);

        }

}



