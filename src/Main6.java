import util.InputUtil;

import java.util.Arrays;

/*
String[] args ne ise yariyir onu gorduk.
 */

public class Main6 {
    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];

        if (username == "salman" || password == "12345") {
            System.out.println("Welcome to the channel my buddy");
        }
//        else{
//            System.out.println("Wrong details");
//        }
        /*
         her hansi bir massive-ə yeni deyer elave etdiyimiz zaman
         hemin massive ne qeder deyer elave edeceyimiz baresinde
         evvelceden melumat vermelik. Misal ucun names adli String
         massivine istifadeciden deyelerlerin sayi baresinde
         aldigimiz melumati otururuk , hansi ki time deyisenidir.
         Bu zaman hemin deyer boyukluyunde massive yaratmis oluruq
         */
//        int time = InputUtil.TakeIntegerFunc("how many times? ");
//        String[] names = new String[time];
//        System.out.println(names.length); // baxsaq gorerik ki uzunlugu time deyisenindeki deyer qederdi
//        for (int i = 0; i < names.length; i++) {
//            names[i] = InputUtil.TakeNamesFunc("What is the name? ");
//            System.out.println(names[i]);
//        }
//        System.out.println(names);
//        // uzunlugu 5 olan integer massivi
//        int[] int_mass = new int[5];

        //indi metod seklinde yazaq
        //bu metodu adlari massive-e doldurur
//        int time = InputUtil.TakeIntegerFunc("how many times? ");
//        String[] names = new String[time];  // names massive
//        String[] FilledNamesMassive = FilledNamesFunc(names); // emptymassive

//        PrintMassive(names); // salman , fuad
//        PrintMassive(FilledNamesMassive); // salman, fuad
        //her ikisinin yaddasdaki yeri eynidi


// çox sıralı massiv. Pythodan bildiyimiz list icerisinde list [[],[],[],[]]
        int[][] new_massive= {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {1,2,3,4,5};
        int[] arr5 = {1,2,3,4,5};
        int[] arr6 = {1,2,3,4,5};

        System.out.println(new_massive[1][3]); //:4
        int[][] arr = { arr1, arr2, arr3, arr4,}; // massivler massivi
        int[][][] arr_triple = { {arr1,arr2,arr3}, {arr3,arr4,arr5}, {arr4,arr5, arr6}}; // multidimensional massive

/*
yox eger bele bir sey etsek bize hemin obyektin hansi classda yerlesdiyi gosterek(bir sirali yoxsa cox sirali
massiv olmasinin ferqi yoxdur. Her ikisinde classi gosterir)
 */
        System.out.println(arr1); //:  [I@1b6d3586
        System.out.println(new_massive[1]); //:  [I@4554617c
/*
eger elementlerini gormek isteyirikse Arrays classinin toString metodundan istifade edirik
 */
        System.out.println(Arrays.toString(arr1)); //: [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(new_massive[1])); //:    [1, 2, 3, 4, 5]

/*
f string methodu burda daha ferqli isleyir.Onu cagirmaq ucun String classinin format metodundan istifade
edirik. (public static String format(String format, Object... args)) . burada %s stringler ucun, %f kesr
ededler ucun, %d ise tam ededler ucun istifade olunur
 */
        String s = String.format("My name is %s ,My weight is %d and I'm %f years old." ,"Salman",24,70.0);
        System.out.println(s); //: My name is Salman ,My weight is 24 and I'm 70.000000 years old.


        String f = "Python";
//lowercase and uppercase
        String lower= f.toLowerCase(); //:python
        String upper= f.toUpperCase();//:PYTHON
//length
        int len = f.length();
//element in index
        char index= f.charAt(0);
//boolean
        boolean low_and_up = f.equals("PYTHON"); //:false
        boolean low_and_low = f.equals("Python"); //:true
//IgnoreCase doesn't care about uppercase or lowercase. Equality of word is enough
        boolean dont_care = f.equalsIgnoreCase("PYTHON"); //:true
//contains from python
        boolean isit_contain = f.contains("Py"); //:true
//split from python
        String[] cut_till_choosen = f.split("a");
//strip from python
        String trim = f.trim();
//replace from python
        String replace = f.replace("Python","Java");
/*
compare to . Secilen deyerin uzunluguna gore muqayise edir. Eger secilen deyer deyisendeki deyerden kicikdirse
musbetnen ferqi boyukdurse menfiynen ferqi qaytarir. Ferq yoxdursa da 0 qaytarir (0 ozu de bir ferqdi)
 */
        int compareTo = f.compareTo("Pah");

//startswith and endswith
        boolean swith = f.startsWith("P"); //:true
        boolean ewith = f.endsWith("o"); //:false
//lastindexof and indexof (first index) . Secilen elementin axirinci defe oldugu ve ilk defe oldugu indexler

        int f_index = f.lastIndexOf("o");
        int l_index = f.lastIndexOf("y");

//substring. Verilen index araliginda elementi sene qaytarir. Bir nov indexing [:4]
        String sub=f.substring(1,3); // bunda start ve end indexleri var
        String after_sub = f.substring(2); //:bunda ise sadece start index var

//is empty . Eger deyer bosdura "" bu sekildedirse

        boolean is_empt = f.isEmpty(); //: false
/*
replace all . Burada biz regex istifade edirik. (regex cheatsheet-e bax). Digitslerin ucun olan yeni 0-dan 9-a qeder
reqemler regexidi. Burda teyin edirik ki eger 0-9-a qeder olan reqemlerin hamisini "" deyerine cevirsin
 */
        String numstrin="13123, Hello";
        String repall=numstrin.replaceAll("[0-9]","");

    }


    public static String[] FilledNamesFunc(String[] emptynamemasive) {
        for (int i = 0; i < emptynamemasive.length; i++) {
            emptynamemasive[i] = InputUtil.TakeNamesFunc("What is the name? ");
        }
        return emptynamemasive;
    }
    //adlarin sayina uygun olaraq her birini print edecek
    public static void PrintMassive(String[] names){
        System.out.println("Filled names: ");
        for(int i = 0; i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
