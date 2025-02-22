package course.java_oracle_certificate.lesson5;

import course.java_oracle_certificate.lesson4.BankAccount;
import course.java_oracle_certificate.lesson4.Student;

public class Homework {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.id = 5;
        ba.name = "Mary";
        ba.balance = 200;

        ba.upBankAccount(50);
        ba.downBankAccount(180);
        System.out.println(ba.balance);

        Student student = new Student();
        double averageGradeMath = student.averageGradeMath(1, 2, 3);
        System.out.println(averageGradeMath);
    }
}


