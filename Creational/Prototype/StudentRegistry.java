package DesignPattern.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private static final Map<String, Student> students = new HashMap<>();

    public static void register(String key, Student st) {
        students.put(key, st);
    }

    public static Student get(String key) {
        return students.get(key).copy();
    }
}
