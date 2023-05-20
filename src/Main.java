import dynamic.Dealer;
import dynamic.Mechanic;
import multiaspect.Bike;
import multiaspect.Car;
import multiaspect.EngineType;
import multiinheritance.BackendDev;
import multiinheritance.FrontendDev;
import multiinheritance.FullstackDev;
import overlapping.Account;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Account adminAccount = new Account("Jan", "Kowalski", true);
        Account ownerAccount = new Account("Maciej", "Nowak", false, "yellow");
        //System.out.println(adminAccount.getBackgroundColor());
        System.out.println(ownerAccount.getBackgroundColor());
        System.out.println();


        BackendDev javaDeveloper = new BackendDev(List.of("Java", "Maven", "Spring", "Swing"), "IntelliJ IDEA", true);
        FrontendDev websiteDeveloper = new FrontendDev(4, List.of("www.coolpage.com", "www.pjatk.pl"));
        FullstackDev fullstackDev = new FullstackDev(List.of("www.bestshoes.com"), List.of("Arduino Simulator", "Pong Game"));
        javaDeveloper.greeting();
        System.out.println();
        websiteDeveloper.portfolioPreview();
        System.out.println();
        fullstackDev.greeting();
        fullstackDev.portfolioPreview();
        System.out.println();


        Bike bike = new Bike("Honda", "CBR 1100", EngineType.GASOLINE, false);
        Car car = new Car("Tesla", "Model S", EngineType.ELECTRIC, true, 5);
        bike.setFuelAmount(20F);
        //bike.setBatteryStatus(50.0F);
        bike.vehicleData();
        System.out.println();
        car.vehicleData();
        System.out.println();


        Mechanic mechanic = new Mechanic("Jan", "Kowalski", 10, 1954);
        System.out.println(mechanic);
        Dealer dealer =  new Dealer(mechanic, 0, true);
        mechanic = null;
        System.out.println(dealer);
        System.out.println(mechanic);
    }
}