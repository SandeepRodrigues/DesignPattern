package DesignPattern.Creational.BuilderPattern;

public class BuilderPatternMain {
    public static void  main(String[] args) {
        Student b = Student.getBuilder()
                .setName("Sandeep")
                .setAge(30)
                .setRollNo(37).
                build();

        System.out.println("Student: " + b.getName() +" : "+ b.getAge() +" : "+ b.getRollNo());

    }
}
