public class Taxi extends Vehicle implements HasWheels{
    public static final int MAX_PASSENGERS = 3;

    public Taxi(String model, int weight, double maxSpeed) {
        super(model, weight, maxSpeed);
    }

    @Override
    public void describeWheels(){
        System.out.println("У такси 4 автомобильных колеса");
    }

    @Override
    public String toString() {
        return "Это такси. " + super.toString();
    }
}
