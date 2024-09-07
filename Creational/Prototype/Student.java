package DesignPattern.Creational.Prototype;

public class Student implements  IPrototype<Student> {
    private int id;
    private String name;
    private String batch;

    public Student() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    // contructor contains the logic of copy
    public Student(Student st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    // The copy method helps you to delegate the process to copy constructor
    @Override
    public Student copy() {
        return new Student(this);
    }

}
