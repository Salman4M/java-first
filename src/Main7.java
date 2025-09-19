public class Main7 {
    public static void main(String[] args){
        Student.calculate();
        /*
        bu deyisenler yaddas olaraq student classina aiddirler (bunu static keywordu sayesinde edirler)
        benzetme etmeye calisaq. Bir restoran fikirles, sadece tek bir stol ve 3 stul var. yeni tutumu 3-dur
        yeni bir stol acmaq mumkun deyil. Sadece insanlar deyisir. Stullar yerinde qalir
         */

        Student.name = "hello";

        Student.surname = "wassup";

        Student.age = 27;
        /*
        instance attribute-unda ise, 1 stol yox 10 stol ve her birinde 3 stul var (stul sayini attribute sayina
        uygun fikirles). 1 stol doludursa insanlar diger stollara kecid edebilir. Cunki bos yerler var
        classin yaddasinda yer tutmadiqlari ucun (amma classa aiddirler)
        Student obyektini yaradib ve onun deyisenlerinden istifade edirik. Onlarin deyerleri basqa bir yaddas
        yerinde saxlanilirlar
         */
        Student others = new Student();
        others.address = "Baku";
        others.height = 181;
        others.number = 2000;
//
//        System.out.println("--------");
//        PrintItFunc(others);// yaddasdaki yeri(referance): Student@1b6d3586
//        System.out.println("--------");

        Student others2 = new Student();
        others2.address = "London";
        others2.height = 192;
        others2.number = 2002;
        /*
         iki classda yer tutmayan obyekt deyisenlerini bir birine beraber etsek deyerler uygun
         olaraq menimsedilecek
         */


//        others=others2;
//        System.out.println(others.address); //: London
//        System.out.println(others2.address);//: London


        /*
         student tipinden (class) istifade ederek 2 obyekt  yaratdiq. Bu obyektlerin attributelarina verdiyimiz
         deyerleri Student classinda PrintThemFunc methodu ile print edirik. Sorussaq ki metodun hec biri parametri
         olmadan attributelari nece gorur. Sebebi ise bu metodla attributelar eyni classin icerisinde oldugu ucun
         onlari parametr kimi vermeye ehtiyac qalmir ve avtomatik olaraq deyerleri goturur.
         */
        Student[] allThem = new Student [2];
        allThem[0]= others;
        allThem[1] = others2;

//        for(int i=0;i<allThem.length;i++){
//            allThem[i].PrintThemFunc();
//        }
        //neticesi bele olacaq
        //: 2000 181 Baku
        //: 2002 192 London


        /*
        bele bir sey de edebilerik. Classin yaddasinda olan deyisene yuxaridaki deyisenler kimi (classin
        yaddasinda olmayan ) davransaq, misal ucun others obyektinden class-in yaddasinda olan bir
        deyiseni goturerek onun deyerini deyise bilirik. Yeni bu yeni bir classdan kenar deyisen yaratmir.
        sadece bu deyiseni classin yaddasindan goturub ona deyer verir
         */
//        others.surname = "como estas";
//        System.out.println(others.surname); //: como estas
//        System.out.println(Student.surname); //: como estas

        //print edib baxsaq

//        System.out.println(others.address);
//        System.out.println(others.height);
//        System.out.println(others.number);

        //yeni bu sekilde artiq cagira bilmerik
//        System.out.println(Student.address);
//        System.out.println(Student.height);
//        System.out.println(Student.number);



//
//        System.out.println(Student.name); // : hello
//        change();
//        System.out.println(Student.name); // : bonsua
//
//        System.out.println(Student.surname); // : wassup
//        System.out.println(Student.age); // : 27

    //metodumuzu istifade ederek yeni obyekt yaradaq
    // Classlar ancaq classin oz metodlarini istifae ede biler gorsenir.
    // Elece de obyekt metodlari, ancaq obyekt metodlarini istifade ede biler
//    Student obj_by_method = Student.TakeAndGiveBack();
    //ve deyerlerimize baxaq
//        System.out.println(obj_by_method.number);//:2003
//        System.out.println(obj_by_method.address);//:Dublin
//        System.out.println(obj_by_method.height);//:185

        //public olmayan classin istifadesi
//        Homies.PrintSome();
        //obyektden static deyerin deyisdirilmesi
//        Student s = new Student();
        /*
        gorunduyu altindan xett cekir. yeni deyir ki bu attribute staticdir (eyrilik static oldugunu gosterir.Bu
        hem classda hem de obyetke bas verir)

         */
//        s.surname = "hiiii guysss";


        /*
        indi ise bele bir sey edek. Bir obyekti digerine beraber edende hemin obyektin referansini almis oluruq.
         Ele bil ki obyekte referance alir. Asagida da her iki obyektin referansi 543-dur
        Referance vasitesile sadece obyekte muraciet edebilirik. Onun tutduyu yer yaddasi baresinde hec ne ede bilmirem
        (ve obyektin ozune hec bir deyisiklik edebilerik)
        Pointer ise bu cehetden daha cox funksionalliga malikdir. O hem obyekt hem de obyektin tutdugu yaddas yeri
        baresinde herseyi edebilir
         */
        Student a = new Student();//a:Student@543
        Student b = ClassChange(a);//:b:Student@543 a:Student@543
        b.name = "NewMan";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.name); //NewMan
        System.out.println(b.name); //NewMan


        /*
        obyekt yarandiqda iki essa hisseye bolunur
        old ve new generation .Ilk olaraq her bir obyekt yarandiqda o new generation olaraq yaranir.
        Iki obyekt yaratsaq (a ve b) tebii olaraq onlarin yaddas yerleri ferqli olacaq
        ilk yaratdigimiz obyekte (a) ikinci yaratdigimiz obyekti (b) menimsedsek artiq a ilk obyekte aid olan
        referansini itirmis olur ve artiq bu obyekt bir muddetden sonra  old generationa cevrilir. a obyekti ise
        b obyektinin referansini menimsemis olur. bu silinme prosesini Garbage collector adli bir method icra edir.
        Hemin metodu cagirsaq bele prosesi hemin anda icra etmir. Istediyi anda yerine yetirir. (onu etmek ucun de
        System.gc() -ni istifade edirik)
         */


        /*
        java proqrami run olduqda jvm evvelce byte kodu tercume edir.Kodu tekrar tekrar tercume etmek (interpret),
        xususi ile metodlarin ve looplarin istifadesi semeresiz olabilir. Jit compiler ise en aktiv noqteleri
        (hot spots) teyin ederek bu problemi aradan qaldirir.
        jit interpretasiya olmus byte kodun en cox istifade olunan yeni en aktiv noqtesini tercume eliyir
         */

        /*
        her emeliyyat sisteminin ozune mexsus jvm-i var, amma butun java kodlari emeliyyat sisteminden asili
        olmayaraq oxuna bilir
        Out qovlugunda bir java faylinin compiled olunmus versiyalari var onlar bytecodelarla ifade olunub.
        Buna baxmaq ucun hemin fayli notepadda acmaq kifayet edir. Bu prosesi "javac" proqrami icra edir.
        O hemin java proqramini oxuyur (hansi ki biz java fayllar yaradiriq) ve onu compile edir.
        Compile codu oxuyub ise salan proqram ise "java" adlanir.
        praktiki olaraq bunu tetbiq etmeye calisaq
        Her hansi bir java faylini (Main -i secdik) burdan goturub basqa bir qovluga atiriq (komputerin istenilen
        yerinde olan bir qovluq). Ve daha sonra o qovlugu intellijde aciriq. Ilk olaraq hemin faylin compile
        olunmus versiyasin yaradiriq (javac Main.java). Goreceyik ki elave olaraq Main.class - fayli yarandi ve
        biz bilirik ki bu compiled olunmus fayldi (icerisini gormek ucun vim Main.class ve ya fayllardan bax).
        Indise ise "java Main" deyerek Main proqramini ise salmis oluruq.
          */
        /*
        jdk - java development kit (compile ucun) "javac.exe"
        jre - java runtime environment (proqrami run etmek ucun ve jvm-i ise salir "jvm.dll") "java.exe"
         */


    }



    public static void PrintItFunc(Student t){
        System.out.println(t);
    }

    public static void change(){
        Student.name = "bonsua";
    }
    public static Student ClassChange(Student s){
        Student.name = "bonsua";
        return s;
    }
}


