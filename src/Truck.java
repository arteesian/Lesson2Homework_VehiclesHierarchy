public class Truck extends Vehicle implements HasWheels, DoesShipping{
    private int cargoWeight;

    public Truck(String model, int weight, double maxSpeed, int cargoWeight){
        super(model, weight, maxSpeed);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void describeWheels() {
        System.out.println("У грузовика 12 колес");
    }

    @Override
    public int increaseCargoWeight(int a){
        return  cargoWeight + a;
    }

    @Override
    public String toString() {
        return "Это грузовик. " + super.toString() +
                ", вес груза: " + cargoWeight;
    }
}
