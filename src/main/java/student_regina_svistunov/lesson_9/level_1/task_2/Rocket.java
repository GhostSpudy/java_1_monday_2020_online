package student_regina_svistunov.lesson_9.level_1.task_2;

//Создайте класс ракета и сделайте так,
//        что бы это класс был доступен только внутри того пакета, в котором он находится.
//        Каким оператором доступа для этого надо воспользоваться?

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Rocket {
    // Если убрать Public перед классом, то тогда он будет доступен только внути этого пакета
}
