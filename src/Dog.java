import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    private double tailLength;
    private List<String> skills;

    public Dog(String name, String race, int age, double weight, String gender, double tailLength, List<String> skills) {
        super(name, race, age, weight, gender);
        this.tailLength = tailLength;
        this.skills = new ArrayList<>(skills);
    }

    public double getTailLength() {
        return tailLength;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }

    public void displaySkills(){
        for (String s : skills){
            System.out.println(s);
        };
    }

    public void addSkill(String skill){
        skills.add(skill);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailLength=" + tailLength +
                ", skills=" + skills +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
