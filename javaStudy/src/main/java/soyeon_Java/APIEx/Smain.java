package soyeon_Java.APIEx;

public class Smain {
    public static void main(String[] args) {
        Student student_1 = new Student("김준석", 1);
        Student student_2 = new Student("박준석", 1);
        Student student_3 = new Student("김준석", 2);

        student_1.equals(student_3);
        System.out.println("=========================================================");
        student_1.equals(student_2);


    }
}
