class Tiger extends Animals implements Runnable {
    
    public Tiger(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Raaaaarrrr");
    }

    @Override
    public void run() {
        System.out.println(getName() + " koşuyor.");
    }
}
