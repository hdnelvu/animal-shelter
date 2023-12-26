import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = Shelter.getInstance();
        shelter.init("Nice shelter :3");
        System.out.println(shelter.getShelterName());
    }
}