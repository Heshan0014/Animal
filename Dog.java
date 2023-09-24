class Dog extends Mammal {
    String Breed;

    public Dog(String name, int age, String furcolor, String breed) {
        super(name, age, furcolor);
        this.Breed = breed;
    }

    public void makeSound() {
        System.out.println("Dog sound");
}
}