import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee extends Person{

    private double salary;
    private Set<Role> roles;
    public Employee(String name, String lastName, String gender, String phoneNumber, String emailAddress, int age, double salary, List<Role> roles) {
        super(name, lastName, gender, phoneNumber, emailAddress, age);
        this.salary = salary;
        this.roles = new HashSet<>(roles);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Role> getRoles() {
        return new HashSet<>(roles);
    }

    public boolean addRole(Role role) {
        if (this.roles.contains(role)){
            return false;
        }
        this.roles.add(role);
        return true;
    }

    public boolean removeRole(Role role){
        if (this.roles.contains(role)){
            this.roles.remove(role);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", roles=" + roles +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }
}
