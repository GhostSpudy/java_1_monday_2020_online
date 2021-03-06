package student_alexander_shl.homework.lesson_2.level_3;

/* Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter int number: ");
        int firstNumber = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int multiplyResult = firstNumber * i;
            System.out.println(firstNumber + " * " + i + " = " + multiplyResult);

        }

    }

}
