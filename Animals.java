abstract class Animals implements Comparable<Animals>, Cloneable{

    private String name;
    private int age;
    private double weight;

    public Animals (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();

    @Override
    public int compareTo(Animals other) {
        return Integer.compare(this.age, other.age);
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Animals)) return false;
        Animals other = (Animals) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    @Override
    protected Animals clone() throws CloneNotSupportedException {
        return (Animals) super.clone();
    }
}
