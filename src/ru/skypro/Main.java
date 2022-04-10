package ru.skypro;

public class Main {

    static Employee[] employee = new Employee[10];

    public static void employeeList() {

//        employee[0] = new Employee("Силин Лукьян Федосеевич", 1, 40_000);
        employee[1] = new Employee("Хохлова Лада Еремеевна", 2, 42_000);
//        employee[2] = new Employee("Шестаков Руслан Наумович", 3, 37_000);
        employee[3] = new Employee("Турова Эрика Филипповна", 4, 31_000);
//        employee[4] = new Employee("Савельев Роберт Валентинович", 5, 41_000);
        employee[5] = new Employee("Мартынов Платон Феликсович", 6, 47_000);
//        employee[6] = new Employee("Савина Инара Серапионовна", 7, 39_000);
        employee[7] = new Employee("Сысоев Игнат Степанович", 8, 36_000);
//        employee[8] = new Employee("Петухова Алиса Глебовна", 9, 43_000);
        employee[9] = new Employee("Константинова Богдана Лукьяновна", 10, 45_000);

        for (Employee i : employee) {
            if (i != null) {
                System.out.println(i);
            }
        }
        System.out.print("\n");
    }

    public static int employeeSum() {
        int sum = 0;
        for (Employee i : employee) {
            if (i != null) {
                sum += i.getSalary();
            }
        }
        return sum;
    }

    public static Employee employeeMinSalary() {
        int min = employeeSum();
        Employee result = employee[0];
        for (Employee i : employee) {
            if (i != null && min > i.getSalary()) {
                min = i.getSalary();
                result = i;
            }
        }
        return result;
    }

    public static Employee employeeMaxSalary() {
        int max = 0;
        Employee result = employee[0];
        for (Employee i : employee) {
            if (i != null && max < i.getSalary()) {
                max = i.getSalary();
                result = i;
            }
        }
        return result;
    }

    public static int averageSum() {
        int average = 0;
        for (Employee i : employee)
            if (i != null) {
                average = employeeSum() / i.getId();
            }
        return average;
    }
    public static void printFullName() {
        for (Employee i : employee) {
            if (i != null) {
                System.out.println(i.getFullName());
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Список сотрудников: ");
        employeeList();

        System.out.println("Сумма затрат на зарплату в месяц сотрудникам: " + employeeSum() + ".\n");

        System.out.println("Сотрудник с максимальной зарплатой: " + employeeMaxSalary().getFullName() + ";\nСотрудник с минимальной зарплатой: " + employeeMinSalary().getFullName() + ".\n");

        System.out.println("Средняя зарплата всех сотрудников: " + averageSum() + ".\n");

        System.out.println("Ф.И.О. сотрудников:");
        printFullName();
    }
}