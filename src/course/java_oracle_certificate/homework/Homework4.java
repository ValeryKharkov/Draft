package course.java_oracle_certificate.homework;

import course.java_oracle_certificate.lesson4.Student;

public class Homework4 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.id = 1;
        student1.name = "Mike";
        student1.surname = "Ivanov";
        student1.year = 2016;


        System.out.println("id: " + student1.id);
        System.out.println("name: " + student1.name);
        System.out.println("surname: " + student1.surname);
        System.out.println("year: " + student1.year);

        System.out.println("averageGradeMath: " + student1.averageGradeMath(4, 4, 5));
        System.out.println("averageGradeEcon: " + student1.averageGradeEcon(3, 4, 5));
        System.out.println("averageGradeLang: " + student1.averageGradeLang(5, 5, 5));
    }
}

