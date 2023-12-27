import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shelter {
    private static Shelter instance = null;
    private String shelterName;
    private List<PetHouse> petHouses = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Volunteer> volunteers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

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

    public void displayAllAnimals(){
        for (PetHouse p : petHouses){
            for (Animal a : p.getAnimals()){
                System.out.println(a);
            }
        }
    }

    public void createDog(){
        System.out.println("What's the dog's name?");
            String dogName = scanner.nextLine();
        System.out.println("What's the dog's race?");
            String dogRace = scanner.nextLine();
        System.out.println("What's the dog's age?");
            String dogAge = scanner.nextLine();
        System.out.println("How much does the dog weigh?");
            String dogWeight = scanner.nextLine();
        System.out.println("What's the dog's gender? (Male/Female)");
            String dogGender = scanner.nextLine();
        System.out.println("How long is dog's tail?");
            String dogTailLength = scanner.nextLine();
        List<String> skills = new ArrayList<>();
        char addSkillChoice;
        do {
            System.out.println("Enter a skill for the dog:");
            String skill = scanner.nextLine();
            skills.add(skill);

            System.out.println("Do you want to add another skill? (Y/N)");
            addSkillChoice = scanner.nextLine().charAt(0);
        } while (Character.toUpperCase(addSkillChoice) == 'Y');

        Dog dog = new Dog(dogName, dogRace, Integer.parseInt(dogAge), Double.parseDouble(dogWeight), dogGender, Double.parseDouble(dogTailLength), skills);
        addAnimal(dog);
    }
    public void createCat() {
        System.out.println("What's the cat's name?");
        String catName = scanner.nextLine();
        System.out.println("What's the cat's race?");
        String catRace = scanner.nextLine();
        System.out.println("What's the cat's age?");
        String catAge = scanner.nextLine();
        System.out.println("How much does the cat weigh?");
        String catWeight = scanner.nextLine();
        System.out.println("What's the cat's gender? (Male/Female)");
        String catGender = scanner.nextLine();
        System.out.println("What's the cat's tail length?");
        String catTailLength = scanner.nextLine();

        Cat cat = new Cat(catName, catRace, Integer.parseInt(catAge), Double.parseDouble(catWeight), catGender, Double.parseDouble(catTailLength));
        addAnimal(cat);
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

    public boolean addPetHouse(PetHouse petHouse){
        for (PetHouse p : petHouses){
            if (petHouse == p){
                return false;
            }
        }
        petHouses.add(petHouse);
        return true;
    }

    public void createPetHouse(){
        System.out.println("What's the pet house capacity?");
        String capacity = scanner.nextLine();
        System.out.println("What material is it made from?");
        String material = scanner.nextLine();
        System.out.println("What color is the blanket inside?");
        String blanketColor = scanner.nextLine();
        PetHouse petHouse = new PetHouse(Integer.parseInt(capacity), material, blanketColor);
        addPetHouse(petHouse);
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
