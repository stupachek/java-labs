package Lab6;

public class Car {
    private String model;
    private double speed;
    private int price;
    private double fuelСonsumption;
    public Car(String model, double speed,int price, double fuelConsumption) {
        this.model = model;
        this.price = price;
        this.fuelСonsumption = fuelConsumption;
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }



    public double getFuelConsumption() {
        return    fuelСonsumption;

    }

    public double getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", fuelСonsumption=" + fuelСonsumption +
                '}';
    }
}
