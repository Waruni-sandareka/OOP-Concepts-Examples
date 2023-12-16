import com.example.animals.Dog;
import com.example.bank.BankAccount;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Canine","Shepherd");

        System.out.println("---------Inheritance Example---------");

        System.out.println("Species : " + myDog.species);
        System.out.println("Breed : " + myDog.breed);

        myDog.makeSound();
        myDog.wagTail();

        System.out.println("---------Encapsulation Example---------");

        BankAccount myAccount = new BankAccount("John Doe", 1000.0);

        // Accessing and modifying attributes through methods (encapsulation)
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        // Using the setter method to update the account holder's name
        myAccount.setAccountHolder("Jane Doe");
        System.out.println("Updated Account Holder: " + myAccount.getAccountHolder());
    }
}