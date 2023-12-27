import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shelter shelter = Shelter.getInstance();
        boolean shouldContinue = true;

        while (shouldContinue){
            System.out.println("===== ANIMAL SHELTER =====");
            System.out.println("1. Create and add new pet house to shelter");
            System.out.println("2. Add animal to pet house");
            System.out.println("3. Display all animals");
            System.out.println("4. Manage employees");
            System.out.println("5. Manage volunteers");
            System.out.println("6. Adopt animal");

            String userChoice = scanner.nextLine();

            switch (Integer.parseInt(userChoice)){
                case 1:
                    shelter.createPetHouse();
                    break;
                case 2:
                    System.out.println("What kind of animal you want to add? (dog or cat)");
                    String animalKind = scanner.nextLine();
                    if (animalKind.equalsIgnoreCase("dog")){
                        shelter.createDog();
                    } else if (animalKind.equalsIgnoreCase("cat")) {
                        shelter.createCat();
                    }
                    else{
                        System.out.println("You can only add dog/cat to shelter!");
                    }
                    break;
                case 3:
                    System.out.println("Animals:");
                    shelter.displayAllAnimals();
                    break;
                case 4:

//                  TODO - COMPLETE MENU
            }
        }
    }
}