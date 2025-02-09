package course.zaur;

public class BankAccount {
    int id;
    String name;
    double balance;

    double addingFunds(double addNumber) {
        return balance + addNumber;
    }

    double removeFunds(double removeNumber) {
        return balance - removeNumber;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();

        ba1.id = 1;
        ba1.name = "Valera";
        ba1.balance = 12.5;

        ba2.id = 2;
        ba2.name = "Ivan";
        ba2.balance = 34.3;

        System.out.println(ba1.name);

        double addingBa1 = ba1.addingFunds(1);
        System.out.println(addingBa1);

        double removeBa1 = ba1.removeFunds(2);
        System.out.println(removeBa1);



    }


}
