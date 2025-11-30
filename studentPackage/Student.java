package studentPackage;

public class Student {
    public String name;
    public int age;
    public double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student() {}

    public void printInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student age: " + this.age);
        System.out.println("Student grade: " + this.grade);
    }
}

