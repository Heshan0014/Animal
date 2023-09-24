public class Mammal extends Animal {
    String furcolor;

    public Mammal(String name, int age, String furcolor) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Mammal sound");
}
}