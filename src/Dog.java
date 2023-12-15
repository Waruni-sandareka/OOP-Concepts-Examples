public class Dog extends Animal {
    public String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof !");
    }

    public void wagTail(){
        System.out.println("Wagging tail happily...");
    }
}
