class Eagle extends Animals implements Flyable{
    
    public Eagle (String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Gaaaakkk");
    }

    @Override
    public void fly() {
        System.out.println(getName() +" uçuyor.");
    }
}
