import util.InputUtil;
import util.MathUtil;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //metodu burada islede bilirik
//        if(2==2){
//          myFirstFunction();
//        }
//        if(3==3){
//          myFirstFunction();
//        }
//        System.out.println("asfasfsfas");
//        System.out.println("asfasfsfas");
//
//        if(4==4){
//            myFirstFunction();
//    }
            /*
    method  ilk olaraq "public static void methodun_adi" seklinde teyin olunur
    pythondan ferqli olaraq burada oxunma yuxaridan asagiya dogru deyil. Yeni asagida
    yazdigimiz metodu yuxarida istifade edebilerik
    elave olaraq metodu main metodundan kenarda yazmaq lazim gelir. Cunki main kod blockudu
    ve metodun icerisinde yeni metod teyin edebilmerik.
     */
//        AnotherFunction(); /// 649-668

//        String name = "Fuad"; /// 670-673
//        System.out.println(MyFunction(name));// :true
//        System.out.println(MyStringFunc());
//////        // ve ya bu sekilde  mystringfunc returnda ad ucun deyer qaytarir ve onu myfunctionun parametrine deyer kimi
//////        //otururuk
//        System.out.println(MyFunction(MyStringFunc()));
//
        char operation = InputUtil.TakeOperation("choose the operation: ");
        double value_a = InputUtil.TakeValue("Give value for a: ");
        double value_b = InputUtil.TakeValue("Give value for b: ");
//
        double res = MathUtil.Calculate(value_a, value_b, operation);
        System.out.println(res);
    }

//        public static void myFirstFunction(){
//        System.out.println("hello world");
//        MyParametrFunction("salman",24);
//    }

//    public static void MyParametrFunction(String name,int age){
//        System.out.println("hello Mr:" + name);
//    }

//    /*
//    Public o demekdir istenilen yerden adi vasitelise cagirila biler.
//     Void o demekdir ki, proses bitdikten sonra hecne qaytarmir.Yeni return etmir
//     Static o demekdir ki, hecbir yere hereket etmir, yeni method oldugu clasa aiddir
//     */

//    public static void AnotherFunction(){
//        String result = ReturnMyStringFunction("salman",24);
//        System.out.println(result);
//        boolean mybool = ReturnMyBooleanFunction("Haidjar",22);
//        System.out.println("aksfksvgksakg");
//    }

    /// /    /*
    /// /    String istifade edirik ki biz string datasi qaytaririq.(void hecne qaytarmir ona gore de return istifade ede bilmerik)
    /// /     */
//    public static String ReturnMyStringFunction(String name,int age){
//        String fromuser = new Scanner(System.in).nextLine(); // local variable
//        if(age<18) {
//            return "Chap Etdim";
//        }
//        return "Bigger than 18";
//    }
////    //indi ise boolean istifade edirik
//    public static Boolean ReturnMyBooleanFunction(String name,int age){
//        return true;
//    }
    /*
    local variable la metoddan kenardaki eyni adli ve eyni tipli deyisenin arasinda hec bir elaqe yoxdur

     */
//    public static boolean MyFunction(String name){
//        return true;
//    }
//    public static String MyStringFunc() {
//        String name = new Scanner(System.in).nextLine();
//        return name;
////
//    }

    }


