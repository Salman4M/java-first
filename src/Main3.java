
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
/// for loop-unun yazilma qaydasi bu curdur. Bir nov pythondaki while loopu
///  pythonda ilk once prosesin davam elemesi ucun bir deyer daha sonra while istifade ederek sert prosesin en
/// sonunda ise hemin deyerde ne deyisiklik olacagini ve ya basqa bir emeliyyati teyin edirik. Bura da ona benzeyir.
/// bir nov de for -ile if statementi qarisigina oxsayir
        for (int i = 0; // bir deyisen
             i < 5;  // sert
             i++) {  // her hansi bir emeliyyat
            System.out.println(i);
            System.out.println("Hello World");
        }
///  elave olaraq proses ucun verdiyimiz deyeri fordan kenarda da teyin ede bilirik.
        int main = 3;
        for (; main < 8; main++) {
            System.out.println(main);
            System.out.println("Hello World");
//        }
///  daha sonra ise  emeliyyat yerini de deyise bilerik
//            int main1 = 3;
//            for (; main1 < 8; ) {
//                main1++;
//                System.out.println(main1);
//                System.out.println("Hello World");
//            }
/////  sonuncu olaraq ise sertin de yerini deyisib ferqli sekilde istifade edebilerik
//            int main2 = 3;
//            for (; ; ) {
//                if (main2 < 8) {
//                    System.out.println(main2);
//                    System.out.println("Hello World");
//                    main2++;
//                } else {
//                    break;
//                }
//            }

            /// sonsuz dovr
            /// pythondaki funksiya ile eynidi ,sadece kod strukturu ferqi var. Misal ucun while bir deyisen veririk
            ///  i=0 , while i>0 serti veririk amma ki iceride i-ye toxunmuruq. Bu zaman sonsuz dovr olur. Cunki sert
            /// hemise oduyur. Bu da eyni qayda. 3-cu teref emeliyyat terefi oldugu ucun ve sertde istifade etdiyimiz
            /// deyisene hec bir tesir etmediyimiz ucun sonsuz dovr olaraq davam edir
//            for(;; System.out.println("something")) {
//            }
            //sonsuz dovru dayandirmasaq asagidaki kodlarin hec biri islemeyecek. Cunki sira gelib catmir
//            System.out.println("helo");

            /// daha bir sonsuz dovr
//            for(; ;) {
//                System.out.println("something");
//            }
//            System.out.println("helo");

            ///  basqa bir misal. Verdiyimiz deyiseni yeni bir deyere deyisirik
        char c = '0';
        for (;c!='!'; c = new Scanner(System.in).nextLine().charAt(0)){
            System.out.println("aridaverci");
        }
            ///  duzgun yazilisi beledir
//        for (;;){
//            c = new Scanner(System.in).nextLine().charAt(0);
//            System.out.println("aridaverci");
//            if(c=='!'){
//                break;
//            }
//        }
            ///  daha sonra biz sertde or (||) ve and (&&) -i istifade edebilirik
        int foul = 8;

        for (;foul-2>1 && foul*2>2;foul--){
            c = new Scanner(System.in).nextLine().charAt(0);
            System.out.println("aridaverci");
            if(c=='!'){
                break;
            }
        }

        for (;foul-2>1 && foul*2>2;foul--){
            c = new Scanner(System.in).nextLine().charAt(0);
            System.out.println("aridaverci");
            if(c=='!'){
                continue;
            }
            System.out.println("outside continue");
        }
            /// break ve continue pythondaki kimi eyni qaydada isleyir.
        /*
        fornan arasindaki ferq odur ki , forda bizden 3 telebi var
        deyisen ,sert, emeliyyat. Biz onlarin 3nu de qeyd etmeden proses true oldugu
        muddetce davam etdire bilirik.Amma while-da bele bir sey yoxdur. Sen mutleq sert
        telebini doldurmalisan while(sert) pythondan bildiyimiz while
         */
        int count = 0;
        boolean button = true;
        while(button==true){
            count++;
            if(count==10){
                button=false;
            }
        }
            /// ilk olaraq emeliyyati edir(count++) ve daha sonra while sertini yoxlayir.
        do {
            if (count == 10) {
                button = false;
            }
            count++;
        }while (button==true);

            /// Ustunluyu odur ki iz while-in serti ucun ilk olaraq bir deyisene deyer veririk ve daha sonra hemin deyiseni
            /// serte otururuk. Misal ucun bele bir sey edek. Bu halda proses cemi 1 defe davam edir. Cunki biz artiq
            /// emeliyyati icra etmeden yoxlama apaririq ve amma artiq bizim deyerimiz var.Emeliyyatin davam etmesi ucun biz
            /// userden alinan deyer yanliz counter-e verdiyimiz deyer olmalidi
//        int counter = 1;
//
//        while(counter==1){
//            System.out.println("congrats");
//            System.out.println("you have done it");
//            counter = new Scanner(System.in).nextInt();
//
//        }
//            ///  do while-da ise artiq isler deyisir. cunki emeliyyatin icrasi ilk bas verdiyi ucun counter-a yeni deyer
//            /// veririk ve sert de yeni deyeri yoxlayir. Yeni ilk basda counter deyisenine  verdiyimiz 1 deyerinin menasi
//            /// qalmir.Cunki biz artiq ona yeni deyer vermisik
//        int counter = 1;
//
//        do {
//            System.out.println("congrats");
//            System.out.println("you have done it");
//            counter = new Scanner(System.in).nextInt();
//
//        }while(counter!=1);
//
//            /// ve ya bele bir sey edebilerik do while istifade etmeyin evezine.
//        int counter = 1;
//
//        while(counter!=0){
//            System.out.println("congrats");
//            System.out.println("you have done it");
//            counter = new Scanner(System.in).nextInt();
//
//        }
//
//            /// nested for
//
//        for(int i=0;i<5;i++){
//            for(int j=i+1;j<5;j++){
//                System.out.println("this is our i: " + i);
//                System.out.println("this is our j: " + j);
//
//            }
//        }




            /*
             switch case else if -e benzeyir amma ferqi odu ki,eger serti odeyen deyer varsa
             ondan sonra gelen sertleri de odenmis kimi sayir ve bize qaytarir. Buna gore de break
             isledmek lazim gelir ki, sert odenirse diger sertlere kecid etmesin.Default da
             bildiyimiz else-di
             */

        System.out.println("kanali secin");
        int menu = new Scanner(System.in).nextInt();

        switch (menu) {
            case 1:
                System.out.println("ANS");
                break;
            case 2:
                System.out.println("ATV");
                break;
            case 3:
                System.out.println("XEZER TV");
                break;
            default:
                System.out.println("IDMAN TV");
            }
        }
    }
}