package student_renars_ranka.homework.lesson_4.level_1;

import java.util.Scanner;
//Поправить форматирование
class Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number...");

        int number = input.nextInt();

        if (number > 0) {

        System.out.println(number + " number is positive!");
        }

        else {

        System.out.println(number + " number is negative!");
        }

    }
}
