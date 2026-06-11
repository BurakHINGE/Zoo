class Gorilla extends Animals implements Runnable {
    
    public Gorilla(String name, int age, double weight) {
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