//package util;
import java.util.Scanner;
import util.InputUtil;
import util.MathUtil;
//import static util.InputUtil.WithoutPublic;
//sirf metodu import etmek ucun ise
// bu zaman utilin adini yazmaga ehtiyac qalmir. Metodu adi onu istifade etmek ucun bes edir
import static util.InputUtil.TakeOperation;
import static util.InputUtil.TakeValue;

//ve ya birdefeye hamisini isteyirikse
import static util.InputUtil.*;


public class Main {
    public static void main(String[] args) {
        //// bildiyimiz pythondaki input funksiyasin yerine yetirir/ Scanner(System.in)
        int x = new Scanner(System.in).nextInt();
//        System.out.println("x ucun daxil edilen reqem: " + x);
//        int v = new Scanner(System.in).nextInt();
//        System.out.println("v ucun daxil edilen reqem: " + v);
//// string ucun nextLine istifadə edirik .Integer üçün isə NextInt
//        String holla = new Scanner(System.in).nextLine();
//        int z=x+v;
        //// only double comma for string. Otherwise you will get an error
        //// not 'Somebody'  use "Somebody" for string
//        String name="Somebody:" + z;
//        System.out.println(look);
//        System.out.println(name);
//        System.out.println(holla);

////        char datatipinde olan deyisenin deyerinin uzunlugu 1-e beraber olmalidir. Onnan uzun olabilmez
////         ve bu zaman biz tek dirnaqdan istifade etmeliyik. Eks halda error alacagiq.
        char letter = 'g';
////        asagidaki kimi olmaz
//        char test = "fff";
        /// /////////////// ///
        ////         float data tip demey olar . double (eslinde ele float data tipi de var. Sonra baxariq)
        double number = 4.5;
////        bildiyimiz adi boolean . True ve False
        boolean check = false;
        ////bu sekilde de sert vere bilirik ve adini print edib neticeye baxa bilerik
        boolean look = number > 3;

////riyazi emellerde sadece pythondan ferqli olaraq 10//3 yoxdur (tam hisse)
        int our_number = 3;
//// toplama emeliyyati zamani deyerlerin datatipleri ya hamisi eyni olmalidi (emeliyyatin neticesi daxil) ve
//// ya eger integerle float (double) reqemleri toplayiriqsa emeliyyatin neticesi tam eded olmayacagi ucun ona
//// data tip olaraq double vermeliyik.
        double b = our_number + 2.1;
//        System.out.println(b);
////Neyinse datatipini deyisdirmek ucun hemin deyerin yaninda(datatip) seklinde
//// yaziriq.(pythonda ise eksine idi datatipin icerisinde deyeri verirdik. int(5) kimi burda ise (int)5 kimidir)
        int sum_check = our_number + (int) 5.2;
//        System.out.println(sum_check);

////javada pre incremenet ve post increment deye bir sey var. ++ vahidi 1 artirmaq demekdir (py-da deyisen+=1)
////java kodu soldan saga oxudugu ucun ilk olaraq deyiseni oxuyur ve bize onu qaytarir. Deyisenin deyeri ise artir
//// sadece bize gorsenmir. Ilk numunede biz deyeri artirib sonra print edirik
        our_number++;  // : 4
//        System.out.println(our_number); // : 4

//// ind ise emeliyyatin ozunu print edek. Bize 4 neticesini qaytaracaq.Cunki artim (++) birinci gelir. Ilk once
//// artirir daha sonra bize qaytarir. Bu pre increment adlanir
//
//        int our_number2 = 3;
//        System.out.println(++our_number2); // : 4
//        System.out.println(our_number2); //   : 4

//// burada ise ilk olaraq deyisen daha sonra artim (++) yeni increment geldiyi ucun ilk olaraq print edir daha sonra
////artim emeliyyatini icra edir.
//        int our_number3 = 3;
//        System.out.println(our_number3++);
//        System.out.println(our_number3);


    }

}

