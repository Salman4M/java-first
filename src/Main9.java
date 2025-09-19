import java.sql.SQLOutput;

public class Main9 {

/*
classin icinde static obyekt yaratmaq
Static obyekt oldugu ucun metodun icerisinde onu cagiranda aid oldugu classin adini qeyd etmek lazim gelir
 */
//    public static Student s;
////ve ya
//    public static Student a = new Student();
//
    public static void main(String[] args){
//        Student s = new Student();
//        Main9.s.number = 5;
//        System.out.println(Main9.s.number);
/*
    hemin o static olmayan obyekti cagiraq bu zaman sonsuz dovre giririk cunki Student s obyektinin ozu bir obyekte
    beraberdir ve obyektin ozunu istifade edib obyekt yaratmaga calisanda bu artiq StackOverFlow erroru alir
 */
//            Student s = new Student();

/*
obyektler massive-i
Obyektlerden ibaret massive yaradiriq Student tipinde ve  3 obyekt yaradiriq
 */
//        Student[] s = new Student[3];
////     Massive yarananda arxada o massivin tipinde olan bir classin obyekti yaranir. Onu da gormek ucun
////        s.getClass().getName(); //:[LStudent;
////        s[0] = new Student();
////        s[0].number = 4;
////        s[1] = new Student();
////        s[1].number = 5;
////        s[2] = new Student();
////        s[2].number = 6;
////        System.out.println(s[0].number);
////        System.out.println(s[0].number);
////        System.out.println(s[0].number);
//
////indi bele bir sey edek
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//
//        s[0]=s1; // s1-in ref-i her ikisine aid olmus olur. Ona gore birinde bas vermis deyisiklik her ikisine aiddir
//        s[0].age=5;
//        s[1]=s2; // bunda da eyni
//        s[1].age=6;
//        s[2]=s3; // bunda da eyni
//        s[2].age=7;
////        System.out.println(s[0].age); //:5
////        System.out.println(s1.age);   //:5
////        System.out.println(s3.age);   //:7
///*
//encapsulation
// */
//        Student newColor = new Student();
////        newColor.SetColor("yasil");
////bu sekilde deyeri gore bilmerik ,cunki o private-dir. onun ucun de student classinda bir method yazaq
////        System.out.println(newColor.GetColor()); // yasil
//
//        /*
//        eyni anda metodlari istifade etmezden emin olmaq lazimdir ki onlarin hecbirinde void istifade olunmuyub
//        eks halda error alinacaq (esasen bu private attributelar ucun nezerde tutulub)
//         */ //bunun adi fluentdir
//        Student newOne = new Student().setColor("black").setHeight(3000).setNumber(5);
//        //ve ya . Bu usulun adi builder pattern -dir
////        System.out.println(new Student().setColor("pink").setHeight(2000).setNumber(9));
//        /*
//        obyektin icerisinde obyekt yaratdiq .Bunun adi Composition
//         */
//        University university= new University().setName("BMU").setAddress("Xirdalan");
//        newOne.setUniversity(university);
//        System.out.println(newOne.getUniversity().getClass());

        //bir nece defe cagiraq ve gorek ne bas verir
//        new Student(); // :Student
//        new Student(); // :Student
//        new Student(); // :Student
        /*
        cavab 3 olacaq cunki bu bir class attribute-dur ve her defe yenisini yaratmaq evezine ozunde 1 dene count
        attribute-unu saxlayir ve normal olaraq yeni deyeri uzerine gelir
         */
//        System.out.println(Student.count);//:3
        //yox eger metodun ozunde count deyiseni teyin etsek, obyektlerin count attribute-unda hecne bas vermeyecek
        //cunki biz artiq bilirik ki bu local variable-dir ve cole hec bir aidiyyati yoxdur
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//        System.out.println(s3.count);
        //eyni adli metod istifade etdik amma parametr teleb edir
//        Student s4 = new Student(1133);
//        System.out.println(s1.getNumber());
//        System.out.println(s4.getNumber());

//        Student s5 = new Student(187,2003,"China");
//        System.out.println(s5.getNumber());
//        System.out.println(s5.getHeight());
//        System.out.println(s5.getAddress());
//3lu konstruktor ucun

//        Student s6 = new Student(0,0,null);
// metodlarin siralamasina gore cavablar da ardicil olacaq
// 1
// 2
// 3

    foo1();
    }

    /*
    basqa bir usulla gostersek. Burda ise metodlar bir birini gozleyir. foo1-de foo2ni cagiririq deye foo2-i foo1-in
    onune kecir, foo2-e kecid etsek o da foo3-u cagirir deye foo3 foo2-nin qabagina kecir ve bu zaman siralama foo3,foo2
    ve foo1 seklinde olur. Bu sebebden 3,2,1 seklinde olacaq
     */

    public static void foo1(){
        foo2();
        System.out.println("1");
    }
    public static void foo2() {
        foo3();
        System.out.println("2");
    }
    public static void foo3(){
        System.out.println("3");
    }




}
