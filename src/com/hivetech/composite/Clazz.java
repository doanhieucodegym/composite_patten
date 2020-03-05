package com.hivetech.composite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Clazz implements Education {
    //Composite
    ArrayList<Student> students =new ArrayList<Student>();

    @Override
    public float calculatePoint() {
        float sum= 0;
        for(Student s : students){
            sum += s.calculatePoint();
        }
        return sum/students.size();
    }
}
