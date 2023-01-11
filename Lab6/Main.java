package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Mitsubishi c1 = new Mitsubishi("Eclipse Cross", 100, 25795, 12);
        Volvo c2 = new Volvo("XC40", 120, 42301, 8);
        Volvo c3 = new Volvo("S60", 115, 35514, 9);
        BMW c4 = new BMW("X5", 130, 92000, 12);
        Mitsubishi c5 = new Mitsubishi("Pajero", 90, 24839, 15);
        Car[] cars = {c1, c2, c3, c4, c5};
        CarPark park = new CarPark(cars);
        Arrays.sort(park.getCars(), Comparator.comparing(Car::getFuelConsumption));
        System.out.println("After sorting...");
        for (Car car : park.getCars()) {
            System.out.println(car);
        }
        int low = 100;
        int height = 120;
        ArrayList<Car> result = park.foundSpeed(low, height);
        System.out.println("Founded cars:");
        if (result.isEmpty()) {
            System.out.println("nothing");
        }
        for (Car car : result) {
            System.out.println(car);
        }

        System.out.println("Cost of park: " + park.cost());



    }
}
