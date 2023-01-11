package Lab6;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private Car[] cars;

    public CarPark(Car[] cars) {
        this.cars = cars;
    }
    public  int cost(){
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }
    public ArrayList<Car> foundSpeed(int low, int height) {
        ArrayList<Car> founded = new ArrayList<Car>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getSpeed() >= low && cars[i].getSpeed() <= height) {
                founded.add(cars[i]);
            }
        }
        return founded;
    }

    public  Car[] getCars() {
        return cars;
    }
}
