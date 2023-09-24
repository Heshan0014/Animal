class Bird extends Animal{
    Double Wingspan;

    public Bird(String name, int age, double wingspan){
        super(name,age);
        Wingspan=wingspan;
    }

    public void makeSound(){
        System.out.println("Bird sound");
}
}