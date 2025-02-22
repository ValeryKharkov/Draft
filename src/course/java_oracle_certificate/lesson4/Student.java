package course.java_oracle_certificate.lesson4;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    double averageGradeMath;
    double averageGradeEcon;
    double averageGradeLang;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.id = 1;
        student1.name = "Valera";
        student1.surname = "Ivanov";
        student1.averageGradeEcon = 5.4;

        System.out.println(student1.averageGradeEcon);
        System.out.println(student2.averageGradeEcon);
    }


}
