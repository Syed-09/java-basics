package com.training.Feb20th_Day2.ExpHandling.MarathonTask;

public class Marathon {

    private String name;
    private int age;
    private String gender;
    private double contactNum;

    public Marathon(String name, int age, String gender, double contactNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNum = contactNum;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getContactNum() {
        return contactNum;
    }

    public void setContactNum(double contactNum) {
        this.contactNum = contactNum;
    }

    public void getDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("Contact Number: "+ name);
    }

}
