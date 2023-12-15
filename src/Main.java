public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Canine","Shepherd");

        System.out.println("Species : " + myDog.species);
        System.out.println("Breed : " + myDog.breed);

        myDog.makeSound();
        myDog.wagTail();
    }
}