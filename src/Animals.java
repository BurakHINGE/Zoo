public abstract class Animals implements Comparable<Animals>, Cloneable{

    protected String name;
    protected int age;
    protected double weight;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}