public class Helicopter extends Vehicle implements HasWheels, HasPropeller, DoesShipping{
    private int cargoWeight;

    public Helicopter(String model, int weight, double maxSpeed){
        super(model, weight, maxSpeed);
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void describeWheels() {
        System.out.println("У вертолета колеса в виде шасси");
    }

    @Override
    public void describePropeller(){
        System.out.println("У вертолета четыре винта");
    }

    @Override
    public int increaseCargoWeight(int a){
        return  cargoWeight + (a+5);
    }

    @Override
    public String toString() {
        return "Это самолёт. " + super.toString();
    }
}
