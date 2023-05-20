package dynamic;

public class Mechanic extends Person {

    private int yearsOfExperience;
    private int fixedCars;

    public Mechanic(String firstName, String lastName, int yearsOfExperience, int fixedCars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExperience = yearsOfExperience;
        this.fixedCars = fixedCars;
    }

    public Mechanic(Dealer dealer, int yearsOfExperience, int fixedCars) {
        this.firstName = dealer.getFirstName();
        this.lastName = dealer.getLastName();
        this.yearsOfExperience = yearsOfExperience;
        this.fixedCars = fixedCars;
    }

    @Override
    public String toString() {
        return String.format("First name: %s \nLast name: %s \nYears of experience: %s \nFixed cars count: %s\n",
                firstName, lastName, yearsOfExperience, fixedCars);
    }
}
