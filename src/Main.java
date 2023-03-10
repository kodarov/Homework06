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
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //решение
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 1; i < 18; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 0;
        for (int i = 1; i < 13; i++) {
            salary += 29000;
            System.out.println("Месяц " + i + " в банке " + salary);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        double salary = 29000;
        double total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary + total / 100;
            System.out.println("Месяц " + i + " в банке с процентами " + String.format("%.2f", total));
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int a;
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}