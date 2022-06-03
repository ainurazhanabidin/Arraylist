package com.company;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        try {
            if (age<0){
                throw new MyExeption("ters san bolbosh kerek!");
        }
        }catch (MyExeption e){
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.age = age;
    }

    public Student(Object name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
