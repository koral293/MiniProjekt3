package dynamic;

public class Dealer extends Person {

    private int carsSold;
    private boolean workerOfTheYear;

    public Dealer(String firstName, String lastName, int carsSold, boolean workerOfTheYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.carsSold = carsSold;
        this.workerOfTheYear = workerOfTheYear;
    }

    public Dealer(Mechanic mechanic, int carsSold, boolean workerOfTheYear) {
        this.firstName = mechanic.getFirstName();
        this.lastName = mechanic.getLastName();
        this.carsSold = carsSold;
        this.workerOfTheYear = workerOfTheYear;
    }

    @Override
    public String toString() {
        return String.format("First name: %s \nLast name: %s \nCars sold: %s \nWorker of the year?: %s \n",
                firstName, lastName, carsSold, workerOfTheYear);
    }
}
