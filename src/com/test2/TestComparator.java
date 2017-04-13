package com.test2;

import java.util.*;

/**
 * Created by vikas.e.mishra on 1/21/2017.
 */
public class TestComparator {

    public static void main(String[] args) {
        List<EmployeeObject> employeeList = new LinkedList<EmployeeObject>();

        employeeList.add(new EmployeeObject(11,"Sid",79000));
        employeeList.add(new EmployeeObject(45,"Rahul",80000));
        employeeList.add(new EmployeeObject(8,"Vikas",85000));

        //Before Sorting
        System.out.println("Before -> "+employeeList);

        //After Sorting by Salary
        Collections.sort(employeeList,new SortEmployeeObject());
        System.out.println("After Sort By Salary -> "+employeeList);
        //After Sorting by Name
        Collections.sort(employeeList, EmployeeObject.sortByName);
        System.out.println("After Sort By Name -> "+employeeList);

    }
}

class SortEmployeeObject implements Comparator<EmployeeObject>{
    // Sorting based on Salary
    public int compare(EmployeeObject eo1, EmployeeObject eo2){
        return (int) (eo1.getSalary() - eo2.getSalary());
    }
}

class EmployeeObject{

    private int id;
    private String name;
    private float salary;

    public EmployeeObject(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Sorting based on Name
    public static Comparator<EmployeeObject> sortByName = new Comparator<EmployeeObject>(){
        public int compare(EmployeeObject eo1, EmployeeObject eo2){
            return eo1.getName().compareTo(eo2.getName());
        }
    };

    @Override
    public String toString() {
        return "EmployeeObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
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
}
