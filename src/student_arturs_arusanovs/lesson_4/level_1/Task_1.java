package student_arturs_arusanovs.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number please.");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is negative.");
        }
    }
}
