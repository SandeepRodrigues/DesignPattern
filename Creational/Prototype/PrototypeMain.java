package DesignPattern.Creational.Prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(1);
        st.setName("ABC");
        st.setBatch("DSA");

        StudentRegistry.register("student", st);
        //Student st1 = st.copy();
        Student st1 = StudentRegistry.get("student");
        System.out.println(st);
        System.out.println(st1);
    }
}
