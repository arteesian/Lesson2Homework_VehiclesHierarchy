public class Boat extends Vehicle implements HasPropeller, DoesShipping{
    private int cargoWeight;

    public Boat(String model, int weight, double maxSpeed, int cargoWeight){
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
    public void describePropeller(){
        System.out.println("У катера один винт");
    }

    @Override
    public int increaseCargoWeight(int a){
        return  cargoWeight + a;
    }

    @Override
    public String toString() {
        return "Это катер. " + super.toString() +
                ", вес груза: " + cargoWeight;
    }
}
