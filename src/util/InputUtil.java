package util;

import java.util.Scanner;

public class InputUtil {
    public static double TakeValue(String message){
        System.out.println(message);
        double a_or_b =  new Scanner(System.in).nextDouble();
        return a_or_b;
    }
    public static char TakeOperation(String message){
        System.out.println(message);
        char math_operation = new Scanner(System.in).nextLine().charAt(0);
        return math_operation;
    }
    //public,default,private,protected  . These are (access modifiers)


    /* public olmadigi halda bu 'default' sayilir. Yeni sadece oldugu package-nin icerisinde istifade olunabiler.
    Misal ucun bu packagenin icerisinde basqa java fayli yaradib bunu istifade edebilerik. Amma bu package-den
    kenarda istifadesi mumkunsuzdur.
    static ise gosterir ki bu method esas classa yeni InputUtil classina aiddir. Onu gosterir
     */
     static char WithoutPublic(String message){
        System.out.println(message);
        char math_operation = new Scanner(System.in).nextLine().charAt(0);
        return math_operation;
    }
    public static int TakeIntegerFunc(String message){
        System.out.println(message);
        int value = new Scanner(System.in).nextInt();
        return value;
    }
    public static String TakeNamesFunc(String message){
        System.out.println(message);
        String value = new Scanner(System.in).nextLine();
        return value;
    }
}
