package lesson_1.task;

import java.util.Scanner;

//Вывести все простые числа от 1 до 1000
// простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число);
public class Task_3 {
    public static void getPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        boolean flag = false;
        int j=2;
        for (int i = 2; i <= n; i++)
         {
            for (j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    flag = true;
                }
            }
            if (flag == false)
            {
                System.out.println(j);
            }
            flag = false;
        }
    }
}