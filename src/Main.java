import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int balance = 0;
        int month = 0;
        while (balance < 2_459_000) {
            balance += 15000;
            month++;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + balance);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 0; i <= 10; i++) {
            population += population / 1000 * (fertility - mortality);
            System.out.println(" Год " + i + " Численность Населения составляет: " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int depositAmount = 15_000;
        int profit = 0;
        int i = 0;
        while (profit < 12_000_000) {
            profit += (profit / 100 * 7);
            profit += depositAmount;
            i++;
            System.out.println(" Месяц " + i + " Сумма накоплений " + profit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int depositAmount = 15_000;
        int profit = 0;
        int i = 0;
        while (profit < 12_000_000) {
            profit += (profit / 100 * 7);
            profit += depositAmount;
            i++;
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " Сумма накоплений " + profit);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int depositAmount = 15_000;
        int profit = 0;
        int i = 0;
        for (; i <= 9 * 12; i++) {
            profit += (profit / 100 * 7);
            profit += depositAmount;
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " Сумма накоплений " + profit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fridaysNumber = 6;
        System.out.println(" Сегодня пятница " + fridaysNumber + " необходимо подготовить отчетность");
        while (fridaysNumber < 31) {
            fridaysNumber += 7;
            System.out.println(" Сегодня пятница " + fridaysNumber + " необходимо подготовить отчетность");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = LocalDate.now().getYear();
        int periodTo = currentYear - 200;
        int periodAfter = currentYear + 100;
        for (int i = periodTo; i < periodAfter; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}