import java.util.ArrayList;
import java.util.List;

public class Adopter extends Person{

    private final List<Animal> adoptedAnimals;

    public Adopter(String name, String lastName, String gender, String phoneNumber, String emailAddress, int age, List<Animal> adoptedAnimals) {
        super(name, lastName, gender, phoneNumber, emailAddress, age);
        this.adoptedAnimals = new ArrayList<>(adoptedAnimals);
    }

    public List<Animal> getAdoptedAnimals() {
        return new ArrayList<>(adoptedAnimals);
    }


    @Override
    public String toString() {
        return "Adopter{" +
                "adoptedAnimals=" + adoptedAnimals +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }
}
