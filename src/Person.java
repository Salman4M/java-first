/*
inheritance ucun istifade edeceyimiz class
 */

public class Person {

    public double age;
    public String name;
    public  String address;

    public double getAge() {
        return age;
    }

    public Person setAge(double age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }
}
