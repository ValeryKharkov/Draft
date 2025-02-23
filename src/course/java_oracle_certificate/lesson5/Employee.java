package course.java_oracle_certificate.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    EmployeeConstructor salary;
    String department;

    void upSalary2x () {
        salary.salaryCon = salary.salaryCon * 2;
    }

    void showInfo(){
        System.out.println(salary.salaryCon);
    }
}

class EmployeeConstructor{
    int id;
    String surname;
    int age;
    double salaryCon;
    String department;

    EmployeeConstructor(double salary) {
        this.salaryCon = salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.salary = new EmployeeConstructor(400);
        emp1.upSalary2x();

        emp1.showInfo();


    }
}

