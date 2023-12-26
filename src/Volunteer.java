public class Volunteer extends Person{
    private String role;
    public Volunteer(String name, String lastName, String gender, String phoneNumber, String emailAddress, int age, String role) {
        super(name, lastName, gender, phoneNumber, emailAddress, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }
}
