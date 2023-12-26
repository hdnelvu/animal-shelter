import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private static Shelter instance = null;
    private String shelterName;
    private List<PetHouse> petHouses = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Volunteer> volunteers = new ArrayList<>();

    private Shelter() {
    }

    public static Shelter getInstance(){
        if(instance == null){
            instance = new Shelter();
        }
        return instance;
    }

    public void init(String name){
        this.shelterName = name;
    }

    public void addAnimal(Animal animal){
        if (petHouses.isEmpty()){
            return;
        }
        if (isInShelter(animal)) {
            return;
        }
        for (PetHouse petHouse : petHouses){
            if (petHouse.addAnimal(animal)){
                return;
            }
        }
    }

    public boolean isInShelter(Animal animal){
        for (PetHouse petHouse : petHouses){
            if (petHouse.getAnimals().contains(animal)){
                return true;
            }
        }
        return false;
    }

    public boolean adoptAnimal(Animal animal, Adopter adopter){
        if (!isInShelter(animal)){
            return false;
        }
        for (PetHouse p : petHouses){
            if (p.getAnimals().contains(animal)){
                p.removeAnimal(animal);
                adopter.getAdoptedAnimals().add(animal);
                return true;
            }
        }
        return false;
    }

    public boolean addPetHouse(PetHouse petHouse){
        for (PetHouse p : petHouses){
            if (petHouse == p){
                return false;
            }
        }
        petHouses.add(petHouse);
        return true;
    }

    public void hireEmployee(Employee employee){
        for (Employee e : employees){
            if (employee == e){
                return;
            }
        }
        employees.add(employee);
    }

    public boolean fireEmployee(Employee employee){
        for (Employee e : employees){
            if (employee == e){
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }

    public boolean hireVolunteer(Volunteer volunteer){
        for (Volunteer v : volunteers){
            if (volunteer == v){
                return false;
            }
        }
        volunteers.add(volunteer);
        return true;
    }

    public boolean fireVolunteer(Volunteer volunteer){
        for (Volunteer v : volunteers){
            if (volunteer == v){
                volunteers.remove(volunteer);
                return true;
            }
        }
        return false;
    }

    public String getShelterName() {
        return shelterName;
    }

    public List<PetHouse> getPetHouses() {
        return new ArrayList<>(petHouses);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Volunteer> getVolunteers() {
        return new ArrayList<>(volunteers);
    }

    @Override
    public String toString() {
        return "Shelter{" +
                "shelterName='" + shelterName + '\'' +
                ", petHouses=" + petHouses +
                ", employees=" + employees +
                ", volunteers=" + volunteers +
                '}';
    }
}
