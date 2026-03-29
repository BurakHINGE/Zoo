class Lion extends Animals implements Runnable{
    
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Roooarrrr");
    }

    @Override
    public void run() {
        System.out.println("Aslan koşuyor.");
    }

}
