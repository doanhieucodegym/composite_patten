package com.hivetech.composite;

public class Student implements Education {
    //subclass
    private  float mathA;
    private float physic;

    public Student() {
    }

    public Student(float mathA, float physic) {
        this.mathA = mathA;
        this.physic = physic;
    }


    @Override
    public float calculatePoint() {

        return (this.mathA +this.physic)/2;
    }
}
