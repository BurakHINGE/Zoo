class Monkey extends Animals implements Runnable {
    
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Uuuuaaaaa Uuuuaaaa");
    }

    @Override
    public void run() {
        System.out.println(getName() + " koşuyor.");
    }
}