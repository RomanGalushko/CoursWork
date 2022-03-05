package ru.skypro;

import static ru.skypro.CodeBlock.*;

public class Main {

    static Employee[] employee = new Employee[10];

    public static void main(String[] args){
        System.out.println("Список сотрудников: ");
        System.out.println(employeeList()+ "\n");

        System.out.println("Сумма затрат на зарплату в месяц сотрудникам: " + employeeSum() + ".\n");

        System.out.println("Максимальная зарплата: " + maxSalary() + ";\nМинимальная зарплата: " + minSalary() + ".\n");

        System.out.println("Средняя зарплата всех сотрудников: " + averageSum() + ".\n");

        System.out.println("Ф.И.О. сотрудников:");
        System.out.println(employeeFullName());
    }

}