package course.java_oracle_certificate.homework;

import course.java_oracle_certificate.lesson4.Student;


class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.id = 1;

        student1.surname = "Ivanov";
        ;

        System.out.println(student1.name);
        System.out.println(student1.averageGradeEcon(4, 4, 5));
    }
}