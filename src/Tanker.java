public class Tanker extends Vehicle implements HasPropeller, DoesShipping{
    private int cargoWeight;

    public Tanker(String model, int weight, double maxSpeed, int cargoWeight){
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
        System.out.println("У танкера огромные винты");
    }

    @Override
    public int increaseCargoWeight(int a){
        return  cargoWeight + a*10;
    }

    @Override
    public String toString() {
        return "Это танкер. " + super.toString() +
                "вес груза: " + cargoWeight;
    }
}