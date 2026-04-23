package com.atguigu06.polymorphism.exer3;

public class Student extends Person {

    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
