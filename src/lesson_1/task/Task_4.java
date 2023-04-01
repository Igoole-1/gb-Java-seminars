package lesson_1.task;

import java.util.Scanner;

//Реализовать простой калькулятор
public class Task_4 {
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        System.out.println("Выберите действие: 1 - сумма; 2 - вычитание; 3 - деление; 4 - умножение : ");
        Scanner var = new Scanner(System.in);
        int result = 0;
        int choice = var.nextInt();
        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Результат " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Результат " + result);
                break;
            case 3:
                result = a / b;
                System.out.println("Результат " + result);
                break;
            case 4:
                result = a * b;
                System.out.println("Результат" + result);
                break;
        }
    }
}
