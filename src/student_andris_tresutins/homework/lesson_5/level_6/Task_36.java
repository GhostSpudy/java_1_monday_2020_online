package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Same issue here," +
        "Wrong method signature. If I want to create a method, to find the max number in array," +
        "I must pass an array as argument. Utility class, is the class (AKA Helper) to assist you " +
        "with some things. In this case, ArrayUtils is the class which must help you work with arrays")
public class Task_36 {

    public static void main(String[] args) {
        Task_36 victim = new Task_36();
        System.out.println(victim.findMaxNumber(victim.staticArray()));
    }

    public int[] staticArray() {

        int[] array = {15, 24, 17, 99, 15};
        return array;
    }

    public int findMaxNumber(int[] array) {


        Task_36 victim = new Task_36();
        int[] myIntArray = victim.staticArray();

        int max = myIntArray[1];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] > max) {
                max = myIntArray[i];
            }

        }
        return max;

    }
}
