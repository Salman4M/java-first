public class Children extends  Person{
    public int scholarship;

    public int getScholarship() {
        return scholarship;
    }

    public Children setScholarship(int scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public static void main(String[] args){
        Children c = new Children();
        c.getScholarship();
        c.setScholarship(5000);
        c.setName("fiona");
        c.setAge(24);
        //yalniz extend olunmus classin metodlarini istifade etmek olar
//        c.getWage();
    }
}
