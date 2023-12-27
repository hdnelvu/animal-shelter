import java.util.ArrayList;
import java.util.List;

public class PetHouse {
    private static int counter = 0;
    private final List<Animal> animals = new ArrayList<>();
    private int capacity;
    private String material;
    private String blanketColor;
    private final int petHouseNumber;

    public PetHouse( int capacity, String material, String blanketColor) {
        this.capacity = capacity;
        this.material = material;
        this.blanketColor = blanketColor;
        counter++;
        this.petHouseNumber = counter;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    public int getCapacity() {
        return capacity;
    }


    public String getMaterial() {
        return material;
    }
    
    public String getBlanketColor() {
        return blanketColor;
    }

    public void setBlanketColor(String blanketColor) {
        this.blanketColor = blanketColor;
    }

    public int getPetHouseNumber() {
        return petHouseNumber;
    }

    @Override
    public String toString() {
        return "PetHouse{" +
                "animals=" + animals +
                ", capacity=" + capacity +
                ", material='" + material + '\'' +
                ", blanketColor='" + blanketColor + '\'' +
                ", petHouseNumber=" + petHouseNumber +
                '}';
    }

    public boolean addAnimal(Animal animal) {
        if (!this.animals.isEmpty()) {
            if (this.animals.get(0).getClass() != animal.getClass()) {
                return false;
            }
        }
        for (Animal a : animals) {
            if (a.equals(animal)) {
                return false;
            }
        }
        if (animals.size() < capacity) {
            animals.add(animal);
            return true;
        } else {
            return false;
        }
    }


    public void removeAnimal(Animal animal){
        if (!this.animals.contains(animal)){
            return;
        }
        animals.remove(animal);
    }

}
