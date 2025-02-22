package course.java_oracle_certificate.lesson5;

public class Human {
    String name;
    Car.CarConstructor car;
    BankAccount ba;

    void showInfo(){
        System.out.println("name: " + name);
        System.out.println("car: " + car.color + " " + car.engine);

        System.out.println("ba: " + ba.balance);
    }
}


class BankAccount{
    BankAccount (int i, double bal) {
        id = i;
        balance = bal;
    }
    int id;
    double balance;
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Jack";
        h.car = new Car.CarConstructor("Blue", "V4");
        h.ba = new BankAccount(1, 10.5);

        h.showInfo();

    }
}