package student_dmitry_vasiliev.lesson_3.homework.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
