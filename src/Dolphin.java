class Dolphin extends Animals implements Swimmable{
    
    public Dolphin (String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Ee-eee-eee");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " yüzüyor.");
    }
}
