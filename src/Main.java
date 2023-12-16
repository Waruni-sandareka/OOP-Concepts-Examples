import com.example.animals.Dog;
import com.example.bank.BankAccount;
import com.example.employees.FullTimeEmployee;
import com.example.employees.PartTimeEmployee;
import com.example.shapes.Circle;
import com.example.shapes.Rectangle;
import com.example.shapes.Shape;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Canine","Shepherd");

        System.out.println("---------Inheritance Example---------");

        System.out.println("Species : " + myDog.species);
        System.out.println("Breed : " + myDog.breed);

        myDog.makeSound();
        myDog.wagTail();

        System.out.println();
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

        System.out.println();
        System.out.println("---------Polymorphism Example---------");

        Shape myShape;

        myShape = new Circle(5.0);
        myShape.draw();
        System.out.println("Area: " + myShape.calculateArea());

        myShape = new Rectangle(4.0, 6.0);
        myShape.draw();
        System.out.println("Area: " + myShape.calculateArea());

        // Polymorphism with method overloading (compile-time polymorphism)
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
        System.out.println("Sum of two doubles: " + add(3.5, 2.5));

        System.out.println();
        System.out.println("---------Abstraction Example---------");

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 101, 5000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 15.0, 20);

        fullTimeEmployee.displayEmployeeInfo();
        System.out.println();
        partTimeEmployee.displayEmployeeInfo();
    }

    // Method overloading for compile-time polymorphism
    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static double add(double a, double b) {
        return a + b;
    }



}