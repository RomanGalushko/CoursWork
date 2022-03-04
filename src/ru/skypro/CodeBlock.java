package ru.skypro;

import static ru.skypro.Main.employee;

public class CodeBlock {

    public static int employeeSum() {
        int sum = 0;
        for (Employee i : employee) {
            sum += i.getSalary();
        }
        return sum;
    }

    public static int minSalary() {

        int min = employee[0].getSalary();
        for (Employee i : employee) {
            if (min > i.getSalary()) {
                min = i.getSalary();
            }
        }
        return min;
    }

    public static int maxSalary() {
        int max = employee[0].getSalary();
        for (Employee i : employee) {
            if (max < i.getSalary()) {
                max = i.getSalary();
            }
        }
        return max;
    }

    public static int averageSum() {
        return employeeSum()/employee.length;
    }
}
