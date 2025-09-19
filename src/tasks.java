import java.util.Scanner;

public class tasks {
    public static void main(String[] args){
        /// exercise in one for
//        String x = "*";
//        for(int i=0;i<6;i++){
//            System.out.println(x);
//            x+="*";
//        }
        //result
        //*
        //**
        //***
        //****
        //*****
        //******

        // exercise in nested for
//        for(int i = 0;i<1;i++){
//            String x = "*";
//            for(int j=0;j<6;j++){
//                System.out.println(x);
//                x+='*';
//            }
//        }

        /// burda elave print methodu var ki (printLn yox, print) bir seyi yeni setirden yox eyni setirde print edir.
//        for(int i=1;i<3;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//                System.out.print("  ");
//                System.out.print("*");
//                System.out.println("");
//            }
//        }
        /// dogru yol
//        for(int i=0;i<3;i++){
//            System.out.print("*");
//            for (int j=0; j<4;j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println("");
//        }

        //*    *
        //*    *
        //*    *

        /// ferqli task

        //*  #  *
        //*  #  *
        //*  #  *
//        for(int i=0;i<3;i++){
//            System.out.print("*");
//            for (int j=0; j<4;j++){
//                System.out.print(" ");
//                if(j==1) {
//                    System.out.print("#");
//                }
//            }
//            System.out.print("*");
//            System.out.println("");
//        }

        /*

        *     *
        =======
        =======

        *     *
        =======
        =======
         */
//        for(int i=0;i<3;i++){
//            System.out.print("*");
//            for(int j=0;j<5;j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println("");
//            for(int p=0;p<2;p++){
//                for (int d = 0; d < 7; d++) {
//                    System.out.print("=");
//                }
//                System.out.println("");
//            }
//        }

        /*
        ev tapsirigi
        --------->
        -------->
        ------->
        ------>
        ----->
        ---->
        --->
        -->
        ->
         */
//        for(int i=10;i>0;i--){
//            for(int j = i;j>0;j--){
//                System.out.print("-");
//            }
//            System.out.print(">");
//            System.out.println("");
//        }

           /*
        ev tapsirigi
        --------->
         -------->
          ------->
           ------>
            ----->
             ---->
              --->
               -->
                ->
         */
//          for(int i=0;i<10;i++){
//              for(int j=0;j<10;j++){
//                if(i>j){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("-");
//                }
//              }
//              System.out.print(">");
//              System.out.println("");
//        }


        //Array Questions
//        int[] arr = new int[6];
//        arr[0] = 1;
//        arr[1] = 1;
//        arr[2] = 0;
//        arr[3] = 1;
//        arr[4] = 1;
//        arr[5] = 1;
        /*
        en boyuk 1 zenciri
        Max Consecutive Ones
         */
//        int total = 0;
//        int max = 0;
//        int[] arr = {1,1,0,1,1,1};
//        for(int i = 0; i<=arr.length; i++) {
//            if (i < arr.length) {
//                if (arr[i] == 0) {
//                    if (total > max) {
//                        max = total;
//                        total = 0;
//                    } else {
//                        total = 0;
//                    }
//                } else {
//                    total += arr[i];
//
//                }
//                /*
//       sonuncu indexden sonra massive bitdiyi ucun axirinci aldigimiz total-in maxdan boyuk ve ya balaca
//       oldugunu yoxlaya bilmirik. Ona gore en sonda bele bir sert yaziriq ki eger index massivin en axirinci
//       elementini kecirse ve total maxdan boyukdurse maximiz total olsun. Cunki massive bitdiyi ucun biz
//       axirinci total deyerini max-a menimsede bilmirik (eger boyukdurse lazimdir eks halda ehtiyac yoxdu)
//                 */
//            }else {
//                if (total > max) {
//                    max = total;
//                }
//            }
//        }
//        System.out.println(max); ///: 4


//        int mynumb = 100;
//        int len = String.valueOf(mynumb).length();
//        String b = "";
//        String d = "";
//        if(len<=3){
//            for(int i=0;i<3-len;i++){
//                String a = String.valueOf(mynumb).toString();
//                b += '0';
//                d = b+a;
//
//            }
//        }
//        System.out.println(d);



    /// 1295. Find Numbers with Even Number of Digits

//        int[] nums = {12,345,2,6,7896};
//
////        int i = GiveIntegerMassive(nums);
////        System.out.println(i);
//        int test = 345;
//        int rest = test % 10;
//        test = test / 10;
//        int rest2= test % 10;
//        test = test /10;
//        System.out.println(test);
//        System.out.println(rest);
//        System.out.println(test);


/////Java Output Formatting (HackerRank)/////
        /*
        bir scannerden muxtelif deyisenler yaradabilirik. (.next() bir nov string data tipde bir deyer ucun
        default sayilir. Yeni NextLine() yazmaga ehtiyac yoxdur)
         */
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String b = "";
//            String d = "";
//            String s1=sc.next();
//            String distance = " ";
//            for(int v=0;v<14-s1.length();v++){
//                distance+=" ";
//            }
//
//            int x=sc.nextInt();
//            /*
//            diger bir metodu ise length-di. Burada sadece int yox double,char kimi data tipde olan deyisenlerin
//            deyerlerinin uzunlugunu da cap ede bilerik
//             */
//            int len = String.valueOf(x).length();
//            if(len<3){
//                for(int j=0;j<3-len;j++){
//                    String a = String.valueOf(x).toString();
//                    b += '0';
//                    d = b+a;
//
//                }
//            }else{
//                /*
//                int data tipinde olan x deyerini stringe cevirdik.Bunun ucun String data tipinin metodu olan
//                valueOf metodunun integer ucun olan metodunu (icerisinde char,float,int,string,double kimi tipler
//                ucun de secim var)istifade ederek deyeri gotururuk ve en sonda ise stringe cevirmek ucun ise
//                toString metodunu istifade etdik
//                 */
//                String j = String.valueOf(x).toString();
//                d=j;
//            }
//
//
//
//            System.out.print(s1);
//            System.out.print(distance);
//            System.out.print(d);
//            System.out.println("");
//
//
//            //Complete this line
//        }
//        System.out.println("================================");

//        int value = 10;
//        for(int i = value;i>2;i--){
//            if(SimpleFunc(i)) {
//                SimplePrintFunc(i);
//            }
//
//        }
        int len_mas = new Scanner(System.in).nextInt();
        int[] elements = CreateMassiveFunc(len_mas);

        for(int i=0;i<elements.length;i++){
            System.out.println(SimpleFunc(elements[i]));
        }


    }

    public static int[] CreateMassiveFunc(int len_massive) {
        int[] my_massive = new int[len_massive];
        for (int i = 0; i < my_massive.length; i++) {
            int from_user = new Scanner(System.in).nextInt();
            my_massive[i] = from_user;

        }
        return my_massive;
    }

    public static void SimplePrintFunc(int number){
        System.out.println(number);
    }

    public static boolean SimpleFunc(int number) {
        if(number<2){
            return false;
        }
        for (int i = 2; i <number; i++) {
            if(number%i==0){
                return false;
            }
        };
       return true;
    }

//    public static int GiveIntegerMassive(int[] ournums) {
//        int counter = 0;
//        int length = 0;
//        int rest = 0;
//        for(int i=0;i<ournums.length;i++) {
//
//            while (ournums[i] > 0) {
//                rest = ournums[i] % 10;
//                ournums[i] = ournums[i] / 10;
//                length++;
//            }
//            System.out.println(length);
//            if(length%2==0){
//                counter+=1;
//
//            }else{
//                length=0;
//            }
//        }
//        return counter;
//    }
}
