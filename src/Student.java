import java.util.Scanner;

public class Student {// POJO Plain Old Java Object (classdan yaranan obyekt)

    /*
    bu bir nov pythondaki class atribute-na benzeyir, Yeni attributelarin bir deyeri olur. butun attributelar
    class- aiddir. Hec bir obyekte aid ola bilmez,cunki obyekt yaratmir. Yeni deyisenlerin deyerleri statikdir
    Java-da bu o demekdir ki, Student classimizin 3 deyiseni var ve 3-u de clasimizin yaddasinda yer tutur
     */

    public static String name;
    public static String surname;
    public static int age;
    /*
    static olmayan methodun icerisinde static deyisen cagirmaq mumkundur. Amma eksini etmek mumkun deyil(
    yeni static methodda static olmayan deyisen istifade etmek mumkun deyil ) Eyni qayda pythonda da kecerlidi
    yeni initdeki (instance) attributelari class obyekti yaradib cagida bilirik,amma classin ozunden hemin
    attributelari cagira bilmirik.
    */
    public static void calculate(){
    }


/*
bu ise Student classinda bele deyisenler oldugunu amma classin yaddasinda yer tutmadigini gosterir.
Yeni her biri ayri bir yaddas sahesi tutur. Bu da pythondaki instance attribute-na benzeyir,( hansi ki
init metodunda teyin edirdik ve classi cagirdigimizda bu attributelarin deyerlerini classda teyin etmeliydik)
Yeni her student obyekti yaratdigimizda bu attributelar her obyektde userden gelen deyere uygun olacaq.
Yeni override deye bir sey bas vermeyecek (misal ucun iki ferqli student1 ve student2 obyektlerinin
attributelarinin deyerleri bir birile elaqesiz olacaq. Yaddasda tutduqlari yer muxtelif olur deyerler eyni olsa bele
deyek ki ikisinin de height-i 180 di. Bir biri ile elaqesizdirler). Yeni deyer dinamikdir
(digerinde ise adindan melum oldugu kimi staticdir)
 */

    public int number;
    public int height;
    public String address;


    public void PrintThemFunc(){
        System.out.println(number+ " " + height + " " +address);
    }

    /*
    indi ise bir classa aid metod istifade ederek icerisinde Student tipinde obyekt yaradib ve attributelarina
    avtomatik olaraq userden gelen deyerleri otururuk ve herdefe obyekten attribute-u cagirib tek tek deyer
    oturmeyimize ehtiyac qalmasin
     */
    public static Student TakeAndGiveBack(){
        Student new_obj = new Student();
        new_obj.number = new Scanner(System.in).nextInt();
        new_obj.height = new Scanner(System.in).nextInt();
        new_obj.address = new Scanner(System.in).nextLine();
        /*
        ayrica olaraq static metodda static olmayan obyektin attribute-ni  cagira bilmerik
        (amma eksini edebilerik)
        Non-static field 'height' cannot be referenced from a static context
        System.out.println(height);
         */

        return new_obj;
    }
    /*
    classin icinde static obyekt yaratmaq (Main9) Biz eyni adli classin ozunden de obyekt yarada bilerik
     */
//    public static Student s;
//    //
//    public static Student a = new Student();
//
//
//    public static void main(String[] args){
//        Student.s = new Student();
//        Student.s.number = 5;
//        System.out.println(Student.s.number);
//    }
/*
bele bir sey yoxlayaq.Static olmayan obyekt yaradaq ve bunu main9-da istifade etmeye calisaq
 */
//    public Student s = new Student();
    ///
/*
encapsulation
color adinda private deyisen yaradaq (chvet rus dilindedir)
 */
    private String color;

//    public void SetColor(String chvet){
//        //burada color deyisenini gorur ve ona userden gelecek chvet parametrinin deyerini oturecek
//        color = chvet;
//    }
    //bu metodun sayesinde private attribute-u gore bilerik

//    public String GetColor(){
//        return color;
//    }
/*
indi ise parametrin adini deyisek ve deyisenin adi ile eyni edek. Bu zaman ise deyiseni gormeyecek.
Burada sanki metod oz parametrini parametrin ozune beraber edir.Bunu aradan qaldirmaq ucun ise "this"
keywordundan istifade edeceyik
 */
//    public void SetColor2(String color){
//        color = color;
//        //artiq deyiseni gorur ve casmir
//        this.color = color;
//    }
/*
bu metodu yazmaqda meqsedim voidle return-nun istifadesidir. Ancaq bele bir halda yeni metodu dayandirmaq ucun
 */
//    public void Something(){
//        if(5<3){
//            return;
//        }
//        color = "black";
//    }
/*
indi ise getter setter deleter metodlarina baxaq
getteri sectik ve her 3 attribute ucun yaratti
 */

    public String getAddress() {
        return address;
    }

    public int getHeight() {
        return height;
    }
//
    public int getNumber() {
        return number;
    }
//    //indi setter
//
////her biri ucun setter (Builderi sectik)
    public Student setNumber(int number) {
        this.number = number;
        return this;
    }

    public Student setHeight(int height) {
        this.height = height;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }


    //
////hem get hem seti secsek
//
//
//    public static int getAge() {
//        return age;
//    }
//
//    public static String getSurname() {
//        return surname;
//    }
//
//    public static void setSurname(String surname) {
//        Student.surname = surname;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public static void setName(String name) {
//        Student.name = name;
//    }


// private attribute ucun de beledir
/*
deyisenleri private olub muracieti de get ve set teyin olunan obyekte Bean deyilir. Her Bean bir Pojodur
amma her pojo bean deyil (plain old java object .Bir pojo encapsulation olundusa o artiq Beandir)
 */
    public String getColor() {
        return color;
    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

/*
records style and builder name attribute-u ucun. Ne etdi desek sadece metodun adinda deyisiklik var.GetName yox
name oldu ve set-de bize return edir teyin edilmis deyeri.
Elave olaraq biz eyni anda bir nece metodu istifade edebilerik. Misal ucun metodu setNumber,setHeight ve
setColor metodlarini birdefeye obyekt yaradarken istifade edek (Main9-da)
 */

    public String color() {
        return color;
    }

    public Student setColor(String color) {
        this.color = color;
        return this;
    }

    private String universityName;
    private String universityAddress;


    public University university;

    public Student setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

//    public Student setUniversityAddress(String universityAddress) {
//        this.universityAddress = universityAddress;
//        return this;
//    }

    public University getUniversity() {
        return university;
    }

    public Student setUniversity(University university) {
        this.university = university;
        return this;
    }

    //Constructor return typi olmayan metoda deyilir

    public Student(){
        /*
        constructor obyekt yarananda ilk ise dussen hissedir
        misal ucun bu metod her cagirilanda ne print etmesini gosterek
         */
//        System.out.println("Student");
        //yox eger metodun ozunde count deyiseni teyin etsek nece olar
        int count = 0;
        count++;
    }
    /*
    indi ise class attribute-u yaradaq ve her defe yuxaridaki metodda artirmaqa calisaq ve main9 proqraminda
    yeni obyekt yaradib hemin attribute-u cagirmaga calisaq
     */
//    public static int count;
    /*
    indi ise instance attribute kimi oturek
     */
    public int count;
    // eyni adli metod yaratdiq ,amma icerisine parametr verdik deye artiq o ferqli metod sayilir
    public Student (int number){
        this.number = number;
    }
    //indi ise constructor funksiyasi ile avtomatik yaradaq (construktorun adi classin adi ile eyni olmalidir)
    /*
    iki constructor yaradaq . Biri height ve number digerinde ise bu metodu istifade edek ve elave
    olaraq address istifade edek.
    Biz bu metodu digerinde istifade etmek ucun this keywordundan istifade edirik.
    Onun ucun biz this- in icerisine istediyimiz metodun deyisenlerini otururuk ki onun tanisin.(this-in
    hansi method oldugunu gormek ucun ctrl-i basili tutub cursoru uzerine getirerek click etmek kifayetdir)
     */
    /*
    indi ise 3lu konstruktor istifade edirik. 2-ci student methodu addressi-i 1-ci metoddan alir ve
    3 cu metoda oturur. Her ucunun sonuna println -da bir sey elave edek ve gorek ne print olununr
     */
    public Student(String address){
        this.address =address;
        System.out.println("1");
    }

    public Student(int height, int number) {
        this("Xizi");
        //bu ikisini 3lu konstruktorda bir seyi yoxlamaq ucun commente aliriq
//        this.height = height;
//        this.number = number;
        System.out.println("2");

    }

    public Student(int number, int height, String address) {
//        this(height,number);
        //usdekini bu sekilde de yazabilerik eger default deyer vermek isteyirikse
        this(0,0);
//        this.address = address;
        System.out.println("3");

    }
    //elave olaraq this ile obyekte aid olan metodu da istifade etmek mumkundur
    /*
    misal ucun getAddress(). Bunu this istifade etmeden getAddress kimi de yazmaq mumkundur amma ki yene de ad
    conflictlerinin qarsini almaq ucun bir vasite kimi dusunmek olar. Sanki biz classa aid olan metodlari ve ya
    attributelari cagiranda classinadi.metod ve ya classinadi.attributeadi yazirdiqsa ve bu da bir nov obyektler
    ucun istifade olunur
     */

    public void foo(){
        this.getAddress();
        this.number =number;
    }
/*
biz burada 4 eded Student adli Construktor yaratmisiq. Yeni biz onu yaratmasaq bele o artiq yaddasda var. Saadece
onu gorebilmirik. Biz ise bunlari yazaraq sanki ona elave funksionalliqlar veriririk.Ama biz parametrsiz olan Student
konstruktorunu silsek artiq yeni obyekt yaradanda mecbur olaraq parametrli konstruktoru istifade etmek mecburriyetinde
qalacagiq. Cunki java bunu override kimi basa dusur. Senin artiq parametrli construktordan istifade edeceyini fikirlesir

 */

}
