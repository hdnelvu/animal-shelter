public class Cat extends Animal{
    private double tailLength;
    public Cat(String name, String race, int age, double weight, String gender, double tailLength) {
        super(name, race, age, weight, gender);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "tailLength=" + tailLength +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
