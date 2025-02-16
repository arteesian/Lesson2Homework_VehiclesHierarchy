public abstract class Vehicle {
    private String model;
    private int weight;
    private double maxSpeed;

    public Vehicle(String model, int weight, double maxSpeed) {
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Модель - " + model +
                ", вес - " + weight +
                ", максимальная скорость - " + maxSpeed;
    }
}

