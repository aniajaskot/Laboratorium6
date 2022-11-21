package exercise1;

public class Student {
    private String firstName;
    private String lastName;
    private char gender;
    private double math;
    private double it;
    private double physics;

    public Student(String firstName, String lastName, char gender, double math, double it, double physics) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.math = math;
        this.it = it;
        this.physics = physics;
    }

    double calculateAverage(){
        return (math + it + physics)/3;
    }

    void printInfo() {
        System.out.println("Student: " + firstName + ", " + lastName + ", " + gender + ", "
                + math + ", " + it + ", " + physics);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getIt() {
        return it;
    }

    public void setIt(double it) {
        this.it = it;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }
}
