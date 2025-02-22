package course.java_oracle_certificate.lesson5;

public class Human {
    String name;
    Car.CarConstructor car;
    BankAccountConstructor ba;

    void showInfo(){
        System.out.println("name: " + name);
        System.out.println("car: " + car.color + " " + car.engine);

        System.out.println("ba: " + ba.balance);
    }
}

class BankAccountConstructor{
    int id;
    double balance;

    BankAccountConstructor (int i, double bal) {
        id = i;
        balance = bal;
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Jack";
        h.car = new Car.CarConstructor("Blue", "V4");
        h.ba = new BankAccountConstructor(1, 10.5);

        h.showInfo();

    }
}