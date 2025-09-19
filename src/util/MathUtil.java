package util;

public class MathUtil {
    public static double Calculate(double a,double b,char operation){
        switch (operation){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                return 0;
        }
    }
    /*
    sadece classin icerisinde istifade oluna biler .Classdan kenara cagirmaq mumkun deyil
     */
    private static double Calculate2(double a,double b,char operation){
        switch (operation){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                return 0;
        }
    }

}
