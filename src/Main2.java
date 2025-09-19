import java.util.Scanner;


public class Main2 {
    public static void main(String[] args){
        //// bele bir misal da gosterek
        int test_num = 4;
////ilk baxisda anlasilmaz olabiler. Emeliyyat soldan baslayir. Soldaki test_num++ bize 4 cavabini qaytarir.
////yeni test_num++ 4-e beraberdir. Amma emeliyyat icra olundugu ucun prosese 5 kimi davam edir.Yeni test_num 5-e
////beraberdir. ikinci terefde ise post istifade olunub. yeni ilk artim daha sonra netice. Yeni 5+1 = 6
//// bu o demekdir summing = 4 + 6 = 10 . Debug edib baxsaq daha rahat gorerik

        int summing = test_num++ + ++test_num;
//        System.out.println(summing);
//// daha rahat gormek ucun

        int test_num2 = 5;
//// bu deyisen emeliyyatin ozune beraberdir. Yeni emeliyyati ozunde dasiyir. Emeliyyat da soldan saga oxundugu ucun
//// 5 deyerini bize verir. (artiq bilirik ki test_num-in ozu 6 dir. Amma first_rep 5-dir)
        int first_rep = test_num2++; // : 5
//// ozunu print edib neticeye baxa bilerik
//        System.out.println(test_num2); // : 6
//// first repe baxsaq neticenin 5 oldugunu gorerik
//        System.out.println(first_rep); // : 5
//// burda ise post increment oldugu ucun test_num da sec_rep de 7 ye beraberdir
        int sec_rep = ++test_num2; // : 7
///// her ikisinin deyerini bildiyimiz ucun (5 ve 7) cavab 12-dir
//        int sum2=first_rep+sec_rep; //: 12
//        System.out.println(sum2); // : 12
//
///// && ve || operatorlari. Bunlar pythondan bildiyimiz Q modelinin operatorlaridi. Sadece orda heresinden bir dene
/////yazmaq kifayet eleyirdi. Burda amma 2 denesi lazimdi.
//        /// bu and ucun istifade olunur &&
        boolean check_operator = 5 > 2 && 5 + 2 < 3;
//        System.out.println(check_operator); //: false
//        ///  bu or ucun istifade olunur ||
        boolean check_operator2 = 5 > 2 || 5 + 2 < 3; // : true
//        System.out.println(check_operator2);
//        ///  bir boolean deyerinin eksini isteyirikse ! assignment operatorundan istifade edirik.Pythonda ise
//        ///  nidanin evezine not operatorun istifade edirik
        boolean our_value = true;
        boolean check_value = !our_value;
//        System.out.println((check_value));
        int verca = 4;
        /*  if else statementine benzer bir miscellaneous operatorumuz var ki , hansi ki "?" isaresidir
          sanki if sozunu evez edir. Sadecec yeri ferqlidi. Ondan sonraki yazdigimiz deyerler ise
         sertin true ve false halinda bize qaytaracigi deyerleri qeyd edirik. Ilk olaraq true halinda,
         ikinci olaraq else false (else) halinda. ":" ise hemin iki ehtimali bir  birinden ayirmaq ucun istifade
          olunur. Yeni 4 true halinda 2 ise false halinda istifadeciye oturulecek
         */

        int result = verca > 3 ? 4 : 2;
        /// bildiyimiz if else bu strukturda olur. Pythondan ferqli olar iki noqte istifade olunmur
//
        if (verca > 3) {
            result = 2;
        } else {
            result = 4;
        }

        ///  bu sekilde de isleyir
//
        if (verca > 3)
            result = 2;
        else
            result = 5;
        ///  ama yuxaridaki strukturda bir problem var. Bele olan halda if sadece ilk setri oxuya bilir.Yeni
        /// ikinci setr artiq ifden asili olmur. Bu sebebden else sertini de istifade edebilmirik.Cunki o ilk
        /// setrden sonra else sertini gozleyir.Misal ucun asagidaki struktur yanlisdir. If yalniz 1-ci setri
        ///  result=2 -ni ozune aid edir ve 2-ci setrde bir aidlik hiss etmediyi ucun ozunun diger yarisi olan
        ///  else sertini gozleyir. Eger else sertinin yerine basqa bir sey yazsaq artiq error aliriq.Cunki if
        ///  else sertini axtarir. Else de eyni cur isleyir. Ilk setri oxuyur. Qalan setrler ona aid deyil
        if (verca < 3)
            result = 2;
        else
            System.out.println(result + " hello");
            result = 5;
        result = 8;
        ///  yeni eger onlari sertin icine elave etmek isteyirikse bu zaman curly bracketsden {}-den istifade etmek
        /// lazim gelir


        int cage = 12;
        /// else if -in (elif) istifade qaydasi
//        if (cage>18)
//            System.out.println("Icaze var");
//        else if (cage>10)
//            System.out.println("Orta yas kategoriyasina icaze var");
//        else
//            System.out.println("Icaze yoxdur");

//        int age = 9;

        /// iki if yazsaq ele pythondaki kimi isleyecek
//        if (age>18)
//            System.out.println("Icaze var");
//        if (age>10)
//            System.out.println("Orta yas kategoriyasina icaze var");
//        else
//            System.out.println("Icaze yoxdur");

        /// nested if
        int age = 9;

        if(age>11){
            if(age>15){
                System.out.println("your age is actually higher than 15");
            }
            else{
                if(age==13){
                    System.out.println("you are 13 years old");
                }
                else if(age==14){
                    System.out.println("you are 14 years old");
                }
                else{
                    System.out.println("you are around 11-13");
                }
            }
        }else{
            System.out.println("you are under 10");
        }

//        / calculator ///
        System.out.println("include your first number: ");
        double first = new Scanner(System.in).nextInt();

        System.out.println("include your second number");
        double second = new Scanner(System.in).nextInt();

        System.out.println("what math you want to do:+,-,/,*");
//        /  charAt(0) pythondan bildiyimiz indexleme usuludu. [0]. Burda elave method kimi gelir.
        char math_type = new Scanner(System.in).nextLine().charAt(0);


        int calc_result = 0;
        ///  burda '+' yerine "+" istifade etsek error alacagiq. Cunki qosa dirnaq string data tipine aiddir
        ///  ve bu zaman bizim muqayise etdiyimiz deyerlerin datatipleri ferqli olur. char ve string
        /// Operator '==' cannot be applied to 'char', 'java.lang.String'
        /// bunun ucun de biz char ucun istifade etdiyimiz tek dirnaqdan istifade etmeliyik
        if(math_type == '+'){
            System.out.println(first + second);
        }
        else if(math_type=='-'){
            System.out.println(first - second);
        }
        else if(math_type=='/'){
            System.out.println(first / second);
        }
        else if(math_type=='*'){
            System.out.println(first * second);
        }
        else{
            System.out.println("not right math type");
        }

    }
}
