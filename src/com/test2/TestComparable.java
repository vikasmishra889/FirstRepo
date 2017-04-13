package com.test2;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by vikas.e.mishra on 1/19/2017.
 */
public class TestComparable {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"Harry",1000));
        list.add(new Employee(2,"Peter",3000));
        list.add(new Employee(3,"Shayam",1200));
        list.add(new Employee(4,"Baba",9000));
        list.add(new Employee(5,"dhaba",8000));
        System.out.println("Before -> "+list);
        Collections.sort(list);
        System.out.println("After -> "+list);

    }


}

class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e){
     return (int) (e.getSalary() - this.salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name -> " + this.name + "; Salary -> " + this.salary + "; Id -> " + this.id;
    }

}


