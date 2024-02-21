package com.training.Feb20th_Day2.ExpHandling.SalaryTask;

import java.util.Scanner;

public class SalaryTester {

    public String name;
    public int salary;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Details");
        System.out.println("Name:");
        String name = sc.nextLine();


        int salary = 0;
        boolean bool = true;

        while (bool){
            try{
                System.out.println("Salary:");
                salary = sc.nextInt();
                validateSalary(salary);
                bool= false;
            }
            catch (InvalidSalaryException e){
                System.out.println(e.getMessage());
            }
        }
        Salary sal = new Salary(name, salary);
        sal.getDetails(name,salary);

    }

    public static void validateSalary(int salary) throws InvalidSalaryException{
        if (salary < 20000){
            throw new InvalidSalaryException("Salary must be greater than 20000");
        }
        else {
            System.out.println("Validation Successful!!");
        }
    }

}
