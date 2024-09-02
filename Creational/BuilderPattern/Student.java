package DesignPattern.Creational.BuilderPattern;

public class Student {
    private String name;
    private int rollNo;
    private int age;

    private Student(StudentBuilder b) {
        this.name = b.getName();
        this.rollNo = b.getRollNo();
        this.age = b.getAge();
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public static class StudentBuilder {
        private String name;
        private int rollNo;
        private int age;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getRollNo() {
            return rollNo;
        }

        public StudentBuilder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
