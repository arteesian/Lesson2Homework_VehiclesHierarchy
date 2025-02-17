public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 13000, 614.75, "грузовой", 30);
        System.out.println(plane);
        plane.describeWheels();
        plane.describePropeller();
        plane.describeWings();
        System.out.println("Старый груз: " + plane.getCargoWeight());
        System.out.println("Увеличенный груз: " + plane.increaseCargoWeight(10 ));
        System.out.println();

        Helicopter heli = new Helicopter("Apache", 2000, 214.00, 20);
        System.out.println(heli);
        heli.describePropeller();
        System.out.println("Увеличим груз на x, докинем еще 5, получим: " + heli.increaseCargoWeight(10 ));
        System.out.println();

        Boat boat = new Boat("Riva", 700, 129.10, 5);
        System.out.println(boat);
        System.out.println();

        Taxi taxi = new Taxi("Volkswagen Polo", 1500, 225.67);
        System.out.println(taxi);
        taxi.describeWheels();
    }
}