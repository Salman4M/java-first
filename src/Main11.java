public class Main11 {
    //burada exception Student constructoru üçündü. Adını çəkmədən çağırmaq üçün
    public static void main(String[] args)throws ClassNotFoundException{
//        String s = "";
//        for(int i = 0;i<10;i++){
//            s+=" java ";
//            System.out.println(s);
//        }
//        StringBuilder s1 = new StringBuilder();
//        for(int i = 0;i<10;i++){
//            s1.append(" java ");
//
//        }
////        StringBuilder s2 = new StringBuilder();
//        for(int i = 0;i<10;i++){
//            s1.append(" c++ ");
//
//        }
//            System.out.println(s1);
        /*
        istifadesi zamani string poolda yeni obyekt yaranmir. Sadece string pooldaki obyektin characterlerini
        goturub heapde obyekt yaradir

         */
        StringBuffer s2 = new StringBuffer();
                for(int i = 0;i<10;i++) {
                    s2.append(" java ");
                }
                for(int i = 0;i<10;i++) {
                    s2.append("c++");
                }
                String res = s2.toString();
//        System.out.println(s2);
//        System.out.println(res);

        String changed = Integer.toString(125);
        System.out.println(Integer.compare(21,19));//1ci terefe gore yoxlama aparir boyukdurse 1 kicikdirse -1
        String nev1 = "aaa";
        String nev2 = "-bbb";//simvollarin ferqini ascii deyerlerine gore yoxlayr
        System.out.println(nev1.compareTo(nev2));
        //signed=256 bit
        //unsigned=512 bit . Sebebi menfi reqemlere yer yoxdur ve menfi reqemleri de musbete cevirib istifade edir
        int j = Integer.parseUnsignedInt("1000");

//        boolean them = Boolean.parseBoolean("true");

// A signed int representing a large positive unsigned value
//        int signedInt = -1; // In two's complement, this is all bits set to 1
//
//        // Interpret as an unsigned 32-bit value
//        long unsignedValue = Integer.toUnsignedLong(signedInt);
//        System.out.println("Signed int: " + signedInt); // Output: -1
//        System.out.println("Unsigned interpretation (long): " + unsignedValue); // Output: 4294967295
//
//        // Parsing an unsigned string
//        String unsignedString = "4294967295";
//        int parsedUnsignedInt = Integer.parseUnsignedInt(unsignedString);
//        System.out.println("Parsed unsigned int (as signed int): " + parsedUnsignedInt); // Output: -1



//    public static boolean parseBoolean(String s){
//        if(s!=null){
//            if(s.equalsIgnoreCase("true")){
//                return true;
//            }else {
//                return false;
//            }
//        }
//        //ustteki if else sertinnin qisa formasi
//        return ((s!=null) && (s.equalsIgnoreCase("true")));

//        System.out.println(factorial(3));
//        System.out.println(fac2(3));


        //from compiled algebra
//        Algebra.sum(4,6);

        //cagirib console-a baxaq. hec bir obyekt yaranmadi. Sadece classi cagirdiq(muraciet)
//        new Student();
        //yene eyni neticeni almis olaciq.Sadece muraciet edirik
//        Student.foo2();
        //gorunduyu kimi 1 defe classin 3 defe ise obyektin printleri geldi
        //bu bir nov pythondan bildiyimiz initdir
//        new Student();// : object has been created
//        new Student();// : object has been created
//        new Student();// : object has been created

        /*classi cagirmadan nece print ede bilerik. For name metodunda problem yaranir
        amma o problemi bir exception hell edirik.
        */
        Class.forName("Student");

    }
    public static int factorial(int number){
        if(number==1){
            return 1;
        }

        int currentRes = number - 1;

        int next  = factorial(currentRes);

        return number * next;
    }
    //normali da budur
    public static int fac2(int num){
        if(num==1)
            return 1;
        return num*fac2(num-1);
    }

}
