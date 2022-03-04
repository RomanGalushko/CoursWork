package ru.skypro;

import static ru.skypro.CodeBlock.*;

public class Main {

    static Employee[] employee = new Employee[10];

    public static void main(String[] args){
        System.out.println("Список сотрудников: ");

        employee[0] = new Employee("Силин Лукьян Федосеевич", 1, 40_000);
        employee[1] = new Employee("Хохлова Лада Еремеевна", 2, 42_000);
        employee[2] = new Employee("Шестаков Руслан Наумович", 3, 37_000);
        employee[3] = new Employee("Турова Эрика Филипповна", 4, 31_000);
        employee[4] = new Employee("Савельев Роберт Валентинович", 5, 41_000);
        employee[5] = new Employee("Мартынов Платон Феликсович", 6, 47_000);
        employee[6] = new Employee("Савина Инара Серапионовна", 7, 39_000);
        employee[7] = new Employee("Сысоев Игнат Степанович", 8, 36_000);
        employee[8] = new Employee("Петухова Алиса Глебовна", 9, 43_000);
        employee[9] = new Employee("Константинова Богдана Лукьяновна", 10, 45_000);

        for (Employee i : employee) {
            System.out.println(i);
        }
        System.out.println();


        System.out.println("Сумма затрат на зарплату в месяц сотрудникам: " + employeeSum() + "\n");

        System.out.println("Максимальная зарплата: " + maxSalary() + "; Минимальная зарплата: " + minSalary() + "\n");

        System.out.println("Средняя зарплата всех сотрудников: " + averageSum() + "\n");

        System.out.println("Ф.И.О. сотрудников:");
        for (Employee i : employee) {
            System.out.println(i.getFullName());
        }
    }
}