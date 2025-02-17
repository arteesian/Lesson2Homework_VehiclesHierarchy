public class Plane extends Vehicle implements HasWheels, HasPropeller, HasWings, DoesShipping{

private String planeType;
private int cargoWeight;

    public Plane(String model, int weight, double maxSpeed, String planeType, int cargoWeight) {
        super(model, weight, maxSpeed);
        this.planeType = planeType;
        this.cargoWeight = cargoWeight;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void describeWheels() {
        System.out.println("У самолета колеса в виде шасси");
    }

    @Override
    public void describePropeller(){
        System.out.println("У самолета несколько больших винтов");
    }

    @Override
    public void describeWings(){
        System.out.println("У самолета большие крылья");
    }

    @Override
    public int increaseCargoWeight(int a){
        return  cargoWeight + a;
    }

    @Override
    public String toString() {
        return "Это самолет. " + super.toString() +
                ", тип самолета - " + planeType;
    }
}
