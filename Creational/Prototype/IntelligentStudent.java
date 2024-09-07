package DesignPattern.Creational.Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent() {

    }

    IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
