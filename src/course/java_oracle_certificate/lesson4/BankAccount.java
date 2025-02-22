// Урок 4. Понятия «класс» и «объект». Знакомство со ссылочными типами данных
    // Любой класс в JAVA является типом данных
    // Конструктор - это механизм создания объекта. Цель конструктора - создать объект.
package course.java_oracle_certificate.lesson4;

public class BankAccount {
    public int id;;
    public String name;
    public double balance;

    public double upBankAccount(double value) {
        balance += value;
        return balance;
    }

    public double downBankAccount(double value) {
        balance -= value;
        return balance;
    }

}

class BankAccountMain {

    public static void main(String[] args) {
        
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
        BankAccount ba3 = new BankAccount();

        ba1.id = 1;
        ba1.name = "Valera";
        ba1.balance = 12.5;

        ba3.id = 3;
        ba3.name = "Mike";
        ba3.balance = 62.3;

        System.out.println(ba1.id);
        System.out.println(ba1.name);
        System.out.println(ba1.balance);

        System.out.println(ba2.id);
        System.out.println(ba2.name);
        System.out.println(ba2.balance);

        System.out.println(ba3.id);
        System.out.println(ba3.name);
        System.out.println(ba3.balance);

    }
}


