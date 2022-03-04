package ru.skypro;

public class Employee {
    private static int count;
    private final String fullName;
    private int department;
    private int salary;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        count++;
        id = count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Работник №" + id + ", Ф.И.О: " + fullName + ", Отдел: " + department + ", З/П: " + salary + ".";
    }
}
