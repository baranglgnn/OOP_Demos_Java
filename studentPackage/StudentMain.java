package studentPackage;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student("Baran", 22, 95.5);
        Student student2 = new Student("Leyla", 21, 88.2);
        Student student3 = new Student("Hasan", 20, 90.0);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }

}
